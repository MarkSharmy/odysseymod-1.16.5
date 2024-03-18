package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class FruitStallTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getMerchantItems()
	{
		INSTANCE.addAll( 
				new MerchantProduct(Items.CHORUS_FRUIT, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHORUS_FRUIT, 16, false); })),
				new MerchantProduct(Items.APPLE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.APPLE, 8, false); })),
				new MerchantProduct(Items.SWEET_BERRIES, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SWEET_BERRIES, 4, false); })),
				new MerchantProduct(Items.COCOA_BEANS, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COCOA_BEANS, 4, false); })),
				new MerchantProduct(Items.MELON_SLICE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MELON_SLICE, 8, false); })),
				new MerchantProduct(Items.HONEYCOMB, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.HONEYCOMB, 48, false); })),
				new MerchantProduct(Items.HONEY_BOTTLE, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.HONEY_BOTTLE, 64, false); })),
				new MerchantProduct(Items.POPPED_CHORUS_FRUIT, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POPPED_CHORUS_FRUIT, 32, false); }))
		);
		
		return INSTANCE.LIST;
	}
    
    public static final FruitStallTrades INSTANCE = new FruitStallTrades();
}
