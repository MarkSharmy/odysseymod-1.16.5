package mod.arcalitegames.odyssey.world.structure.structures.ruins.cathedral;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CathedralRuins extends StructureBase
{

	public CathedralRuins(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		CathedralComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 6, 6, 7, 64, 51, 56, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit1, "bandit");
	    this.spawnEntity(bandit1, world, 22, 7, 25, start);
	    CreatureEntity bandit2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit2, "bandit");
	    this.spawnEntity(bandit2, world, 22, 7, 33, start);
	    this.generateChest(world, Direction.NORTH, 27, 28, 37, start, 1);
	    CreatureEntity bandit_outlaw3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw3, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw3, world, 28, 28, 35, start);
	    this.generateChest(world, Direction.NORTH, 30, 7, 36, start, 1);
	    CreatureEntity bandit4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit4, "bandit");
	    this.spawnEntity(bandit4, world, 31, 16, 42, start);
	    CreatureEntity bandit5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit5, "bandit");
	    this.spawnEntity(bandit5, world, 32, 7, 44, start);
	    this.generateChest(world, Direction.NORTH, 32, 16, 46, start, 1);
	    this.generateChest(world, Direction.SOUTH, 33, 28, 21, start, 2);
	    this.generateChest(world, Direction.SOUTH, 35, 7, 23, start, 1);
	    CreatureEntity bandit_outlaw6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw6, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw6, world, 35, 7, 29, start);
	    CreatureEntity bandit7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit7, "bandit");
	    this.spawnEntity(bandit7, world, 36, 7, 28, start);
	    CreatureEntity bandit_thug8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug8, "bandit_thug");
	    this.spawnEntity(bandit_thug8, world, 36, 7, 30, start);
	    CreatureEntity bandit_outlaw9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw9, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw9, world, 36, 28, 23, start);
	    CreatureEntity bandit10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit10, "bandit");
	    this.spawnEntity(bandit10, world, 39, 28, 36, start);
	    this.generateChest(world, Direction.NORTH, 42, 28, 38, start, 2);
	    this.generateChest(world, Direction.SOUTH, 44, 15, 39, start, 1);
	    this.generateChest(world, Direction.SOUTH, 44, 28, 21, start, 3);
	    CreatureEntity bandit11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit11, "bandit");
	    this.spawnEntity(bandit11, world, 45, 16, 44, start);
	    CreatureEntity bandit12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit12, "bandit");
	    this.spawnEntity(bandit12, world, 48, 7, 16, start);
	    CreatureEntity bandit13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit13, "bandit");
	    this.spawnEntity(bandit13, world, 49, 7, 43, start);
	    CreatureEntity bandit_outlaw14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw14, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw14, world, 57, 7, 29, start);
	    this.executeCommand(world);
	}

}
