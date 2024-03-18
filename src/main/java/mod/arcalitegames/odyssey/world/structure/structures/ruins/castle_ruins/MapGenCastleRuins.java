package mod.arcalitegames.odyssey.world.structure.structures.ruins.castle_ruins;

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


public class MapGenCastleRuins extends MapGenStructure implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3127835806565564671L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.CASTLE_RUINS.getStructureClass();
    	
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
        public CastleRuins structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new CastleRuins(event.world, origin, 0, 0, 0);
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
            	CastleComponent0.generatePart1();
                CastleComponent0.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	CastleComponent0.generatePart3();
                CastleComponent0.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	CastleComponent0.generatePart5();
                CastleComponent0.generatePart6();
                this.generatePart = 4;
            }
        }

        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	CastleComponent0.generatePart7();
                CastleComponent0.generatePart8();
                this.generatePart = 5;
            }
        }

        @SubscribeEvent
        public void generatePart5(WorldTickEvent event)
        {
            if(this.canGeneratePart(5))
            {
            	CastleComponent0.generatePart9();
                CastleComponent0.generatePart10();
                this.generatePart = 6;
            }
        }

        @SubscribeEvent
        public void generatePart6(WorldTickEvent event)
        {
            if(this.canGeneratePart(6))
            {
            	CastleComponent1.generatePart11();
                CastleComponent1.generatePart12();
                this.generatePart = 7;
            }
        }

        @SubscribeEvent
        public void generatePart7(WorldTickEvent event)
        {
        	if(this.canGeneratePart(7))
        	{
        		CastleComponent1.generatePart13();
            	CastleComponent1.generatePart14();
                this.generatePart = 8;
        	}
        }

        @SubscribeEvent
        public void generatePart8(WorldTickEvent event)
        {
        	if(this.canGeneratePart(8))
        	{
        		CastleComponent1.generatePart15();
            	CastleComponent1.generatePart16();
                this.generatePart = 9;
        	}
        }

        @SubscribeEvent
        public void generatePart9(WorldTickEvent event)
        {
        	if(this.canGeneratePart(9))
        	{
        		CastleComponent1.generatePart17();
            	CastleComponent1.generatePart18();
                this.generatePart = 10;
        	}
        }

        @SubscribeEvent
        public void generatePart10(WorldTickEvent event)
        {
        	if(this.canGeneratePart(10))
        	{
        		CastleComponent1.generatePart19();
            	CastleComponent1.generatePart20();
                this.generatePart = 11;
        	}
        }

        @SubscribeEvent
        public void generatePart11(WorldTickEvent event)
        {
            if(this.canGeneratePart(11))
            {
            	CastleComponent2.generatePart21();
                CastleComponent2.generatePart22();
                this.generatePart = 12;
            }
        }
        
        @SubscribeEvent
        public void generatePart12(WorldTickEvent event)
        {
            if(this.canGeneratePart(12))
            {
            	CastleComponent2.generatePart23();
                CastleComponent2.generatePart24();
                this.generatePart = 13;
            }
        }
        
        @SubscribeEvent
        public void generatePart13(WorldTickEvent event)
        {
            if(this.canGeneratePart(13))
            {
            	CastleComponent2.generatePart25();
                CastleComponent2.generatePart26();
                this.generatePart = 14;
            }
        }
        
        @SubscribeEvent
        public void generatePart14(WorldTickEvent event)
        {
            if(this.canGeneratePart(14))
            {
            	CastleComponent2.generatePart27();
                CastleComponent2.generatePart28();
                this.generatePart = 15;
            }
        }
        
        @SubscribeEvent
        public void generatePart15(WorldTickEvent event)
        {
            if(this.canGeneratePart(15))
            {
            	CastleComponent2.generatePart29();
                CastleComponent2.generatePart30();
                this.generatePart = 16;
            }
        }
        
        @SubscribeEvent
        public void generatePart16(WorldTickEvent event)
        {
            if(this.canGeneratePart(16))
            {
            	CastleComponent3.generatePart31();
                CastleComponent3.generatePart32();
                this.generatePart = 17;
            }
        }
        
        @SubscribeEvent
        public void generatePart17(WorldTickEvent event)
        {
            if(this.canGeneratePart(17))
            {
            	CastleComponent3.generatePart33();
                CastleComponent3.generatePart34();
                this.generatePart = 18;
            }
        }
        
        @SubscribeEvent
        public void generatePart18(WorldTickEvent event)
        {
            if(this.canGeneratePart(18))
            {
            	CastleComponent3.generatePart35();
                CastleComponent3.generatePart36();
                this.generatePart = 19;
            }
        }
        
        @SubscribeEvent
        public void generatePart19(WorldTickEvent event)
        {
            if(this.canGeneratePart(19))
            {
            	CastleComponent3.generatePart37();
                CastleComponent3.generatePart38();
                this.generatePart = 20;
            }
        }
        
        @SubscribeEvent
        public void generatePart20(WorldTickEvent event)
        {
            if(this.canGeneratePart(20))
            {
            	CastleComponent3.generatePart39();
                CastleComponent3.generatePart40();
                this.generatePart = 21;
            }
        }
        
        @SubscribeEvent
        public void generatePart21(WorldTickEvent event)
        {
            if(this.canGeneratePart(21))
            {
            	CastleComponent4.generatePart41();
                CastleComponent4.generatePart42();
                this.generatePart = 22;
            }
        }
        
        @SubscribeEvent
        public void generatePart22(WorldTickEvent event)
        {
            if(this.canGeneratePart(22))
            {
            	CastleComponent4.generatePart43();
            	CastleComponent4.generatePart44();
                this.generatePart = 23;
            }
        }
        
        @SubscribeEvent
        public void generatePart23(WorldTickEvent event)
        {
            if(this.canGeneratePart(23))
            {
            	CastleComponent4.generatePart45();
            	CastleComponent4.generatePart46();
                this.generatePart = 24;
            }
        }
        
        @SubscribeEvent
        public void generatePart24(WorldTickEvent event)
        {
            if(this.canGeneratePart(24))
            {
            	CastleComponent4.generatePart47();
            	CastleComponent4.generatePart48();
                this.generatePart = 25;
            }
        }
        
        @SubscribeEvent
        public void generatePart25(WorldTickEvent event)
        {
            if(this.canGeneratePart(25))
            {
            	CastleComponent4.generatePart49();
            	CastleComponent4.generatePart50();
                this.generatePart = 26;
            }
        }
        
        @SubscribeEvent
        public void generatePart26(WorldTickEvent event)
        {
            if(this.canGeneratePart(26))
            {
            	CastleComponent5.generatePart51();
            	CastleComponent5.generatePart52();
                this.generatePart = 27;
            }
        }
        
        @SubscribeEvent
        public void generatePart27(WorldTickEvent event)
        {
            if(this.canGeneratePart(27))
            {
            	CastleComponent5.generatePart53();
            	CastleComponent5.generatePart54();
                this.generatePart = 28;
            }
        }
        
        @SubscribeEvent
        public void generatePart28(WorldTickEvent event)
        {
            if(this.canGeneratePart(28))
            {
            	CastleComponent5.generatePart55();
            	CastleComponent5.generatePart56();
                this.generatePart = 29;
            }
        }
        
        @SubscribeEvent
        public void generatePart29(WorldTickEvent event)
        {
            if(this.canGeneratePart(29))
            {
            	CastleComponent5.generatePart57();
            	CastleComponent5.generatePart58();
                this.generatePart = 30;
            }
        }
        
        @SubscribeEvent
        public void generatePart30(WorldTickEvent event)
        {
            if(this.canGeneratePart(30))
            {
            	CastleComponent5.generatePart59();
            	CastleComponent5.generatePart60();
                this.generatePart = 31;
            }
        }
        
        @SubscribeEvent
        public void generatePart31(WorldTickEvent event)
        {
            if(this.canGeneratePart(31))
            {
            	CastleComponent6.generatePart61();
            	CastleComponent6.generatePart62();
                this.generatePart = 32;
            }
        }
        
        @SubscribeEvent
        public void generatePart32(WorldTickEvent event)
        {
            if(this.canGeneratePart(32))
            {
            	CastleComponent6.generatePart63();
            	CastleComponent6.generatePart64();
                this.generatePart = 33;
            }
        }
        
        @SubscribeEvent
        public void generatePart33(WorldTickEvent event)
        {
            if(this.canGeneratePart(33))
            {
            	CastleComponent6.generatePart65();
            	CastleComponent6.generatePart66();
                this.generatePart = 34;
            }
        }
        
        @SubscribeEvent
        public void generatePart34(WorldTickEvent event)
        {
            if(this.canGeneratePart(34))
            {
            	CastleComponent6.generatePart67();
            	CastleComponent6.generatePart68();
                this.generatePart = 35;
            }
        }
        
        @SubscribeEvent
        public void generatePart35(WorldTickEvent event)
        {
            if(this.canGeneratePart(35))
            {
            	CastleComponent6.generatePart69();
            	CastleComponent6.generatePart70();
                this.generatePart = 36;
            }
        }
        
        @SubscribeEvent
        public void generatePart36(WorldTickEvent event)
        {
            if(this.canGeneratePart(36))
            {
            	CastleComponent7.generatePart71();
            	CastleComponent7.generatePart72();
                this.generatePart = 37;
            }
        }
        
        @SubscribeEvent
        public void generatePart37(WorldTickEvent event)
        {
            if(this.canGeneratePart(37))
            {
            	CastleComponent7.generatePart73();
            	CastleComponent7.generatePart74();
                this.generatePart = 38;
            }
        }
        
        @SubscribeEvent
        public void generatePart38(WorldTickEvent event)
        {
            if(this.canGeneratePart(38))
            {
            	CastleComponent7.generatePart75();
            	CastleComponent7.generatePart76();
                this.generatePart = 39;
            }
        }
        
        @SubscribeEvent
        public void generatePart39(WorldTickEvent event)
        {
            if(this.canGeneratePart(39))
            {
            	CastleComponent7.generatePart77();
            	CastleComponent7.generatePart78();
                this.generatePart = 40;
            }
        }
        
        @SubscribeEvent
        public void generatePart40(WorldTickEvent event)
        {
            if(this.canGeneratePart(40))
            {
            	CastleComponent7.generatePart79();
            	CastleComponent7.generatePart80();
                this.generatePart = 41;
            }
        }
        
        @SubscribeEvent
        public void generatePart41(WorldTickEvent event)
        {
            if(this.canGeneratePart(41))
            {
            	CastleComponent8.generatePart81();
            	CastleComponent8.generatePart82();
                this.generatePart = 42;
            }
        }
        
        @SubscribeEvent
        public void generatePart42(WorldTickEvent event)
        {
            if(this.canGeneratePart(42))
            {
            	CastleComponent8.generatePart83();
            	CastleComponent8.generatePart84();
                this.generatePart = 43;
            }
        }
        
        @SubscribeEvent
        public void generatePart43(WorldTickEvent event)
        {
            if(this.canGeneratePart(43))
            {
            	CastleComponent8.generatePart85();
            	CastleComponent8.generatePart86();
                this.generatePart = 44;
            }
        }
        
        @SubscribeEvent
        public void generatePart44(WorldTickEvent event)
        {
            if(this.canGeneratePart(44))
            {
            	CastleComponent8.generatePart87();
            	CastleComponent8.generatePart88();
                this.generatePart = 45;
            }
        }
        
        @SubscribeEvent
        public void generatePart45(WorldTickEvent event)
        {
            if(this.canGeneratePart(45))
            {
            	CastleComponent8.generatePart89();
            	CastleComponent8.generatePart90();
                this.generatePart = 46;
            }
        }
        
        @SubscribeEvent
        public void generatePart46(WorldTickEvent event)
        {
            if(this.canGeneratePart(46))
            {
            	CastleComponent9.generatePart91();
            	CastleComponent9.generatePart92();
                this.generatePart = 47;
            }
        }
        
        @SubscribeEvent
        public void generatePart47(WorldTickEvent event)
        {
            if(this.canGeneratePart(47))
            {
            	CastleComponent9.generatePart93();
                this.generatePart = 0;
            }
        }
        
    }
}
