package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.ai.goal.Goal;

public class EatSomethingGoal extends Goal
{
	private final ModEntity entity;
	private final int executionChance;
	
	public EatSomethingGoal(ModEntity entity)
	{
		this(entity, 240);
	}
	
	public EatSomethingGoal(ModEntity entityIn, int chance)
	{
		this.entity = entityIn;
		this.executionChance = chance;
		this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
	}
	
	@Override
	public boolean shouldExecute()
	{
		if(this.entity instanceof CitizenEntity)
		{
			if(!this.entity.isSitting())
			{
				return false;
			}
			
			if(((CitizenEntity)this.entity).isChatting())
			{
				return false;
			}
		}
		
		if(this.entity.getRNG().nextInt(this.executionChance) != 0)
		{
			return false;
		}
		
		return true;
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startEatingAnimation(entity);
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		return ModelAnimations.continueAnimation(entity);
	}
	
	@Override
	public void resetTask()
	{
		ModelAnimations.endEatingAnimation(entity);
	}

}
