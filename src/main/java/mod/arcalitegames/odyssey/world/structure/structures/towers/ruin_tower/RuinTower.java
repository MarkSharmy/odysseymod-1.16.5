package mod.arcalitegames.odyssey.world.structure.structures.towers.ruin_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RuinTower extends StructureBase
{

	public RuinTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		RuinTowerComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -16, 5, -5, -4, 49, 7, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity witch1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch1, "witch");
	    this.spawnEntity(witch1, world, 10, 12, 12, start);
	    CreatureEntity witch2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch2, "witch");
	    this.spawnEntity(witch2, world, 11, 8, 11, start);
	    CreatureEntity witch3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch3, "witch");
	    this.spawnEntity(witch3, world, 12, 8, 16, start);
	    CreatureEntity witch4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch4, "witch");
	    this.spawnEntity(witch4, world, 12, 17, 10, start);
	    CreatureEntity witch5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch5, "witch");
	    this.spawnEntity(witch5, world, 12, 21, 11, start);
	    this.generateChest(world, Direction.WEST, 13, 21, 11, start, 2);
	    CreatureEntity witch6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:witch")).create(world);
	    this.setItemsForEntity(witch6, "witch");
	    this.spawnEntity(witch6, world, 14, 7, 16, start);
	    this.executeCommand(world);
	}

}
