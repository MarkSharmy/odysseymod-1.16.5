package mod.arcalitegames.odyssey.world.structure.structures.towers.watch_tower;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WatchTower extends StructureBase
{

	public WatchTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		WatchTowerComponents.init(worldIn,  origin,  this);
        this.fillWithBlocks(world, start, 5, 4, 5, 17, 49, 17, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit7, "bandit");
	    this.spawnEntity(bandit7, world, -170, 5, -53, start);
	    CreatureEntity bandit_thug8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug8, "bandit_thug");
	    this.spawnEntity(bandit_thug8, world, -170, 5, -45, start);
	    CreatureEntity bandit_outlaw9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw9, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw9, world, -166, 4, -49, start);
	    this.generateChest(world, Direction.WEST, -165, 17, -50, start, 1);
	    this.generateChest(world, Direction.WEST, -165, 17, -48, start, 1);
	    CreatureEntity bandit10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit10, "bandit");
	    this.spawnEntity(bandit10, world, -161, 5, -49, start);
	    this.executeCommand(world);
	}

}
