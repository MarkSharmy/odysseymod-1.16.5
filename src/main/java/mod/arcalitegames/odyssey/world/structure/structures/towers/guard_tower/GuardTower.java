package mod.arcalitegames.odyssey.world.structure.structures.towers.guard_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GuardTower extends StructureBase
{

	public GuardTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		GuardTowerComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -18, 6, 2, -2, 50, 15, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity vindicator1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator1, "vindicator");
	    this.spawnEntity(vindicator1, world, 9, 6, 11, start);
	    this.generateChest(world, Direction.WEST, 11, 6, 10, start, 1);
	    CreatureEntity vindicator2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator2, "vindicator");
	    this.spawnEntity(vindicator2, world, 12, 6, 6, start);
	    this.generateChest(world, Direction.NORTH, 13, 15, 12, start, 1);
	    CreatureEntity evoker3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker3, "evoker");
	    this.spawnEntity(evoker3, world, 14, 15, 11, start);
	    CreatureEntity evoker4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker4, "evoker");
	    this.spawnEntity(evoker4, world, 14, 19, 11, start);
	    this.generateChest(world, Direction.NORTH, 14, 19, 14, start, 1);
	    CreatureEntity illusioner5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner5, "illusioner");
	    this.spawnEntity(illusioner5, world, 14, 25, 11, start);
	    this.generateChest(world, Direction.WEST, 15, 6, 10, start, 1);
	    CreatureEntity evoker6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker6, "evoker");
	    this.spawnEntity(evoker6, world, 17, 9, 10, start);
	    this.executeCommand(world);
	}


}
