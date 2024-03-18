package mod.arcalitegames.odyssey.world.structure.town;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class TownStructureGeneration
{
    @SuppressWarnings("unlikely-arg-type")
	public static void generateStructures(final BiomeLoadingEvent event)
    {
        	RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        	Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
        
            List<Supplier<StructureFeature<?, ?>>> structures = event.getGeneration().getStructures();

            if(types.contains(BiomeDictionary.Type.PLAINS))
            {  
            	structures.add(() -> TownStructures.SAXON_TOWN.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            	structures.remove(Structure.VILLAGE);
            }
            
            if(types.contains(BiomeDictionary.Type.MESA))
            {  
            	structures.add(() -> TownStructures.FORT_MESA.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));structures.add(() -> TownStructures.FORT_MESA.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            	structures.remove(Structure.VILLAGE);
            }
            
            if(types.contains(BiomeDictionary.Type.SNOWY))
            {  
            	structures.add(() -> TownStructures.SAXON_SNOW.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            	structures.remove(Structure.VILLAGE);
            }
            
            if(types.contains(BiomeDictionary.Type.SANDY) && types.contains(BiomeDictionary.Type.DRY) || types.contains(BiomeDictionary.Type.MESA))
            {
            	structures.add(() -> TownStructures.BASHKAR_CITY.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            	structures.remove(Structure.VILLAGE);
            }
            
            if(types.contains(BiomeDictionary.Type.SANDY))
            {
            	structures.remove(Structure.VILLAGE);
            }
            
            if(types.contains(BiomeDictionary.Type.SAVANNA))
            {
            	structures.add(() -> TownStructures.SAXON_TOWN.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                structures.remove(Structure.VILLAGE);
            }
            
            if(types.contains(BiomeDictionary.Type.FOREST))
            {
            	structures.add(() -> TownStructures.BOROMIR_TOWN.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            	structures.remove(Structure.VILLAGE);
            }
    }
}
