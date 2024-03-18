package mod.arcalitegames.odyssey.world.structure.structures.camps.bandit_hideout;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BanditHideout extends StructureBase
{

	public BanditHideout(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		BanditHideoutComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -45, 4, -6, -6, 34, 23, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit92 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit92, "bandit");
	    this.spawnEntity(bandit92, world, 14, 6, 32, start);
	    CreatureEntity bandit93 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit93, "bandit");
	    this.spawnEntity(bandit93, world, 17, 6, 13, start);
	    CreatureEntity bandit_plunderer94 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_plunderer")).create(world);
	    this.setItemsForEntity(bandit_plunderer94, "bandit_plunderer");
	    this.spawnEntity(bandit_plunderer94, world, 19, 6, 22, start);
	    CreatureEntity bandit95 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit95, "bandit");
	    this.spawnEntity(bandit95, world, 21, 6, 31, start);
	    CreatureEntity bandit_thug96 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug96, "bandit_thug");
	    this.spawnEntity(bandit_thug96, world, 24, 6, 23, start);
	    this.generateChest(world, Direction.SOUTH, 25, 6, 17, start, 1);
	    CreatureEntity bandit97 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit97, "bandit");
	    this.spawnEntity(bandit97, world, 30, 6, 30, start);
	    CreatureEntity bandit_outlaw98 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw98, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw98, world, 31, 6, 18, start);
	    CreatureEntity bandit_thug99 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug99, "bandit_thug");
	    this.spawnEntity(bandit_thug99, world, 31, 6, 23, start);
	    CreatureEntity bandit100 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit100, "bandit");
	    this.spawnEntity(bandit100, world, 35, 6, 11, start);
	    this.generateChest(world, Direction.WEST, 35, 6, 24, start, 1);
	    CreatureEntity bandit101 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit101, "bandit");
	    this.spawnEntity(bandit101, world, 39, 6, 32, start);
	    this.executeCommand(world);
	}

}
