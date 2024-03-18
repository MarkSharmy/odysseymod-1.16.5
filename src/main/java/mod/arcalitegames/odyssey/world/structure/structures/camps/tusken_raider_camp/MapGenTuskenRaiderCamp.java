package mod.arcalitegames.odyssey.world.structure.structures.camps.tusken_raider_camp;

import java.io.Serializable;

import mod.arcalitegames.odyssey.enums.StructureClass;
import mod.arcalitegames.odyssey.world.biome.BiomeFunction;
import mod.arcalitegames.odyssey.world.gen.MapGenStructure;
import mod.arcalitegames.odyssey.world.structure.structures.Structures;
import mod.arcalitegames.system.util.Debugging;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent.WorldTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class MapGenTuskenRaiderCamp extends MapGenStructure implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7975055613800658568L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.TUSKEN_RAIDER_CAMP.getStructureClass();
    	
    	if(BiomeFunction.structureObstracting(start, structureClass))
    	{
    		return false;
    	}
    	
		return true;
	}

	@Override
	public void setOrigin(BlockPos spawnPoint)
	{
		this.spawnPoint = spawnPoint;
		StructurePiece structurePiece = new StructurePiece(this);
		MinecraftForge.EVENT_BUS.register(structurePiece);
	}

    public static class StructurePiece
    {
    	public BlockPos origin;
    	public int generatePart = 100;
        public TuskenRaiderCamp structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new TuskenRaiderCamp(event.world, origin, 0, 0, 0);
                generatePart = 1;
                origin = null;
            }
        }

        @SubscribeEvent
        public void generateEntitiesAndChest(WorldTickEvent event)
        {
            if(this.canSpawnEntitiesAndChest() && !Debugging.IN_PROGRESS)
            {
            	structure.addEntitiesAndSpawn();
                generatePart = 100;
            }
        }
        
        public boolean canGeneratePart(int part)
        {
        	return this.generatePart == part;
        }

        public boolean canSpawnEntitiesAndChest()
        {
            return generatePart == 0;
        }

        @SubscribeEvent
        public void generatePart1(WorldTickEvent event)
        {
            if(this.canGeneratePart(1))
            {
            	TuskenRaiderComponents.generatePart1();
                TuskenRaiderComponents.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	TuskenRaiderComponents.generatePart3();
                TuskenRaiderComponents.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	TuskenRaiderComponents.generatePart5();
                TuskenRaiderComponents.generatePart6();
                this.generatePart = 4;
            }
        }
        
        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	TuskenRaiderComponents.generatePart7();
                TuskenRaiderComponents.generatePart8();
                this.generatePart = 5;
            }
        }
        
        @SubscribeEvent
        public void generatePart5(WorldTickEvent event)
        {
            if(this.canGeneratePart(5))
            {
            	TuskenRaiderComponents.generatePart9();
                TuskenRaiderComponents.generatePart10();
                this.generatePart = 6;
            }
        }
        
        @SubscribeEvent
        public void generatePart6(WorldTickEvent event)
        {
            if(this.canGeneratePart(6))
            {
            	TuskenRaiderComponents.generatePart11();
                TuskenRaiderComponents.generatePart12();
                this.generatePart = 7;
            }
        }
        
        @SubscribeEvent
        public void generatePart7(WorldTickEvent event)
        {
            if(this.canGeneratePart(7))
            {
            	TuskenRaiderComponents.generatePart13();
                this.generatePart = 0;
            }
        }

    }
}
