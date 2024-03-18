package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class BlacksmithTrades extends TradeOption
{

     public static final BlacksmithTrades INSTANCE = new BlacksmithTrades();
     
     public static MerchantSet<MerchantProduct> getWeaponsItems()
     {
    	 INSTANCE.addAll( 
    			 new MerchantProduct(Items.WOODEN_SWORD, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WOODEN_SWORD, 16, false); })),
        		 new MerchantProduct(Items.WOODEN_AXE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WOODEN_AXE, 24, false); })),
        		 new MerchantProduct(Items.STONE_SWORD, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_SWORD, 16, false); })),
        		 new MerchantProduct(Items.STONE_AXE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_AXE, 24, false); })),
        		 new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_sword"), CoinType.BRONZE, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_sword"), 128, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_axe"), CoinType.SILVER, 2, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_axe"), 2, false); })),
				 new MerchantProduct(Items.GOLDEN_SWORD, CoinType.GOLD, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_SWORD, 16, false); })),
        		 new MerchantProduct(Items.GOLDEN_AXE, CoinType.GOLD, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_AXE, 24, false); })),
        		 new MerchantProduct(Items.IRON_SWORD, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_SWORD, 256, false); })),
        		 new MerchantProduct(Items.IRON_AXE, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_AXE, 4, false); })),
        		 new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_sword"), CoinType.SILVER, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_sword"), 32, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_axe"), CoinType.SILVER, 48, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_axe"), 48, false); })),
				 new MerchantProduct(Items.DIAMOND_SWORD, CoinType.GOLD, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_SWORD, 80, false); })),
        		 new MerchantProduct(Items.DIAMOND_AXE, CoinType.GOLD, 120, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_AXE, 120, false); })),
        		 new MerchantProduct(Items.NETHERITE_SWORD, CoinType.GOLD, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_SWORD, 128, false); })),
        		 new MerchantProduct(Items.NETHERITE_AXE, CoinType.GOLD, 192, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_AXE, 192, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_sword"), CoinType.GOLD, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_sword"), 16, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_axe"), CoinType.GOLD, 24, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_axe"), 24, false); })),
        		 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_sword"), CoinType.GOLD, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_sword"), 16, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_axe"), CoinType.GOLD, 24, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_axe"), 24, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_sword"), CoinType.GOLD, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_sword"), 32, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_axe"), CoinType.GOLD, 48, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_axe"), 48, false); }))
    	);
    	 
    	 return INSTANCE.LIST;
     }
     
     public static MerchantSet<MerchantProduct> getArmorItems()
     {
    	 INSTANCE.addAll(  
    			 new MerchantProduct(Items.LEATHER_HELMET, CoinType.BRONZE, 160, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEATHER_HELMET, 160, false); })),
        		 new MerchantProduct(Items.LEATHER_CHESTPLATE, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEATHER_CHESTPLATE, 256, false); })),
        		 new MerchantProduct(Items.LEATHER_LEGGINGS, CoinType.BRONZE, 224, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEATHER_LEGGINGS, 224, false); })),
        		 new MerchantProduct(Items.LEATHER_BOOTS, CoinType.BRONZE, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEATHER_BOOTS, 128, false); })),
        		 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_copper_metal_helmet"), CoinType.BRONZE, 320, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_copper_metal_helmet"), 320, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_copper_metal_chestplate"), CoinType.BRONZE, 512, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_copper_metal_chestplate"), 512, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_copper_metal_leggings"), CoinType.BRONZE, 448, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_copper_metal_leggings"), 448, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_copper_metal_boots"), CoinType.BRONZE, 256, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_copper_metal_boots"), 256, false); })),
  				 new MerchantProduct(Items.CHAINMAIL_HELMET, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_HELMET, 8, false); })),
        		 new MerchantProduct(Items.CHAINMAIL_CHESTPLATE, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_CHESTPLATE, 12, false); })),
        		 new MerchantProduct(Items.CHAINMAIL_LEGGINGS, CoinType.SILVER, 10, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_LEGGINGS, 10, false); })),
        		 new MerchantProduct(Items.CHAINMAIL_BOOTS, CoinType.SILVER, 6, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_BOOTS, 6, false); })),
        		 new MerchantProduct(Items.IRON_HELMET, CoinType.SILVER, 6, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_HELMET, 6, false); })),
        		 new MerchantProduct(Items.IRON_CHESTPLATE, CoinType.SILVER, 10, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_CHESTPLATE, 10, false); })),
        		 new MerchantProduct(Items.IRON_LEGGINGS, CoinType.SILVER, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_LEGGINGS, 9, false); })),
        		 new MerchantProduct(Items.IRON_BOOTS, CoinType.SILVER, 5, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_BOOTS, 5, false); })),
        		 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_silver_metal_helmet"), CoinType.SILVER, 80, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_silver_metal_helmet"), 80, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_silver_metal_chestplate"), CoinType.SILVER, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_silver_metal_chestplate"), 128, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_silver_metal_leggings"), CoinType.SILVER, 112, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_silver_metal_leggings"), 112, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:armor_silver_metal_boots"), CoinType.SILVER, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:armor_silver_metal_boots"), 64, false); })),
				 new MerchantProduct(Items.DIAMOND_HELMET, CoinType.GOLD, 200, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_HELMET, 200, false); })),
        		 new MerchantProduct(Items.DIAMOND_CHESTPLATE, CoinType.GOLD, 320, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_CHESTPLATE, 320, false); })),
        		 new MerchantProduct(Items.DIAMOND_LEGGINGS, CoinType.GOLD, 280, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_LEGGINGS, 280, false); })),
        		 new MerchantProduct(Items.DIAMOND_BOOTS, CoinType.GOLD, 160, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_BOOTS, 160, false); })),
        		 new MerchantProduct(Items.GOLDEN_HELMET, CoinType.GOLD, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_HELMET, 40, false); })),
        		 new MerchantProduct(Items.GOLDEN_CHESTPLATE, CoinType.GOLD, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_CHESTPLATE, 64, false); })),
        		 new MerchantProduct(Items.GOLDEN_LEGGINGS, CoinType.GOLD, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_LEGGINGS, 56, false); })),
        		 new MerchantProduct(Items.GOLDEN_BOOTS, CoinType.GOLD, 36, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_BOOTS, 36, false); })),
        		 new MerchantProduct(Items.NETHERITE_HELMET, CoinType.GOLD, 320, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_HELMET, 320, false); })),
        		 new MerchantProduct(Items.NETHERITE_CHESTPLATE, CoinType.GOLD, 512, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_CHESTPLATE, 512, false); })),
        		 new MerchantProduct(Items.NETHERITE_LEGGINGS, CoinType.GOLD, 448, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_LEGGINGS, 448, false); })),
        		 new MerchantProduct(Items.NETHERITE_BOOTS, CoinType.GOLD, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_BOOTS, 256, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_helmet"), CoinType.GOLD, 40, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_helmet"), 40, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_chestplate"), CoinType.GOLD, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_chestplate"), 64, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_leggings"), CoinType.GOLD, 56, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_leggings"), 56, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_boots"), CoinType.GOLD, 48, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_boots"), 48, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_helmet"), CoinType.GOLD, 40, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_helmet"), 40, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_chestplate"), CoinType.GOLD, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_chestplate"), 64, false); })),
 		       	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_leggings"), CoinType.GOLD, 56, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_leggings"), 56, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_boots"), CoinType.GOLD, 48, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_boots"), 48, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_helmet"), CoinType.GOLD, 80, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_helmet"), 80, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_chestplate"), CoinType.GOLD, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_chestplate"), 128, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_leggings"), CoinType.GOLD, 112, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_leggings"), 112, false); })),
 		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_boots"), CoinType.GOLD, 96, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_boots"), 96, false); }))
    	);
    	 
    	 return INSTANCE.LIST;
     }
     
     public static MerchantSet<MerchantProduct> getMiscellaneousItems()
     {
    	 INSTANCE.addAll(
    			 new MerchantProduct(Items.SHIELD, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SHIELD, 2, false); })),
				 new MerchantProduct(Items.ANVIL, CoinType.SILVER, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ANVIL, 40, false); })),
				 new MerchantProduct(Items.ARMOR_STAND, CoinType.SILVER, 52, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ARMOR_STAND, 52, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:fishing_spear"), CoinType.BRONZE, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:fishing_spear"), 128, false); }))
    	);
    	 
    	 return INSTANCE.LIST;
     }
     
}