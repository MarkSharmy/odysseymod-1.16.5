package mod.arcalitegames.odyssey.world.structure.structures.ruins.jungle_ruins;

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


public class MapGenJungleRuins extends MapGenStructure implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4917011293545621933L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.JUNGLE_RUINS.getStructureClass();
    	
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
        public JungleRuins structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new JungleRuins(event.world, origin, 0, 0, 0);
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
            	JungleRuinsComponents.generatePart1();
                JungleRuinsComponents.generatePart2();
                this.generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
            if(this.canGeneratePart(2))
            {
            	JungleRuinsComponents.generatePart3();
                JungleRuinsComponents.generatePart4();
                this.generatePart = 3;
            }
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
            if(this.canGeneratePart(3))
            {
            	JungleRuinsComponents.generatePart5();
                JungleRuinsComponents.generatePart6();
                this.generatePart = 4;
            }
        }

        @SubscribeEvent
        public void generatePart4(WorldTickEvent event)
        {
            if(this.canGeneratePart(4))
            {
            	JungleRuinsComponents.generatePart7();
                this.generatePart = 0;
            }
        }

    }
}
