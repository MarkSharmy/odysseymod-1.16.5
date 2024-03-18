package mod.arcalitegames.odyssey.world.structure.structures.ruins.ancient_ruins;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AncientRuins extends StructureBase
{

	public AncientRuins(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		AncientComponent0.init(world, origin, this);
		AncientComponent1.init(world, origin, this);
		AncientComponent2.init(world, origin, this);
		AncientComponent3.init(world, origin, this);
		AncientComponent4.init(world, origin, this);
		AncientComponent5.init(world, origin, this);
		AncientComponent6.init(world, origin, this);
		AncientComponent7.init(world, origin, this);
		AncientComponent8.init(world, origin, this);
        this.fillWithBlocks(world, start, 11, 7, 9, 67, 36, 60, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity vindicator1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator1, "vindicator");
	    this.spawnEntity(vindicator1, world, 22, 7, 39, start);
	    CreatureEntity vindicator2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator2, "vindicator");
	    this.spawnEntity(vindicator2, world, 23, 7, 26, start);
	    CreatureEntity vindicator3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator3, "vindicator");
	    this.spawnEntity(vindicator3, world, 27, 7, 50, start);
	    this.generateChest(world, Direction.SOUTH, 30, 7, 25, start, 2);
	    this.generateChest(world, Direction.EAST, 30, 7, 42, start, 1);
	    CreatureEntity pillager4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager4, "pillager");
	    this.spawnEntity(pillager4, world, 31, 15, 30, start);
	    CreatureEntity pillager5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager5, "pillager");
	    this.spawnEntity(pillager5, world, 35, 17, 38, start);
	    CreatureEntity vindicator6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator6, "vindicator");
	    this.spawnEntity(vindicator6, world, 37, 7, 53, start);
	    CreatureEntity vindicator7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator7, "vindicator");
	    this.spawnEntity(vindicator7, world, 37, 8, 17, start);
	    CreatureEntity illusioner8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner8, "illusioner");
	    this.spawnEntity(illusioner8, world, 39, 7, 34, start);
	    CreatureEntity ravager9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager9, "ravager");
	    this.spawnEntity(ravager9, world, 39, 7, 58, start);
	    this.generateChest(world, Direction.NORTH, 42, 7, 39, start, 1);
	    CreatureEntity pillager10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager10, "pillager");
	    this.spawnEntity(pillager10, world, 43, 17, 30, start);
	    CreatureEntity pillager11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager11, "pillager");
	    this.spawnEntity(pillager11, world, 43, 17, 38, start);
	    this.generateChest(world, Direction.SOUTH, 46, 7, 25, start, 1);
	    CreatureEntity pillager12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager12, "pillager");
	    this.spawnEntity(pillager12, world, 47, 15, 38, start);
	    CreatureEntity vindicator13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator13, "vindicator");
	    this.spawnEntity(vindicator13, world, 49, 7, 49, start);
	    CreatureEntity vindicator14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator14, "vindicator");
	    this.spawnEntity(vindicator14, world, 52, 8, 19, start);
	    CreatureEntity vindicator15 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator15, "vindicator");
	    this.spawnEntity(vindicator15, world, 56, 7, 29, start);
	    CreatureEntity vindicator16 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator16, "vindicator");
	    this.spawnEntity(vindicator16, world, 56, 7, 41, start);
	    this.executeCommand(world);
	}

}
