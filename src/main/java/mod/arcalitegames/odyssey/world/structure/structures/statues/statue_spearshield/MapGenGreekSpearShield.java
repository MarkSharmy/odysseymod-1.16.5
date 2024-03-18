package mod.arcalitegames.odyssey.world.structure.structures.statues.statue_spearshield;

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


public class MapGenGreekSpearShield extends MapGenStructure implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -213782089188111428L;

	@Override
	public boolean canGenerate(BlockPos start)
    {
    	
    	StructureClass structureClass = Structures.GREEK_WARRIOR_SPEAR_SHIELD.getStructureClass();
    	
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
    	private BlockPos origin;
    	private int generatePart = 100;
    	private StatueWarriorSpearShield structure;

        public StructurePiece(MapGenStructure mapGenStructure)
        {
        	this.origin = mapGenStructure.spawnPoint;
        }
        
        @SubscribeEvent
        public void generate(WorldTickEvent event)
        {
            if(origin != null)
            {
				structure = new StatueWarriorSpearShield(event.world, origin, 0, 0, 0);
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
            	SpearShieldComponents.generatePart1();
                SpearShieldComponents.generatePart2();
                generatePart = 2;
            }
        }

        @SubscribeEvent
        public void generatePart2(WorldTickEvent event)
        {
        	if(this.canGeneratePart(2))
        	{
        		SpearShieldComponents.generatePart3();
            	SpearShieldComponents.generatePart4();
                generatePart = 3;
        	}
        }

        @SubscribeEvent
        public void generatePart3(WorldTickEvent event)
        {
        	if(this.canGeneratePart(3))
        	{
        		SpearShieldComponents.generatePart5();
            	SpearShieldComponents.generatePart6();
                generatePart = 0;
        	}
        }
        
    }
}
