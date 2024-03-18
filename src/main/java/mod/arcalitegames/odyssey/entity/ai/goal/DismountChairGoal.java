package mod.arcalitegames.odyssey.entity.ai.goal;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.states.ModelStates;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class DismountChairGoal extends Goal
{
	private ModEntity entity;
	private int sittingTime = 0;
	
	public DismountChairGoal(ModEntity entity)
	{
		this.entity = entity;
	}

	@Override
	public boolean shouldExecute()
	{
		return this.entity.isSitting();
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		return this.sittingTime > 6000;
	}
	
	@Override
	public void tick()
	{
		this.sittingTime++;
	}
	
	@Override
	public void resetTask()
	{
		this.entity.stand();
		this.sittingTime = 0;
		BlockPos blockPos = this.entity.findSpecificTargetBlock(Blocks.AIR.getDefaultState(), 1);
		Vector3d vector = Vector3d.copyCenteredHorizontally(blockPos);
		this.entity.setPositionAndUpdate(vector.x, vector.y, vector.z);
		ModelStates.resetState(entity);
	}

}
