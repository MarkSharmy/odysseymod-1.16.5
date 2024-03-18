package mod.arcalitegames.odyssey.world.structure.structures.ruins.stone_hedge;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StoneHedgeRuins extends StructureBase
{

	public StoneHedgeRuins(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		StoneHedgeComponent0.init(world, origin, this);
		StoneHedgeComponent1.init(world, origin, this);
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    this.generateChest(world, Direction.WEST, 129, 9, 71, start, 1);
	    this.executeCommand(world);
	}


}
