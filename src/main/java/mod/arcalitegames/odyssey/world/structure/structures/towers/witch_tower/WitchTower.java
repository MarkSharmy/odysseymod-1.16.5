package mod.arcalitegames.odyssey.world.structure.structures.towers.witch_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WitchTower extends StructureBase
{

	public WitchTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		WitchTowerComponents.init(worldIn, origin, this);
        this.fillWithBlocks(world, start, 4, 5, 4, 18, 46, 18, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity witch7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch7, "witch");
	    this.spawnEntity(witch7, world, 6, 6, 11, start);
	    CreatureEntity witch8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch8, "witch");
	    this.spawnEntity(witch8, world, 9, 18, 7, start);
	    this.generateChest(world, Direction.EAST, 9, 22, 9, start, 2);
	    CreatureEntity witch9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch9, "witch");
	    this.spawnEntity(witch9, world, 11, 6, 9, start);
	    CreatureEntity witch10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch10, "witch");
	    this.spawnEntity(witch10, world, 11, 22, 11, start);
	    this.generateChest(world, Direction.NORTH, 12, 25, 13, start, 1);
	    CreatureEntity witch11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch11, "witch");
	    this.spawnEntity(witch11, world, 13, 12, 10, start);
	    this.generateChest(world, Direction.WEST, 13, 15, 7, start, 1);
	    this.generateChest(world, Direction.WEST, 14, 10, 7, start, 1);
	    CreatureEntity witch12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch12, "witch");
	    this.spawnEntity(witch12, world, 15, 6, 11, start);
	    CreatureEntity witch13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch13, "witch");
	    this.spawnEntity(witch13, world, 16, 6, 8, start);
	    this.executeCommand(world);
	}

}
