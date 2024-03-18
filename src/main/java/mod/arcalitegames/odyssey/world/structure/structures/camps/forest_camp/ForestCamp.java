package mod.arcalitegames.odyssey.world.structure.structures.camps.forest_camp;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ForestCamp extends StructureBase
{

	public ForestCamp(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		ForestCampComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -62, 6, -54, -2, 43, 15, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit_thug371 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug371, "bandit_thug");
	    this.spawnEntity(bandit_thug371, world, 16, 9, 36, start);
	    CreatureEntity bandit372 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit372, "bandit");
	    this.spawnEntity(bandit372, world, 20, 7, 63, start);
	    this.generateChest(world, Direction.EAST, 21, 7, 24, start, 1);
	    CreatureEntity bandit_plunderer373 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_plunderer")).create(world);
	    this.setItemsForEntity(bandit_plunderer373, "bandit_plunderer");
	    this.spawnEntity(bandit_plunderer373, world, 23, 7, 25, start);
	    CreatureEntity bandit374 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit374, "bandit");
	    this.spawnEntity(bandit374, world, 24, 7, 35, start);
	    this.generateChest(world, Direction.WEST, 26, 8, 25, start, 1);
	    CreatureEntity bandit375 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit375, "bandit");
	    this.spawnEntity(bandit375, world, 29, 7, 9, start);
	    CreatureEntity bandit376 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit376, "bandit");
	    this.spawnEntity(bandit376, world, 31, 6, 50, start);
	    CreatureEntity bandit377 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit377, "bandit");
	    this.spawnEntity(bandit377, world, 33, 7, 36, start);
	    CreatureEntity bandit378 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit378, "bandit");
	    this.spawnEntity(bandit378, world, 34, 7, 67, start);
	    CreatureEntity bandit379 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit379, "bandit");
	    this.spawnEntity(bandit379, world, 35, 7, 39, start);
	    CreatureEntity bandit_marauder380 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_marauder")).create(world);
	    this.setItemsForEntity(bandit_marauder380, "bandit_marauder");
	    this.spawnEntity(bandit_marauder380, world, 40, 7, 32, start);
	    this.generateChest(world, Direction.SOUTH, 41, 7, 30, start, 2);
	    CreatureEntity bandit_outlaw381 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw381, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw381, world, 43, 7, 51, start);
	    CreatureEntity bandit_thug382 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug382, "bandit_thug");
	    this.spawnEntity(bandit_thug382, world, 54, 9, 42, start);
	    CreatureEntity bandit383 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit383, "bandit");
	    this.spawnEntity(bandit383, world, 55, 7, 29, start);
	    CreatureEntity bandit384 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit384, "bandit");
	    this.spawnEntity(bandit384, world, 56, 7, 53, start);
	    this.executeCommand(world);
	}

}
