package mod.arcalitegames.odyssey.world.structure.structures.forts.abandoned_fort;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AbandonedFort extends StructureBase
{

	public AbandonedFort(World worldIn, BlockPos origin, int xRange, int yRange, int zRange) 
	{
		super(worldIn, origin, xRange, yRange, zRange);
		AbandonedFortComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 4, 5, 5, 51, 34, 38, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity goblin_knocker58 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker58, "goblin_knocker");
	    this.spawnEntity(goblin_knocker58, world, 5, 6, 19, start);
	    CreatureEntity goblin_knocker59 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker59, "goblin_knocker");
	    this.spawnEntity(goblin_knocker59, world, 5, 6, 37, start);
	    this.generateChest(world, Direction.SOUTH, 11, 14, 13, start, 1);
	    CreatureEntity goblin_kobold60 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold60, "goblin_kobold");
	    this.spawnEntity(goblin_kobold60, world, 11, 14, 16, start);
	    CreatureEntity goblin_knocker61 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker61, "goblin_knocker");
	    this.spawnEntity(goblin_knocker61, world, 14, 6, 5, start);
	    CreatureEntity goblin_knocker62 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker62, "goblin_knocker");
	    this.spawnEntity(goblin_knocker62, world, 14, 9, 15, start);
	    CreatureEntity hobgoblin63 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin63, "hobgoblin");
	    this.spawnEntity(hobgoblin63, world, 15, 9, 14, start);
	    CreatureEntity hobgoblin64 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin64, "hobgoblin");
	    this.spawnEntity(hobgoblin64, world, 15, 9, 16, start);
	    this.generateChest(world, Direction.SOUTH, 15, 14, 13, start, 1);
	    CreatureEntity goblin_knocker65 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker65, "goblin_knocker");
	    this.spawnEntity(goblin_knocker65, world, 16, 9, 15, start);
	    CreatureEntity goblin_knocker66 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker66, "goblin_knocker");
	    this.spawnEntity(goblin_knocker66, world, 18, 6, 30, start);
	    CreatureEntity goblin_kobold67 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold67, "goblin_kobold");
	    this.spawnEntity(goblin_kobold67, world, 18, 14, 16, start);
	    this.generateChest(world, Direction.SOUTH, 20, 14, 13, start, 1);
	    CreatureEntity goblin_knocker68 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker68, "goblin_knocker");
	    this.spawnEntity(goblin_knocker68, world, 23, 6, 5, start);
	    CreatureEntity goblin_knocker69 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker69, "goblin_knocker");
	    this.spawnEntity(goblin_knocker69, world, 24, 6, 33, start);
	    this.generateChest(world, Direction.EAST, 24, 19, 15, start, 2);
	    this.generateChest(world, Direction.SOUTH, 25, 14, 12, start, 1);
	    CreatureEntity goblin_kobold70 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold70, "goblin_kobold");
	    this.spawnEntity(goblin_kobold70, world, 26, 14, 17, start);
	    this.generateChest(world, Direction.NORTH, 26, 19, 17, start, 3);
	    this.generateChest(world, Direction.SOUTH, 27, 9, 12, start, 1);
	    this.generateChest(world, Direction.WEST, 28, 19, 15, start, 2);
	    CreatureEntity goblin_knocker71 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker71, "goblin_knocker");
	    this.spawnEntity(goblin_knocker71, world, 31, 6, 36, start);
	    CreatureEntity goblin_knocker72 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker72, "goblin_knocker");
	    this.spawnEntity(goblin_knocker72, world, 36, 6, 6, start);
	    this.generateChest(world, Direction.SOUTH, 38, 14, 19, start, 2);
	    CreatureEntity goblin_knocker73 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker73, "goblin_knocker");
	    this.spawnEntity(goblin_knocker73, world, 39, 10, 22, start);
	    CreatureEntity hobgoblin74 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin74, "hobgoblin");
	    this.spawnEntity(hobgoblin74, world, 40, 10, 12, start);
	    this.generateChest(world, Direction.EAST, 40, 10, 25, start, 1);
	    this.generateChest(world, Direction.EAST, 40, 10, 27, start, 1);
	    CreatureEntity goblin_knocker75 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker75, "goblin_knocker");
	    this.spawnEntity(goblin_knocker75, world, 41, 10, 11, start);
	    CreatureEntity goblin_knocker76 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker76, "goblin_knocker");
	    this.spawnEntity(goblin_knocker76, world, 41, 10, 13, start);
	    CreatureEntity goblin_knocker77 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker77, "goblin_knocker");
	    this.spawnEntity(goblin_knocker77, world, 41, 10, 30, start);
	    CreatureEntity hobgoblin78 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin78, "hobgoblin");
	    this.spawnEntity(hobgoblin78, world, 41, 14, 21, start);
	    CreatureEntity hobgoblin79 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin79, "hobgoblin");
	    this.spawnEntity(hobgoblin79, world, 42, 10, 12, start);
	    this.generateChest(world, Direction.SOUTH, 42, 14, 19, start, 2);
	    CreatureEntity goblin_knocker80 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker80, "goblin_knocker");
	    this.spawnEntity(goblin_knocker80, world, 43, 10, 22, start);
	    this.executeCommand(world);
	}

}
