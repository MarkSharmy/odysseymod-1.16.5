package mod.arcalitegames.odyssey.client.events;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.capabilities.commerce.PlayerWallet;
import mod.arcalitegames.odyssey.client.player.PlayerWalletManager;
import mod.arcalitegames.odyssey.world.gen.MapGenerator;
import mod.arcalitegames.system.database.AllocationManager;
import mod.arcalitegames.system.parser.WorldParser;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OdysseyMod.MODID)
public class WorldEvents {

    @SubscribeEvent
    public static void onWorldLoad(WorldEvent.Load event)
    {
    	MapGenerator.resetCount();
        AllocationManager.readSaveData(WorldParser.getWorldName(event.getWorld()));
    }

    @SubscribeEvent
    public static void onWorldSave(WorldEvent.Save event)
    {
        if(event.getWorld().getPlayers().size() != 0)
        {
            PlayerWallet wallet = new PlayerWallet();
            wallet.setGoldCoins(PlayerWalletManager.getGoldCoins());
            wallet.setSilverCoins(PlayerWalletManager.getSilverCoins());
            wallet.setBronzeCoins(PlayerWalletManager.getBronzeCoins());
            AllocationManager.update(WorldParser.getWorldName(event.getWorld()), wallet);
            AllocationManager.writeSaveData(WorldParser.getWorldName(event.getWorld()));
        }
    }
    
}
