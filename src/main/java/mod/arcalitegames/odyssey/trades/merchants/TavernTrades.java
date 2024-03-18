package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class TavernTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getMerchantItems()
	{
		INSTANCE.addAll( 
				new MerchantProduct(ItemParser.getItemFromName("odysseymod:ale"), CoinType.BRONZE, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:ale"), 16, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:beer"), CoinType.BRONZE, 40, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:beer"), 40, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:wine"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:wine"), 64, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:fine_wine"), CoinType.SILVER, 2, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:fine_wine"), 2, false); })),
				new MerchantProduct(ItemParser.getItemFromName("odysseymod:full_cup"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:full_cup"), 8, false); })),
				new MerchantProduct(Items.BREAD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BREAD, 8, false); })),
        		new MerchantProduct(Items.CAKE, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CAKE, 4, false); })),
        		new MerchantProduct(Items.PUMPKIN_PIE, CoinType.BRONZE, 160, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PUMPKIN_PIE, 160, false); })),
				new MerchantProduct(Items.RABBIT_STEW, CoinType.BRONZE, 238, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RABBIT_STEW, 238, false); })),
        		new MerchantProduct(Items.BEETROOT_SOUP, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BEETROOT_SOUP, 4, false); })),
        		new MerchantProduct(Items.MUSHROOM_STEW, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MUSHROOM_STEW, 16, false); })), 
				new MerchantProduct(Items.BAKED_POTATO, CoinType.BRONZE, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BAKED_POTATO, 80, false); })),
				new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:chocolatecaramelfudgeitem"), CoinType.BRONZE, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:chocolatecaramelfudgeitem"), 128, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:chickenpotpieitem"), CoinType.SILVER, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:chickenpotpieitem"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:chickendinneritem"), CoinType.SILVER, 6, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:chickendinneritem"), 6, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:beefjerkyitem"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:beefjerkyitem"), 64, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:fishsticksitem"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:fishsticksitem"), 64, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:fishandchipsitem"), CoinType.SILVER, 3, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:fishandchipsitem"), 3, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:potatosoupitem"), CoinType.SILVER, 1, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:potatosoupitem"), 1, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:carrotsoupitem"), CoinType.SILVER, 1, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:carrotsoupitem"), 1, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:pumpkinsoupitem"), CoinType.SILVER, 1, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:pumpkinsoupitem"), 1, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:stewitem"), CoinType.SILVER, 3, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:stewitem"), 3, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:meatloafitem"), CoinType.BRONZE, 72, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:meatloafitem"), 72, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:fried_egg"), CoinType.BRONZE, 40, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:fried_egg"), 40, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:grilledcheeseitem"), CoinType.BRONZE, 20, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:grilledcheeseitem"), 20, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:noodlesoupitem"), CoinType.BRONZE, 50, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:noodlesoupitem"), 50, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:stock"), CoinType.BRONZE, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:stock"), 32, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:cheeseitem"), CoinType.BRONZE, 24, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:cheeseitem"), 24, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("pamhc2foodcore:goat_cheese"), CoinType.BRONZE, 20, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("pamhc2foodcore:goat_cheese"), 20, false); }))
		);
		
		return INSTANCE.LIST;
	}

    public static final TavernTrades INSTANCE = new TavernTrades();
}
