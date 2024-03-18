package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class ShopkeeperTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getWeaponsItems()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.BOW, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BOW, 40, false); })),
	        	new MerchantProduct(Items.CROSSBOW, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CROSSBOW, 3, false); })),
	        	new MerchantProduct(Items.ARROW, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ARROW, 8, false); })),
				new MerchantProduct(Items.STONE_SWORD, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_SWORD, 16, false); })),
	        	new MerchantProduct(Items.STONE_AXE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_AXE, 24, false); })),
				new MerchantProduct(Items.IRON_SWORD, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_SWORD, 256, false); })),
	        	new MerchantProduct(Items.IRON_AXE, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_AXE, 4, false); })),
				new MerchantProduct(Items.STONE_SHOVEL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_SHOVEL, 8, false); })),
				new MerchantProduct(Items.STONE_PICKAXE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_PICKAXE, 24, false); })),
				new MerchantProduct(Items.IRON_SHOVEL, CoinType.BRONZE, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_SHOVEL, 128, false); })),
	        	new MerchantProduct(Items.IRON_PICKAXE, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_PICKAXE, 4, false); }))
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
				new MerchantProduct(Items.CHAINMAIL_HELMET, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_HELMET, 8, false); })),
				new MerchantProduct(Items.CHAINMAIL_CHESTPLATE, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_CHESTPLATE, 12, false); })),
	        	new MerchantProduct(Items.CHAINMAIL_LEGGINGS, CoinType.SILVER, 10, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_LEGGINGS, 10, false); })),
	        	new MerchantProduct(Items.CHAINMAIL_BOOTS, CoinType.SILVER, 6, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAINMAIL_BOOTS, 6, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getToolItems()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.TORCH, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TORCH, 4, false); })),
				new MerchantProduct(Items.SOUL_TORCH, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SOUL_TORCH, 8, false); })),
	        	new MerchantProduct(Items.FLINT_AND_STEEL, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FLINT_AND_STEEL, 72, false); })),
				new MerchantProduct(Items.PAPER, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PAPER, 64, false); })),
	        	new MerchantProduct(Items.BOOK, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BOOK, 1, false); })),
	        	new MerchantProduct(Items.BOOKSHELF, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BOOKSHELF, 3, false); })),
				new MerchantProduct(Items.FISHING_ROD, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FISHING_ROD, 40, false); })),
				new MerchantProduct(Items.BUCKET, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BUCKET, 3, false); })),
	        	new MerchantProduct(Items.CHARCOAL, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHARCOAL, 32, false); })),
	        	new MerchantProduct(Items.NAME_TAG, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NAME_TAG, 1, false); })),
	        	new MerchantProduct(Items.LEAD, CoinType.BRONZE, 30, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEAD, 30, false); })),
	        	new MerchantProduct(Items.WRITABLE_BOOK, CoinType.BRONZE, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WRITABLE_BOOK, 80, false); })),
	        	new MerchantProduct(Items.BOWL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BOWL, 8, false); })),
	        	new MerchantProduct(Items.ITEM_FRAME, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ITEM_FRAME, 1, false); })),
				new MerchantProduct(Items.TNT, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TNT, 2, false); })),
				new MerchantProduct(Items.COMPASS, CoinType.BRONZE, 544, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COMPASS, 544, false); })),
				new MerchantProduct(Items.CLOCK, CoinType.GOLD, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CLOCK, 32, false); })),
				new MerchantProduct(Items.CHEST, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHEST, 64, false); })),
	        	new MerchantProduct(Items.CRAFTING_TABLE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRAFTING_TABLE, 16, false); })),
	        	new MerchantProduct(Items.FURNACE, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FURNACE, 64, false); })),
				new MerchantProduct(Items.LANTERN, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LANTERN, 1, false); })),
	        	new MerchantProduct(Items.CAMPFIRE, CoinType.BRONZE, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CAMPFIRE, 80, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("odysseymod:large_candle"), CoinType.BRONZE, 38, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:large_candle"), 38, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("odysseymod:candle"), CoinType.SILVER, 400, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:candle"), 400, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getMiscItems()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.NETHER_STAR, CoinType.GOLD, 96, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_STAR, 96, false); })),
       		 new MerchantProduct(Items.FIREWORK_ROCKET, CoinType.SILVER, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FIREWORK_ROCKET, 16, false); })),
       		 new MerchantProduct(Items.FIREWORK_STAR, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FIREWORK_STAR, 8, false); })),
       		 new MerchantProduct(Items.ENCHANTED_BOOK, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ENCHANTED_BOOK, 8, false); })),
       		 new MerchantProduct(Items.NETHER_BRICK, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_BRICK, 16, false); })),
       		 new MerchantProduct(Items.QUARTZ, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.QUARTZ, 64, false); })),
       		 new MerchantProduct(Items.PRISMARINE_SHARD, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PRISMARINE_SHARD, 8, false); })),
       		 new MerchantProduct(Items.PRISMARINE_CRYSTALS, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PRISMARINE_CRYSTALS, 8, false); })),
				 new MerchantProduct(Items.END_ROD, CoinType.SILVER, 5, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.END_ROD, 5, false); })),
				 new MerchantProduct(Items.FIRE_CHARGE, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FIRE_CHARGE, 3, false); })),
       		 new MerchantProduct(Items.FLOWER_POT, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FLOWER_POT, 48, false); })),
       		 new MerchantProduct(Items.MAP, CoinType.SILVER, 10, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAP, 10, false); })),
       		 new MerchantProduct(Items.CLAY, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CLAY, 8, false); })),
       		 new MerchantProduct(Items.CARVED_PUMPKIN, CoinType.BRONZE, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CARVED_PUMPKIN, 80, false); })),
       		 new MerchantProduct(Items.JACK_O_LANTERN, CoinType.BRONZE, 88, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JACK_O_LANTERN, 88, false); })),
				 new MerchantProduct(Items.LAPIS_LAZULI, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LAPIS_LAZULI, 32, false); })),
       		 new MerchantProduct(Items.BONE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BONE, 24, false); })),
       		 new MerchantProduct(Items.SUGAR, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SUGAR, 64, false); })),
       		 new MerchantProduct(Items.CHAIN, CoinType.BRONZE, 156, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHAIN, 156, false); })),
       		 new MerchantProduct(Items.SCUTE, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SCUTE, 40, false); })),
       		 new MerchantProduct(Items.FEATHER, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FEATHER, 8, false); })),
       		 new MerchantProduct(Items.STRING, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRING, 8, false); })),
       		 new MerchantProduct(Items.GUNPOWDER, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GUNPOWDER, 40, false); })), 
       		 new MerchantProduct(Items.FLINT, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FLINT, 8, false); })),
       		 new MerchantProduct(Items.BRICK, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BRICK, 16, false); })),
       		 new MerchantProduct(Items.CLAY_BALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CLAY_BALL, 8, false); })),
       		 new MerchantProduct(Items.LEATHER, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEATHER, 32, false); })),
       		 new MerchantProduct(Items.SLIME_BALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SLIME_BALL, 8, false); }))
		);
		
		return INSTANCE.LIST;
	}

    public static final ShopkeeperTrades INSTANCE = new ShopkeeperTrades();
    
}
