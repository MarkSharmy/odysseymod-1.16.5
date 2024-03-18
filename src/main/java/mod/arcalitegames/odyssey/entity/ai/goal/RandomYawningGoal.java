package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.ai.goal.Goal;

public class RandomYawningGoal extends Goal
{
	private ModEntity entity;
	protected int executionChance;
	private boolean stopWhenIdle;
	
	public RandomYawningGoal(ModEntity entityIn)
	{
		this(entityIn, 240);
	}
	
	public RandomYawningGoal(ModEntity entityIn, int chance)
	{
		this(entityIn, chance, true);
	}
	
	public RandomYawningGoal(ModEntity entityIn, int chance, boolean stopWhenIdle)
	{
		this.entity = entityIn;
		this.executionChance = chance;
		this.stopWhenIdle = stopWhenIdle;
		this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
	}
	
	@Override
	public boolean shouldExecute()
	{
		if(this.stopWhenIdle && this.entity.getIdleTime() >= 100)
		{
			return false;
		}
		if(this.entity.getRNG().nextInt(this.executionChance) != 0)
		{
			return false;
		}
		if(this.entity instanceof CitizenEntity)
		{
			CitizenEntity citizen = (CitizenEntity)this.entity;
			if(citizen.isChatting())
				return false;
		}
		
		return true;
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startYawningAnimation(entity);
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		return ModelAnimations.continueAnimation(entity);
	}

	
	@Override
	public void resetTask()
	{
		ModelAnimations.endYawningAnimation(entity);
	}
	
	@Override
	public boolean isPreemptible() {
		return false;
	}
}