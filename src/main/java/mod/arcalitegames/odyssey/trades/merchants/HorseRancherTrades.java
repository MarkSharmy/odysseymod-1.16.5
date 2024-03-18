package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class HorseRancherTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getMerchantItems()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.APPLE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.APPLE, 8, false); })),
				new MerchantProduct(Items.WHEAT, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WHEAT, 72, false); })),
				new MerchantProduct(Items.SADDLE, CoinType.BRONZE, 100, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SADDLE, 100, false); })),
				new MerchantProduct(Items.LEATHER_HORSE_ARMOR, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LEATHER_HORSE_ARMOR, 4, false); })),
	        	new MerchantProduct(Items.IRON_HORSE_ARMOR, CoinType.SILVER, 15, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_HORSE_ARMOR, 15, false); })),
	        	new MerchantProduct(Items.GOLDEN_HORSE_ARMOR, CoinType.GOLD, 96, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_HORSE_ARMOR, 96, false); })),
	        	new MerchantProduct(Items.DIAMOND_HORSE_ARMOR, CoinType.GOLD, 480, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_HORSE_ARMOR, 480, false); }))
		);
		
		return INSTANCE.LIST;
	}
    
    public static final HorseRancherTrades INSTANCE = new HorseRancherTrades();
}
