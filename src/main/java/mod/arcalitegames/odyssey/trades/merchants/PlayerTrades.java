package mod.arcalitegames.odyssey.trades.merchants;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import mod.arcalitegames.odyssey.client.player.ModdedItems;
import mod.arcalitegames.odyssey.client.player.VanillaItems;
import mod.arcalitegames.odyssey.trades.products.InventoryProduct;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerTrades
{
   protected static int count = 0;
   protected PlayerEntity player;
   public static final int posY = 45;
   public static final int height = 19;
   public static List<ItemStack> itemInventory = new LinkedList<>();
   private static List<InventoryProduct> productInventory = new LinkedList<>();
   public static final LinkedHashSet<InventoryProduct> FULL_LIST_OF_ITEMS = new LinkedHashSet<>();
   
   @SubscribeEvent
   public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event)
   {
	   FULL_LIST_OF_ITEMS.clear();
	   VanillaItems.addVanillaItems();
	   ModdedItems.addModItems();
   }
   
   public static List<InventoryProduct> getInventoryProducts(PlayerEntity player)
   {
		   productInventory.clear();
		   PlayerTrades.setPlayerInventory(player);
		   
		   for(int i = 0; i < itemInventory.size(); i++)
		   {
			   Item item = itemInventory.get(i).getItem();
			   
			   for(InventoryProduct product: FULL_LIST_OF_ITEMS)
			   {
				   if(item == product.getItem())
				   {
					   product.setItemStack(itemInventory.get(i));
					   productInventory.add(product);
				   }
			   }
		   }
		   
		   return productInventory;
   }
   
   private static void setPlayerInventory(PlayerEntity player)
   {
	   int slots = 36;
	   itemInventory.clear();
		Set<ItemStack> set = new LinkedHashSet<>();
		PlayerInventory inventory = player.inventory;
		
		for(int i = 0; i < slots; i++)
		{
			ItemStack stack = inventory.getStackInSlot(i);
			if((stack != ItemStack.EMPTY) || (stack != null))
			{
				if(stack.getItem() != Items.AIR)
				{
					set.add(stack);
				}
			}
		}
		
		itemInventory.addAll(set);
   }

   public static void addAll(InventoryProduct...products)
   {
	   for(InventoryProduct product: products)
	   {
		   FULL_LIST_OF_ITEMS.add(product);
	   }
   }
   
   public static InventoryProduct getInventoryProduct(Button button)
   {
	   for(InventoryProduct product: productInventory)
	   {
		   if(button.equals(product.getImageButton())) return product;
	   }
	   
	   return null;
   }
   
   public static InventoryProduct getInventoryProduct(Item item)
   {
	   for(InventoryProduct product: productInventory)
	   {
		   if(item == product.getItem()) return product;
	   }
	   
	   return null;
   }
   
}
