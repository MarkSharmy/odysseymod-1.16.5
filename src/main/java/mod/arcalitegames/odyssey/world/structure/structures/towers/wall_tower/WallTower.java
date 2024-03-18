package mod.arcalitegames.odyssey.world.structure.structures.towers.wall_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WallTower extends StructureBase
{

	public WallTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		WallTowerComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -42, 5, -7, -4, 43, 7, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity vindicator18 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator18, "vindicator");
	    this.spawnEntity(vindicator18, world, 13, 7, 8, start);
	    CreatureEntity vindicator19 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator19, "vindicator");
	    this.spawnEntity(vindicator19, world, 13, 7, 12, start);
	    CreatureEntity evoker20 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker20, "evoker");
	    this.spawnEntity(evoker20, world, 13, 13, 12, start);
	    CreatureEntity pillager21 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager21, "pillager");
	    this.spawnEntity(pillager21, world, 13, 26, 12, start);
	    CreatureEntity pillager22 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager22, "pillager");
	    this.spawnEntity(pillager22, world, 22, 13, 12, start);
	    CreatureEntity pillager23 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager23, "pillager");
	    this.spawnEntity(pillager23, world, 24, 7, 9, start);
	    CreatureEntity pillager24 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager24, "pillager");
	    this.spawnEntity(pillager24, world, 24, 7, 15, start);
	    CreatureEntity pillager25 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager25, "pillager");
	    this.spawnEntity(pillager25, world, 29, 13, 12, start);
	    CreatureEntity vindicator26 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator26, "vindicator");
	    this.spawnEntity(vindicator26, world, 35, 7, 8, start);
	    CreatureEntity vindicator27 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator27, "vindicator");
	    this.spawnEntity(vindicator27, world, 35, 7, 12, start);
	    CreatureEntity evoker28 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker28, "evoker");
	    this.spawnEntity(evoker28, world, 35, 13, 12, start);
	    CreatureEntity pillager29 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager29, "pillager");
	    this.spawnEntity(pillager29, world, 35, 26, 12, start);
	    this.executeCommand(world);
	}

}
