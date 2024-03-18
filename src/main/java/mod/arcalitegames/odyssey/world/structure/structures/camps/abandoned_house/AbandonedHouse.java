package mod.arcalitegames.odyssey.world.structure.structures.camps.abandoned_house;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AbandonedHouse extends StructureBase
{

	public AbandonedHouse(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		AbandonedHouseComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 4, 5, 6, 22, 18, 21, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
		this.executeCommand(world);
	}

}
