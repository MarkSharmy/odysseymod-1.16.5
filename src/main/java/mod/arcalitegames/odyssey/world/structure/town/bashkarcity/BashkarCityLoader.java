package mod.arcalitegames.odyssey.world.structure.town.bashkarcity;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BashkarCityLoader
{
	@SubscribeEvent
    public static void loadStructure(TickEvent.WorldTickEvent event)
    {
        MapGenBashkarCity.StructurePiece.generate(event.world);
    }

    @SubscribeEvent
    public static void loadEntities(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canSpawnEntitiesAndChest())
        {
            MapGenBashkarCity.StructurePiece.generateEntitiesAndChest();
        }
    }

    @SubscribeEvent
    public static void loadPiece1(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(1))
        MapGenBashkarCity.StructurePiece.generatePart1();
    }

    @SubscribeEvent
    public static void loadPiece2(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(2))
        MapGenBashkarCity.StructurePiece.generatePart2();
    }

    @SubscribeEvent
    public static void loadPiece3(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(3))
        MapGenBashkarCity.StructurePiece.generatePart3();
    }

    @SubscribeEvent
    public static void loadPiece4(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(4))
        MapGenBashkarCity.StructurePiece.generatePart4();
    }

    @SubscribeEvent
    public static void loadPiece5(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(5))
        MapGenBashkarCity.StructurePiece.generatePart5();
    }

    @SubscribeEvent
    public static void loadPiece6(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(6))
        MapGenBashkarCity.StructurePiece.generatePart6();
    }

    @SubscribeEvent
    public static void loadPiece7(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(7))
        MapGenBashkarCity.StructurePiece.generatePart7();
    }

    @SubscribeEvent
    public static void loadPiece8(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(8))
        MapGenBashkarCity.StructurePiece.generatePart8();
    }

    @SubscribeEvent
    public static void loadPiece9(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(9))
        MapGenBashkarCity.StructurePiece.generatePart9();
    }

    @SubscribeEvent
    public static void loadPiece10(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(10))
        MapGenBashkarCity.StructurePiece.generatePart10();
    }

    @SubscribeEvent
    public static void loadPiece11(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(11))
            MapGenBashkarCity.StructurePiece.generatePart11();
    }
    
    @SubscribeEvent
    public static void loadPiece12(TickEvent.WorldTickEvent event)
    {
        if(MapGenBashkarCity.StructurePiece.canGeneratePart(12))
            MapGenBashkarCity.StructurePiece.generatePart12();
    }

}
