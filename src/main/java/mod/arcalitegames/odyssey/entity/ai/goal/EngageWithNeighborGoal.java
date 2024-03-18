package mod.arcalitegames.odyssey.entity.ai.goal;

import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.ai.goal.Goal;

public class EngageWithNeighborGoal extends Goal
{
	private CitizenEntity citizen;
	private CitizenEntity targetNeighbor;

	public EngageWithNeighborGoal(CitizenEntity citizen)
	{
		this.citizen = citizen;
	}
	
	@Override
	public boolean shouldExecute()
	{
		return citizen.isChatting();
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startInteractionAnimation(citizen);
		this.targetNeighbor = this.citizen.getAquaintance();
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		if(!this.targetNeighbor.isAlive())
			return false;
		
		return super.shouldContinueExecuting();
	}
	
	@Override
	public void resetTask()
	{
		ModelAnimations.endInteractionAnimation(citizen);
	}
	
	@Override
	public void tick()
	{
		this.citizen.getLookController().setLookPositionWithEntity(this.targetNeighbor, 10.0f, (float)this.citizen.getVerticalFaceSpeed());
	}

}
