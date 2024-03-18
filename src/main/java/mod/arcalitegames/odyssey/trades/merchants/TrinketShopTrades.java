package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class TrinketShopTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getRedstoneItems()
	{
		INSTANCE.addAll( 
				new MerchantProduct(Items.REDSTONE, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.REDSTONE, 32, false); })),
       		 new MerchantProduct(Items.REDSTONE_BLOCK, CoinType.BRONZE, 150, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.REDSTONE_BLOCK, 150, false); })),
				 new MerchantProduct(Items.REDSTONE_LAMP, CoinType.BRONZE, 160, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.REDSTONE_LAMP, 160, false); })),
       		 new MerchantProduct(Items.REDSTONE_TORCH, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.REDSTONE_TORCH, 40, false); })),
       		 new MerchantProduct(Items.TORCH, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TORCH, 4, false); })),
				 new MerchantProduct(Items.LEVER, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEVER, 16, false); })),
				 new MerchantProduct(Items.REPEATER, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.REPEATER, 1, false); })),
       		 new MerchantProduct(Items.COMPARATOR, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COMPARATOR, 2, false); })),
				 new MerchantProduct(Items.TRIPWIRE_HOOK, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TRIPWIRE_HOOK, 72, false); })),
       		 new MerchantProduct(Items.ITEM_FRAME, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ITEM_FRAME, 1, false); })),
				 new MerchantProduct(Items.STONE_PRESSURE_PLATE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_PRESSURE_PLATE, 16, false); })),
				 new MerchantProduct(Items.DISPENSER, CoinType.BRONZE, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DISPENSER, 128, false); })),
				 new MerchantProduct(Items.DROPPER, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DROPPER, 72, false); })),
				 new MerchantProduct(Items.OBSERVER, CoinType.BRONZE, 150, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OBSERVER, 150, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("odysseymod:detector"), CoinType.GOLD, 90, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:detector"), 90, false); })),
       		 new MerchantProduct(Items.HOPPER, CoinType.BRONZE, 704, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.HOPPER, 704, false); })),    		  			
				 new MerchantProduct(Items.PISTON, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PISTON, 2, false); })),
       		 new MerchantProduct(Items.STICKY_PISTON, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STICKY_PISTON, 2, false); })),
				 new MerchantProduct(Items.TNT, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TNT, 2, false); })),
				 new MerchantProduct(Items.TARGET, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TARGET, 8, false); })),
       		 new MerchantProduct(Items.BEACON, CoinType.GOLD, 100, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BEACON, 100, false); })),
				 new MerchantProduct(Items.DAYLIGHT_DETECTOR, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DAYLIGHT_DETECTOR, 2, false); })),
       		 new MerchantProduct(Items.SLIME_BLOCK, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SLIME_BLOCK, 72, false); })),
       		 new MerchantProduct(Items.NOTE_BLOCK, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NOTE_BLOCK, 1, false); })),
				 new MerchantProduct(Items.JUKEBOX, CoinType.GOLD, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUKEBOX, 40, false); })),
				 new MerchantProduct(Items.COMPASS, CoinType.BRONZE, 544, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COMPASS, 544, false); })),
				 new MerchantProduct(Items.CLOCK, CoinType.GOLD, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CLOCK, 32, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getDoorItems()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.IRON_DOOR, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_DOOR, 64, false); })),
       		 new MerchantProduct(Items.OAK_DOOR, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_DOOR, 16, false); })),
       		 new MerchantProduct(Items.SPRUCE_DOOR, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_DOOR, 16, false); })),
       		 new MerchantProduct(Items.BIRCH_DOOR, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_DOOR, 16, false); })),
       		 new MerchantProduct(Items.DARK_OAK_DOOR, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_DOOR, 16, false); })),
       		 new MerchantProduct(Items.ACACIA_DOOR, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_DOOR, 16, false); })),
       		 new MerchantProduct(Items.CRIMSON_DOOR, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_DOOR, 32, false); })),
       		 new MerchantProduct(Items.WARPED_DOOR, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_DOOR, 32, false); })),
				 new MerchantProduct(Items.OAK_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.SPRUCE_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.BIRCH_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.JUNGLE_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.ACACIA_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.DARK_OAK_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.CRIMSON_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.WARPED_TRAPDOOR, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_TRAPDOOR, 24, false); })),
       		 new MerchantProduct(Items.IRON_TRAPDOOR, CoinType.SILVER, 5, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_TRAPDOOR, 5, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getTransportItems()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.MINECART, CoinType.SILVER, 6, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MINECART, 6, false); })),
				 new MerchantProduct(Items.RAIL, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RAIL, 1, false); })),
				 new MerchantProduct(Items.ACTIVATOR_RAIL, CoinType.BRONZE, 120, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACTIVATOR_RAIL, 120, false); })),
				 new MerchantProduct(Items.POWERED_RAIL, CoinType.GOLD, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POWERED_RAIL, 8, false); })),
       		 new MerchantProduct(Items.DETECTOR_RAIL, CoinType.BRONZE, 136, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DETECTOR_RAIL, 136, false); })),
				 new MerchantProduct(Items.OAK_BOAT, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_BOAT, 40, false); })),
       		 new MerchantProduct(Items.SPRUCE_BOAT, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_BOAT, 40, false); })),
       		 new MerchantProduct(Items.BIRCH_BOAT, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_BOAT, 40, false); })),
       		 new MerchantProduct(Items.JUNGLE_BOAT, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_BOAT, 40, false); })),
       		 new MerchantProduct(Items.DARK_OAK_BOAT, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_BOAT, 40, false); })),
       		 new MerchantProduct(Items.ACACIA_BOAT, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_BOAT, 40, false); })),
				 new MerchantProduct(Items.SHULKER_BOX, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SHULKER_BOX, 12, false); })),
       		 new MerchantProduct(Items.WHITE_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WHITE_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.ORANGE_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ORANGE_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.MAGENTA_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAGENTA_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.YELLOW_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.YELLOW_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.LIME_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIME_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.PINK_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PINK_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.GRAY_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRAY_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.CYAN_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CYAN_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.PURPLE_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PURPLE_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.BLUE_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLUE_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.BROWN_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BROWN_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.GREEN_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GREEN_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.RED_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_SHULKER_BOX, 15, false); })),
       		 new MerchantProduct(Items.BLACK_SHULKER_BOX, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLACK_SHULKER_BOX, 15, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
     public static final TrinketShopTrades INSTANCE = new TrinketShopTrades();
}
