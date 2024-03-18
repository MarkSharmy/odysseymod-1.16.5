package mod.arcalitegames.odyssey.world.structure.town.saxon_snow;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class SaxonSnowLoader
{
	@SubscribeEvent
    public static void loadStructure(TickEvent.WorldTickEvent event)
    {
        MapGenSaxonSnow.StructurePiece.generate(event.world);
    }

    @SubscribeEvent
    public static void loadEntities(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canSpawnEntitiesAndChest())
        {
            MapGenSaxonSnow.StructurePiece.generateEntitiesAndChest();
        }
    }

    @SubscribeEvent
    public static void loadPiece1(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(1))
        MapGenSaxonSnow.StructurePiece.generatePart1();
    }

    @SubscribeEvent
    public static void loadPiece2(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(2))
        MapGenSaxonSnow.StructurePiece.generatePart2();
    }

    @SubscribeEvent
    public static void loadPiece3(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(3))
        MapGenSaxonSnow.StructurePiece.generatePart3();
    }

    @SubscribeEvent
    public static void loadPiece4(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(4))
        MapGenSaxonSnow.StructurePiece.generatePart4();
    }

    @SubscribeEvent
    public static void loadPiece5(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(5))
        MapGenSaxonSnow.StructurePiece.generatePart5();
    }

    @SubscribeEvent
    public static void loadPiece6(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(6))
        MapGenSaxonSnow.StructurePiece.generatePart6();
    }

    @SubscribeEvent
    public static void loadPiece7(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(7))
        MapGenSaxonSnow.StructurePiece.generatePart7();
    }

    @SubscribeEvent
    public static void loadPiece8(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(8))
        MapGenSaxonSnow.StructurePiece.generatePart8();
    }

    @SubscribeEvent
    public static void loadPiece9(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(9))
        MapGenSaxonSnow.StructurePiece.generatePart9();
    }

    @SubscribeEvent
    public static void loadPiece10(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(10))
        MapGenSaxonSnow.StructurePiece.generatePart10();
    }

    @SubscribeEvent
    public static void loadPiece11(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(11))
            MapGenSaxonSnow.StructurePiece.generatePart11();
    }

    @SubscribeEvent
    public static void loadPiece12(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(12))
            MapGenSaxonSnow.StructurePiece.generatePart12();
    }
    
    @SubscribeEvent
    public static void loadPiece13(TickEvent.WorldTickEvent event)
    {
        if(MapGenSaxonSnow.StructurePiece.canGeneratePart(13))
            MapGenSaxonSnow.StructurePiece.generatePart13();
    }
}
