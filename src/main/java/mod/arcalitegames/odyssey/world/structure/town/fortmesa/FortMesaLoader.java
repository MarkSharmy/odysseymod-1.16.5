package mod.arcalitegames.odyssey.world.structure.town.fortmesa;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class FortMesaLoader
{
	@SubscribeEvent
    public static void loadStructure(TickEvent.WorldTickEvent event)
    {
        MapGenFortMesa.StructurePiece.generate(event.world);
    }

    @SubscribeEvent
    public static void loadEntities(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canSpawnEntitiesAndChest())
        {
            MapGenFortMesa.StructurePiece.generateEntitiesAndChest();
        }
    }

    @SubscribeEvent
    public static void loadPiece1(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(1))
        MapGenFortMesa.StructurePiece.generatePart1();
    }

    @SubscribeEvent
    public static void loadPiece2(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(2))
        MapGenFortMesa.StructurePiece.generatePart2();
    }

    @SubscribeEvent
    public static void loadPiece3(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(3))
        MapGenFortMesa.StructurePiece.generatePart3();
    }

    @SubscribeEvent
    public static void loadPiece4(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(4))
        MapGenFortMesa.StructurePiece.generatePart4();
    }

    @SubscribeEvent
    public static void loadPiece5(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(5))
        MapGenFortMesa.StructurePiece.generatePart5();
    }

    @SubscribeEvent
    public static void loadPiece6(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(6))
        MapGenFortMesa.StructurePiece.generatePart6();
    }

    @SubscribeEvent
    public static void loadPiece7(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(7))
        MapGenFortMesa.StructurePiece.generatePart7();
    }

    @SubscribeEvent
    public static void loadPiece8(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(8))
        MapGenFortMesa.StructurePiece.generatePart8();
    }

    @SubscribeEvent
    public static void loadPiece9(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(9))
        MapGenFortMesa.StructurePiece.generatePart9();
    }

    @SubscribeEvent
    public static void loadPiece10(TickEvent.WorldTickEvent event)
    {
        if(MapGenFortMesa.StructurePiece.canGeneratePart(10))
        MapGenFortMesa.StructurePiece.generatePart10();
    }

}
