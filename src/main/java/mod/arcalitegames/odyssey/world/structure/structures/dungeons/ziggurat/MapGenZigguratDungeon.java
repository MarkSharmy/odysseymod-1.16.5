package mod.arcalitegames.odyssey.world.structure.structures.dungeons.ziggurat;

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


public class MapGenZigguratDungeon extends MapGenStructure implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4244264222749496201L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.ZIGGURAT.getStructureClass();
    	
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
        public ZigguratDungeon structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new ZigguratDungeon(event.world, origin, 0, 0, 0);
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
            	ZigguratComponent0.generatePart1();
                ZigguratComponent0.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	ZigguratComponent0.generatePart3();
                ZigguratComponent0.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	ZigguratComponent0.generatePart5();
                ZigguratComponent0.generatePart6();
                this.generatePart = 4;
            }
        }

        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	ZigguratComponent0.generatePart7();
                ZigguratComponent0.generatePart8();
                this.generatePart = 5;
            }
        }

        @SubscribeEvent
        public void generatePart5(WorldTickEvent event)
        {
            if(this.canGeneratePart(5))
            {
            	ZigguratComponent0.generatePart9();
                ZigguratComponent0.generatePart10();
                this.generatePart = 6;
            }
        }

        @SubscribeEvent
        public void generatePart6(WorldTickEvent event)
        {
            if(this.canGeneratePart(6))
            {
            	ZigguratComponent1.generatePart11();
                ZigguratComponent1.generatePart12();
                this.generatePart = 7;
            }
        }

        @SubscribeEvent
        public void generatePart7(WorldTickEvent event)
        {
        	if(this.canGeneratePart(7))
        	{
        		ZigguratComponent1.generatePart13();
            	ZigguratComponent1.generatePart14();
                this.generatePart = 8;
        	}
        }

        @SubscribeEvent
        public void generatePart8(WorldTickEvent event)
        {
        	if(this.canGeneratePart(8))
        	{
        		ZigguratComponent1.generatePart15();
            	ZigguratComponent1.generatePart16();
                this.generatePart = 9;
        	}
        }

        @SubscribeEvent
        public void generatePart9(WorldTickEvent event)
        {
        	if(this.canGeneratePart(9))
        	{
        		ZigguratComponent1.generatePart17();
            	ZigguratComponent1.generatePart18();
                this.generatePart = 10;
        	}
        }

        @SubscribeEvent
        public void generatePart10(WorldTickEvent event)
        {
        	if(this.canGeneratePart(10))
        	{
        		ZigguratComponent1.generatePart19();
            	ZigguratComponent1.generatePart20();
                this.generatePart = 11;
        	}
        }

        @SubscribeEvent
        public void generatePart11(WorldTickEvent event)
        {
            if(this.canGeneratePart(11))
            {
            	ZigguratComponent2.generatePart21();
                ZigguratComponent2.generatePart22();
                this.generatePart = 12;
            }
        }
        
        @SubscribeEvent
        public void generatePart12(WorldTickEvent event)
        {
            if(this.canGeneratePart(12))
            {
            	ZigguratComponent2.generatePart23();
                ZigguratComponent2.generatePart24();
                this.generatePart = 13;
            }
        }
        
        @SubscribeEvent
        public void generatePart13(WorldTickEvent event)
        {
            if(this.canGeneratePart(13))
            {
            	ZigguratComponent2.generatePart25();
                ZigguratComponent2.generatePart26();
                this.generatePart = 14;
            }
        }
        
        @SubscribeEvent
        public void generatePart14(WorldTickEvent event)
        {
            if(this.canGeneratePart(14))
            {
            	ZigguratComponent2.generatePart27();
                ZigguratComponent2.generatePart28();
                this.generatePart = 15;
            }
        }
        
        @SubscribeEvent
        public void generatePart15(WorldTickEvent event)
        {
            if(this.canGeneratePart(15))
            {
            	ZigguratComponent2.generatePart29();
                ZigguratComponent2.generatePart30();
                this.generatePart = 16;
            }
        }
        
        @SubscribeEvent
        public void generatePart16(WorldTickEvent event)
        {
            if(this.canGeneratePart(16))
            {
            	ZigguratComponent3.generatePart31();
                ZigguratComponent3.generatePart32();
                this.generatePart = 17;
            }
        }
        
        @SubscribeEvent
        public void generatePart17(WorldTickEvent event)
        {
            if(this.canGeneratePart(17))
            {
            	ZigguratComponent3.generatePart33();
                ZigguratComponent3.generatePart34();
                this.generatePart = 18;
            }
        }
        
        @SubscribeEvent
        public void generatePart18(WorldTickEvent event)
        {
            if(this.canGeneratePart(18))
            {
            	ZigguratComponent3.generatePart35();
                ZigguratComponent3.generatePart36();
                this.generatePart = 19;
            }
        }
        
        @SubscribeEvent
        public void generatePart19(WorldTickEvent event)
        {
            if(this.canGeneratePart(19))
            {
            	ZigguratComponent3.generatePart37();
                ZigguratComponent3.generatePart38();
                this.generatePart = 20;
            }
        }
        
        @SubscribeEvent
        public void generatePart20(WorldTickEvent event)
        {
            if(this.canGeneratePart(20))
            {
            	ZigguratComponent3.generatePart39();
                ZigguratComponent3.generatePart40();
                this.generatePart = 21;
            }
        }
        
        @SubscribeEvent
        public void generatePart21(WorldTickEvent event)
        {
            if(this.canGeneratePart(21))
            {
            	ZigguratComponent4.generatePart41();
                ZigguratComponent4.generatePart42();
                this.generatePart = 0;
            }
        }
    }
}
