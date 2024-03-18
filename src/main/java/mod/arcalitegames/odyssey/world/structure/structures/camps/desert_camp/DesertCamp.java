package mod.arcalitegames.odyssey.world.structure.structures.camps.desert_camp;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DesertCamp extends StructureBase
{

	public DesertCamp(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		DesertCampComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -36, 6, 1, -4, 38, 32, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit361 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit361, "bandit");
	    this.spawnEntity(bandit361, world, 11, 7, 31, start);
	    CreatureEntity bandit362 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit362, "bandit");
	    this.spawnEntity(bandit362, world, 15, 7, 18, start);
	    CreatureEntity bandit_outlaw363 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw363, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw363, world, 17, 7, 25, start);
	    this.generateChest(world, Direction.SOUTH, 20, 6, 15, start, 1);
	    CreatureEntity bandit_plunderer364 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_plunderer")).create(world);
	    this.setItemsForEntity(bandit_plunderer364, "bandit_plunderer");
	    this.spawnEntity(bandit_plunderer364, world, 21, 6, 17, start);
	    CreatureEntity bandit_outlaw365 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw365, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw365, world, 21, 7, 29, start);
	    CreatureEntity bandit366 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit366, "bandit");
	    this.spawnEntity(bandit366, world, 22, 7, 25, start);
	    CreatureEntity bandit367 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit367, "bandit");
	    this.spawnEntity(bandit367, world, 26, 7, 31, start);
	    CreatureEntity bandit368 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit368, "bandit");
	    this.spawnEntity(bandit368, world, 28, 7, 17, start);
	    CreatureEntity bandit_outlaw369 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw369, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw369, world, 29, 7, 23, start);
	    CreatureEntity bandit_outlaw370 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw370, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw370, world, 32, 7, 32, start);
	    this.executeCommand(world);
	}

}
