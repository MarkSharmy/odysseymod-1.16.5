package mod.arcalitegames.odyssey.world.structure.structures.towers.tower_fountain;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FountainTower extends StructureBase
{

	public FountainTower(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		FountainComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 7, 6, 7, 39, 50, 39, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity goblin_kobold1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold1, "goblin_kobold");
	    this.spawnEntity(goblin_kobold1, world, 12, 7, 23, start);
	    CreatureEntity goblin_knocker2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker2, "goblin_knocker");
	    this.spawnEntity(goblin_knocker2, world, 16, 11, 19, start);
	    CreatureEntity goblin_knocker3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker3, "goblin_knocker");
	    this.spawnEntity(goblin_knocker3, world, 16, 11, 27, start);
	    CreatureEntity goblin_knocker4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker4, "goblin_knocker");
	    this.spawnEntity(goblin_knocker4, world, 19, 11, 16, start);
	    CreatureEntity goblin_knocker5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker5, "goblin_knocker");
	    this.spawnEntity(goblin_knocker5, world, 19, 11, 30, start);
	    CreatureEntity goblin_kobold6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold6, "goblin_kobold");
	    this.spawnEntity(goblin_kobold6, world, 23, 7, 12, start);
	    CreatureEntity goblin_kobold7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold7, "goblin_kobold");
	    this.spawnEntity(goblin_kobold7, world, 23, 7, 34, start);
	    CreatureEntity hobgoblin8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin")).create(world);
	    this.setItemsForEntity(hobgoblin8, "hobgoblin");
	    this.spawnEntity(hobgoblin8, world, 23, 13, 24, start);
	    CreatureEntity goblin_knocker9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker9, "goblin_knocker");
	    this.spawnEntity(goblin_knocker9, world, 27, 11, 16, start);
	    CreatureEntity goblin_knocker10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker10, "goblin_knocker");
	    this.spawnEntity(goblin_knocker10, world, 27, 11, 30, start);
	    CreatureEntity goblin_knocker11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker11, "goblin_knocker");
	    this.spawnEntity(goblin_knocker11, world, 30, 11, 19, start);
	    CreatureEntity goblin_knocker12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_knocker")).create(world);
	    this.setItemsForEntity(goblin_knocker12, "goblin_knocker");
	    this.spawnEntity(goblin_knocker12, world, 30, 11, 27, start);
	    CreatureEntity goblin_kobold13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("odysseymod:goblin_kobold")).create(world);
	    this.setItemsForEntity(goblin_kobold13, "goblin_kobold");
	    this.spawnEntity(goblin_kobold13, world, 34, 7, 23, start);
	    this.executeCommand(world);
	}


}
