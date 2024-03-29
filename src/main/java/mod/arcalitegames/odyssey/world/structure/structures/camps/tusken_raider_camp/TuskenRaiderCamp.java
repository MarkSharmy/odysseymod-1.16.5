package mod.arcalitegames.odyssey.world.structure.structures.camps.tusken_raider_camp;

import java.util.Objects;

import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.parser.EntityParser;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TuskenRaiderCamp extends StructureBase
{

	public TuskenRaiderCamp(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		super(worldIn, origin, xRange, yRange, zRange);
		TuskenRaiderComponents.init(world, origin, this);
        this.fillWithBlocks(world, start, -126, 6, -69, -14, 48, 54, Blocks.AIR.getDefaultState());
	}

	@Override
	public void addEntitiesAndSpawn()
	{
	    CreatureEntity ravager1 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager1, "ravager");
	    this.spawnEntity(ravager1, world, 16, 7, 104, start);
	    CreatureEntity ravager2 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager2, "ravager");
	    this.spawnEntity(ravager2, world, 22, 7, 98, start);
	    CreatureEntity ravager3 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager3, "ravager");
	    this.spawnEntity(ravager3, world, 24, 7, 54, start);
	    CreatureEntity ravager4 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager4, "ravager");
	    this.spawnEntity(ravager4, world, 26, 7, 49, start);
	    CreatureEntity ravager5 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager5, "ravager");
	    this.spawnEntity(ravager5, world, 27, 7, 96, start);
	    CreatureEntity pillager6 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager6, "pillager");
	    this.spawnEntity(pillager6, world, 31, 11, 30, start);
	    CreatureEntity vindicator7 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator7, "vindicator");
	    this.spawnEntity(vindicator7, world, 32, 7, 63, start);
	    CreatureEntity ravager8 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager8, "ravager");
	    this.spawnEntity(ravager8, world, 33, 7, 79, start);
	    CreatureEntity horse9 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse9, "horse");
	    this.spawnEntity(horse9, world, 34, 7, 23, start);
	    CreatureEntity ravager10 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager10, "ravager");
	    this.spawnEntity(ravager10, world, 34, 7, 42, start);
	    CreatureEntity ravager11 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager11, "ravager");
	    this.spawnEntity(ravager11, world, 35, 7, 92, start);
	    CreatureEntity ravager12 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager12, "ravager");
	    this.spawnEntity(ravager12, world, 35, 7, 97, start);
	    CreatureEntity vindicator13 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator13, "vindicator");
	    this.spawnEntity(vindicator13, world, 37, 7, 30, start);
	    CreatureEntity vindicator14 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator14, "vindicator");
	    this.spawnEntity(vindicator14, world, 40, 7, 62, start);
	    CreatureEntity pillager15 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager15, "pillager");
	    this.spawnEntity(pillager15, world, 41, 9, 122, start);
	    CreatureEntity evoker16 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker16, "evoker");
	    this.spawnEntity(evoker16, world, 43, 7, 74, start);
	    CreatureEntity evoker17 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker17, "evoker");
	    this.spawnEntity(evoker17, world, 44, 7, 50, start);
	    CreatureEntity vindicator18 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator18, "vindicator");
	    this.spawnEntity(vindicator18, world, 45, 9, 121, start);
	    CreatureEntity vindicator19 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator19, "vindicator");
	    this.spawnEntity(vindicator19, world, 45, 9, 123, start);
	    CreatureEntity pillager20 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager20, "pillager");
	    this.spawnEntity(pillager20, world, 46, 8, 100, start);
	    CreatureEntity pillager21 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager21, "pillager");
	    this.spawnEntity(pillager21, world, 46, 8, 105, start);
	    CreatureEntity pillager22 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager22, "pillager");
	    this.spawnEntity(pillager22, world, 46, 8, 110, start);
	    CreatureEntity pillager23 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager23, "pillager");
	    this.spawnEntity(pillager23, world, 47, 7, 36, start);
	    CreatureEntity evoker24 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker24, "evoker");
	    this.spawnEntity(evoker24, world, 48, 6, 57, start);
	    CreatureEntity ravager25 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager25, "ravager");
	    this.spawnEntity(ravager25, world, 48, 7, 84, start);
	    CreatureEntity vindicator26 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator26, "vindicator");
	    this.spawnEntity(vindicator26, world, 49, 7, 29, start);
	    CreatureEntity horse27 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse27, "horse");
	    this.spawnEntity(horse27, world, 51, 7, 76, start);
	    CreatureEntity vindicator28 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator28, "vindicator");
	    this.spawnEntity(vindicator28, world, 52, 7, 94, start);
	    CreatureEntity vindicator29 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator29, "vindicator");
	    this.spawnEntity(vindicator29, world, 53, 7, 29, start);
	    CreatureEntity pillager30 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager30, "pillager");
	    this.spawnEntity(pillager30, world, 53, 7, 65, start);
	    CreatureEntity pillager31 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager31, "pillager");
	    this.spawnEntity(pillager31, world, 53, 7, 69, start);
	    CreatureEntity vindicator32 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator32, "vindicator");
	    this.spawnEntity(vindicator32, world, 53, 8, 115, start);
	    CreatureEntity horse33 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse33, "horse");
	    this.spawnEntity(horse33, world, 54, 7, 44, start);
	    CreatureEntity vindicator34 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator34, "vindicator");
	    this.spawnEntity(vindicator34, world, 54, 7, 94, start);
	    CreatureEntity pillager35 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager35, "pillager");
	    this.spawnEntity(pillager35, world, 55, 8, 115, start);
	    CreatureEntity evoker36 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker36, "evoker");
	    this.spawnEntity(evoker36, world, 56, 6, 50, start);
	    CreatureEntity vindicator37 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator37, "vindicator");
	    this.spawnEntity(vindicator37, world, 56, 7, 94, start);
	    CreatureEntity evoker38 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker38, "evoker");
	    this.spawnEntity(evoker38, world, 58, 6, 67, start);
	    this.generateChest(world, Direction.EAST, 60, 8, 115, start, 1);
	    CreatureEntity vindicator39 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator39, "vindicator");
	    this.spawnEntity(vindicator39, world, 61, 7, 50, start);
	    CreatureEntity pillager40 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager40, "pillager");
	    this.spawnEntity(pillager40, world, 62, 7, 21, start);
	    CreatureEntity vindicator41 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator41, "vindicator");
	    this.spawnEntity(vindicator41, world, 62, 8, 114, start);
	    CreatureEntity pillager42 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager42, "pillager");
	    this.spawnEntity(pillager42, world, 67, 7, 21, start);
	    CreatureEntity vindicator43 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator43, "vindicator");
	    this.spawnEntity(vindicator43, world, 71, 7, 64, start);
	    CreatureEntity illusioner44 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner44, "illusioner");
	    this.spawnEntity(illusioner44, world, 71, 7, 98, start);
	    this.generateChest(world, Direction.WEST, 71, 13, 98, start, 1);
	    CreatureEntity vindicator45 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator45, "vindicator");
	    this.spawnEntity(vindicator45, world, 72, 7, 41, start);
	    CreatureEntity vindicator46 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator46, "vindicator");
	    this.spawnEntity(vindicator46, world, 72, 7, 54, start);
	    CreatureEntity pillager47 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager47, "pillager");
	    this.spawnEntity(pillager47, world, 73, 7, 19, start);
	    CreatureEntity vindicator48 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator48, "vindicator");
	    this.spawnEntity(vindicator48, world, 77, 7, 71, start);
	    CreatureEntity pillager49 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager49, "pillager");
	    this.spawnEntity(pillager49, world, 78, 7, 17, start);
	    CreatureEntity pillager50 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager50, "pillager");
	    this.spawnEntity(pillager50, world, 79, 7, 67, start);
	    CreatureEntity horse51 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse51, "horse");
	    this.spawnEntity(horse51, world, 79, 7, 103, start);
	    CreatureEntity vindicator52 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator52, "vindicator");
	    this.spawnEntity(vindicator52, world, 83, 2, 86, start);
	    CreatureEntity horse53 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse53, "horse");
	    this.spawnEntity(horse53, world, 83, 7, 24, start);
	    CreatureEntity vindicator54 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator54, "vindicator");
	    this.spawnEntity(vindicator54, world, 84, 7, 67, start);
	    CreatureEntity vindicator55 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator55, "vindicator");
	    this.spawnEntity(vindicator55, world, 84, 7, 71, start);
	    CreatureEntity horse56 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse56, "horse");
	    this.spawnEntity(horse56, world, 84, 7, 102, start);
	    CreatureEntity pillager57 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager57, "pillager");
	    this.spawnEntity(pillager57, world, 85, 7, 13, start);
	    CreatureEntity vindicator58 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator58, "vindicator");
	    this.spawnEntity(vindicator58, world, 87, 7, 91, start);
	    CreatureEntity evoker59 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker59, "evoker");
	    this.spawnEntity(evoker59, world, 88, 7, 56, start);
	    CreatureEntity horse60 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse60, "horse");
	    this.spawnEntity(horse60, world, 88, 7, 74, start);
	    CreatureEntity horse61 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse61, "horse");
	    this.spawnEntity(horse61, world, 88, 7, 80, start);
	    CreatureEntity horse62 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse62, "horse");
	    this.spawnEntity(horse62, world, 89, 7, 16, start);
	    CreatureEntity horse63 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse63, "horse");
	    this.spawnEntity(horse63, world, 89, 7, 28, start);
	    CreatureEntity horse64 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse64, "horse");
	    this.spawnEntity(horse64, world, 89, 7, 100, start);
	    CreatureEntity horse65 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse65, "horse");
	    this.spawnEntity(horse65, world, 90, 7, 64, start);
	    CreatureEntity ravager66 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager66, "ravager");
	    this.spawnEntity(ravager66, world, 92, 7, 38, start);
	    CreatureEntity evoker67 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker67, "evoker");
	    this.spawnEntity(evoker67, world, 92, 7, 77, start);
	    CreatureEntity horse68 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse68, "horse");
	    this.spawnEntity(horse68, world, 95, 7, 22, start);
	    CreatureEntity pillager69 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager69, "pillager");
	    this.spawnEntity(pillager69, world, 96, 8, 100, start);
	    CreatureEntity ravager70 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:ravager")).create(world);
	    this.setItemsForEntity(ravager70, "ravager");
	    this.spawnEntity(ravager70, world, 96, 8, 106, start);
	    this.generateChest(world, Direction.NORTH, 96, 11, 108, start, 2);
	    CreatureEntity pillager71 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager71, "pillager");
	    this.spawnEntity(pillager71, world, 99, 8, 100, start);
	    CreatureEntity evoker72 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker72, "evoker");
	    this.spawnEntity(evoker72, world, 100, 7, 55, start);
	    CreatureEntity vindicator73 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator73, "vindicator");
	    this.spawnEntity(vindicator73, world, 102, 7, 27, start);
	    this.generateChest(world, Direction.EAST, 104, 8, 83, start, 2);
	    CreatureEntity pillager74 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager74, "pillager");
	    this.spawnEntity(pillager74, world, 104, 10, 56, start);
	    CreatureEntity evoker75 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker75, "evoker");
	    this.spawnEntity(evoker75, world, 105, 7, 97, start);
	    CreatureEntity vindicator76 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:vindicator")).create(world);
	    this.setItemsForEntity(vindicator76, "vindicator");
	    this.spawnEntity(vindicator76, world, 107, 7, 79, start);
	    this.generateChest(world, Direction.EAST, 107, 16, 85, start, 3);
	    CreatureEntity horse77 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse77, "horse");
	    this.spawnEntity(horse77, world, 108, 7, 62, start);
	    CreatureEntity pillager78 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:pillager")).create(world);
	    this.setItemsForEntity(pillager78, "pillager");
	    this.spawnEntity(pillager78, world, 109, 7, 72, start);
	    CreatureEntity illusioner79 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:illusioner")).create(world);
	    this.setItemsForEntity(illusioner79, "illusioner");
	    this.spawnEntity(illusioner79, world, 109, 7, 88, start);
	    CreatureEntity horse80 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:horse")).create(world);
	    this.setItemsForEntity(horse80, "horse");
	    this.spawnEntity(horse80, world, 112, 7, 68, start);
	    CreatureEntity evoker81 = (CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName("minecraft:evoker")).create(world);
	    this.setItemsForEntity(evoker81, "evoker");
	    this.spawnEntity(evoker81, world, 112, 7, 79, start);
	    this.executeCommand(world);
	}

}
