package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class BakeryTrades extends TradeOption
{

	public static MerchantSet<MerchantProduct> getMerchantItems()
	{
		INSTANCE.addAll(
				new MerchantProduct(Items.BREAD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BREAD, 8, false); })),
        		new MerchantProduct(Items.CAKE, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CAKE, 4, false); })),
        		new MerchantProduct(Items.PUMPKIN_PIE, CoinType.BRONZE, 160, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PUMPKIN_PIE, 160, false); })),
				new MerchantProduct(Items.COOKIE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COOKIE, 8, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:carrotbreaditem"), CoinType.BRONZE, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:carrotbreaditem"), 16, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:pumpkinbreaditem"), CoinType.BRONZE, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:pumpkinbreaditem"), 16, false); })),
				new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:applepieitem"), CoinType.BRONZE, 180, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:applepieitem"), 180, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:sweetberrypieitem"), CoinType.BRONZE, 190, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:sweetberrypieitem"), 190, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:chocolatecakeitem"), CoinType.BRONZE, 200, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:chocolatecakeitem"), 200, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:cheese_cake"), CoinType.BRONZE, 100, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:cheese_cake"), 100, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:pumpkincheesecakeitem"), CoinType.BRONZE, 120, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:pumpkincheesecakeitem"), 120, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:carrotcakeitem"), CoinType.BRONZE, 100, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:carrotcakeitem"), 100, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:softpretzelitem"), CoinType.BRONZE, 20, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:softpretzelitem"), 20, false); }))
		);
		
		
		return INSTANCE.LIST;
	}
		
     public static final BakeryTrades INSTANCE = new BakeryTrades();
     
}
