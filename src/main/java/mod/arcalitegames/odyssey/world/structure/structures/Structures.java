package mod.arcalitegames.odyssey.world.structure.structures;

import java.util.List;

import com.google.common.collect.Lists;

import mod.arcalitegames.odyssey.enums.BiomeList;
import mod.arcalitegames.odyssey.enums.StructureClass;
import mod.arcalitegames.odyssey.world.structure.Structure;
import mod.arcalitegames.odyssey.world.structure.structures.camps.abandoned_house.MapGenAbandonedHouse;
import mod.arcalitegames.odyssey.world.structure.structures.camps.bandit_camp.MapGenBanditCamp;
import mod.arcalitegames.odyssey.world.structure.structures.camps.bandit_hideout.MapGenBanditHideout;
import mod.arcalitegames.odyssey.world.structure.structures.camps.desert_camp.MapGenDesertCamp;
import mod.arcalitegames.odyssey.world.structure.structures.camps.forest_camp.MapGenForestCamp;
import mod.arcalitegames.odyssey.world.structure.structures.camps.illager_camp.MapGenIllagerCamp;
import mod.arcalitegames.odyssey.world.structure.structures.camps.outpost_camp.MapGenOutpostCamp;
import mod.arcalitegames.odyssey.world.structure.structures.camps.tusken_raider_camp.MapGenTuskenRaiderCamp;
import mod.arcalitegames.odyssey.world.structure.structures.dungeons.desert_pyramid.MapGenDesertPyramid;
import mod.arcalitegames.odyssey.world.structure.structures.dungeons.highguard_castle.MapGenHighguardCastle;
import mod.arcalitegames.odyssey.world.structure.structures.dungeons.masoleum.MapGenDesertMasoleum;
import mod.arcalitegames.odyssey.world.structure.structures.dungeons.mayan_pyramid.MapGenMayanPyramid;
import mod.arcalitegames.odyssey.world.structure.structures.dungeons.mayan_temple.MapGenMayanTemple;
import mod.arcalitegames.odyssey.world.structure.structures.dungeons.shrine.MapGenDesertShrine;
import mod.arcalitegames.odyssey.world.structure.structures.dungeons.ziggurat.MapGenZigguratDungeon;
import mod.arcalitegames.odyssey.world.structure.structures.forts.abandoned_fort.MapGenAbandonedFort;
import mod.arcalitegames.odyssey.world.structure.structures.forts.greymoor.MapGenFortGreymoor;
import mod.arcalitegames.odyssey.world.structure.structures.forts.hraggstad.MapGenFortHraggstad;
import mod.arcalitegames.odyssey.world.structure.structures.forts.neograd.MapGenFortNeograd;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.ancient_ruins.MapGenAncientRuins;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.castle_ruins.MapGenCastleRuins;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.cathedral.MapGenCathedralRuins;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.desert_ruins.MapGenDesertRuins;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.goblin_ruins.MapGenGoblinRuins;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.jungle_ruins.MapGenJungleRuins;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.kagrenzal.MapGenKagrenzalCastle;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.old_ruins.MapGenRuins;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.stone_hedge.MapGenStoneHedge;
import mod.arcalitegames.odyssey.world.structure.structures.ruins.temple.MapGenInfestedTemple;
import mod.arcalitegames.odyssey.world.structure.structures.statues.sphinx.MapGenSphinxStatue;
import mod.arcalitegames.odyssey.world.structure.structures.statues.statue_spearpointing.MapGenGreekSpearPointing;
import mod.arcalitegames.odyssey.world.structure.structures.statues.statue_spearshield.MapGenGreekSpearShield;
import mod.arcalitegames.odyssey.world.structure.structures.statues.statue_swordpointing.MapGenGreekSwordPointing;
import mod.arcalitegames.odyssey.world.structure.structures.statues.statue_swordshield.MapGenGreekSwordShield;
import mod.arcalitegames.odyssey.world.structure.structures.towers.dark_tower.MapGenDarkTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.desert_tower.MapGenDesertTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.green_tower.MapGenGreenTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.guard_tower.MapGenGuardTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.lighthouse.MapGenLightHouse;
import mod.arcalitegames.odyssey.world.structure.structures.towers.ruin_tower.MapGenRuinTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.small_watch_tower.MapGenSmallWatchTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.tower.MapGenTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.tower_fountain.MapGenFountainTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.wall_tower.MapGenWallTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.watch_tower.MapGenWatchTower;
import mod.arcalitegames.odyssey.world.structure.structures.towers.witch_tower.MapGenWitchTower;
import net.minecraft.world.biome.Biome;

