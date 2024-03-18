package mod.arcalitegames.odyssey.world.structure.structures.camps.outpost_camp;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OutpostCamp extends StructureBase
{

	public OutpostCamp(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		OutpostComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 0, 0, 0, 0, 0, 9, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit_marauder102 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_marauder")).create(world);
	    this.setItemsForEntity(bandit_marauder102, "bandit_marauder");
	    this.spawnEntity(bandit_marauder102, world, 18, 7, 25, start);
	    CreatureEntity bandit_thug103 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug103, "bandit_thug");
	    this.spawnEntity(bandit_thug103, world, 22, 7, 19, start);
	    CreatureEntity bandit_outlaw104 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw104, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw104, world, 22, 7, 31, start);
	    this.generateChest(world, Direction.WEST, 26, 7, 19, start, 1);
	    this.generateChest(world, Direction.WEST, 26, 7, 31, start, 1);
	    CreatureEntity bandit105 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit105, "bandit");
	    this.spawnEntity(bandit105, world, 30, 7, 23, start);
	    CreatureEntity bandit106 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit106, "bandit");
	    this.spawnEntity(bandit106, world, 30, 7, 27, start);
	    CreatureEntity bandit_outlaw107 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw107, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw107, world, 38, 7, 23, start);
	    CreatureEntity bandit_thug108 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug108, "bandit_thug");
	    this.spawnEntity(bandit_thug108, world, 38, 7, 27, start);
	    CreatureEntity bandit109 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit109, "bandit");
	    this.spawnEntity(bandit109, world, 44, 7, 23, start);
	    CreatureEntity bandit110 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit110, "bandit");
	    this.spawnEntity(bandit110, world, 44, 7, 27, start);
	    CreatureEntity bandit111 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit111, "bandit");
	    this.spawnEntity(bandit111, world, 50, 7, 23, start);
	    CreatureEntity bandit112 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit112, "bandit");
	    this.spawnEntity(bandit112, world, 50, 7, 27, start);
	    this.executeCommand(world);
	}

}
