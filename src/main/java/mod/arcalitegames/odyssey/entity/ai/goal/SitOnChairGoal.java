package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;

import javax.annotation.Nullable;

import mod.arcalitegames.buildersaddition.blocks.base.ISeat.ChairSeat;
import mod.arcalitegames.odyssey.blocks.ChairBlock;
import mod.arcalitegames.odyssey.blocks.ModBlocks;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class SitOnChairGoal extends Goal{

	protected Path path;
	private int stopTime;
	protected World world;
	protected double speed;
	protected int maxDistance;
	protected int executionChance;
	protected boolean stopWhenIdle;
	protected ModEntity entity;
	protected BlockPos targetPos;
	protected boolean foundChair = false;
	
	public SitOnChairGoal(ModEntity entity, int maxDistanceIn)
	{
		this(entity, 0.3, maxDistanceIn);
	}
	
	public SitOnChairGoal(ModEntity entity, double speed, int maxDistanceIn)
	{
		this(entity, speed, maxDistanceIn, 240, true);
	}
	
	public SitOnChairGoal(ModEntity entity, double speedIn, int maxDistanceIn, int chance, boolean stopWhenIdle)
	{
		this.stopTime = 0;
		this.speed = speedIn;
		this.entity = entity;
		this.world = entity.world;
		this.executionChance = chance;
		this.maxDistance = maxDistanceIn;
		this.stopWhenIdle = stopWhenIdle;
		this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
	}

	@Override
	public boolean shouldExecute()
	{
		if(this.entity.getRNG().nextInt(this.executionChance) != 0)
		{
			return false;
		}
		if(this.entity.isSitting())
		{
			return false;
		}
		if(!(this.entity instanceof CitizenEntity))
		{
			return false;
		}
		
		this.targetPos = this.findChairBlock();
		return this.targetPos != null;
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startWalkingAnimation(entity);
		this.path = this.entity.getNavigator().getPathToPos(targetPos, 0);
		GroundPathNavigator groundpathnavigator = (GroundPathNavigator)this.entity.getNavigator();
		groundpathnavigator.setBreakDoors(true);
		groundpathnavigator.setPath(path, speed);
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		if(this.stopTime > 40)
		{
			return false;
		}
		
		this.updatePath();
		
		return !this.foundChair;
	}
	
	@Override
	public void tick()
	{
		this.update();
	}
	
	private void update()
	{
		Vector3d vector3d = Vector3d.copyCenteredHorizontally(this.targetPos);
		if(this.entity.getDistanceSq(vector3d) < 4.0)
		{
			this.entity.sit();
			ModelAnimations.endWalkingAnimation(entity);
			ChairSeat seat = new ChairSeat(Entities.SEAT_CHAIR.get(), this.world);
			seat.setParameters(this.world.getBlockState(targetPos).getBlock(), world, Vector3d.copy(targetPos));
			this.world.addEntity(seat);
			this.entity.startRiding(seat);
			this.foundChair = true;
		}
	}
	
	private void updatePath()
	{
		if(this.entity.getNavigator().noPath())
		{
			this.stopTime++;
			this.entity.getNavigator().clearPath();
			this.path = this.entity.getNavigator().getPathToPos(targetPos, 0);
			this.entity.getNavigator().setPath(path, this.speed);
		}
		
		if(this.entity.collidedHorizontally)
		{
			this.stopTime++;
			this.entity.getNavigator().clearPath();
			this.path = this.entity.getNavigator().getPathToPos(targetPos, 0);
			this.entity.getNavigator().setPath(path, this.speed);
		}
	}
	
	@Override
	public void resetTask()
	{
		this.stopTime = 0;
		this.foundChair = false;
		this.entity.getNavigator().clearPath();
	}
	
	@Nullable
	private BlockPos findChairBlock()
	{
		BlockPos pos = this.entity.findRandomTargetBlock(ModBlocks.CHAIR.get(), 50);
		if(pos != null)
		{
			BlockState state = this.world.getBlockState(pos);
			
			/*
			if(state.get(ChairBlock.OCCUPIED))
			{
				this.findChairBlock();
			}
			else
			{
				
			}
			*/
			return pos;
		}
		
		return null;
	}

}