public class Structures
{
	//1
	public static final Structure ZIGGURAT = new Structure("ziggurat", StructureClass.CLASS_5, new MapGenZigguratDungeon());
	//2
	public static final Structure MASOLEUM = new Structure("masoleum", StructureClass.CLASS_6, new MapGenDesertMasoleum());
	//3
	public static final Structure SHRINE = new Structure("shrine", StructureClass.CLASS_5, new MapGenDesertShrine());
	//4
	public static final Structure KAGRENZAL = new Structure("kagrenzal", StructureClass.CLASS_4, new MapGenKagrenzalCastle());
	//5
	public static final Structure TEMPLE = new Structure("temple", StructureClass.CLASS_4, new MapGenInfestedTemple());
	//6
	public static final Structure MAYAN_PYRAMID = new Structure("mayan_pyramid", StructureClass.CLASS_3, new MapGenMayanPyramid());
	//7
	public static final Structure MAYAN_TEMPLE = new Structure("mayan_temple", StructureClass.CLASS_3, new MapGenMayanTemple());
	//8
	public static final Structure ABANDONED_FORT = new Structure("abandoned_fort", StructureClass.CLASS_2, new MapGenAbandonedFort());
	//9
	public static final Structure FORT_NEOGRAD = new Structure("fort_neograd", StructureClass.CLASS_3, new MapGenFortNeograd());
	//10
	public static final Structure FORT_HRAGGSTAD = new Structure("fort_hraggstad", StructureClass.CLASS_2, new MapGenFortHraggstad());
	//11
	public static final Structure FORT_GREYMOOR = new Structure("fort_greymoor", StructureClass.CLASS_3, new MapGenFortGreymoor());
	//12
	public static final Structure GOBLIN_RUINS = new Structure("goblin_ruins", StructureClass.CLASS_3, new MapGenGoblinRuins());
	//13
	public static final Structure ANCIENT_RUINS = new Structure("ancient_ruins", StructureClass.CLASS_2, new MapGenAncientRuins());
	//14
	public static final Structure CATHEDRAL_RUINS = new Structure("cathedral_ruins", StructureClass.CLASS_2, new MapGenCathedralRuins());
	//15
	public static final Structure RUINS = new Structure("ruins", StructureClass.CLASS_3, new MapGenRuins());
	//16
	public static final Structure DESERT_RUINS = new Structure("desert_ruins", StructureClass.CLASS_2, new MapGenDesertRuins());
	//17
	public static final Structure JUNGLE_RUINS = new Structure("jungle_ruins", StructureClass.CLASS_3, new MapGenJungleRuins());
	//18
	public static final Structure GREEK_WARRIOR_SWORD_SHIELD = new Structure("greek_warrior_sword_shield", StructureClass.CLASS_1, new MapGenGreekSwordShield());
	//19
	public static final Structure GREEK_WARRIOR_SWORD_POINTING = new Structure("greek_warrior_sword_pointing", StructureClass.CLASS_1, new MapGenGreekSwordPointing());
	//20
	public static final Structure GREEK_WARRIOR_SPEAR_SHIELD = new Structure("greek_warrior_spear_shield", StructureClass.CLASS_1, new MapGenGreekSpearShield());
	//21
	public static final Structure GREEK_WARRIOR_SPEAR_POINTING = new Structure("greek_warrior_spear_pointing", StructureClass.CLASS_1, new MapGenGreekSpearPointing());
	//22
	public static final Structure STONE_HEDGE = new Structure("stone_hedge", StructureClass.CLASS_5, new MapGenStoneHedge());
	//23
	public static final Structure SPHINX = new Structure("sphinx", StructureClass.CLASS_4, new MapGenSphinxStatue());
	//24
	public static final Structure ABANDONED_HOUSE = new Structure("abandoned_house", StructureClass.CLASS_1, new MapGenAbandonedHouse());
	//25
	public static final Structure BANDIT_CAMP = new Structure("bandit_camp", StructureClass.CLASS_1, new MapGenBanditCamp());
	//26
	public static final Structure BANDIT_HIDEOUT = new Structure("bandit_hideout", StructureClass.CLASS_2, new MapGenBanditHideout());
	//27
	public static final Structure DESERT_CAMP = new Structure("desert_camp", StructureClass.CLASS_2, new MapGenDesertCamp());
	//28
	public static final Structure FOREST_CAMP = new Structure("forest_camp", StructureClass.CLASS_3, new MapGenForestCamp());
	//29
	public static final Structure ILLAGER_CAMP = new Structure("illager_camp", StructureClass.CLASS_4, new MapGenIllagerCamp());
	//30
	public static final Structure OUTPOST_CAMP = new Structure("outpost_camp", StructureClass.CLASS_2, new MapGenOutpostCamp());
	//31
	public static final Structure TUSKEN_RAIDER_CAMP = new Structure("tusken_raider_camp", StructureClass.CLASS_4, new MapGenTuskenRaiderCamp());
	//32
	public static final Structure CASTLE_RUINS = new Structure("castle_ruins", StructureClass.CLASS_3, new MapGenCastleRuins());
	//33
	public static final Structure DESERT_PYRAMID = new Structure("desert_pyramid", StructureClass.CLASS_2, new MapGenDesertPyramid());
	//34
	public static final Structure HIGHGUARD_CASTLE = new Structure("highguard_castle", StructureClass.CLASS_3, new MapGenHighguardCastle());
	//35
	public static final Structure DARK_TOWER = new Structure("dark_tower", StructureClass.CLASS_2, new MapGenDarkTower());
	//36
	public static final Structure DESERT_TOWER = new Structure("desert_tower", StructureClass.CLASS_3, new MapGenDesertTower());
	//37
	public static final Structure GREEN_TOWER = new Structure("green_tower", StructureClass.CLASS_2, new MapGenGreenTower());
	//38
	public static final Structure GUARD_TOWER = new Structure("guard_tower", StructureClass.CLASS_1, new MapGenGuardTower());
	//39
	public static final Structure LIGHTHOUSE = new Structure("lighthouse", StructureClass.CLASS_1, new MapGenLightHouse());
	//40
	public static final Structure RUIN_TOWER = new Structure("ruin_tower", StructureClass.CLASS_1, new MapGenRuinTower());
	//41
	public static final Structure SMALL_WATCH_TOWER = new Structure("small_watch_tower", StructureClass.CLASS_1, new MapGenSmallWatchTower());
	//42
	public static final Structure TOWER = new Structure("tower", StructureClass.CLASS_1, new MapGenTower());
	//43
	public static final Structure FOUNTAIN_TOWER = new Structure("fountain_tower", StructureClass.CLASS_2, new MapGenFountainTower());
	//44
	public static final Structure WALL_TOWER = new Structure("wall_tower", StructureClass.CLASS_2, new MapGenWallTower());
	//45
	public static final Structure WATCH_TOWER = new Structure("watch_tower", StructureClass.CLASS_1, new MapGenWatchTower());
	//46
	public static final Structure WITCH_TOWER = new Structure("witch_tower", StructureClass.CLASS_1, new MapGenWitchTower());
	
	
	public static List<Structure> getStructuresOfClass(StructureClass structureClass, Biome biome)
	{
		List<Structure> list = Lists.newArrayList();
		
		for(Structure structure: Structures.getBiomeStructures(biome))
		{
			boolean flag = structure.getStructureClass().equals(structureClass);
			
			//LOGGER.debug("Checking Structure: " + structure);
			//LOGGER.debug("Required class: " + structureClass);
			//LOGGER.debug(structure + " StructureClass: " + structure.getStructureClass());
			//LOGGER.debug("Match: " + flag);
			if(flag)
			{
				list.add(structure);
			}
		}
		
		//LOGGER.debug("Final List of Structures: " + list);
		
		return list;
	}
	
