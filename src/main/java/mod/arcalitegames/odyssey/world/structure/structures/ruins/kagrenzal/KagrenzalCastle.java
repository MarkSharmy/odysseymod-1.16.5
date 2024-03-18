package mod.arcalitegames.odyssey.world.structure.structures.ruins.kagrenzal;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KagrenzalCastle extends StructureBase
{

	public KagrenzalCastle(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		KagrenzalComponent0.init(world, origin, this);
		KagrenzalComponent1.init(world, origin, this);
		KagrenzalComponent2.init(world, origin, this);
	    this.fillWithBlocks(world, start, -23, 6, 20, -100, 64, -68, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity vindicator19 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator19, "vindicator");
	    this.spawnEntity(vindicator19, world, -170, 7, 0, start);
	    this.generateChest(world, Direction.EAST, -163, 8, -14, start, 1);
	    this.generateChest(world, Direction.EAST, -163, 8, 13, start, 1);
	    CreatureEntity illusioner20 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner20, "illusioner");
	    this.spawnEntity(illusioner20, world, -163, 8, 29, start);
	    CreatureEntity vindicator21 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator21, "vindicator");
	    this.spawnEntity(vindicator21, world, -163, 14, -16, start);
	    CreatureEntity vindicator22 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator22, "vindicator");
	    this.spawnEntity(vindicator22, world, -163, 14, 15, start);
	    this.generateChest(world, Direction.EAST, -163, 26, -14, start, 1);
	    this.generateChest(world, Direction.EAST, -163, 26, 13, start, 1);
	    this.generateChest(world, Direction.SOUTH, -162, 15, 25, start, 2);
	    CreatureEntity vindicator23 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator23, "vindicator");
	    this.spawnEntity(vindicator23, world, -162, 15, 27, start);
	    CreatureEntity vindicator24 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator24, "vindicator");
	    this.spawnEntity(vindicator24, world, -161, 26, -11, start);
	    CreatureEntity vindicator25 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator25, "vindicator");
	    this.spawnEntity(vindicator25, world, -161, 26, 10, start);
	    this.generateChest(world, Direction.NORTH, -160, 26, -11, start, 1);
	    this.generateChest(world, Direction.SOUTH, -160, 26, 10, start, 1);
	    this.generateChest(world, Direction.NORTH, -158, 14, -11, start, 1);
	    this.generateChest(world, Direction.SOUTH, -158, 14, 10, start, 1);
	    this.generateChest(world, Direction.WEST, -157, 7, -15, start, 1);
	    this.generateChest(world, Direction.WEST, -157, 7, 14, start, 1);
	    this.generateChest(world, Direction.WEST, -157, 14, -13, start, 1);
	    this.generateChest(world, Direction.WEST, -157, 14, 12, start, 1);
	    this.generateChest(world, Direction.WEST, -157, 26, -14, start, 1);
	    this.generateChest(world, Direction.WEST, -157, 26, 13, start, 1);
	    CreatureEntity vindicator26 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator26, "vindicator");
	    this.spawnEntity(vindicator26, world, -155, 7, 55, start);
	    CreatureEntity vindicator27 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator27, "vindicator");
	    this.spawnEntity(vindicator27, world, -155, 8, 23, start);
	    this.generateChest(world, Direction.SOUTH, -155, 9, 33, start, 1);
	    CreatureEntity illusioner28 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner28, "illusioner");
	    this.spawnEntity(illusioner28, world, -153, 7, -4, start);
	    CreatureEntity evoker29 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker29, "evoker");
	    this.spawnEntity(evoker29, world, -153, 8, 42, start);
	    CreatureEntity evoker30 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker30, "evoker");
	    this.spawnEntity(evoker30, world, -153, 13, 5, start);
	    CreatureEntity vindicator31 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator31, "vindicator");
	    this.spawnEntity(vindicator31, world, -151, 7, 55, start);
	    CreatureEntity vindicator32 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator32, "vindicator");
	    this.spawnEntity(vindicator32, world, -151, 8, 23, start);
	    this.generateChest(world, Direction.SOUTH, -151, 9, 33, start, 1);
	    this.generateChest(world, Direction.EAST, -149, 8, -14, start, 1);
	    this.generateChest(world, Direction.EAST, -149, 8, 13, start, 1);
	    CreatureEntity vindicator33 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator33, "vindicator");
	    this.spawnEntity(vindicator33, world, -149, 14, -16, start);
	    CreatureEntity vindicator34 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator34, "vindicator");
	    this.spawnEntity(vindicator34, world, -149, 14, 15, start);
	    this.generateChest(world, Direction.EAST, -149, 26, -14, start, 1);
	    this.generateChest(world, Direction.EAST, -149, 26, 13, start, 1);
	    CreatureEntity vindicator35 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator35, "vindicator");
	    this.spawnEntity(vindicator35, world, -147, 26, -11, start);
	    CreatureEntity vindicator36 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator36, "vindicator");
	    this.spawnEntity(vindicator36, world, -147, 26, 10, start);
	    this.generateChest(world, Direction.NORTH, -146, 26, -11, start, 1);
	    this.generateChest(world, Direction.SOUTH, -146, 26, 10, start, 1);
	    this.generateChest(world, Direction.NORTH, -144, 14, -11, start, 1);
	    this.generateChest(world, Direction.SOUTH, -144, 14, 10, start, 1);
	    this.generateChest(world, Direction.SOUTH, -144, 15, 25, start, 2);
	    CreatureEntity vindicator37 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator37, "vindicator");
	    this.spawnEntity(vindicator37, world, -144, 15, 27, start);
	    this.generateChest(world, Direction.WEST, -143, 7, -15, start, 1);
	    this.generateChest(world, Direction.WEST, -143, 7, 14, start, 1);
	    CreatureEntity illusioner38 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner38, "illusioner");
	    this.spawnEntity(illusioner38, world, -143, 8, 29, start);
	    this.generateChest(world, Direction.WEST, -143, 14, -13, start, 1);
	    this.generateChest(world, Direction.WEST, -143, 14, 12, start, 1);
	    this.generateChest(world, Direction.WEST, -143, 26, -14, start, 1);
	    this.generateChest(world, Direction.WEST, -143, 26, 13, start, 1);
	    CreatureEntity vindicator39 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator39, "vindicator");
	    this.spawnEntity(vindicator39, world, -136, 7, 0, start);
	    this.executeCommand(world);
	}

}
