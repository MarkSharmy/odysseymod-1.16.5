package mod.arcalitegames.odyssey.enums;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.world.biome.Biome;

public enum BiomeList
{
	OCEAN("minecraft:ocean"),
	PLAINS("minecraft:plains"),
	DESERT("minecraft:desert"),
	MOUNTAINS("minecraft:mountains"),
	FOREST("minecraft:forest"),
	TAIGA("minecraft:taiga"),
	SWAMP("minecraft:swamp"),
	RIVER("minecraft:river"),
	NETHER_WASTES("minecraft:nether_wastes"),
	THE_END("minecraft:the_end"),
	FROZEN_OCEAN("minecraft:frozen_ocean"),
	SNOWY_TUNDRA("minecraft:snowy_tundra"),
	SNOWY_MOUNTAINS("minecraft:snowy_mountains"),
	MUSHROOM_FIELDS("minecraft:mushroom_fields"),
	MUSHROOM_FIELD_SHORE("minecraft:mushroom_field_shore"),
	BEACH("minecraft:beach"),
	DESERT_HILLS("minecraft:desert_hills"),
	WOODED_HILLS("minecraft:wooded_hills"),
	TAIGA_HILLS("minecraft:taiga_hills"),
	MOUNTAIN_EDGE("minecraft:mountain_edge"),
	JUNGLE("minecraft:jungle"),
	JUNGLE_HILLS("minecraft:jungle_hills"),
	JUNGLE_EDGE("minecraft:jungle_edge"),
	DEEP_OCEAN("minecraft:deep_ocean"),
	STONE_SHORE("minecraft:stone_shore"),
	SNOWY_BEACH("minecraft:snowy_beach"),
	BIRCH_FOREST("minecraft:birch_forest"),
	BIRCH_FOREST_HILLS("minecraft:birch_forest_hills"),
	DARK_FOREST("minecraft:dark_forest"),
	SNOWY_TAIGA("minecraft:snow_taiga"),
	SNOWY_TAIGA_HILLS("minecraft:snowy_taiga_hills"),
	GIANT_TREE_TAIGA("minecraft:giant_tree_taiga"),
	GIANT_TREE_TAIGA_HILLS("minecraft:giant_tree_taiga_hills"),
	WOODED_MOUNTAINS("minecraft:wooded_mountains"),
	SAVANNA("minecraft:savanna"),
	SAVANNA_PLATEAU("minecraft:savanna_plateau"),
	BADLANDS("minecraft:badlands"),
	WOODED_BADLANDS_PLATEAU("minecraft:wooded_badlands_plateau"),
	BADLANDS_PLATEAU("minecraft:badlands_plateau"),
	SMALL_END_ISLANDS("minecraft:small_end_islands"),
	END_MIDLANDS("minecraft:end_midlands"),
	END_HIGHLANDS("minecraft:end_highlands"),
	END_BARRENS("minecraft:barrens"),
	WARM_OCEAN("minecraft:warm_ocean"),
	LUKEWARM_OCEAN("minecraft:lukewarm_ocean"),
	COLD_OCEAN("minecraft:cold_ocean"),
	DEEP_WARM_OCEAN("minecraft:deep_warm_ocean"),
	DEEP_LUKEWARM_OCEAN("minecraft:deep_lukewarm_ocean"),
	DEEP_COLD_OCEAN("minecraft:deep_cold_ocean"),
	DEEP_FROZEN_OCEAN("minecraft:deep_frozen_ocean"),
	THE_VOID("minecraft:the_void"),
	SUNFLOWER_PLAINS("minecraft:sunflower_plains"),
	DESERT_LAKES("minecraft:desert_lakes"),
	GRAVELLY_MOUNTAINS("minecraft:gravelly_mountains"),
	FLOWER_FOREST("minecraft:flower_forest"),
	TAIGA_MOUNTAINS("minecraft:taiga_mountains"),
	SWAMP_HILLS("minecraft:swamp_hills"),
	ICE_SPIKES("minecraft:ice_spikes"),
	MODIFIED_JUNGLE("minecraft:modified_jungle"),
	MODIFIED_JUNGLE_EDGE("minecraft:modified_jungle_edge"),
	TALL_BIRCH_FOREST("minecraft:tall_birch_forest"),
	TALL_BIRCH_HILLS("minecraft:tall_birch_hills"),
	DARK_FOREST_HILLS("minecraft:dark_forest_hills"),
	SNOWY_TAIGA_MOUNTAINS("minecraft:snowy_taiga_mountains"),
	GIANT_SPRUCE_TAIGA("minecraft:giant_spruce_taiga"),
	GIANT_SPRUCE_TAIGA_HILLS("minecraft:giant_spruce_taiga_hills"),
	MODIFIED_GRAVELLY_MOUNTAINS("minecraft:modified_gravelly_mountains"),
	SHATTERED_SAVANNA("minecraft:shattered_savanna"),
	SHATTERED_SAVANNA_PLATEAU("minecraft:shattered_savanna_plateau"),
	ERODED_BADLANDS("minecraft:eroded_badlands"),
	MODIFIED_WOODED_BADLANDS_PLATEAU("minecraft:modified_wooded_badlands_plateau"),
	MODIFIED_BADLANDS_PLATEAU("minecraft:modified_badlands_plateau"),
	BAMBOO_JUNGLE("minecraft:bamboo_jungle"),
	BAMBOO_JUNGLE_HILLS("bamboo_jungle_hills"),
	SOUL_SAND_VALLEY("minecraft:soul_sand_valley"),
	CRIMSON_FOREST("minecraft:crimson_forest"),
	WARPED_FOREST("minecraft:warped_forest"),
	BASALT_DELTAS("minecraft:basalt_deltas")
	;
	
