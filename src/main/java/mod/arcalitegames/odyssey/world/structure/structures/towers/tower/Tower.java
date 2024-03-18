package mod.arcalitegames.odyssey.world.structure.structures.towers.tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Tower extends StructureBase
{

	public Tower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		TowerComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -16, 5, -5, -4, 35, 7, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit14, "bandit");
	    this.spawnEntity(bandit14, world, 7, 7, 12, start);
	    this.generateChest(world, Direction.EAST, 10, 7, 11, start, 1);
	    CreatureEntity bandit_thug15 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug15, "bandit_thug");
	    this.spawnEntity(bandit_thug15, world, 11, 7, 11, start);
	    CreatureEntity bandit16 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit16, "bandit");
	    this.spawnEntity(bandit16, world, 15, 7, 10, start);
	    CreatureEntity bandit17 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit17, "bandit");
	    this.spawnEntity(bandit17, world, 15, 7, 12, start);
	    this.executeCommand(world);
	}

}
