package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.Path;
import net.minecraft.world.World;

public class WanderThroughTownGoal2 extends Goal
{
	protected Path path;
	protected World world;
	protected double speed;
	protected int executionChance;
	protected boolean stopWhenIdle;
	protected CitizenEntity citizen;
	protected CitizenEntity targetNeighbor;
	
	public WanderThroughTownGoal2(CitizenEntity citizen)
	{
		this(citizen, 0.3);
	}
	
	public WanderThroughTownGoal2(CitizenEntity citizen, double speed)
	{
		this(citizen, speed, 240, true);
	}
	
	public WanderThroughTownGoal2(CitizenEntity citizenIn, double speedIn, int chance, boolean stopWhenIdle)
	{
		this.citizen = citizenIn;
		this.speed = speedIn;
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
		else 
		{
			this.targetNeighbor = this.findRandomNeighbor();
			return this.targetNeighbor != null;
		}
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startWalkingAnimation(citizen);
		this.path = this.citizen.getNavigator().pathfind(this.targetNeighbor, 0);
		GroundPathNavigator groundpathnavigator = (GroundPathNavigator)this.citizen.getNavigator();
		groundpathnavigator.setBreakDoors(true);
		
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		if(!this.targetNeighbor.isAlive())
		{
			return false;
		}
		
		return this.citizen.getDistanceSq(this.targetNeighbor) > 3.0D;
	}
	
	@Nullable
	private CitizenEntity findRandomNeighbor()
	{
		CitizenEntity citizenEntity = null;
		List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(this.citizen, this.citizen.getBoundingBox().grow(50));
		Entity entity = list.get(this.world.rand.nextInt(list.size()));
		if(entity instanceof CitizenEntity)
		{
			citizenEntity = (CitizenEntity)entity;
		}
		
		return citizenEntity;
	}
	
	@Override
	public void resetTask()
	{
		this.citizen.getNavigator().clearPath();
		ModelAnimations.endWalkingAnimation(citizen);
	}
	
	@Override
	public void tick()
	{
		this.citizen.getNavigator().setPath(path, 0.3D);
		if(this.citizen.getNavigator().noPath())
		{
			this.citizen.getNavigator().clearPath();
			this.citizen.getNavigator().tryMoveToEntityLiving(targetNeighbor, 0.3D);
		}
	}
}
