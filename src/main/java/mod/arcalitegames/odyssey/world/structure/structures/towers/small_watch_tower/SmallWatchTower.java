package mod.arcalitegames.odyssey.world.structure.structures.towers.small_watch_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SmallWatchTower extends StructureBase
{

	public SmallWatchTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		SmallTowerComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 5, 6, 5, 17, 39, 17, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity pillager17 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager17, "pillager");
	    this.spawnEntity(pillager17, world, 6, 7, 11, start);
	    CreatureEntity pillager18 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager18, "pillager");
	    this.spawnEntity(pillager18, world, 11, 7, 6, start);
	    CreatureEntity vindicator19 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator19, "vindicator");
	    this.spawnEntity(vindicator19, world, 11, 7, 11, start);
	    CreatureEntity pillager20 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager20, "pillager");
	    this.spawnEntity(pillager20, world, 11, 7, 16, start);
	    CreatureEntity vindicator21 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator21, "vindicator");
	    this.spawnEntity(vindicator21, world, 11, 13, 11, start);
	    CreatureEntity illusioner22 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner22, "illusioner");
	    this.spawnEntity(illusioner22, world, 11, 21, 10, start);
	    this.generateChest(world, Direction.SOUTH, 12, 21, 10, start, 1);
	    CreatureEntity pillager23 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager23, "pillager");
	    this.spawnEntity(pillager23, world, 16, 7, 11, start);
	    this.executeCommand(world);
	}

}
