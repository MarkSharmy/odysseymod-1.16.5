package mod.arcalitegames.odyssey.world.structure.structures.statues.statue_spearpointing;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StatueWarriorSpearPointing extends StructureBase
{

	public StatueWarriorSpearPointing(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		SpearPointingComponents.init(world, start, this);
        this.fillWithBlocks(world, start, 8, 7, 10, 45, 89, 43, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    this.generateChest(world, Direction.EAST, 20, 12, 24, start, 1);
	    this.generateChest(world, Direction.WEST, 30, 12, 23, start, 2);
	    this.executeCommand(world);
	}

}