	String registryName;
	
	BiomeList(String name)
	{
		this.registryName = name;
	}
	
	public String getRegistryName()
	{
		return registryName;
	}
	
	@Override
	public String toString()
	{
		return registryName;
	}
	
	public boolean equals(Biome biome)
	{
		return biome.getRegistryName().toString().equals(this.registryName);
	}
	
	public static class Type
	{
		private final List<BiomeList> BIOMES;
		
		public Type(BiomeList... biomes)
		{
			BIOMES = Lists.newArrayList();
			
			for(BiomeList biome: biomes)
			{
				BIOMES.add(biome);
			}
		}
		
		public boolean contains(Biome biome)
		{
			for(BiomeList biomeList: BIOMES)
			{
				if(biomeList.equals(biome))
				{
					return true;
				}
			}
			
			return false;
		}
		
		public static final Type VOID = new Type(BiomeList.THE_VOID);
		public static final Type END = new Type(BiomeList.THE_END, BiomeList.END_BARRENS, BiomeList.END_HIGHLANDS, BiomeList.END_MIDLANDS, BiomeList.SMALL_END_ISLANDS);
		public static final Type OCEAN = new Type(BiomeList.OCEAN, BiomeList.WARM_OCEAN, BiomeList.COLD_OCEAN, BiomeList.LUKEWARM_OCEAN, BiomeList.FROZEN_OCEAN, BiomeList.DEEP_OCEAN, BiomeList.DEEP_WARM_OCEAN, BiomeList.DEEP_COLD_OCEAN, BiomeList.DEEP_LUKEWARM_OCEAN, BiomeList.DEEP_FROZEN_OCEAN);
		public static final Type PLAINS = new Type(BiomeList.PLAINS, BiomeList.SUNFLOWER_PLAINS);
		public static final Type DESERT = new Type(BiomeList.DESERT);
		public static final Type MOUNTAINS = new Type(BiomeList.MOUNTAINS, BiomeList.GRAVELLY_MOUNTAINS, BiomeList.MOUNTAIN_EDGE, BiomeList.MODIFIED_GRAVELLY_MOUNTAINS, BiomeList.STONE_SHORE);
		public static final Type FOREST = new Type(BiomeList.FOREST, BiomeList.BIRCH_FOREST, BiomeList.FLOWER_FOREST, BiomeList.TALL_BIRCH_FOREST);
		public static final Type COLD = new Type(BiomeList.SNOWY_TUNDRA);
		public static final Type TAIGA = new Type(BiomeList.TAIGA, BiomeList.GIANT_SPRUCE_TAIGA, BiomeList.GIANT_TREE_TAIGA, BiomeList.SNOWY_TAIGA);
		public static final Type SWAMP = new Type(BiomeList.SWAMP);
		public static final Type JUNGLE = new Type(BiomeList.JUNGLE, BiomeList.MODIFIED_JUNGLE, BiomeList.BAMBOO_JUNGLE);
		public static final Type BADLANDS = new Type(BiomeList.BADLANDS, BiomeList.BADLANDS_PLATEAU, BiomeList.ERODED_BADLANDS, BiomeList.MODIFIED_BADLANDS_PLATEAU, BiomeList.MODIFIED_WOODED_BADLANDS_PLATEAU, BiomeList.WOODED_BADLANDS_PLATEAU);
	}
	
}
