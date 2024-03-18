package mod.arcalitegames.odyssey.client.player;

import mod.arcalitegames.odyssey.client.gui.HUDRenderer;
import mod.arcalitegames.odyssey.items.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber
public class PlayerWalletManager
{
    private static int goldCoins = 0;
    private static int silverCoins = 0;
    private static int bronzeCoins = 0;

    @SubscribeEvent
    public static void onPlayerCollectCoin(TickEvent.WorldTickEvent event)
    {
        @SuppressWarnings("unchecked")
		List<PlayerEntity> players = (List<PlayerEntity>) event.world.getPlayers();

        for(PlayerEntity player: players)
        {
            ItemStack gold_coin = new ItemStack(ModItems.GOLD_COIN.get());
            ItemStack silver_coin = new ItemStack(ModItems.SILVER_COIN.get());
            ItemStack bronze_coin = new ItemStack(ModItems.BRONZE_COIN.get());
            
            PlayerInventory inventory = player.inventory;
            if(inventory.hasItemStack(gold_coin))
            {
                PlayerWalletManager.setGoldCoins(goldCoins + gold_coin.getCount());
                HUDRenderer.Overlay.gold = goldCoins;
                int slot = inventory.getSlotFor(gold_coin);
                inventory.decrStackSize(slot, gold_coin.getCount());
            }
            else if(inventory.hasItemStack(silver_coin))
            {
                PlayerWalletManager.setSilverCoins(silverCoins + silver_coin.getCount());
                HUDRenderer.Overlay.silver = silverCoins;
                int slot = inventory.getSlotFor(silver_coin);
                inventory.decrStackSize(slot, silver_coin.getCount());
            }
            else if(inventory.hasItemStack(bronze_coin))
            {
                PlayerWalletManager.setBronzeCoins(bronzeCoins + bronze_coin.getCount());
                HUDRenderer.Overlay.bronze = bronzeCoins;
                int slot = inventory.getSlotFor(bronze_coin);
                inventory.decrStackSize(slot, bronze_coin.getCount());
            }
        }
    }

    public static int getGoldCoins()
    {
        return goldCoins;
    }

    public static int getSilverCoins()
    {
        return silverCoins;
    }
    
    public static int getBronzeCoins()
    {
        return bronzeCoins;
    }

    public static void setGoldCoins(int goldAmount)
    {
        PlayerWalletManager.goldCoins = goldAmount;
    }

    public static void setSilverCoins(int silverAmount)
    {
        PlayerWalletManager.silverCoins = silverAmount;
    }
    
    public static void setBronzeCoins(int bronzeAmount)
    {
        PlayerWalletManager.bronzeCoins = bronzeAmount;
    }
    
    public static void resetWealth()
    {
    	PlayerWalletManager.goldCoins = 0;
    	PlayerWalletManager.silverCoins = 0;
    	PlayerWalletManager.bronzeCoins = 0;
    	HUDRenderer.Overlay.gold = goldCoins;
    	HUDRenderer.Overlay.silver = silverCoins;
    	HUDRenderer.Overlay.bronze = bronzeCoins;
    }
}
