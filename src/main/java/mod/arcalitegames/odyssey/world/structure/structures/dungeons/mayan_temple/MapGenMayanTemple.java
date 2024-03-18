package mod.arcalitegames.odyssey.world.structure.structures.dungeons.mayan_temple;

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


public class MapGenMayanTemple extends MapGenStructure implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5816936716305792586L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.MAYAN_TEMPLE.getStructureClass();
    	
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
        public MayanTemple structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new MayanTemple(event.world, origin, 0, 0, 0);
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
            	TempleComponent0.generatePart1();
                TempleComponent0.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	TempleComponent0.generatePart3();
                TempleComponent0.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	TempleComponent0.generatePart5();
                TempleComponent0.generatePart6();
                this.generatePart = 4;
            }
        }

        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	TempleComponent0.generatePart7();
                TempleComponent0.generatePart8();
                this.generatePart = 5;
            }
        }

        @SubscribeEvent
        public void generatePart5(WorldTickEvent event)
        {
            if(this.canGeneratePart(5))
            {
            	TempleComponent0.generatePart9();
                TempleComponent0.generatePart10();
                this.generatePart = 6;
            }
        }

        @SubscribeEvent
        public void generatePart6(WorldTickEvent event)
        {
            if(this.canGeneratePart(6))
            {
            	TempleComponent1.generatePart11();
                TempleComponent1.generatePart12();
                this.generatePart = 7;
            }
        }

        @SubscribeEvent
        public void generatePart7(WorldTickEvent event)
        {
        	if(this.canGeneratePart(7))
        	{
        		TempleComponent1.generatePart13();
            	TempleComponent1.generatePart14();
                this.generatePart = 8;
        	}
        }

        @SubscribeEvent
        public void generatePart8(WorldTickEvent event)
        {
        	if(this.canGeneratePart(8))
        	{
        		TempleComponent1.generatePart15();
            	TempleComponent1.generatePart16();
                this.generatePart = 9;
        	}
        }

        @SubscribeEvent
        public void generatePart9(WorldTickEvent event)
        {
        	if(this.canGeneratePart(9))
        	{
        		TempleComponent1.generatePart17();
            	TempleComponent1.generatePart18();
                this.generatePart = 10;
        	}
        }

        @SubscribeEvent
        public void generatePart10(WorldTickEvent event)
        {
        	if(this.canGeneratePart(10))
        	{
        		TempleComponent1.generatePart19();
            	TempleComponent1.generatePart20();
                this.generatePart = 11;
        	}
        }

        @SubscribeEvent
        public void generatePart11(WorldTickEvent event)
        {
            if(this.canGeneratePart(11))
            {
            	TempleComponent2.generatePart21();
                TempleComponent2.generatePart22();
                this.generatePart = 12;
            }
        }
        
        @SubscribeEvent
        public void generatePart12(WorldTickEvent event)
        {
            if(this.canGeneratePart(12))
            {
            	TempleComponent2.generatePart23();
                TempleComponent2.generatePart24();
                this.generatePart = 13;
            }
        }
        
        @SubscribeEvent
        public void generatePart13(WorldTickEvent event)
        {
            if(this.canGeneratePart(13))
            {
            	TempleComponent2.generatePart25();
                TempleComponent2.generatePart26();
                this.generatePart = 14;
            }
        }
        
        @SubscribeEvent
        public void generatePart14(WorldTickEvent event)
        {
            if(this.canGeneratePart(14))
            {
            	TempleComponent2.generatePart27();
                TempleComponent2.generatePart28();
                this.generatePart = 15;
            }
        }
        
        @SubscribeEvent
        public void generatePart15(WorldTickEvent event)
        {
            if(this.canGeneratePart(15))
            {
            	TempleComponent2.generatePart29();
                TempleComponent2.generatePart30();
                this.generatePart = 16;
            }
        }
        
        @SubscribeEvent
        public void generatePart16(WorldTickEvent event)
        {
            if(this.canGeneratePart(16))
            {
            	TempleComponent3.generatePart31();
                TempleComponent3.generatePart32();
                this.generatePart = 17;
            }
        }
        
        @SubscribeEvent
        public void generatePart17(WorldTickEvent event)
        {
            if(this.canGeneratePart(17))
            {
            	TempleComponent3.generatePart33();
                TempleComponent3.generatePart34();
                this.generatePart = 18;
            }
        }
        
        @SubscribeEvent
        public void generatePart18(WorldTickEvent event)
        {
            if(this.canGeneratePart(18))
            {
            	TempleComponent3.generatePart35();
                TempleComponent3.generatePart36();
                this.generatePart = 19;
            }
        }
        
        @SubscribeEvent
        public void generatePart19(WorldTickEvent event)
        {
            if(this.canGeneratePart(19))
            {
            	TempleComponent3.generatePart37();
                TempleComponent3.generatePart38();
                this.generatePart = 20;
            }
        }
        
        @SubscribeEvent
        public void generatePart20(WorldTickEvent event)
        {
            if(this.canGeneratePart(20))
            {
            	TempleComponent3.generatePart39();
                TempleComponent3.generatePart40();
                this.generatePart = 21;
            }
        }
        
        @SubscribeEvent
        public void generatePart21(WorldTickEvent event)
        {
            if(this.canGeneratePart(21))
            {
            	TempleComponent4.generatePart41();
                TempleComponent4.generatePart42();
                this.generatePart = 22;
            }
        }
        
        @SubscribeEvent
        public void generatePart22(WorldTickEvent event)
        {
            if(this.canGeneratePart(22))
            {
            	TempleComponent4.generatePart43();
            	TempleComponent4.generatePart44();
                this.generatePart = 23;
            }
        }
        
        @SubscribeEvent
        public void generatePart23(WorldTickEvent event)
        {
            if(this.canGeneratePart(23))
            {
            	TempleComponent4.generatePart45();
            	TempleComponent4.generatePart46();
                this.generatePart = 24;
            }
        }
        
        @SubscribeEvent
        public void generatePart24(WorldTickEvent event)
        {
            if(this.canGeneratePart(24))
            {
            	TempleComponent4.generatePart47();
            	TempleComponent4.generatePart48();
                this.generatePart = 25;
            }
        }
        
        @SubscribeEvent
        public void generatePart25(WorldTickEvent event)
        {
            if(this.canGeneratePart(25))
            {
            	TempleComponent4.generatePart49();
            	TempleComponent4.generatePart50();
                this.generatePart = 26;
            }
        }
        
        @SubscribeEvent
        public void generatePart26(WorldTickEvent event)
        {
            if(this.canGeneratePart(26))
            {
            	TempleComponent5.generatePart51();
            	TempleComponent5.generatePart52();
                this.generatePart = 27;
            }
        }
        
        @SubscribeEvent
        public void generatePart27(WorldTickEvent event)
        {
            if(this.canGeneratePart(27))
            {
            	TempleComponent5.generatePart53();
            	TempleComponent5.generatePart54();
                this.generatePart = 28;
            }
        }
        
        @SubscribeEvent
        public void generatePart28(WorldTickEvent event)
        {
            if(this.canGeneratePart(28))
            {
            	TempleComponent5.generatePart55();
            	TempleComponent5.generatePart56();
                this.generatePart = 29;
            }
        }
        
        @SubscribeEvent
        public void generatePart29(WorldTickEvent event)
        {
            if(this.canGeneratePart(29))
            {
            	TempleComponent5.generatePart57();
            	TempleComponent5.generatePart58();
                this.generatePart = 30;
            }
        }
        
        @SubscribeEvent
        public void generatePart30(WorldTickEvent event)
        {
            if(this.canGeneratePart(30))
            {
            	TempleComponent5.generatePart59();
            	TempleComponent5.generatePart60();
                this.generatePart = 31;
            }
        }
        
        @SubscribeEvent
        public void generatePart31(WorldTickEvent event)
        {
            if(this.canGeneratePart(31))
            {
            	TempleComponent6.generatePart61();
            	TempleComponent6.generatePart62();
                this.generatePart = 32;
            }
        }
        
        @SubscribeEvent
        public void generatePart32(WorldTickEvent event)
        {
            if(this.canGeneratePart(32))
            {
            	TempleComponent6.generatePart63();
            	TempleComponent6.generatePart64();
                this.generatePart = 33;
            }
        }
        
        @SubscribeEvent
        public void generatePart33(WorldTickEvent event)
        {
            if(this.canGeneratePart(33))
            {
            	TempleComponent6.generatePart65();
            	TempleComponent6.generatePart66();
                this.generatePart = 34;
            }
        }
        
        @SubscribeEvent
        public void generatePart34(WorldTickEvent event)
        {
            if(this.canGeneratePart(34))
            {
            	TempleComponent6.generatePart67();
            	TempleComponent6.generatePart68();
                this.generatePart = 35;
            }
        }
        
        @SubscribeEvent
        public void generatePart35(WorldTickEvent event)
        {
            if(this.canGeneratePart(35))
            {
            	TempleComponent6.generatePart69();
            	TempleComponent6.generatePart70();
                this.generatePart = 36;
            }
        }
        
        @SubscribeEvent
        public void generatePart36(WorldTickEvent event)
        {
            if(this.canGeneratePart(36))
            {
            	TempleComponent7.generatePart71();
            	TempleComponent7.generatePart72();
                this.generatePart = 37;
            }
        }
        
        @SubscribeEvent
        public void generatePart37(WorldTickEvent event)
        {
            if(this.canGeneratePart(37))
            {
            	TempleComponent7.generatePart73();
            	TempleComponent7.generatePart74();
                this.generatePart = 38;
            }
        }
        
        @SubscribeEvent
        public void generatePart38(WorldTickEvent event)
        {
            if(this.canGeneratePart(38))
            {
            	TempleComponent7.generatePart75();
            	TempleComponent7.generatePart76();
                this.generatePart = 39;
            }
        }
        
        @SubscribeEvent
        public void generatePart39(WorldTickEvent event)
        {
            if(this.canGeneratePart(39))
            {
            	TempleComponent7.generatePart77();
            	TempleComponent7.generatePart78();
                this.generatePart = 40;
            }
        }
        
        @SubscribeEvent
        public void generatePart40(WorldTickEvent event)
        {
            if(this.canGeneratePart(40))
            {
            	TempleComponent7.generatePart79();
            	TempleComponent7.generatePart80();
                this.generatePart = 41;
            }
        }
        
        @SubscribeEvent
        public void generatePart41(WorldTickEvent event)
        {
            if(this.canGeneratePart(41))
            {
            	TempleComponent8.generatePart81();
            	TempleComponent8.generatePart82();
                this.generatePart = 42;
            }
        }
        
        @SubscribeEvent
        public void generatePart42(WorldTickEvent event)
        {
            if(this.canGeneratePart(42))
            {
            	TempleComponent8.generatePart83();
            	TempleComponent8.generatePart84();
                this.generatePart = 43;
            }
        }
        
        @SubscribeEvent
        public void generatePart43(WorldTickEvent event)
        {
            if(this.canGeneratePart(43))
            {
            	TempleComponent8.generatePart85();
            	TempleComponent8.generatePart86();
                this.generatePart = 44;
            }
        }
        
        @SubscribeEvent
        public void generatePart44(WorldTickEvent event)
        {
            if(this.canGeneratePart(44))
            {
            	TempleComponent8.generatePart87();
            	TempleComponent8.generatePart88();
                this.generatePart = 45;
            }
        }
        
        @SubscribeEvent
        public void generatePart45(WorldTickEvent event)
        {
            if(this.canGeneratePart(45))
            {
            	TempleComponent8.generatePart89();
            	TempleComponent8.generatePart90();
                this.generatePart = 46;
            }
        }
        
        @SubscribeEvent
        public void generatePart46(WorldTickEvent event)
        {
            if(this.canGeneratePart(46))
            {
            	TempleComponent9.generatePart91();
            	TempleComponent9.generatePart92();
                this.generatePart = 47;
            }
        }
        
        @SubscribeEvent
        public void generatePart47(WorldTickEvent event)
        {
            if(this.canGeneratePart(47))
            {
            	TempleComponent9.generatePart93();
                this.generatePart = 0;
            }
        }
    }
}
