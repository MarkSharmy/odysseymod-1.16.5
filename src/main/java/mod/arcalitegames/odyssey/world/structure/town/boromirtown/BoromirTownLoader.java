package mod.arcalitegames.odyssey.world.structure.town.boromirtown;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BoromirTownLoader
{
	@SubscribeEvent
    public static void loadStructure(TickEvent.WorldTickEvent event)
    {
        MapGenBoromirTown.StructurePiece.generate(event.world);
    }

    @SubscribeEvent
    public static void loadEntities(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canSpawnEntitiesAndChest())
        {
            MapGenBoromirTown.StructurePiece.generateEntitiesAndChest();
        }
    }

    @SubscribeEvent
    public static void loadPiece1(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(1))
        MapGenBoromirTown.StructurePiece.generatePart1();
    }

    @SubscribeEvent
    public static void loadPiece2(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(2))
        MapGenBoromirTown.StructurePiece.generatePart2();
    }

    @SubscribeEvent
    public static void loadPiece3(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(3))
        MapGenBoromirTown.StructurePiece.generatePart3();
    }

    @SubscribeEvent
    public static void loadPiece4(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(4))
        MapGenBoromirTown.StructurePiece.generatePart4();
    }

    @SubscribeEvent
    public static void loadPiece5(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(5))
        MapGenBoromirTown.StructurePiece.generatePart5();
    }

    @SubscribeEvent
    public static void loadPiece6(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(6))
        MapGenBoromirTown.StructurePiece.generatePart6();
    }

    @SubscribeEvent
    public static void loadPiece7(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(7))
        MapGenBoromirTown.StructurePiece.generatePart7();
    }

    @SubscribeEvent
    public static void loadPiece8(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(8))
        MapGenBoromirTown.StructurePiece.generatePart8();
    }

    @SubscribeEvent
    public static void loadPiece9(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(9))
        MapGenBoromirTown.StructurePiece.generatePart9();
    }

    @SubscribeEvent
    public static void loadPiece10(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(10))
        MapGenBoromirTown.StructurePiece.generatePart10();
    }

    @SubscribeEvent
    public static void loadPiece11(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(11))
            MapGenBoromirTown.StructurePiece.generatePart11();
    }

    @SubscribeEvent
    public static void loadPiece12(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(12))
            MapGenBoromirTown.StructurePiece.generatePart12();
    }

    @SubscribeEvent
    public static void loadPiece13(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(13))
            MapGenBoromirTown.StructurePiece.generatePart13();
    }

    @SubscribeEvent
    public static void loadPiece14(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(14))
            MapGenBoromirTown.StructurePiece.generatePart14();
    }

    @SubscribeEvent
    public static void loadPiece15(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(15))
            MapGenBoromirTown.StructurePiece.generatePart15();
    }

    @SubscribeEvent
    public static void loadPiece16(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(16))
            MapGenBoromirTown.StructurePiece.generatePart16();
    }

    @SubscribeEvent
    public static void loadPiece17(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(17))
            MapGenBoromirTown.StructurePiece.generatePart17();
    }
    
    @SubscribeEvent
    public static void loadPiece18(TickEvent.WorldTickEvent event)
    {
        if(MapGenBoromirTown.StructurePiece.canGeneratePart(18))
            MapGenBoromirTown.StructurePiece.generatePart18();
    }

}
