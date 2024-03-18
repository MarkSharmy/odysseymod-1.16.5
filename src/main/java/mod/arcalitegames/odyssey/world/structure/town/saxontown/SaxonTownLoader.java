package mod.arcalitegames.odyssey.world.structure.town.saxontown;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class SaxonTownLoader
{
	@SubscribeEvent
    public static void loadStructure(TickEvent.WorldTickEvent event)
    {
        MapGenSaxonTown.StructurePiece.generate(event.world);
    }

    @SubscribeEvent
    public static void loadEntities(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canSpawnEntitiesAndChest())
        {
            MapGenSaxonTown.StructurePiece.generateEntitiesAndChest();
        }
    }

    @SubscribeEvent
    public static void loadPiece1(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(1))
        MapGenSaxonTown.StructurePiece.generatePart1();
    }

    @SubscribeEvent
    public static void loadPiece2(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(2))
        MapGenSaxonTown.StructurePiece.generatePart2();
    }

    @SubscribeEvent
    public static void loadPiece3(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(3))
        MapGenSaxonTown.StructurePiece.generatePart3();
    }

    @SubscribeEvent
    public static void loadPiece4(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(4))
        MapGenSaxonTown.StructurePiece.generatePart4();
    }

    @SubscribeEvent
    public static void loadPiece5(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(5))
        MapGenSaxonTown.StructurePiece.generatePart5();
    }

    @SubscribeEvent
    public static void loadPiece6(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(6))
        MapGenSaxonTown.StructurePiece.generatePart6();
    }

    @SubscribeEvent
    public static void loadPiece7(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(7))
        MapGenSaxonTown.StructurePiece.generatePart7();
    }

    @SubscribeEvent
    public static void loadPiece8(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(8))
        MapGenSaxonTown.StructurePiece.generatePart8();
    }

    @SubscribeEvent
    public static void loadPiece9(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(9))
        MapGenSaxonTown.StructurePiece.generatePart9();
    }

    @SubscribeEvent
    public static void loadPiece10(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(10))
        MapGenSaxonTown.StructurePiece.generatePart10();
    }

    @SubscribeEvent
    public static void loadPiece11(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(11))
            MapGenSaxonTown.StructurePiece.generatePart11();
    }

    @SubscribeEvent
    public static void loadPiece12(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonTown.StructurePiece.canGeneratePart(12))
            MapGenSaxonTown.StructurePiece.generatePart12();
    }
}
