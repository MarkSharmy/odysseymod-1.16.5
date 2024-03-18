package mod.arcalitegames.odyssey.world.structure.town;

import java.util.List;

import com.google.common.collect.Lists;

import mod.arcalitegames.OdysseyMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OdysseyMod.MODID)
public class TownGenerator {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        TownStructureGeneration.generateStructures(event);
        
        List<MobSpawnInfo.Spawners> spawns = event.getSpawns().getSpawner(EntityClassification.CREATURE);
        List<MobSpawnInfo.Spawners> unwanted = Lists.newArrayList();
        
        for(MobSpawnInfo.Spawners spawner: spawns)
        {
        	if(isUnwantedEntityType(spawner.type))
        		unwanted.add(spawner);
        }
        
        spawns.removeAll(unwanted);
    }
    
    public static boolean isUnwantedEntityType(EntityType<?> type)
    {
    	List<EntityType<?>> list =
    			Lists.newArrayList(
    					EntityType.CHICKEN,
    					EntityType.SHEEP,
    					EntityType.COW,
    					EntityType.PIG,
    					EntityType.MULE,
    					EntityType.DONKEY,
    					EntityType.HORSE,
    					EntityType.WOLF,
    					EntityType.VILLAGER
    			);
    	
    	boolean flag = list.stream().anyMatch( s -> s.equals(type));
    	
    	if(flag)
    		return true;
    	else
    	return false;
    }

}
