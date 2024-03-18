package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.world.World;

public class InteractWithNeighborGoal extends Goal
{
	private final CitizenEntity citizen;
	private final World world;
	private CitizenEntity targetNeighbor;
	private final double moveSpeed;
	private int executionChance = 240;
	
	public InteractWithNeighborGoal(CitizenEntity citizen)
	{
		this(citizen, 0.3D);
	}
	
	public InteractWithNeighborGoal(CitizenEntity citizen, double moveSpeed)
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
		
		this.targetNeighbor = this.getNearByNeighbor();
		return this.targetNeighbor != null;
	}
	
	@Override
	public void startExecuting()
	{
		
		ModelAnimations.startWalkingAnimation(citizen);
		
		if(citizen.getDistance(targetNeighbor) < 3.0)
		{
			this.citizen.setChatting(this.targetNeighbor, true);
			this.targetNeighbor.setChatting(this.citizen, true);
			ModelAnimations.endWalkingAnimation(citizen);
			ModelAnimations.startInteractionAnimation(citizen);
		}
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		return targetNeighbor.isAlive() && ModelAnimations.continueAnimation(citizen);
	}
	
	@Override
	public void resetTask()
	{
		this.citizen.setChatting(this.targetNeighbor, false);
		this.targetNeighbor.setChatting(this.citizen, false);
		ModelAnimations.endInteractionAnimation(citizen);
		ModelAnimations.endWalkingAnimation(citizen);
		this.targetNeighbor = null;
	}
	
	@Override
	public void tick()
	{
		this.citizen.getLookController().setLookPositionWithEntity(targetNeighbor, 10.0f, (float)this.citizen.getVerticalFaceSpeed());
		this.citizen.getNavigator().tryMoveToEntityLiving(this.targetNeighbor, moveSpeed);
	}
	
	@Nullable
	private CitizenEntity getNearByNeighbor()
	{
		List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this.citizen, this.citizen.getBoundingBox().grow(8.0D));
		double d0 = Double.MAX_VALUE;
		CitizenEntity citizenEntity = null;
		
		for(Entity entity: list)
		{
			if(entity instanceof CitizenEntity)
			{
				CitizenEntity neighbor = (CitizenEntity)entity;
				if (this.citizen.canInteractWith(neighbor) && this.citizen.getDistanceSq(neighbor) < d0) {
					citizenEntity = neighbor;
		            d0 = this.citizen.getDistanceSq(neighbor);
		         }
			}
		}
		
		return citizenEntity;
	}
}
