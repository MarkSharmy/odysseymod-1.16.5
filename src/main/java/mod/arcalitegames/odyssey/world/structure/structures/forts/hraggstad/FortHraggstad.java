package mod.arcalitegames.odyssey.world.structure.structures.forts.hraggstad;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FortHraggstad extends StructureBase
{
	public FortHraggstad(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		HraggstadComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, 12, 6, 11, 76, 56, 75, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
		System.out.println("addComponentParts Called");
		
	    this.generateChest(world, Direction.EAST, 19, 13, 48, start, 1);
	    PillagerEntity pillager23 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager23, "pillager");
	    this.spawnEntity(pillager23, 19, 14, 65, start);
	    this.generateChest(world, Direction.NORTH, 20, 11, 19, start, 2);
	    PillagerEntity pillager24 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager24, "pillager");
	    this.spawnEntity(pillager24, 20, 13, 44, start);
	    this.generateChest(world, Direction.SOUTH, 21, 21, 14, start, 1);
	    PillagerEntity pillager25 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager25, "pillager");
	    this.spawnEntity(pillager25, 23, 21, 18, start);
	    this.generateChest(world, Direction.WEST, 25, 7, 23, start, 3);
	    this.generateChest(world, Direction.EAST, 26, 7, 62, start, 1);
	    EvokerEntity evoker26 = (EvokerEntity) EntityParser.getEntityFromName("minecraft:evoker").create(world);
	    this.setItemsForEntity(evoker26, "evoker");
	    this.spawnEntity(evoker26, 28, 7, 60, start);
	    VindicatorEntity vindicator27 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator27, "vindicator");
	    this.spawnEntity(vindicator27, 29, 8, 26, start);
	    VindicatorEntity vindicator28 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator28, "vindicator");
	    this.spawnEntity(vindicator28, 30, 8, 24, start);
	    VindicatorEntity vindicator29 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator29, "vindicator");
	    this.spawnEntity(vindicator29, 30, 11, 18, start);
	    PillagerEntity pillager30 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager30, "pillager");
	    this.spawnEntity(pillager30, 32, 13, 67, start);
	    VindicatorEntity vindicator31 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator31, "vindicator");
	    this.spawnEntity(vindicator31, 33, 7, 71, start);
	    PillagerEntity pillager32 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager32, "pillager");
	    this.spawnEntity(pillager32, 33, 14, 30, start);
	    this.generateChest(world, Direction.WEST, 34, 8, 23, start, 1);
	    this.generateChest(world, Direction.WEST, 34, 8, 30, start, 1);
	    RavagerEntity ravanger33 = (RavagerEntity) EntityParser.getEntityFromName("minecraft:ravager").create(world);
	    this.setItemsForEntity(ravanger33, "ravanger");
	    this.spawnEntity(ravanger33, 37, 7, 55, start);
	    VindicatorEntity vindicator34 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator34, "vindicator");
	    this.spawnEntity(vindicator34, 37, 7, 71, start);
	    EvokerEntity evoker35 = (EvokerEntity) EntityParser.getEntityFromName("minecraft:evoker").create(world);
	    this.setItemsForEntity(evoker35, "evoker");
	    this.spawnEntity(evoker35, 38, 8, 21, start);
	    PillagerEntity pillager36 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager36, "pillager");
	    this.spawnEntity(pillager36, 38, 13, 67, start);
	    PillagerEntity pillager37 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager37, "pillager");
	    this.spawnEntity(pillager37, 38, 14, 25, start);
	    VindicatorEntity vindicator38 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator38, "vindicator");
	    this.spawnEntity(vindicator38, 38, 17, 24, start);
	    VindicatorEntity vindicator39 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator39, "vindicator");
	    this.spawnEntity(vindicator39, 40, 8, 40, start);
	    IllusionerEntity illusioner40 = (IllusionerEntity) EntityParser.getEntityFromName("minecraft:illusioner").create(world);
	    this.setItemsForEntity(illusioner40, "illusioner");
	    this.spawnEntity(illusioner40, 43, 14, 35, start);
	    VindicatorEntity vindicator41 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator41, "vindicator");
	    this.spawnEntity(vindicator41, 44, 17, 23, start);
	    PillagerEntity pillager42 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager42, "pillager");
	    this.spawnEntity(pillager42, 45, 8, 26, start);
	    this.generateChest(world, Direction.SOUTH, 45, 14, 30, start, 3);
	    VindicatorEntity vindicator43 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator43, "vindicator");
	    this.spawnEntity(vindicator43, 45, 19, 18, start);
	    VindicatorEntity vindicator44 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator44, "vindicator");
	    this.spawnEntity(vindicator44, 52, 8, 24, start);
	    VindicatorEntity vindicator45 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator45, "vindicator");
	    this.spawnEntity(vindicator45, 52, 8, 49, start);
	    this.generateChest(world, Direction.NORTH, 54, 31, 22, start, 2);
	    PillagerEntity pillager46 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager46, "pillager");
	    this.spawnEntity(pillager46, 55, 14, 27, start);
	    PillagerEntity pillager47 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager47, "pillager");
	    this.spawnEntity(pillager47, 57, 11, 60, start);
	    this.generateChest(world, Direction.WEST, 58, 7, 59, start, 2);
	    this.generateChest(world, Direction.SOUTH, 61, 12, 66, start, 1);
	    RavagerEntity ravager48 = (RavagerEntity) EntityParser.getEntityFromName("minecraft:ravager").create(world);
	    this.setItemsForEntity(ravager48, "ravager");
	    this.spawnEntity(ravager48, 64, 8, 34, start);
	    VindicatorEntity vindicator49 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator49, "vindicator");
	    this.spawnEntity(vindicator49, 64, 8, 56, start);
	    VindicatorEntity vindicator50 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator50, "vindicator");
	    this.spawnEntity(vindicator50, 64, 12, 68, start);
	    VindicatorEntity vindicator51 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator51, "vindicator");
	    this.spawnEntity(vindicator51, 64, 15, 50, start);
	    PillagerEntity pillager52 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager52, "pillager");
	    this.spawnEntity(pillager52, 65, 15, 42, start);
	    PillagerEntity pillager53 = (PillagerEntity) EntityParser.getEntityFromName("minecraft:pillager").create(world);
	    this.setItemsForEntity(pillager53, "pillager");
	    this.spawnEntity(pillager53, 65, 16, 29, start);
	    this.generateChest(world, Direction.SOUTH, 66, 8, 31, start, 3);
	    EvokerEntity evoker54 = (EvokerEntity) EntityParser.getEntityFromName("minecraft:evoker").create(world);
	    this.setItemsForEntity(evoker54, "evoker");
	    this.spawnEntity(evoker54, 66, 10, 39, start);
	    VindicatorEntity vindicator55 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator55, "vindicator");
	    this.spawnEntity(vindicator55, 66, 15, 50, start);
	    RavagerEntity ravager56 = (RavagerEntity) EntityParser.getEntityFromName("minecraft:ravager").create(world);
	    this.setItemsForEntity(ravager56, "ravager");
	    this.spawnEntity(ravager56, 67, 8, 33, start);
	    VindicatorEntity vindicator57 = (VindicatorEntity) EntityParser.getEntityFromName("minecraft:vindicator").create(world);
	    this.setItemsForEntity(vindicator57, "vindicator");
	    this.spawnEntity(vindicator57, 68, 8, 56, start);
	    this.generateChest(world, Direction.WEST, 72, 13, 46, start, 2);
	    this.executeCommand(world);
	}
	
}
