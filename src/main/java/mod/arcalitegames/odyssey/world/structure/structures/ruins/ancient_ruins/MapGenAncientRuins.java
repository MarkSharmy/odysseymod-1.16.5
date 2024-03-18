package mod.arcalitegames.odyssey.world.structure.structures.ruins.ancient_ruins;

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


public class MapGenAncientRuins extends MapGenStructure implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4435189104932664927L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.ANCIENT_RUINS.getStructureClass();
    	
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
        public AncientRuins structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new AncientRuins(event.world, origin, 0, 0, 0);
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
            	AncientComponent0.generatePart1();
                AncientComponent0.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	AncientComponent0.generatePart3();
                AncientComponent0.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	AncientComponent0.generatePart5();
                AncientComponent0.generatePart6();
                this.generatePart = 4;
            }
        }

        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	AncientComponent0.generatePart7();
                AncientComponent0.generatePart8();
                this.generatePart = 5;
            }
        }

        @SubscribeEvent
        public void generatePart5(WorldTickEvent event)
        {
            if(this.canGeneratePart(5))
            {
            	AncientComponent0.generatePart9();
                AncientComponent0.generatePart10();
                this.generatePart = 6;
            }
        }

        @SubscribeEvent
        public void generatePart6(WorldTickEvent event)
        {
            if(this.canGeneratePart(6))
            {
            	AncientComponent1.generatePart11();
                AncientComponent1.generatePart12();
                this.generatePart = 7;
            }
        }

        @SubscribeEvent
        public void generatePart7(WorldTickEvent event)
        {
        	if(this.canGeneratePart(7))
        	{
        		AncientComponent1.generatePart13();
            	AncientComponent1.generatePart14();
                this.generatePart = 8;
        	}
        }

        @SubscribeEvent
        public void generatePart8(WorldTickEvent event)
        {
        	if(this.canGeneratePart(8))
        	{
        		AncientComponent1.generatePart15();
            	AncientComponent1.generatePart16();
                this.generatePart = 9;
        	}
        }

        @SubscribeEvent
        public void generatePart9(WorldTickEvent event)
        {
        	if(this.canGeneratePart(9))
        	{
        		AncientComponent1.generatePart17();
            	AncientComponent1.generatePart18();
                this.generatePart = 10;
        	}
        }

        @SubscribeEvent
        public void generatePart10(WorldTickEvent event)
        {
        	if(this.canGeneratePart(10))
        	{
        		AncientComponent1.generatePart19();
            	AncientComponent1.generatePart20();
                this.generatePart = 11;
        	}
        }

        @SubscribeEvent
        public void generatePart11(WorldTickEvent event)
        {
            if(this.canGeneratePart(11))
            {
            	AncientComponent2.generatePart21();
                AncientComponent2.generatePart22();
                this.generatePart = 12;
            }
        }
        
        @SubscribeEvent
        public void generatePart12(WorldTickEvent event)
        {
            if(this.canGeneratePart(12))
            {
            	AncientComponent2.generatePart23();
                AncientComponent2.generatePart24();
                this.generatePart = 13;
            }
        }
        
        @SubscribeEvent
        public void generatePart13(WorldTickEvent event)
        {
            if(this.canGeneratePart(13))
            {
            	AncientComponent2.generatePart25();
                AncientComponent2.generatePart26();
                this.generatePart = 14;
            }
        }
        
        @SubscribeEvent
        public void generatePart14(WorldTickEvent event)
        {
            if(this.canGeneratePart(14))
            {
            	AncientComponent2.generatePart27();
                AncientComponent2.generatePart28();
                this.generatePart = 15;
            }
        }
        
        @SubscribeEvent
        public void generatePart15(WorldTickEvent event)
        {
            if(this.canGeneratePart(15))
            {
            	AncientComponent2.generatePart29();
                AncientComponent2.generatePart30();
                this.generatePart = 16;
            }
        }
        
        @SubscribeEvent
        public void generatePart16(WorldTickEvent event)
        {
            if(this.canGeneratePart(16))
            {
            	AncientComponent3.generatePart31();
                AncientComponent3.generatePart32();
                this.generatePart = 17;
            }
        }
        
        @SubscribeEvent
        public void generatePart17(WorldTickEvent event)
        {
            if(this.canGeneratePart(17))
            {
            	AncientComponent3.generatePart33();
                AncientComponent3.generatePart34();
                this.generatePart = 18;
            }
        }
        
        @SubscribeEvent
        public void generatePart18(WorldTickEvent event)
        {
            if(this.canGeneratePart(18))
            {
            	AncientComponent3.generatePart35();
                AncientComponent3.generatePart36();
                this.generatePart = 19;
            }
        }
        
        @SubscribeEvent
        public void generatePart19(WorldTickEvent event)
        {
            if(this.canGeneratePart(19))
            {
            	AncientComponent3.generatePart37();
                AncientComponent3.generatePart38();
                this.generatePart = 20;
            }
        }
        
        @SubscribeEvent
        public void generatePart20(WorldTickEvent event)
        {
            if(this.canGeneratePart(20))
            {
            	AncientComponent3.generatePart39();
                AncientComponent3.generatePart40();
                this.generatePart = 21;
            }
        }
        
        @SubscribeEvent
        public void generatePart21(WorldTickEvent event)
        {
            if(this.canGeneratePart(21))
            {
            	AncientComponent4.generatePart41();
                AncientComponent4.generatePart42();
                this.generatePart = 22;
            }
        }
        
        @SubscribeEvent
        public void generatePart22(WorldTickEvent event)
        {
            if(this.canGeneratePart(22))
            {
            	AncientComponent4.generatePart43();
            	AncientComponent4.generatePart44();
                this.generatePart = 23;
            }
        }
        
        @SubscribeEvent
        public void generatePart23(WorldTickEvent event)
        {
            if(this.canGeneratePart(23))
            {
            	AncientComponent4.generatePart45();
            	AncientComponent4.generatePart46();
                this.generatePart = 24;
            }
        }
        
        @SubscribeEvent
        public void generatePart24(WorldTickEvent event)
        {
            if(this.canGeneratePart(24))
            {
            	AncientComponent4.generatePart47();
            	AncientComponent4.generatePart48();
                this.generatePart = 25;
            }
        }
        
        @SubscribeEvent
        public void generatePart25(WorldTickEvent event)
        {
            if(this.canGeneratePart(25))
            {
            	AncientComponent4.generatePart49();
            	AncientComponent4.generatePart50();
                this.generatePart = 26;
            }
        }
        
        @SubscribeEvent
        public void generatePart26(WorldTickEvent event)
        {
            if(this.canGeneratePart(26))
            {
            	AncientComponent5.generatePart51();
            	AncientComponent5.generatePart52();
                this.generatePart = 27;
            }
        }
        
        @SubscribeEvent
        public void generatePart27(WorldTickEvent event)
        {
            if(this.canGeneratePart(27))
            {
            	AncientComponent5.generatePart53();
            	AncientComponent5.generatePart54();
                this.generatePart = 28;
            }
        }
        
        @SubscribeEvent
        public void generatePart28(WorldTickEvent event)
        {
            if(this.canGeneratePart(28))
            {
            	AncientComponent5.generatePart55();
            	AncientComponent5.generatePart56();
                this.generatePart = 29;
            }
        }
        
        @SubscribeEvent
        public void generatePart29(WorldTickEvent event)
        {
            if(this.canGeneratePart(29))
            {
            	AncientComponent5.generatePart57();
            	AncientComponent5.generatePart58();
                this.generatePart = 30;
            }
        }
        
        @SubscribeEvent
        public void generatePart30(WorldTickEvent event)
        {
            if(this.canGeneratePart(30))
            {
            	AncientComponent5.generatePart59();
            	AncientComponent5.generatePart60();
                this.generatePart = 31;
            }
        }
        
        @SubscribeEvent
        public void generatePart31(WorldTickEvent event)
        {
            if(this.canGeneratePart(31))
            {
            	AncientComponent6.generatePart61();
            	AncientComponent6.generatePart62();
                this.generatePart = 32;
            }
        }
        
        @SubscribeEvent
        public void generatePart32(WorldTickEvent event)
        {
            if(this.canGeneratePart(32))
            {
            	AncientComponent6.generatePart63();
            	AncientComponent6.generatePart64();
                this.generatePart = 33;
            }
        }
        
        @SubscribeEvent
        public void generatePart33(WorldTickEvent event)
        {
            if(this.canGeneratePart(33))
            {
            	AncientComponent6.generatePart65();
            	AncientComponent6.generatePart66();
                this.generatePart = 34;
            }
        }
        
        @SubscribeEvent
        public void generatePart34(WorldTickEvent event)
        {
            if(this.canGeneratePart(34))
            {
            	AncientComponent6.generatePart67();
            	AncientComponent6.generatePart68();
                this.generatePart = 35;
            }
        }
        
        @SubscribeEvent
        public void generatePart35(WorldTickEvent event)
        {
            if(this.canGeneratePart(35))
            {
            	AncientComponent6.generatePart69();
            	AncientComponent6.generatePart70();
                this.generatePart = 36;
            }
        }
        
        @SubscribeEvent
        public void generatePart36(WorldTickEvent event)
        {
            if(this.canGeneratePart(36))
            {
            	AncientComponent7.generatePart71();
            	AncientComponent7.generatePart72();
                this.generatePart = 37;
            }
        }
        
        @SubscribeEvent
        public void generatePart37(WorldTickEvent event)
        {
            if(this.canGeneratePart(37))
            {
            	AncientComponent7.generatePart73();
            	AncientComponent7.generatePart74();
                this.generatePart = 38;
            }
        }
        
        @SubscribeEvent
        public void generatePart38(WorldTickEvent event)
        {
            if(this.canGeneratePart(38))
            {
            	AncientComponent7.generatePart75();
            	AncientComponent7.generatePart76();
                this.generatePart = 39;
            }
        }
        
        @SubscribeEvent
        public void generatePart39(WorldTickEvent event)
        {
            if(this.canGeneratePart(39))
            {
            	AncientComponent7.generatePart77();
            	AncientComponent7.generatePart78();
                this.generatePart = 40;
            }
        }
        
        @SubscribeEvent
        public void generatePart40(WorldTickEvent event)
        {
            if(this.canGeneratePart(40))
            {
            	AncientComponent7.generatePart79();
            	AncientComponent7.generatePart80();
                this.generatePart = 41;
            }
        }
        
        @SubscribeEvent
        public void generatePart41(WorldTickEvent event)
        {
            if(this.canGeneratePart(41))
            {
            	AncientComponent8.generatePart81();
            	AncientComponent8.generatePart82();
                this.generatePart = 42;
            }
        }
        
        @SubscribeEvent
        public void generatePart42(WorldTickEvent event)
        {
            if(this.canGeneratePart(42))
            {
            	AncientComponent8.generatePart83();
            	AncientComponent8.generatePart84();
                this.generatePart = 43;
            }
        }
        
        @SubscribeEvent
        public void generatePart43(WorldTickEvent event)
        {
            if(this.canGeneratePart(43))
            {
            	AncientComponent8.generatePart85();
            	AncientComponent8.generatePart86();
                this.generatePart = 44;
            }
        }
        
        @SubscribeEvent
        public void generatePart44(WorldTickEvent event)
        {
            if(this.canGeneratePart(44))
            {
            	AncientComponent8.generatePart87();
            	AncientComponent8.generatePart88();
                this.generatePart = 0;
            }
        }
    }
}
