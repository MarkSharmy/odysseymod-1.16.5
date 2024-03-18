package mod.arcalitegames.odyssey.entity.ai.goal;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.world.World;

public class GenericGoal extends Goal
{
	ModEntity entity;
	World world;
	
	public GenericGoal(ModEntity entity)
	{
		this.entity = entity;
		this.world = entity.world;
	}
	
	@Override
	public boolean shouldExecute()
	{
		return world.isDaytime();
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startPanickingAnimation(entity);
	}
	
	@Override
	public void resetTask()
	{
		ModelAnimations.endPanickingAnimation(entity);
	}
}