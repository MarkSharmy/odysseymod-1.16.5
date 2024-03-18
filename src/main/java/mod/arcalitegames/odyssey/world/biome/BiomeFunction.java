package mod.arcalitegames.odyssey.world.biome;

import java.util.List;

import com.google.common.collect.Lists;

import mod.arcalitegames.odyssey.enums.StructureClass;
import mod.arcalitegames.odyssey.world.SuperWorld;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;

public class BiomeFunction
{
	public static final List<Block> obstractions =Lists.newArrayList(  
			
			Blocks.COBBLESTONE,
			Blocks.MOSSY_COBBLESTONE,
			Blocks.BRICKS,
			Blocks.SANDSTONE,
			Blocks.RED_SANDSTONE,
			Blocks.STONE_BRICKS,
			Blocks.MOSSY_STONE_BRICKS,
			Blocks.COBBLESTONE_SLAB,
			Blocks.MOSSY_COBBLESTONE_SLAB,
			Blocks.BRICK_SLAB,
			Blocks.SANDSTONE_SLAB,
			Blocks.RED_SANDSTONE_SLAB,
			Blocks.STONE_BRICK_SLAB,
			Blocks.MOSSY_STONE_BRICK_SLAB,
			
			Blocks.ACACIA_PLANKS,
			Blocks.BIRCH_PLANKS,
			Blocks.CRIMSON_PLANKS,
			Blocks.DARK_OAK_PLANKS,
			Blocks.JUNGLE_PLANKS,
			Blocks.OAK_PLANKS,
			Blocks.SPRUCE_PLANKS,
			Blocks.WARPED_PLANKS,
			Blocks.ACACIA_STAIRS,
			Blocks.BIRCH_STAIRS,
			Blocks.CRIMSON_STAIRS,
			Blocks.DARK_OAK_STAIRS,
			Blocks.JUNGLE_STAIRS,
			Blocks.OAK_STAIRS,
			Blocks.SPRUCE_STAIRS,
			Blocks.WARPED_STAIRS,
			
			Blocks.COBBLESTONE_STAIRS,
			Blocks.MOSSY_COBBLESTONE_STAIRS,
			Blocks.BRICK_STAIRS,
			Blocks.SANDSTONE_STAIRS,
			Blocks.RED_SANDSTONE_STAIRS,
			Blocks.STONE_BRICK_STAIRS,
			Blocks.MOSSY_STONE_BRICK_STAIRS,
			Blocks.COBBLESTONE_WALL,
			Blocks.MOSSY_COBBLESTONE_WALL,
			Blocks.BRICK_WALL,
			Blocks.SANDSTONE_WALL,
			Blocks.RED_SANDSTONE_WALL,
			Blocks.STONE_BRICK_WALL,
			Blocks.MOSSY_STONE_BRICK_WALL,
			
			Blocks.ACACIA_SLAB,
			Blocks.BIRCH_SLAB,
			Blocks.CRIMSON_SLAB,
			Blocks.DARK_OAK_SLAB,
			Blocks.JUNGLE_SLAB,
			Blocks.OAK_SLAB,
			Blocks.SPRUCE_SLAB,
			Blocks.WARPED_SLAB,
			
			Blocks.NETHER_BRICK_FENCE,
			Blocks.NETHER_BRICK_SLAB,
			Blocks.NETHER_BRICK_FENCE,
			Blocks.NETHER_BRICKS,
			
			Blocks.CHISELED_NETHER_BRICKS,
			Blocks.CHISELED_POLISHED_BLACKSTONE,
			Blocks.CHISELED_RED_SANDSTONE,
			Blocks.CHISELED_SANDSTONE,
			Blocks.CHISELED_STONE_BRICKS,
			
			Blocks.CUT_RED_SANDSTONE,
			Blocks.CUT_RED_SANDSTONE_SLAB,
			Blocks.CUT_SANDSTONE,
			Blocks.CUT_SANDSTONE_SLAB,
			
			Blocks.POLISHED_ANDESITE,
			Blocks.POLISHED_ANDESITE_SLAB,
			Blocks.POLISHED_ANDESITE_STAIRS,
			Blocks.POLISHED_BLACKSTONE,
			Blocks.POLISHED_BLACKSTONE_BRICKS,
			Blocks.POLISHED_BLACKSTONE_BRICK_SLAB,
			Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS,
			Blocks.POLISHED_BLACKSTONE_BRICK_WALL,
			Blocks.POLISHED_DIORITE,
			Blocks.POLISHED_DIORITE_SLAB,
			Blocks.POLISHED_DIORITE_STAIRS,
			Blocks.POLISHED_GRANITE,
			Blocks.POLISHED_GRANITE_SLAB,
			Blocks.POLISHED_GRANITE_STAIRS,
			
			Blocks.ACACIA_BUTTON,
			Blocks.BIRCH_BUTTON,
			Blocks.CRIMSON_BUTTON,
			Blocks.DARK_OAK_BUTTON,
			Blocks.JUNGLE_BUTTON,
			Blocks.OAK_BUTTON,
			Blocks.SPRUCE_BUTTON,
			Blocks.WARPED_BUTTON,
			Blocks.ACACIA_FENCE,
			Blocks.BIRCH_FENCE,
			Blocks.CRIMSON_FENCE,
			Blocks.DARK_OAK_FENCE,
			Blocks.JUNGLE_FENCE,
			Blocks.OAK_FENCE,
			Blocks.SPRUCE_FENCE,
			Blocks.WARPED_FENCE,
			
			Blocks.ACACIA_DOOR,
			Blocks.BIRCH_DOOR,
			Blocks.CRIMSON_DOOR,
			Blocks.DARK_OAK_DOOR,
			Blocks.JUNGLE_DOOR,
			Blocks.OAK_DOOR,
			Blocks.SPRUCE_DOOR,
			Blocks.WARPED_DOOR,
			Blocks.ACACIA_FENCE_GATE,
			Blocks.BIRCH_FENCE_GATE,
			Blocks.CRIMSON_FENCE_GATE,
			Blocks.DARK_OAK_FENCE_GATE,
			Blocks.JUNGLE_FENCE_GATE,
			Blocks.OAK_FENCE_GATE,
			Blocks.SPRUCE_FENCE_GATE,
			Blocks.WARPED_FENCE_GATE,
			
			Blocks.ACACIA_TRAPDOOR,
			Blocks.BIRCH_TRAPDOOR,
			Blocks.CRIMSON_TRAPDOOR,
			Blocks.DARK_OAK_TRAPDOOR,
			Blocks.JUNGLE_TRAPDOOR,
			Blocks.OAK_TRAPDOOR,
			Blocks.SPRUCE_TRAPDOOR,
			Blocks.WARPED_TRAPDOOR,
			
			Blocks.ACACIA_PRESSURE_PLATE,
			Blocks.BIRCH_PRESSURE_PLATE,
			Blocks.CRIMSON_PRESSURE_PLATE,
			Blocks.DARK_OAK_PRESSURE_PLATE,
			Blocks.JUNGLE_PRESSURE_PLATE,
			Blocks.OAK_PRESSURE_PLATE,
			Blocks.SPRUCE_PRESSURE_PLATE,
			Blocks.WARPED_PRESSURE_PLATE
	);
	
	public static boolean structureObstracting(BlockPos start, StructureClass structureClass)
	{
		int x = start.getX();
		int y = start.getY();
		int z = start.getZ();
		
		ClientWorld world = SuperWorld.getClientWorld();
		
		int range =  structureClass.getRange();
		
		for(int i = 0; i < range; i++)
		{
			for(int j = 0; j < range; j++)
			{
				for(int k = 0; k < range; k++)
				{
					BlockPos pos = new BlockPos(x + i, y + j, z + k);
					BlockState state = world.getBlockState(pos);
					Block nextBlock = state.getBlock();
					
					for(Block block: obstractions)
					{
						if(block.equals(nextBlock))
						{
							return true;
						}
					}
					
				}
			}
		}
		
		return false;
	}
	
}
