package mod.arcalitegames.odyssey.world.structure.structures.ruins.old_ruins;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Ruins extends StructureBase
{

	public Ruins(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		RuinsComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -96, 6, -17, -8, 46, 41, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    this.generateChest(world, Direction.EAST, -91, 8, -18, start, 1);
	    CreatureEntity bandit_outlaw52 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw52, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw52, world, -88, 8, -18, start);
	    this.generateChest(world, Direction.WEST, -77, 11, -30, start, 2);
	    CreatureEntity bandit_outlaw53 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw53, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw53, world, -63, 12, -20, start);
	    CreatureEntity bandit_marauder54 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_marauder")).create(world);
	    this.setItemsForEntity(bandit_marauder54, "bandit_marauder");
	    this.spawnEntity(bandit_marauder54, world, -59, 16, -31, start);
	    this.generateChest(world, Direction.SOUTH, -57, 16, -31, start, 3);
	    this.generateChest(world, Direction.SOUTH, -56, 16, -31, start, 2);
	    CreatureEntity bandit55 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit55, "bandit");
	    this.spawnEntity(bandit55, world, -54, 16, -27, start);
	    CreatureEntity bandit56 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit56, "bandit");
	    this.spawnEntity(bandit56, world, -53, 16, -28, start);
	    this.generateChest(world, Direction.EAST, -47, 8, -21, start, 1);
	    CreatureEntity bandit57 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit57, "bandit");
	    this.spawnEntity(bandit57, world, -47, 9, -4, start);
	    CreatureEntity bandit_outlaw58 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw58, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw58, world, -43, 8, -6, start);
	    this.generateChest(world, Direction.NORTH, -37, 9, -33, start, 1);
	    CreatureEntity bandit59 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit59, "bandit");
	    this.spawnEntity(bandit59, world, -36, 8, -36, start);
	    CreatureEntity bandit_outlaw60 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw60, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw60, world, -35, 8, -38, start);
	    this.executeCommand(world);
	}

}
