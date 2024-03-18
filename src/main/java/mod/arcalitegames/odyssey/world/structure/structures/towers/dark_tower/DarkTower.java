package mod.arcalitegames.odyssey.world.structure.structures.towers.dark_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DarkTower extends StructureBase
{

	public DarkTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		DarkTowerComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 9, 6, 7, 25, 63, 25, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity vindicator1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator1, "vindicator");
	    this.spawnEntity(vindicator1, world, 8, 7, 13, start);
	    CreatureEntity vindicator2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator2, "vindicator");
	    this.spawnEntity(vindicator2, world, 8, 7, 18, start);
	    CreatureEntity pillager3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager3, "pillager");
	    this.spawnEntity(pillager3, world, 10, 15, 10, start);
	    CreatureEntity pillager4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager4, "pillager");
	    this.spawnEntity(pillager4, world, 10, 15, 21, start);
	    CreatureEntity vindicator5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator5, "vindicator");
	    this.spawnEntity(vindicator5, world, 15, 7, 7, start);
	    this.generateChest(world, Direction.NORTH, 15, 7, 19, start, 1);
	    this.generateChest(world, Direction.EAST, 15, 31, 15, start, 2);
	    this.generateChest(world, Direction.SOUTH, 16, 7, 12, start, 1);
	    CreatureEntity vindicator6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator6, "vindicator");
	    this.spawnEntity(vindicator6, world, 17, 7, 24, start);
	    this.generateChest(world, Direction.WEST, 19, 7, 16, start, 1);
	    CreatureEntity pillager7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager7, "pillager");
	    this.spawnEntity(pillager7, world, 21, 15, 10, start);
	    CreatureEntity pillager8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager8, "pillager");
	    this.spawnEntity(pillager8, world, 21, 15, 21, start);
	    CreatureEntity vindicator9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator9, "vindicator");
	    this.spawnEntity(vindicator9, world, 24, 7, 15, start);
	    this.executeCommand(world);
	}

}
