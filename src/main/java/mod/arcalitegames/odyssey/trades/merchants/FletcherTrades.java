package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class FletcherTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getWeaponsItems()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.BOW, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BOW, 40, false); })),
	        	new MerchantProduct(Items.CROSSBOW, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CROSSBOW, 3, false); })),
	        	new MerchantProduct(Items.ARROW, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ARROW, 8, false); })),
	        	new MerchantProduct(Items.SPECTRAL_ARROW, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPECTRAL_ARROW, 8, false); })),	
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonbone_arrow"), CoinType.SILVER, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonbone_arrow"), 16, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonbone_bow"), CoinType.SILVER, 161, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonbone_bow"), 161, false); })),	
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:hippogryph_sword"), CoinType.SILVER, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:hippogryph_sword"), 4, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_red"), CoinType.SILVER, 35, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_red"), 35, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_white"), CoinType.SILVER, 35, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_white"), 35, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_yellow"), CoinType.SILVER, 35, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_yellow"), 35, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:stymphalian_arrow"), CoinType.BRONZE, 29, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:stymphalian_arrow"), 29, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:amphithere_arrow"), CoinType.BRONZE, 29, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:amphithere_arrow"), 29, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:sea_serpent_arrow"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sea_serpent_arrow"), 8, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getFletchingTools()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.FEATHER, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FEATHER, 8, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:stymphalian_bird_feather"), CoinType.SILVER, 1, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:stymphalian_bird_feather"), 1, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:stymphalian_feather_bundle"), CoinType.SILVER, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:stymphalian_feather_bundle"), 8, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:stymphalian_bird_dagger"), CoinType.SILVER, 2, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:stymphalian_bird_dagger"), 2, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:amphithere_feather"), CoinType.SILVER, 1, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:amphithere_feather"), 1, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:amphithere_macuahuitl"), CoinType.BRONZE, 1824, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:amphithere_macuahuitl"), 1824, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:sea_serpent_fang"), CoinType.SILVER, 320, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sea_serpent_fang"), 320, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:hydra_fang"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:hydra_fang"), 8, false); })),
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:hippogryph_talon"), CoinType.SILVER, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:hippogryph_talon"), 16, false); })),
	 		    new MerchantProduct(ItemParser.getItemFromName("iceandfire:cockatrice_scepter"), CoinType.SILVER, 129, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:cockatrice_scepter"), 129, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getArmorItems()
	{
		INSTANCE.addAll( 
				new MerchantProduct(ItemParser.getItemFromName("iceandfire:forest_troll_leather_helmet"), CoinType.SILVER, 40, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:forest_troll_leather_helmet"), 40, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:forest_troll_leather_chestplate"), CoinType.SILVER, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:forest_troll_leather_chestplate"), 64, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:forest_troll_leather_leggings"), CoinType.SILVER, 56, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:forest_troll_leather_leggings"), 56, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:forest_troll_leather_boots"), CoinType.SILVER, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:forest_troll_leather_boots"), 32, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_helmet"), CoinType.SILVER, 40, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_helmet"), 40, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_chestplate"), CoinType.SILVER, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_chestplate"), 64, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_leggings"), CoinType.SILVER, 56, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_leggings"), 56, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_boots"), CoinType.SILVER, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:mountain_troll_leather_boots"), 32, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:frost_troll_leather_helmet"), CoinType.SILVER, 40, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:frost_troll_leather_helmet"), 40, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:frost_troll_leather_chestplate"), CoinType.SILVER, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:frost_troll_leather_chestplate"), 64, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:frost_troll_leather_leggings"), CoinType.SILVER, 56, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:frost_troll_leather_leggings"), 56, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:frost_troll_leather_boots"), CoinType.SILVER, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:frost_troll_leather_boots"), 32, false); })),
				 new MerchantProduct(Items.TURTLE_HELMET, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TURTLE_HELMET, 2, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:sheep_helmet"), CoinType.BRONZE, 320, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sheep_helmet"), 320, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:sheep_chestplate"), CoinType.BRONZE, 512, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sheep_chestplate"), 512, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:sheep_leggings"), CoinType.BRONZE, 448, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sheep_leggings"), 448, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("iceandfire:sheep_boots"), CoinType.BRONZE, 256, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:sheep_boots"), 256, false); })),	
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_snowy"), CoinType.SILVER, 5, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_snowy"), 5, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_timber"), CoinType.SILVER, 5, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_timber"), 5, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_black"), CoinType.SILVER, 5, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_black"), 5, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_arctic"), CoinType.SILVER, 5, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_arctic"), 5, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_brown"), CoinType.SILVER, 5, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_brown"), 5, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_red"), CoinType.SILVER, 5, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:wolf_cape_red"), 5, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:bear_cape_brown"), CoinType.SILVER, 15, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:bear_cape_brown"), 15, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:bear_cape_black"), CoinType.SILVER, 15, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:bear_cape_black"), 15, false); })),
	 		     new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:bear_cape_kermode"), CoinType.SILVER, 15, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:bear_cape_kermode"), 15, false); }))
		);
		
		return INSTANCE.LIST;
	}
    
    public static final FletcherTrades INSTANCE = new FletcherTrades();
}
