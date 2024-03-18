package mod.arcalitegames.odyssey.world.structure.structures.ruins.desert_ruins;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DesertRuins extends StructureBase
{

	public DesertRuins(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		DesertRuinsComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 10, 6, 8, 42, 46, 40, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity husk38 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk38, "husk");
	    this.spawnEntity(husk38, world, 14, 9, 24, start);
	    this.generateChest(world, Direction.EAST, 14, 21, 24, start, 1);
	    this.generateChest(world, Direction.NORTH, 15, 16, 35, start, 1);
	    CreatureEntity husk39 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk39, "husk");
	    this.spawnEntity(husk39, world, 15, 21, 18, start);
	    CreatureEntity husk40 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk40, "husk");
	    this.spawnEntity(husk40, world, 15, 21, 31, start);
	    CreatureEntity husk41 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk41, "husk");
	    this.spawnEntity(husk41, world, 19, 21, 35, start);
	    CreatureEntity husk42 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk42, "husk");
	    this.spawnEntity(husk42, world, 21, 21, 13, start);
	    this.generateChest(world, Direction.NORTH, 21, 21, 35, start, 2);
	    CreatureEntity husk43 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk43, "husk");
	    this.spawnEntity(husk43, world, 24, 9, 24, start);
	    CreatureEntity husk44 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk44, "husk");
	    this.spawnEntity(husk44, world, 25, 9, 36, start);
	    CreatureEntity husk45 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk45, "husk");
	    this.spawnEntity(husk45, world, 26, 9, 12, start);
	    CreatureEntity husk46 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk46, "husk");
	    this.spawnEntity(husk46, world, 26, 9, 21, start);
	    CreatureEntity husk47 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk47, "husk");
	    this.spawnEntity(husk47, world, 26, 9, 27, start);
	    this.generateChest(world, Direction.EAST, 26, 20, 24, start, 3);
	    CreatureEntity husk48 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk48, "husk");
	    this.spawnEntity(husk48, world, 26, 21, 13, start);
	    CreatureEntity husk49 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk49, "husk");
	    this.spawnEntity(husk49, world, 27, 9, 36, start);
	    CreatureEntity husk50 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk50, "husk");
	    this.spawnEntity(husk50, world, 28, 9, 24, start);
	    CreatureEntity husk51 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk51, "husk");
	    this.spawnEntity(husk51, world, 33, 21, 35, start);
	    this.generateChest(world, Direction.SOUTH, 36, 9, 14, start, 2);
	    this.generateChest(world, Direction.NORTH, 36, 9, 34, start, 1);
	    CreatureEntity husk52 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk52, "husk");
	    this.spawnEntity(husk52, world, 36, 21, 15, start);
	    this.generateChest(world, Direction.WEST, 37, 16, 13, start, 2);
	    this.generateChest(world, Direction.SOUTH, 37, 21, 13, start, 2);
	    CreatureEntity husk53 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk53, "husk");
	    this.spawnEntity(husk53, world, 37, 21, 20, start);
	    CreatureEntity husk54 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk54, "husk");
	    this.spawnEntity(husk54, world, 37, 21, 29, start);
	    this.generateChest(world, Direction.WEST, 37, 21, 34, start, 1);
	    this.generateChest(world, Direction.WEST, 38, 21, 28, start, 2);
	    CreatureEntity husk55 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:husk")).create(world);
	    this.setItemsForEntity(husk55, "husk");
	    this.spawnEntity(husk55, world, 39, 9, 24, start);
	    this.executeCommand(world);
	}

}
