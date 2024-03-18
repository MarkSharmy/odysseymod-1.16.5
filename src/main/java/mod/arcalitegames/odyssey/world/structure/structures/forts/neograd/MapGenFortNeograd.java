package mod.arcalitegames.odyssey.world.structure.structures.forts.neograd;

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


public class MapGenFortNeograd extends MapGenStructure implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2506977212403776489L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.FORT_NEOGRAD.getStructureClass();
    	
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
        public FortNeograd structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new FortNeograd(event.world, origin, 0, 0, 0);
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
            	NeogradComponent0.generatePart1();
                NeogradComponent0.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	NeogradComponent0.generatePart3();
                NeogradComponent0.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	NeogradComponent0.generatePart5();
                NeogradComponent0.generatePart6();
                this.generatePart = 4;
            }
        }

        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	NeogradComponent0.generatePart7();
                NeogradComponent0.generatePart8();
                this.generatePart = 5;
            }
        }

        @SubscribeEvent
        public void generatePart5(WorldTickEvent event)
        {
            if(this.canGeneratePart(5))
            {
            	NeogradComponent0.generatePart9();
                NeogradComponent0.generatePart10();
                this.generatePart = 6;
            }
        }

        @SubscribeEvent
        public void generatePart6(WorldTickEvent event)
        {
            if(this.canGeneratePart(6))
            {
            	NeogradComponent1.generatePart11();
                NeogradComponent1.generatePart12();
                this.generatePart = 7;
            }
        }

        @SubscribeEvent
        public void generatePart7(WorldTickEvent event)
        {
        	if(this.canGeneratePart(7))
        	{
        		NeogradComponent1.generatePart13();
            	NeogradComponent1.generatePart14();
                this.generatePart = 8;
        	}
        }

        @SubscribeEvent
        public void generatePart8(WorldTickEvent event)
        {
        	if(this.canGeneratePart(8))
        	{
        		NeogradComponent1.generatePart15();
            	NeogradComponent1.generatePart16();
                this.generatePart = 9;
        	}
        }

        @SubscribeEvent
        public void generatePart9(WorldTickEvent event)
        {
        	if(this.canGeneratePart(9))
        	{
        		NeogradComponent1.generatePart17();
            	NeogradComponent1.generatePart18();
                this.generatePart = 10;
        	}
        }

        @SubscribeEvent
        public void generatePart10(WorldTickEvent event)
        {
        	if(this.canGeneratePart(10))
        	{
        		NeogradComponent1.generatePart19();
            	NeogradComponent1.generatePart20();
                this.generatePart = 0;
        	}
        }
    }
}
