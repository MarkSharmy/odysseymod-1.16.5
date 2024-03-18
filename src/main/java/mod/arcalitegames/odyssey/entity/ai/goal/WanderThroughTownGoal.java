package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import mod.arcalitegames.odyssey.entity.passive.TownEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.Path;
import net.minecraft.world.World;

public class WanderThroughTownGoal extends Goal
{
	protected Path path;
	private int stopTime;
	protected World world;
	protected double speed;
	protected int executionChance;
	protected boolean stopWhenIdle;
	protected CitizenEntity citizen;
	protected TownEntity targetNeighbor;
	
	public WanderThroughTownGoal(CitizenEntity citizen)
	{
		this(citizen, 0.4);
	}
	
	public WanderThroughTownGoal(CitizenEntity citizen, double speed)
	{
		this(citizen, speed, 240, true);
	}
	
	public WanderThroughTownGoal(CitizenEntity citizenIn, double speedIn, int chance, boolean stopWhenIdle)
	{
		this.stopTime = 0;
		this.speed = speedIn;
		this.citizen = citizenIn;
		this.world = citizenIn.world;
		this.executionChance = chance;
		this.stopWhenIdle = stopWhenIdle;
		this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
	}
	
	@Override
	public boolean shouldExecute()
	{
		if(this.citizen.getRNG().nextInt(this.executionChance) != 0)
		{
			return false;
		}
		if(this.citizen.isSitting())
		{
			return false;
		}
		this.targetNeighbor = this.findRandomNeighbor();
		return this.targetNeighbor != null;
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startWalkingAnimation(citizen);
		this.path = this.citizen.getNavigator().pathfind(this.targetNeighbor, 0);
		GroundPathNavigator groundpathnavigator = (GroundPathNavigator)this.citizen.getNavigator();
		groundpathnavigator.setBreakDoors(true);
		groundpathnavigator.setPath(path, speed);
		
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		this.updatePath();
		
		if(!this.targetNeighbor.isAlive())
		{
			return false;
		}
		
		if(this.stopTime > 10)
		{
			return false;
		}
		
		return this.citizen.getDistanceSq(this.targetNeighbor) > 4.0D;
	}
	
	@Nullable
	private TownEntity findRandomNeighbor()
	{
		TownEntity neighbor = null;
		List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(this.citizen, this.citizen.getBoundingBox().grow(50));
		Entity entity = list.get(this.world.rand.nextInt(list.size()));
		if(entity instanceof TownEntity)
		{
			neighbor = (TownEntity)entity;
		}
		
		return neighbor;
	}
	
	@Override
	public void resetTask()
	{
		this.stopTime = 0;
		this.citizen.getNavigator().clearPath();
		ModelAnimations.endWalkingAnimation(citizen);
	}
	
	private void updatePath()
	{
		if(this.citizen.getNavigator().noPath())
		{
			this.stopTime++;
			this.citizen.getNavigator().clearPath();
			this.path = this.citizen.getNavigator().pathfind(targetNeighbor, 0);
			this.citizen.getNavigator().tryMoveToEntityLiving(targetNeighbor, this.speed);
			ModelAnimations.startWalkingAnimation(citizen);
		}
		
		if(this.citizen.collidedHorizontally)
		{
			this.stopTime++;
			this.citizen.getNavigator().clearPath();
			this.path = this.citizen.getNavigator().pathfind(targetNeighbor, 0);
			this.citizen.getNavigator().tryMoveToEntityLiving(targetNeighbor, this.speed);
			ModelAnimations.startWalkingAnimation(citizen);
		}
	}
}
