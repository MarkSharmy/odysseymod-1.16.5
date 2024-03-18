package mod.arcalitegames.odyssey.entity.ai.goal;

import mod.arcalitegames.odyssey.entity.passive.StandingGuardEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;

public class ReturnToPostGoal extends Goal
{
	private Path path;
	private int stopTime;
	private StandingGuardEntity guard;
	
	public ReturnToPostGoal(StandingGuardEntity guardEntity)
	{
		this.guard = guardEntity;
	}
	
	@Override
	public boolean shouldExecute()
	{
		BlockPos post = guard.getDataManager().get(StandingGuardEntity.POST);
		BlockPos currentPos = guard.getPosition();
		
		if(this.guard.isAttacking())
		{
			return false;
		}
		
		return !(currentPos.equals(post));
	}
	
	@Override
	public void startExecuting()
	{
		this.path = this.guard.getNavigator().getPathToPos(guard.getHomePosition(), 0);
		this.guard.getNavigator().setPath(path, 0.6D);
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		if(this.stopTime > 40)
		{
			this.stopTime = 0;
			this.updatePath();
		}
		return this.guard.getDistanceSq(guard.getHomePosition().getX(), guard.getHomePosition().getY(), guard.getHomePosition().getZ()) < 1.0D;
	}
	
	private void updatePath()
	{
		BlockPos post = this.guard.getHomePosition();
		
		if(this.guard.getNavigator().noPath())
		{
			this.stopTime++;
			this.guard.getNavigator().clearPath();
			this.path = this.guard.getNavigator().getPathToPos(post, 0);
			this.guard.getNavigator().tryMoveToXYZ(post.getX(), post.getY(), post.getZ(), 0.6D);
		}
		
		if(this.guard.collidedHorizontally)
		{
			this.stopTime++;
			this.guard.getNavigator().clearPath();
			this.path = this.guard.getNavigator().getPathToPos(post, 0);
			this.guard.getNavigator().tryMoveToXYZ(post.getX(), post.getY(), post.getZ(), 0.6D);
		}
	}

}
