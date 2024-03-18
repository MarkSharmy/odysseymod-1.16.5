package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;

import javax.annotation.Nullable;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.world.World;

public class BarterWithMerchantGoal extends Goal
{
	private final CitizenEntity citizen;
	private final World world;
	private MerchantEntity targetVendor;
	private final double moveSpeed;
	private int executionChance = 240;
	
	public BarterWithMerchantGoal(CitizenEntity citizen)
	{
		this(citizen, 0.3D);
	}
	
	public BarterWithMerchantGoal(CitizenEntity citizen, double moveSpeed)
	{
		this.citizen = citizen;
		this.world = citizen.world;
		this.moveSpeed = moveSpeed;
		this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
	}
	
	@Override
	public boolean shouldExecute()
	{
		if (this.citizen.getRNG().nextInt(this.executionChance) != 0)
		{
            return false;
        }
		
		if(this.citizen.isChatting())
		{
			return false;
		}
		
		if(this.citizen.isSitting())
		{
			return false;
		}
		
		this.targetVendor = this.getTargetEntity();
		return this.targetVendor != null;
	}
	
	@Override
	public void startExecuting()
	{
		
		ModelAnimations.startWalkingAnimation(citizen);
		
		if(citizen.getDistance(targetVendor) < 3.0)
		{
			ModelAnimations.endWalkingAnimation(citizen);
			ModelAnimations.startBarteringAnimation(citizen);
		}
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		return targetVendor.isAlive() && ModelAnimations.continueAnimation(citizen);
	}
	
	@Override
	public void resetTask()
	{
		ModelAnimations.endBarteringAnimation(citizen);
		ModelAnimations.endWalkingAnimation(citizen);
		this.targetVendor = null;
	}
	
	@Override
	public void tick()
	{
		this.citizen.getLookController().setLookPositionWithEntity(targetVendor, 10.0f, (float)this.citizen.getVerticalFaceSpeed());
		this.citizen.getNavigator().tryMoveToEntityLiving(this.targetVendor, moveSpeed);
	}
	
	@Nullable
	private MerchantEntity getTargetEntity()
	{
		List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this.citizen, this.citizen.getBoundingBox().grow(8.0D));
		double d0 = Double.MAX_VALUE;
		MerchantEntity merchant = null;
		
		for(Entity entity: list)
		{
			if(entity instanceof MerchantEntity)
			{
				MerchantEntity neighbor = (MerchantEntity)entity;
				if (this.citizen.canInteractWith(neighbor) && this.citizen.getDistanceSq(neighbor) < d0) {
					merchant = neighbor;
		            d0 = this.citizen.getDistanceSq(neighbor);
		         }
			}
		}
		
		return merchant;
	}
}
