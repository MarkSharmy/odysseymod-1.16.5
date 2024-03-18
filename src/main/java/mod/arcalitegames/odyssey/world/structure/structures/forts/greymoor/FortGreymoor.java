package mod.arcalitegames.odyssey.world.structure.structures.forts.greymoor;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FortGreymoor extends StructureBase
{

	public FortGreymoor(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		GreymoorComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 0, 8, 0, 106, 46, 102, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    this.generateChest(world, Direction.WEST, 18, 18, 40, start, 1);
	    this.generateChest(world, Direction.NORTH, 28, 15, 46, start, 2);
	    this.generateChest(world, Direction.EAST, 30, 15, 60, start, 2);
	    CreatureEntity bandit_plunderer1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_plunderer")).create(world);
	    this.setItemsForEntity(bandit_plunderer1, "bandit_plunderer");
	    this.spawnEntity(bandit_plunderer1, world, 32, 15, 47, start);
	    CreatureEntity bandit2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit2, "bandit");
	    this.spawnEntity(bandit2, world, 33, 15, 32, start);
	    this.generateChest(world, Direction.NORTH, 34, 26, 18, start, 3);
	    CreatureEntity bandit_thug3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug3, "bandit_thug");
	    this.spawnEntity(bandit_thug3, world, 35, 26, 18, start);
	    CreatureEntity bandit4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit4, "bandit");
	    this.spawnEntity(bandit4, world, 36, 15, 31, start);
	    CreatureEntity bandit5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit5, "bandit");
	    this.spawnEntity(bandit5, world, 43, 14, 67, start);
	    this.generateChest(world, Direction.EAST, 46, 8, 63, start, 1);
	    CreatureEntity bandit_plunderer6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_plunderer")).create(world);
	    this.setItemsForEntity(bandit_plunderer6, "bandit_plunderer");
	    this.spawnEntity(bandit_plunderer6, world, 47, 10, 40, start);
	    this.generateChest(world, Direction.SOUTH, 48, 10, 36, start, 3);
	    CreatureEntity bandit_thug7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug7, "bandit_thug");
	    this.spawnEntity(bandit_thug7, world, 49, 8, 60, start);
	    CreatureEntity bandit8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit8, "bandit");
	    this.spawnEntity(bandit8, world, 49, 14, 20, start);
	    this.generateChest(world, Direction.SOUTH, 52, 17, 80, start, 2);
	    CreatureEntity bandit_thug9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug9, "bandit_thug");
	    this.spawnEntity(bandit_thug9, world, 53, 17, 76, start);
	    CreatureEntity bandit10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit10, "bandit");
	    this.spawnEntity(bandit10, world, 56, 14, 21, start);
	    CreatureEntity bandit11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit11, "bandit");
	    this.spawnEntity(bandit11, world, 62, 8, 56, start);
	    this.generateChest(world, Direction.EAST, 62, 13, 17, start, 1);
	    CreatureEntity bandit12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit12, "bandit");
	    this.spawnEntity(bandit12, world, 63, 8, 56, start);
	    this.generateChest(world, Direction.EAST, 63, 20, 15, start, 2);
	    CreatureEntity bandit13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit13, "bandit");
	    this.spawnEntity(bandit13, world, 64, 8, 56, start);
	    CreatureEntity bandit14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit14, "bandit");
	    this.spawnEntity(bandit14, world, 65, 8, 81, start);
	    CreatureEntity bandit_thug15 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug15, "bandit_thug");
	    this.spawnEntity(bandit_thug15, world, 66, 13, 19, start);
	    CreatureEntity bandit16 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit16, "bandit");
	    this.spawnEntity(bandit16, world, 68, 16, 78, start);
	    CreatureEntity bandit17 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit17, "bandit");
	    this.spawnEntity(bandit17, world, 69, 8, 81, start);
	    CreatureEntity bandit_thug18 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug18, "bandit_thug");
	    this.spawnEntity(bandit_thug18, world, 70, 8, 41, start);
	    CreatureEntity bandit_outlaw19 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw19, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw19, world, 73, 8, 64, start);
	    CreatureEntity bandit_outlaw20 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw20, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw20, world, 77, 12, 55, start);
	    CreatureEntity bandit21 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit21, "bandit");
	    this.spawnEntity(bandit21, world, 77, 14, 78, start);
	    CreatureEntity bandit_outlaw22 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw22, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw22, world, 83, 20, 45, start);
	    this.generateChest(world, Direction.NORTH, 83, 20, 46, start, 2);
	    this.executeCommand(world);
	}

}
