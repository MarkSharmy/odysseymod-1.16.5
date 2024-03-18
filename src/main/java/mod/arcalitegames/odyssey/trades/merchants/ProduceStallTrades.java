package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class ProduceStallTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getMerchantItems()
	{
		INSTANCE.addAll( 
				new MerchantProduct(Items.SEA_PICKLE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SEA_PICKLE, 16, false); })),
				 new MerchantProduct(Items.PUMPKIN, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PUMPKIN, 64, false); })),
				 new MerchantProduct(Items.DRIED_KELP, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DRIED_KELP, 8, false); })),
				 new MerchantProduct(Items.CARROT, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CARROT, 64, false); })),
				 new MerchantProduct(Items.POTATO, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POTATO, 64, false); })),
				 new MerchantProduct(Items.MELON, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MELON, 32, false); })),
				 new MerchantProduct(Items.BEETROOT, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BEETROOT, 64, false); })),
				 new MerchantProduct(Items.MILK_BUCKET, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MILK_BUCKET, 3, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:goatmilk"), CoinType.SILVER, 2, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:goatmilk"), 2, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:blubber"), CoinType.BRONZE, 100, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:blubber"), 100, false); })),
				 new MerchantProduct(Items.EGG, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.EGG, 32, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:pheasant_egg"), CoinType.BRONZE, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:pheasant_egg"), 16, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:turkey_egg"), CoinType.BRONZE, 24, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:turkey_egg"), 24, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:goose_egg"), CoinType.BRONZE, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:goose_egg"), 16, false); })),
				 new MerchantProduct(Items.TURTLE_EGG, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TURTLE_EGG, 1, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:hippogryph_egg"), CoinType.GOLD, 1, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:hippogryph_egg"), 1, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:deathworm_egg"), CoinType.BRONZE, 256, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:deathworm_egg"), 256, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:giant_deathworm_egg"), CoinType.BRONZE, 512, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:giant_deathworm_egg"), 512, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:myrmex_desert_worker_egg"), CoinType.BRONZE, 160, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:myrmex_desert_worker_egg"), 160, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:myrmex_jungle_worker_egg"), CoinType.BRONZE, 160, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:myrmex_jungle_worker_egg"), 160, false); }))
		);
		
		return INSTANCE.LIST;
	}
    
    
    public static final ProduceStallTrades INSTANCE = new ProduceStallTrades();
}
