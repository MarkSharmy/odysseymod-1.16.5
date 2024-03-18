package mod.arcalitegames.odyssey.world.structure.structures.dungeons.shrine;

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


public class MapGenDesertShrine extends MapGenStructure implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5132325643006365344L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.SHRINE.getStructureClass();
    	
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
        public DesertShrine structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new DesertShrine(event.world, origin, 0, 0, 0);
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
            	ShrineComponent0.generatePart1();
                ShrineComponent0.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	ShrineComponent0.generatePart3();
                ShrineComponent0.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	ShrineComponent0.generatePart5();
                ShrineComponent0.generatePart6();
                this.generatePart = 4;
            }
        }

        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	ShrineComponent0.generatePart7();
                ShrineComponent0.generatePart8();
                this.generatePart = 5;
            }
        }

        @SubscribeEvent
        public void generatePart5(WorldTickEvent event)
        {
            if(this.canGeneratePart(5))
            {
            	ShrineComponent0.generatePart9();
                ShrineComponent0.generatePart10();
                this.generatePart = 6;
            }
        }

        @SubscribeEvent
        public void generatePart6(WorldTickEvent event)
        {
            if(this.canGeneratePart(6))
            {
            	ShrineComponent1.generatePart11();
                ShrineComponent1.generatePart12();
                this.generatePart = 7;
            }
        }

        @SubscribeEvent
        public void generatePart7(WorldTickEvent event)
        {
        	if(this.canGeneratePart(7))
        	{
        		ShrineComponent1.generatePart13();
            	ShrineComponent1.generatePart14();
                this.generatePart = 8;
        	}
        }

        @SubscribeEvent
        public void generatePart8(WorldTickEvent event)
        {
        	if(this.canGeneratePart(8))
        	{
        		ShrineComponent1.generatePart15();
            	ShrineComponent1.generatePart16();
                this.generatePart = 9;
        	}
        }

        @SubscribeEvent
        public void generatePart9(WorldTickEvent event)
        {
        	if(this.canGeneratePart(9))
        	{
        		ShrineComponent1.generatePart17();
            	ShrineComponent1.generatePart18();
                this.generatePart = 10;
        	}
        }

        @SubscribeEvent
        public void generatePart10(WorldTickEvent event)
        {
        	if(this.canGeneratePart(10))
        	{
        		ShrineComponent1.generatePart19();
            	ShrineComponent1.generatePart20();
                this.generatePart = 11;
        	}
        }

        @SubscribeEvent
        public void generatePart11(WorldTickEvent event)
        {
            if(this.canGeneratePart(11))
            {
            	ShrineComponent2.generatePart21();
                ShrineComponent2.generatePart22();
                this.generatePart = 12;
            }
        }
        
        @SubscribeEvent
        public void generatePart12(WorldTickEvent event)
        {
            if(this.canGeneratePart(12))
            {
            	ShrineComponent2.generatePart23();
                ShrineComponent2.generatePart24();
                this.generatePart = 13;
            }
        }
        
        @SubscribeEvent
        public void generatePart13(WorldTickEvent event)
        {
            if(this.canGeneratePart(13))
            {
            	ShrineComponent2.generatePart25();
                ShrineComponent2.generatePart26();
                this.generatePart = 14;
            }
        }
        
        @SubscribeEvent
        public void generatePart14(WorldTickEvent event)
        {
            if(this.canGeneratePart(14))
            {
            	ShrineComponent2.generatePart27();
                ShrineComponent2.generatePart28();
                this.generatePart = 15;
            }
        }
        
        @SubscribeEvent
        public void generatePart15(WorldTickEvent event)
        {
            if(this.canGeneratePart(15))
            {
            	ShrineComponent2.generatePart29();
                ShrineComponent2.generatePart30();
                this.generatePart = 16;
            }
        }
        
        @SubscribeEvent
        public void generatePart16(WorldTickEvent event)
        {
            if(this.canGeneratePart(16))
            {
            	ShrineComponent3.generatePart31();
                ShrineComponent3.generatePart32();
                this.generatePart = 17;
            }
        }
        
        @SubscribeEvent
        public void generatePart17(WorldTickEvent event)
        {
            if(this.canGeneratePart(17))
            {
            	ShrineComponent3.generatePart33();
                ShrineComponent3.generatePart34();
                this.generatePart = 18;
            }
        }
        
        @SubscribeEvent
        public void generatePart18(WorldTickEvent event)
        {
            if(this.canGeneratePart(18))
            {
            	ShrineComponent3.generatePart35();
                ShrineComponent3.generatePart36();
                this.generatePart = 19;
            }
        }
        
        @SubscribeEvent
        public void generatePart19(WorldTickEvent event)
        {
            if(this.canGeneratePart(19))
            {
            	ShrineComponent3.generatePart37();
                ShrineComponent3.generatePart38();
                this.generatePart = 20;
            }
        }
        
        @SubscribeEvent
        public void generatePart20(WorldTickEvent event)
        {
            if(this.canGeneratePart(20))
            {
            	ShrineComponent3.generatePart39();
                ShrineComponent3.generatePart40();
                this.generatePart = 21;
            }
        }
        
        @SubscribeEvent
        public void generatePart21(WorldTickEvent event)
        {
            if(this.canGeneratePart(21))
            {
            	ShrineComponent4.generatePart41();
                ShrineComponent4.generatePart42();
                this.generatePart = 22;
            }
        }
        
        @SubscribeEvent
        public void generatePart22(WorldTickEvent event)
        {
            if(this.canGeneratePart(22))
            {
            	ShrineComponent4.generatePart43();
            	ShrineComponent4.generatePart44();
                this.generatePart = 23;
            }
        }
        
        @SubscribeEvent
        public void generatePart23(WorldTickEvent event)
        {
            if(this.canGeneratePart(23))
            {
            	ShrineComponent4.generatePart45();
            	ShrineComponent4.generatePart46();
                this.generatePart = 24;
            }
        }
        
        @SubscribeEvent
        public void generatePart24(WorldTickEvent event)
        {
            if(this.canGeneratePart(24))
            {
            	ShrineComponent4.generatePart47();
            	ShrineComponent4.generatePart48();
                this.generatePart = 0;
            }
        }
    }
}
