package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class ButcheryTrades extends TradeOption
{

	public static MerchantSet<MerchantProduct> getMerchantItems()
	{
		INSTANCE.addAll(
				new MerchantProduct(Items.COOKED_PORKCHOP, CoinType.BRONZE, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COOKED_PORKCHOP, 80, false); })),
				 new MerchantProduct(Items.COOKED_COD, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COOKED_COD, 72, false); })),
				 new MerchantProduct(Items.COOKED_SALMON, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COOKED_SALMON, 72, false); })),
       		 new MerchantProduct(Items.COOKED_BEEF, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COOKED_BEEF, 72, false); })),
       		 new MerchantProduct(Items.COOKED_MUTTON, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COOKED_MUTTON, 72, false); })),
       		 new MerchantProduct(Items.COOKED_RABBIT, CoinType.BRONZE, 90, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COOKED_RABBIT, 90, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:pheasantcooked"), CoinType.BRONZE, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:pheasantcooked"), 72, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:venisoncooked"), CoinType.BRONZE, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:venisoncooked"), 72, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:crab_meat_cooked"), CoinType.BRONZE, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:crab_meat_cooked"), 72, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:turkey_leg_cooked"), CoinType.BRONZE, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:turkey_leg_cooked"), 72, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:eel_meat_cooked"), CoinType.BRONZE, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:eel_meat_cooked"), 72, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("betteranimalsplus:calamari_cooked"), CoinType.BRONZE, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("betteranimalsplus:calamari_cooked"), 72, false); }))
		);
		
		return INSTANCE.LIST;
	}

    public static final ButcheryTrades INSTANCE = new ButcheryTrades();
}
