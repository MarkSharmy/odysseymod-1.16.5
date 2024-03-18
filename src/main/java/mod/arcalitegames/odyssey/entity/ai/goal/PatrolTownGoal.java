package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import mod.arcalitegames.odyssey.entity.passive.PatrollingGuardEntity;
import mod.arcalitegames.odyssey.entity.passive.TownEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.Path;
import net.minecraft.world.World;

public class PatrolTownGoal extends Goal
{
	protected Path path;
	private int stopTime;
	protected World world;
	protected double speed;
	protected int executionChance;
	protected boolean stopWhenIdle;
	protected PatrollingGuardEntity guard;
	protected TownEntity targetCitizen;

	public PatrolTownGoal(PatrollingGuardEntity guard)
	{
		this(guard, 0.6D);
	}
	
	public PatrolTownGoal(PatrollingGuardEntity guard, double speed)
	{
		this(guard, speed, 120, true);
	}
	
	public PatrolTownGoal(PatrollingGuardEntity guardIn, double speedIn, int chance, boolean stopWhenIdle)
	{
		this.stopTime = 0;
		this.speed = speedIn;
		this.guard = guardIn;
		this.world = guardIn.world;
		this.executionChance = chance;
		this.stopWhenIdle = stopWhenIdle;
		this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
	}
	
	
	@Override
	public boolean shouldExecute()
	{
		if(this.guard.getRNG().nextInt(this.executionChance) != 0)
		{
			return false;
		}
		
		this.targetCitizen = this.findRandomCitizen();
		
		return this.targetCitizen != null;
	}
	
	@Override
	public void startExecuting()
	{
		this.path = this.guard.getNavigator().pathfind(this.targetCitizen, 0);
		GroundPathNavigator groundpathnavigator = (GroundPathNavigator)this.guard.getNavigator();
		groundpathnavigator.setPath(path, speed);
		
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		this.updatePath();
		
		if(!this.targetCitizen.isAlive())
		{
			return false;
		}
		
		if(this.stopTime > 10)
		{
			return false;
		}
		
		return this.guard.getDistanceSq(this.targetCitizen) > 4.0D;
	}

	@Nullable
	private CitizenEntity findRandomCitizen()
	{
		CitizenEntity neighbor = null;
		List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(this.guard, this.guard.getBoundingBox().grow(50));
		Entity entity = list.get(this.world.rand.nextInt(list.size()));
		if(entity instanceof CitizenEntity)
		{
			neighbor = (CitizenEntity)entity;
		}
		
		return neighbor;
	}
	
	@Override
	public void resetTask()
	{
		this.stopTime = 0;
		this.guard.getNavigator().clearPath();
	}
	
	private void updatePath()
	{
		if(this.guard.getNavigator().noPath())
		{
			this.stopTime++;
			this.guard.getNavigator().clearPath();
			this.path = this.guard.getNavigator().pathfind(targetCitizen, 0);
			this.guard.getNavigator().tryMoveToEntityLiving(targetCitizen, this.speed);
		}
		
		if(this.guard.collidedHorizontally)
		{
			this.stopTime++;
			this.guard.getNavigator().clearPath();
			this.path = this.guard.getNavigator().pathfind(targetCitizen, 0);
			this.guard.getNavigator().tryMoveToEntityLiving(targetCitizen, this.speed);
		}
	}


}