	public static List<Structure> getBiomeStructures(Biome biome)
	{
		List<Structure> structures = Lists.newArrayList();
		
		if(BiomeList.Type.PLAINS.contains(biome))
		{
			structures.add(STONE_HEDGE);
			structures.add(FORT_NEOGRAD);
			structures.add(FORT_HRAGGSTAD);
			structures.add(KAGRENZAL);
			structures.add(GOBLIN_RUINS);
			structures.add(RUINS);
			structures.add(GREEK_WARRIOR_SPEAR_POINTING);
			structures.add(GREEK_WARRIOR_SPEAR_SHIELD);
			structures.add(GREEK_WARRIOR_SWORD_POINTING);
			structures.add(GREEK_WARRIOR_SWORD_SHIELD);
			structures.add(ABANDONED_HOUSE);
			structures.add(BANDIT_CAMP);
			structures.add(BANDIT_HIDEOUT);
			structures.add(OUTPOST_CAMP);
			structures.add(ILLAGER_CAMP);
			structures.add(CASTLE_RUINS);
			structures.add(HIGHGUARD_CASTLE);
			//LOGGER.debug("Plains Biome structures: " + structures);
		}
		
		if(BiomeList.Type.FOREST.contains(biome))
		{
			structures.add(ABANDONED_HOUSE);
			structures.add(FORT_HRAGGSTAD);
			structures.add(KAGRENZAL);
			structures.add(ABANDONED_FORT);
			structures.add(ANCIENT_RUINS);
			structures.add(CATHEDRAL_RUINS);
			structures.add(TEMPLE);
			structures.add(MAYAN_TEMPLE);
			structures.add(MAYAN_PYRAMID);
			structures.add(GREEK_WARRIOR_SPEAR_POINTING);
			structures.add(GREEK_WARRIOR_SPEAR_SHIELD);
			structures.add(GREEK_WARRIOR_SWORD_POINTING);
			structures.add(GREEK_WARRIOR_SWORD_SHIELD);
			structures.add(FOREST_CAMP);
			structures.add(ILLAGER_CAMP);
			structures.add(CASTLE_RUINS);
			structures.add(HIGHGUARD_CASTLE);
			structures.add(DARK_TOWER);
			structures.add(GREEN_TOWER);
			structures.add(GUARD_TOWER);
			structures.add(LIGHTHOUSE);
			structures.add(SMALL_WATCH_TOWER);
			structures.add(TOWER);
			structures.add(FOUNTAIN_TOWER);
			structures.add(WALL_TOWER);
			structures.add(WATCH_TOWER);
			structures.add(WITCH_TOWER);
			//LOGGER.debug("Forest Biome structures: " + structures);
		}
		
		if(BiomeList.Type.DESERT.contains(biome))
		{
			structures.add(DESERT_TOWER);
			structures.add(DESERT_PYRAMID);
			structures.add(DESERT_CAMP);
			structures.add(DESERT_RUINS);
			structures.add(SPHINX);
			structures.add(ZIGGURAT);
			structures.add(MASOLEUM);
			structures.add(SHRINE);
			structures.add(TUSKEN_RAIDER_CAMP);
			//LOGGER.debug("Desert Biome structures: " + structures);
		}
		
		if(BiomeList.Type.JUNGLE.contains(biome))
		{
			structures.add(JUNGLE_RUINS);
			structures.add(ABANDONED_FORT);
			structures.add(CATHEDRAL_RUINS);
			structures.add(GOBLIN_RUINS);
			structures.add(TEMPLE);
			structures.add(GREEK_WARRIOR_SPEAR_POINTING);
			structures.add(GREEK_WARRIOR_SPEAR_SHIELD);
			structures.add(GREEK_WARRIOR_SWORD_POINTING);
			structures.add(GREEK_WARRIOR_SWORD_SHIELD);
			//LOGGER.debug("Jungle Biome structures: " + structures);
		}
		
		if(BiomeList.Type.SWAMP.contains(biome))
		{
			structures.add(ABANDONED_HOUSE);
			structures.add(FORT_HRAGGSTAD);
			structures.add(KAGRENZAL);
			structures.add(ABANDONED_FORT);
			structures.add(ANCIENT_RUINS);
			structures.add(CATHEDRAL_RUINS);
			structures.add(TEMPLE);
			structures.add(MAYAN_TEMPLE);
			structures.add(MAYAN_PYRAMID);
			structures.add(FORT_NEOGRAD);
			structures.add(GREEK_WARRIOR_SPEAR_POINTING);
			structures.add(GREEK_WARRIOR_SPEAR_SHIELD);
			structures.add(GREEK_WARRIOR_SWORD_POINTING);
			structures.add(GREEK_WARRIOR_SWORD_SHIELD);
			structures.add(RUIN_TOWER);
			structures.add(WITCH_TOWER);
			//LOGGER.debug("Swamp Biome structures: " + structures);
		}
		
		if(BiomeList.Type.TAIGA.contains(biome))
		{
			structures.add(BANDIT_CAMP);
			structures.add(BANDIT_HIDEOUT);
			structures.add(OUTPOST_CAMP);
			structures.add(ABANDONED_HOUSE);
			structures.add(RUINS);
			structures.add(FORT_HRAGGSTAD);
			structures.add(GREEK_WARRIOR_SPEAR_POINTING);
			structures.add(GREEK_WARRIOR_SPEAR_SHIELD);
			structures.add(GREEK_WARRIOR_SWORD_POINTING);
			structures.add(GREEK_WARRIOR_SWORD_SHIELD);
			structures.add(ILLAGER_CAMP);
			structures.add(CASTLE_RUINS);
			structures.add(HIGHGUARD_CASTLE);
			structures.add(DARK_TOWER);
			structures.add(GREEN_TOWER);
			structures.add(GUARD_TOWER);
			structures.add(LIGHTHOUSE);
			structures.add(SMALL_WATCH_TOWER);
			structures.add(TOWER);
			structures.add(FOUNTAIN_TOWER);
			structures.add(WALL_TOWER);
			structures.add(WATCH_TOWER);
			structures.add(WITCH_TOWER);
			//LOGGER.debug("Taiga Biome structures: " + structures);
		}
		
		if(BiomeList.Type.BADLANDS.contains(biome))
		{
			//LOGGER.debug("Badlands Biome structures: " + structures);
		}
		
		if(BiomeList.Type.COLD.contains(biome))
		{
			structures.add(ABANDONED_HOUSE);
			structures.add(FORT_GREYMOOR);
			structures.add(GREEK_WARRIOR_SPEAR_POINTING);
			structures.add(GREEK_WARRIOR_SPEAR_SHIELD);
			structures.add(GREEK_WARRIOR_SWORD_POINTING);
			structures.add(GREEK_WARRIOR_SWORD_SHIELD);
			structures.add(DARK_TOWER);
			structures.add(GREEN_TOWER);
			structures.add(GUARD_TOWER);
			structures.add(LIGHTHOUSE);
			structures.add(SMALL_WATCH_TOWER);
			structures.add(TOWER);
			structures.add(FOUNTAIN_TOWER);
			structures.add(WALL_TOWER);
			structures.add(WATCH_TOWER);
			structures.add(WITCH_TOWER);
			//LOGGER.debug("Snowy Biome structures: " + structures);
		}
		
		return structures;
	}
	
	//private static final Logger LOGGER = LogManager.getLogger();
}