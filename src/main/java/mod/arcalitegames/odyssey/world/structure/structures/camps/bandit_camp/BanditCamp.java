package mod.arcalitegames.odyssey.world.structure.structures.camps.bandit_camp;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BanditCamp extends StructureBase {

	public BanditCamp(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		BanditCampComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -25, 0, -3, -1, 30, 16, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit113 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit113, "bandit");
	    this.spawnEntity(bandit113, world, 10, 7, 7, start);
	    this.generateChest(world, Direction.EAST, 11, 7, 14, start, 1);
	    CreatureEntity bandit_outlaw114 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw114, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw114, world, 13, 7, 13, start);
	    CreatureEntity bandit115 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit115, "bandit");
	    this.spawnEntity(bandit115, world, 13, 7, 19, start);
	    CreatureEntity bandit_outlaw116 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_outlaw")).create(world);
	    this.setItemsForEntity(bandit_outlaw116, "bandit_outlaw");
	    this.spawnEntity(bandit_outlaw116, world, 16, 7, 7, start);
	    this.generateChest(world, Direction.SOUTH, 17, 7, 5, start, 1);
	    CreatureEntity bandit_thug117 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug117, "bandit_thug");
	    this.spawnEntity(bandit_thug117, world, 17, 7, 15, start);
	    CreatureEntity bandit_thug118 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_thug")).create(world);
	    this.setItemsForEntity(bandit_thug118, "bandit_thug");
	    this.spawnEntity(bandit_thug118, world, 21, 7, 10, start);
	    CreatureEntity bandit119 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit119, "bandit");
	    this.spawnEntity(bandit119, world, 24, 7, 18, start);
	    this.executeCommand(world);
	}

}
