package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class MinerTrades extends TradeOption
{
	
	public static MerchantSet<MerchantProduct> getMiningTools()
	{
		INSTANCE.addAll( 
				 new MerchantProduct(Items.WOODEN_SHOVEL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WOODEN_SHOVEL, 8, false); })),
       		 	 new MerchantProduct(Items.WOODEN_PICKAXE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WOODEN_PICKAXE, 24, false); })),
       		 	 new MerchantProduct(Items.STONE_SHOVEL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_SHOVEL, 8, false); })),
				 new MerchantProduct(Items.STONE_PICKAXE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_PICKAXE, 24, false); })), 		     	
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_shovel"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_shovel"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_pickaxe"), CoinType.SILVER, 2, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_pickaxe"), 2, false); })),
		     	 new MerchantProduct(Items.GOLDEN_SHOVEL, CoinType.GOLD, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_SHOVEL, 8, false); })),
		     	 new MerchantProduct(Items.GOLDEN_PICKAXE, CoinType.GOLD, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_PICKAXE, 24, false); })),
		     	 new MerchantProduct(Items.IRON_SHOVEL, CoinType.BRONZE, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_SHOVEL, 128, false); })),
		     	 new MerchantProduct(Items.IRON_PICKAXE, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_PICKAXE, 4, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_shovel"), CoinType.SILVER, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_shovel"), 16, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_pickaxe"), CoinType.SILVER, 48, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_pickaxe"), 48, false); })),
		     	 new MerchantProduct(Items.DIAMOND_SHOVEL, CoinType.GOLD, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_SHOVEL, 40, false); })),
		     	 new MerchantProduct(Items.DIAMOND_PICKAXE, CoinType.GOLD, 120, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_PICKAXE, 120, false); })),
		     	 new MerchantProduct(Items.NETHERITE_SHOVEL, CoinType.GOLD, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_SHOVEL, 64, false); })),
		     	 new MerchantProduct(Items.NETHERITE_PICKAXE, CoinType.GOLD, 192, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_PICKAXE, 192, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_shovel"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_shovel"), 8, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_pickaxe"), CoinType.GOLD, 24, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_pickaxe"), 24, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_shovel"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_shovel"), 8, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_pickaxe"), CoinType.GOLD, 24, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_pickaxe"), 24, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_shovel"), CoinType.GOLD, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_shovel"), 16, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_pickaxe"), CoinType.GOLD, 48, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_pickaxe"), 48, false); }))
		);
		
		return INSTANCE.LIST;
	}

	public static MerchantSet<MerchantProduct> getMineralItems()
	{
		INSTANCE.addAll( 
				new MerchantProduct(Items.COAL, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COAL, 32, false); })),
	        	new MerchantProduct(Items.COAL_BLOCK, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COAL_BLOCK, 3, false); })),
	        	new MerchantProduct(Items.REDSTONE, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.REDSTONE, 32, false); })),
	        	new MerchantProduct(Items.REDSTONE_BLOCK, CoinType.BRONZE, 150, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.REDSTONE_BLOCK, 150, false); })),
				new MerchantProduct(Items.LAPIS_LAZULI, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LAPIS_LAZULI, 32, false); })),
				new MerchantProduct(Items.LAPIS_BLOCK, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LAPIS_BLOCK, 3, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_nugget"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_nugget"), 8, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_ingot"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_ingot"), 64, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_block"), CoinType.SILVER, 6, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_block"), 6, false); })),
				new MerchantProduct(Items.IRON_NUGGET, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_NUGGET, 16, false); })),
				new MerchantProduct(Items.IRON_INGOT, CoinType.BRONZE, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_INGOT, 128, false); })),
	        	new MerchantProduct(Items.IRON_BLOCK, CoinType.SILVER, 11, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_BLOCK, 11, false); })),
	        	new MerchantProduct(ItemParser.getItemFromName("odysseymod:rough_iron_block"), CoinType.SILVER, 12, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:rough_iron_block"), 12, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_ingot"), CoinType.SILVER, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_ingot"), 16, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_nugget"), CoinType.BRONZE, 177, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_nugget"), 177, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_block"), CoinType.SILVER, 144, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_block"), 144, false); })),
				new MerchantProduct(Items.GOLD_NUGGET, CoinType.GOLD, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLD_NUGGET, 1, false); })),
				new MerchantProduct(Items.GOLD_INGOT, CoinType.GOLD, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLD_INGOT, 8, false); })),
	        	new MerchantProduct(Items.GOLD_BLOCK, CoinType.GOLD, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLD_BLOCK, 72, false); })),
	        	new MerchantProduct(Items.NETHERITE_SCRAP, CoinType.GOLD, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_SCRAP, 8, false); })),
				new MerchantProduct(Items.NETHERITE_INGOT, CoinType.GOLD, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_INGOT, 64, false); })),
	        	new MerchantProduct(Items.NETHERITE_BLOCK, CoinType.GOLD, 576, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_BLOCK, 576, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_ingot"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_ingot"), 8, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_ingot"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_ingot"), 8, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_ingot"), CoinType.GOLD, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_ingot"), 16, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:amethyst_gem"), CoinType.SILVER, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:amethyst_gem"), 8, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:amethyst_block"), CoinType.SILVER, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:amethyst_block"), 72, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("odysseymod:topaz"), CoinType.SILVER, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:topaz"), 32, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("odysseymod:topaz_block"), CoinType.SILVER, 288, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:topaz_block"), 288, false); })),
				new MerchantProduct(ItemParser.getItemFromName("odysseymod:ruby"), CoinType.GOLD, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:ruby"), 4, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("odysseymod:ruby_block"), CoinType.GOLD, 36, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:ruby_block"), 36, false); })),
				new MerchantProduct(Items.DIAMOND, CoinType.GOLD, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND, 40, false); })),
	        	new MerchantProduct(Items.DIAMOND_BLOCK, CoinType.GOLD, 360, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_BLOCK, 360, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:sapphire_gem"), CoinType.GOLD, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sapphire_gem"), 64, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:sapphire_block"), CoinType.GOLD, 576, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sapphire_block"), 576, false); })),
				new MerchantProduct(Items.EMERALD, CoinType.GOLD, 96, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.EMERALD, 96, false); })),
	        	new MerchantProduct(Items.EMERALD_BLOCK, CoinType.GOLD, 864, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.EMERALD_BLOCK, 864, false); }))
		);
		
		return INSTANCE.LIST;
	}

	public static final MinerTrades INSTANCE = new MinerTrades();
}
