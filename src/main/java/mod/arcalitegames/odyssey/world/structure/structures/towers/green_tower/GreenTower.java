package mod.arcalitegames.odyssey.world.structure.structures.towers.green_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GreenTower extends StructureBase
{

	public GreenTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		GreenTowerComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -57, 6, -15, -4, 77, 20, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit1, "bandit");
	    this.spawnEntity(bandit1, world, 26, 15, 27, start);
	    CreatureEntity bandit2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit2, "bandit");
	    this.spawnEntity(bandit2, world, 27, 12, 21, start);
	    CreatureEntity bandit_outlaw3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw3, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw3, world, 27, 21, 26, start);
	    this.generateChest(world, Direction.EAST, 27, 40, 26, start, 2);
	    CreatureEntity bandit_outlaw4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw4, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw4, world, 28, 30, 21, start);
	    this.generateChest(world, Direction.EAST, 29, 28, 21, start, 1);
	    CreatureEntity bandit_thug5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug5, "bandit_thug");
	    this.spawnEntity(bandit_thug5, world, 30, 9, 24, start);
	    CreatureEntity bandit_outlaw6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw6, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw6, world, 30, 21, 20, start);
	    CreatureEntity bandit_plunderer7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_plunderer")).create(world);
	    this.setItemsForEntity(bandit_plunderer7, "bandit_plunderer");
	    this.spawnEntity(bandit_plunderer7, world, 30, 28, 27, start);
	    CreatureEntity bandit8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit8, "bandit");
	    this.spawnEntity(bandit8, world, 30, 33, 28, start);
	    CreatureEntity bandit_marauder9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_marauder")).create(world);
	    this.setItemsForEntity(bandit_marauder9, "bandit_marauder");
	    this.spawnEntity(bandit_marauder9, world, 30, 39, 23, start);
	    this.generateChest(world, Direction.WEST, 33, 21, 28, start, 1);
	    CreatureEntity bandit_thug10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug10, "bandit_thug");
	    this.spawnEntity(bandit_thug10, world, 34, 28, 24, start);
	    CreatureEntity bandit11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit11, "bandit");
	    this.spawnEntity(bandit11, world, 42, 9, 21, start);
	    CreatureEntity bandit12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit12, "bandit");
	    this.spawnEntity(bandit12, world, 42, 9, 27, start);
	    CreatureEntity bandit13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit13, "bandit");
	    this.spawnEntity(bandit13, world, 54, 7, 15, start);
	    CreatureEntity bandit14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit14, "bandit");
	    this.spawnEntity(bandit14, world, 54, 7, 31, start);
	    this.executeCommand(world);
	}

}
