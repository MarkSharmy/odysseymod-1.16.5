package mod.arcalitegames.odyssey.world.structure.structures.camps.abandoned_house;

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


public class MapGenAbandonedHouse extends MapGenStructure implements Serializable
{
    

	/**
	 * 
	 */
	private static final long serialVersionUID = 6483458493792784288L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.ABANDONED_HOUSE.getStructureClass();
    	
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

    public class StructurePiece
    {
    	public BlockPos origin;
    	public int generatePart = 100;
        public AbandonedHouse structure;

        public StructurePiece(MapGenAbandonedHouse mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
                structure = new AbandonedHouse(event.world, origin, 0, 0, 0);
                generatePart = 1;
                origin = null;
            }
        }

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
        	return generatePart == part;
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
            	AbandonedHouseComponents.generatePart1();
                generatePart = 0;
            }
        }
    }
}