package mod.arcalitegames.odyssey.world.structure.structures.towers.lighthouse;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LightHouse extends StructureBase
{

	public LightHouse(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		LightHouseComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -16, 5, -5, -4, 42, 7, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity bandit11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit11, "bandit");
	    this.spawnEntity(bandit11, world, 7, 7, 11, start);
	    CreatureEntity bandit12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit12, "bandit");
	    this.spawnEntity(bandit12, world, 11, 7, 7, start);
	    CreatureEntity bandit13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit13, "bandit");
	    this.spawnEntity(bandit13, world, 11, 7, 15, start);
	    CreatureEntity bandit_plunderer14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit_plunderer")).create(world);
	    this.setItemsForEntity(bandit_plunderer14, "bandit_plunderer");
	    this.spawnEntity(bandit_plunderer14, world, 11, 15, 11, start);
	    CreatureEntity bandit15 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit15, "bandit");
	    this.spawnEntity(bandit15, world, 12, 10, 12, start);
	    this.generateChest(world, Direction.WEST, 13, 20, 11, start, 1);
	    CreatureEntity bandit16 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:bandit")).create(world);
	    this.setItemsForEntity(bandit16, "bandit");
	    this.spawnEntity(bandit16, world, 15, 7, 11, start);
	    this.executeCommand(world);
	}

}
