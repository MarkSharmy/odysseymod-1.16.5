package mod.arcalitegames.odyssey.world.structure.structures.ruins.temple;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InfestedTemple extends StructureBase
{

	public InfestedTemple(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		TempleComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -74, 6, -25, -9, 64, 41, Blocks.AIR.getDefaultState());

	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity goblin_knocker1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker1, "goblin_knocker");
	    this.spawnEntity(goblin_knocker1, world, 19, 9, 37, start);
	    CreatureEntity goblin_knocker2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker2, "goblin_knocker");
	    this.spawnEntity(goblin_knocker2, world, 19, 9, 49, start);
	    this.generateChest(world, Direction.EAST, 21, 12, 40, start, 1);
	    this.generateChest(world, Direction.EAST, 21, 12, 41, start, 1);
	    this.generateChest(world, Direction.EAST, 21, 12, 46, start, 1);
	    this.generateChest(world, Direction.EAST, 21, 12, 47, start, 1);
	    CreatureEntity hobgoblin3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin3, "hobgoblin");
	    this.spawnEntity(hobgoblin3, world, 26, 10, 43, start);
	    CreatureEntity goblin_knocker4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker4, "goblin_knocker");
	    this.spawnEntity(goblin_knocker4, world, 37, 9, 33, start);
	    CreatureEntity goblin_knocker5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker5, "goblin_knocker");
	    this.spawnEntity(goblin_knocker5, world, 37, 9, 53, start);
	    CreatureEntity goblin_kobold6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold6, "goblin_kobold");
	    this.spawnEntity(goblin_kobold6, world, 37, 9, 62, start);
	    CreatureEntity goblin_kobold7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold7, "goblin_kobold");
	    this.spawnEntity(goblin_kobold7, world, 38, 9, 24, start);
	    CreatureEntity hobgoblin8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin8, "hobgoblin");
	    this.spawnEntity(hobgoblin8, world, 38, 10, 40, start);
	    CreatureEntity hobgoblin9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin9, "hobgoblin");
	    this.spawnEntity(hobgoblin9, world, 38, 10, 46, start);
	    CreatureEntity goblin_kobold10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold10, "goblin_kobold");
	    this.spawnEntity(goblin_kobold10, world, 48, 9, 24, start);
	    CreatureEntity goblin_knocker11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker11, "goblin_knocker");
	    this.spawnEntity(goblin_knocker11, world, 49, 9, 33, start);
	    CreatureEntity goblin_knocker12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker12, "goblin_knocker");
	    this.spawnEntity(goblin_knocker12, world, 49, 9, 53, start);
	    CreatureEntity goblin_kobold13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold13, "goblin_kobold");
	    this.spawnEntity(goblin_kobold13, world, 49, 9, 62, start);
	    CreatureEntity goblin_kobold14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold14, "goblin_kobold");
	    this.spawnEntity(goblin_kobold14, world, 54, 10, 38, start);
	    CreatureEntity hobgoblin15 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin15, "hobgoblin");
	    this.spawnEntity(hobgoblin15, world, 54, 10, 48, start);
	    CreatureEntity goblin_trow16 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_trow")).create(world);
	    this.setItemsForEntity(goblin_trow16, "goblin_trow");
	    this.spawnEntity(goblin_trow16, world, 63, 10, 43, start);
	    this.generateChest(world, Direction.WEST, 65, 10, 41, start, 1);
	    this.generateChest(world, Direction.WEST, 65, 10, 45, start, 1);
	    CreatureEntity goblin_knocker17 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker17, "goblin_knocker");
	    this.spawnEntity(goblin_knocker17, world, 67, 9, 38, start);
	    CreatureEntity goblin_knocker18 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker18, "goblin_knocker");
	    this.spawnEntity(goblin_knocker18, world, 67, 9, 49, start);
	    this.executeCommand(world);
	}

}
