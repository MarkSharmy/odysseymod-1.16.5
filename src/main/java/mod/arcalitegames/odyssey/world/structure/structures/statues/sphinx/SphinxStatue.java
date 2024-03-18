package mod.arcalitegames.odyssey.world.structure.structures.statues.sphinx;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SphinxStatue extends StructureBase
{

	public SphinxStatue(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		SphinxComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 0, 0, 0, 136, 61, 63, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
		this.executeCommand(world);
	}

}
