package mod.arcalitegames.odyssey.world.structure.structures.ruins.jungle_ruins;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JungleRuins extends StructureBase
{

	public JungleRuins(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		JungleRuinsComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 10, 6, 8, 74, 116, 71, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity goblin_knocker56 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker56, "goblin_knocker");
	    this.spawnEntity(goblin_knocker56, world, 16, 7, 62, start);
	    CreatureEntity hobgoblin57 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin57, "hobgoblin");
	    this.spawnEntity(hobgoblin57, world, 17, 7, 39, start);
	    CreatureEntity goblin_knocker58 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker58, "goblin_knocker");
	    this.spawnEntity(goblin_knocker58, world, 21, 7, 14, start);
	    this.generateChest(world, Direction.NORTH, 27, 9, 56, start, 1);
	    CreatureEntity goblin_knocker59 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker59, "goblin_knocker");
	    this.spawnEntity(goblin_knocker59, world, 29, 7, 31, start);
	    CreatureEntity goblin_knocker60 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker60, "goblin_knocker");
	    this.spawnEntity(goblin_knocker60, world, 32, 7, 47, start);
	    CreatureEntity hobgoblin61 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin61, "hobgoblin");
	    this.spawnEntity(hobgoblin61, world, 41, 7, 63, start);
	    CreatureEntity hobgoblin62 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin62, "hobgoblin");
	    this.spawnEntity(hobgoblin62, world, 42, 7, 14, start);
	    CreatureEntity goblin_knocker63 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker63, "goblin_knocker");
	    this.spawnEntity(goblin_knocker63, world, 42, 7, 23, start);
	    this.generateChest(world, Direction.NORTH, 42, 8, 39, start, 2);
	    CreatureEntity goblin_knocker64 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker64, "goblin_knocker");
	    this.spawnEntity(goblin_knocker64, world, 44, 7, 45, start);
	    CreatureEntity goblin_knocker65 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker65, "goblin_knocker");
	    this.spawnEntity(goblin_knocker65, world, 47, 7, 38, start);
	    CreatureEntity goblin_knocker66 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker66, "goblin_knocker");
	    this.spawnEntity(goblin_knocker66, world, 56, 7, 28, start);
	    this.generateChest(world, Direction.WEST, 63, 9, 34, start, 1);
	    CreatureEntity goblin_knocker67 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker67, "goblin_knocker");
	    this.spawnEntity(goblin_knocker67, world, 66, 7, 16, start);
	    CreatureEntity goblin_knocker68 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker68, "goblin_knocker");
	    this.spawnEntity(goblin_knocker68, world, 66, 7, 64, start);
	    CreatureEntity hobgoblin69 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin69, "hobgoblin");
	    this.spawnEntity(hobgoblin69, world, 67, 7, 39, start);
	    this.executeCommand(world);
	}

}
