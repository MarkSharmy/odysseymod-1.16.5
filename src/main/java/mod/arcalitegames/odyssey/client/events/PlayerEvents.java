package mod.arcalitegames.odyssey.client.events;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.capabilities.commerce.PlayerWallet;
import mod.arcalitegames.odyssey.client.gui.HUDRenderer;
import mod.arcalitegames.odyssey.client.player.PlayerWalletManager;
import mod.arcalitegames.odyssey.enums.BiomeList;
import mod.arcalitegames.odyssey.world.gen.MapGenerator;
import mod.arcalitegames.odyssey.world.structure.town.TownStructures;
import mod.arcalitegames.system.database.AllocationManager;
import mod.arcalitegames.system.database.ServerList;
import mod.arcalitegames.system.parser.WorldParser;
import mod.arcalitegames.system.util.Counter;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerEvents
{
	
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event)
    {
        PlayerWallet wallet = AllocationManager.getSaveData(WorldParser.getWorldName(event.getPlayer().world));
        PlayerWalletManager.setSilverCoins(wallet.getSilverCoins());
        PlayerWalletManager.setGoldCoins(wallet.getGoldCoins());
        HUDRenderer.Overlay.gold = PlayerWalletManager.getGoldCoins();
        HUDRenderer.Overlay.silver = PlayerWalletManager.getSilverCoins();
    }
    
    @SubscribeEvent
    public static void updatePlayerPosition(PlayerEvent.PlayerLoggedInEvent event)
    {
    	PlayerEntity player = event.getPlayer();
    	BlockPos playerPos = player.getPosition();
    	World world = player.world;
    	Biome biome = world.getBiome(playerPos);
    	
    	OdysseyMod.displayMessage(event.getPlayer());
    	
    	Counter.startTimer();
    	
    	if(ServerList.isNewServer(world))
    	{
    		findNearestTown(world, biome);
    	}else
    	{
    		MapGenerator.generateFromMapData(world);
    	}
    }
    
	private static void findNearestTown(World world, Biome biome)
    {
    	MinecraftServer server = world.getServer();
    	CommandSource source = server.getCommandSource();
    	Commands manager = server.getCommandManager();
    	String command = "locate odysseymod:boromir_town";
    	
    	if(BiomeList.PLAINS.equals(biome))
    	{
    		command = "locate odysseymod:saxon_town";
    		TownStructures.tpSaxonTown = true;
    		
    	}else if(BiomeList.SUNFLOWER_PLAINS.equals(biome))
    	{
    		command = "locate odysseymod:saxon_town";
    		TownStructures.tpSaxonTown = true;
    	}
    	else if(BiomeList.SAVANNA.equals(biome))
    	{
    		command = "locate odysseymod:saxon_town";
    		TownStructures.tpSaxonTown = true;
    	}
    	else if(BiomeList.SAVANNA_PLATEAU.equals(biome))
    	{
    		command = "locate odysseymod:saxon_town";
    		TownStructures.tpSaxonTown = true;
    	}
    	else if(BiomeList.BEACH.equals(biome))
    	{
    		command = "locate odysseymod:saxon_town";
    		TownStructures.tpSaxonTown = true;
    	}
    	else if(BiomeList.SWAMP.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpSaxonSnow = true;
    	}
    	else if(BiomeList.SWAMP_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.MOUNTAIN_EDGE.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.MOUNTAINS.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.STONE_SHORE.equals(biome))
    	{
    		command = "locate odysseymod:saxon_town";
    		TownStructures.tpSaxonTown = true;
    	}
    	else if(BiomeList.DESERT.equals(biome))
    	{
    		command = "locate odysseymod:bashkar_city";
    		TownStructures.tpBashkarCity = true;
    	}
    	else if(BiomeList.DESERT_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:bashkar_city";
    		TownStructures.tpBashkarCity = true;
    	}
    	else if(BiomeList.DESERT_LAKES.equals(biome))
    	{
    		command = "locate odysseymod:bashkar_city";
    		TownStructures.tpBashkarCity = true;
    	}
    	else if(BiomeList.BADLANDS.equals(biome))
    	{
    		command = "locate odysseymod:fort_mesa";
    		TownStructures.tpFortMesa = true;
    	}
    	else if(BiomeList.BADLANDS_PLATEAU.equals(biome))
    	{
    		command = "locate odysseymod:fort_mesa";
    		TownStructures.tpFortMesa = true;
    	}
    	else if(BiomeList.WOODED_BADLANDS_PLATEAU.equals(biome))
    	{
    		command = "locate odysseymod:fort_mesa";
    		TownStructures.tpFortMesa = true;
    	}
    	else if(BiomeList.FOREST.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.WOODED_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.BIRCH_FOREST.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.BIRCH_FOREST_HILLS.equals(biome))
    	{
    		command = "lcoate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.DARK_FOREST.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.SNOWY_TAIGA.equals(biome))
    	{
    		command = "locate odysseymod:saxon_snow";
    		TownStructures.tpSaxonSnow = true;
    	}
    	else if(BiomeList.SNOWY_TAIGA_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:saxon_snow";
    		TownStructures.tpSaxonSnow = true;
    	}
    	else if(BiomeList.GIANT_TREE_TAIGA.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.GIANT_TREE_TAIGA_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.FLOWER_FOREST.equals(biome))
    	{
    		command = "locate odysseymod:saxon_town";
    		TownStructures.tpSaxonTown = true;
    	}
    	else if(BiomeList.ICE_SPIKES.equals(biome))
    	{
    		command = "locate odysseymod:saxon_snow";
    		TownStructures.tpSaxonSnow = true;
    	}
    	else if(BiomeList.JUNGLE.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.JUNGLE_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.BAMBOO_JUNGLE.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.BAMBOO_JUNGLE_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.TALL_BIRCH_FOREST.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.TALL_BIRCH_HILLS.equals(biome))
    	{
    		command = "locate odysseymod:boromir_town";
    		TownStructures.tpBoromirTown = true;
    	}
    	else if(BiomeList.SNOWY_TUNDRA.equals(biome))
    	{
    		command = "locate odysseymod:saxon_snow";
    		TownStructures.tpSaxonSnow = true;
    	}
    	else if(BiomeList.SNOWY_TUNDRA.equals(biome))
    	{
    		command = "locate odysseymod:saxon_snow";
    		TownStructures.tpSaxonSnow = true;
    	}else {
    		
    		TownStructures.tpBoromirTown = true;
    	}
    	
    	manager.handleCommand(source, command);
	}

}
