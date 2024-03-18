package mod.arcalitegames.odyssey.world.structure.structures.ruins.goblin_ruins;

import mod.arcalitegames.odyssey.entity.hostile.GoblinEntity;
import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GoblinRuins extends StructureBase
{
	
	public GoblinRuins(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		GoblinComponent0.init(world, origin, this);
		GoblinComponent1.init(world, origin, this);
        this.fillWithBlocks(world, start, 13, 7, 6, 84, 46, 68, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    GoblinEntity goblin_kobold17 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold17, "goblin_kobold");
	    this.spawnEntity(goblin_kobold17, world, 21, 7, 34, start);
	    GoblinEntity goblin_kobold18 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold18, "goblin_kobold");
	    this.spawnEntity(goblin_kobold18, world, 21, 7, 38, start);
	    GoblinEntity goblin_knocker19 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker19, "goblin_knocker");
	    this.spawnEntity(goblin_knocker19, world, 33, 9, 30, start);
	    GoblinEntity hobgoblin20 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin").create(world);
	    this.setItemsForEntity(hobgoblin20, "hobgoblin");
	    this.spawnEntity(hobgoblin20, world, 34, 9, 36, start);
	    GoblinEntity goblin_knocker21 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker21, "goblin_knocker");
	    this.spawnEntity(goblin_knocker21, world, 35, 9, 43, start);
	    GoblinEntity goblin_knocker22 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker22, "goblin_knocker");
	    this.spawnEntity(goblin_knocker22, world, 37, 9, 25, start);
	    GoblinEntity goblin_knocker23 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker23, "goblin_knocker");
	    this.spawnEntity(goblin_knocker23, world, 38, 9, 47, start);
	    this.generateChest(world, Direction.SOUTH, 42, 9, 30, start, 2);
	    this.generateChest(world, Direction.NORTH, 44, 9, 43, start, 1);
	    GoblinEntity goblin_kobold24 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold24, "goblin_kobold");
	    this.spawnEntity(goblin_kobold24, world, 46, 7, 9, start);
	    GoblinEntity goblin_kobold25 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold25, "goblin_kobold");
	    this.spawnEntity(goblin_kobold25, world, 46, 7, 63, start);
	    GoblinEntity hobgoblin26 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin").create(world);
	    this.setItemsForEntity(hobgoblin26, "hobgoblin");
	    this.spawnEntity(hobgoblin26, world, 48, 9, 22, start);
	    GoblinEntity goblin_trow27 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_trow").create(world);
	    this.setItemsForEntity(goblin_trow27, "goblin_trow");
	    this.spawnEntity(goblin_trow27, world, 48, 9, 36, start);
	    GoblinEntity hobgoblin28 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin").create(world);
	    this.setItemsForEntity(hobgoblin28, "hobgoblin");
	    this.spawnEntity(hobgoblin28, world, 48, 9, 50, start);
	    GoblinEntity goblin_kobold29 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold29, "goblin_kobold");
	    this.spawnEntity(goblin_kobold29, world, 50, 7, 9, start);
	    GoblinEntity goblin_kobold30 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold30, "goblin_kobold");
	    this.spawnEntity(goblin_kobold30, world, 50, 7, 63, start);
	    GoblinEntity goblin_knocker31 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker31, "goblin_knocker");
	    this.spawnEntity(goblin_knocker31, world, 54, 9, 22, start);
	    this.generateChest(world, Direction.SOUTH, 54, 9, 30, start, 2);
	    this.generateChest(world, Direction.NORTH, 54, 9, 42, start, 1);
	    GoblinEntity goblin_knocker32 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker32, "goblin_knocker");
	    this.spawnEntity(goblin_knocker32, world, 58, 9, 47, start);
	    GoblinEntity goblin_knocker33 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker33, "goblin_knocker");
	    this.spawnEntity(goblin_knocker33, world, 60, 9, 27, start);
	    GoblinEntity hobgoblin34 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_hobgoblin").create(world);
	    this.setItemsForEntity(hobgoblin34, "hobgoblin");
	    this.spawnEntity(hobgoblin34, world, 60, 9, 36, start);
	    GoblinEntity goblin_knocker35 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_knocker").create(world);
	    this.setItemsForEntity(goblin_knocker35, "goblin_knocker");
	    this.spawnEntity(goblin_knocker35, world, 62, 9, 42, start);
	    GoblinEntity goblin_kobold36 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold36, "goblin_kobold");
	    this.spawnEntity(goblin_kobold36, world, 75, 7, 34, start);
	    GoblinEntity goblin_kobold37 = (GoblinEntity) EntityParser.getEntityFromName("odysseymod:goblin_kobold").create(world);
	    this.setItemsForEntity(goblin_kobold37, "goblin_kobold");
	    this.spawnEntity(goblin_kobold37, world, 75, 7, 38, start);
	    this.executeCommand(world);
	}


}
