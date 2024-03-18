package mod.arcalitegames.odyssey.entity.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.ModEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityPerimeter {

	protected World world;
	protected final ModEntity entity;
	protected BlockPos entityPosition;
	
	public EntityPerimeter(ModEntity modEntity)
	{
		this.entity = modEntity;
		this.world = modEntity.world;
	}
	
	/**
	    * Returns a random blockpos matching the given block, within the maxDistance perimeter.
	    */
	public BlockPos findRandomTargetBlock(Block block, int maxDistance)
	{
		BlockPos start = BlockPos.ZERO;
		List<BlockPos> list = new ArrayList<>();
		this.entityPosition = this.entity.getPosition();
		start = this.entityPosition.west(maxDistance);
		start = start.north(maxDistance);
		
		for(int i = 0; i < maxDistance * 2; i++)
		{
			for(int j = 0; j < maxDistance; j++)
			{
				for(int k = 0; k < maxDistance * 2; k++)
				{
					BlockState blockstate = world.getBlockState(start.add(i, j, k));
					if(blockstate.getBlock() == block)
					{
						list.add(start.add(i, j, k));
					}
				}
			}
		}
		
		return list.get(new Random().nextInt(list.size()));
	}
	
	/**
	    * Returns the first blockpos it finds with the matching blockstate within the maxDistance perimeter.
	    */
	@Nullable
	public BlockPos findSpecificTargetBlock(BlockState blockstate, int maxDistance)
	{
		BlockPos start = BlockPos.ZERO;
		this.entityPosition = this.entity.getPosition();
		start = this.entityPosition.west(maxDistance);
		start = start.north(maxDistance);
		
		for(int i = 0; i < maxDistance * 2; i++)
		{
			for(int j = 0; j < maxDistance; j++)
			{
				for(int k = 0; k < maxDistance * 2; k++)
				{
					BlockPos pos = start.add(i, j, k);
					BlockState state = world.getBlockState(pos);
					if(blockstate.equals(state))
					{
						return pos;
					}
				}
			}
		}
		
		return null;
	}
	
	@Nullable
	public BlockPos findRandomTargetBlock(BlockState blockstate, int maxDistance)
	{
		BlockPos start = BlockPos.ZERO;
		List<BlockPos> list = new ArrayList<>();
		this.entityPosition = this.entity.getPosition();
		start = this.entityPosition.west(maxDistance);
		start = start.north(maxDistance);
		
		for(int i = 0; i < maxDistance * 2; i++)
		{
			for(int j = 0; j < maxDistance; j++)
			{
				for(int k = 0; k < maxDistance * 2; k++)
				{
					BlockState state = world.getBlockState(start.add(i, j, k));
					if(blockstate.equals(state))
					{
						list.add(start.add(i, j, k));
					}
				}
			}
		}
		
		return list.get(new Random().nextInt(list.size()));
	}

}
