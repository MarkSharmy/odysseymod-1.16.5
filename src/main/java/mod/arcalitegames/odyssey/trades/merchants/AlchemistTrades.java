package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class AlchemistTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getAlchemyTools()
	{
		INSTANCE.addAll( 
			new MerchantProduct(Items.GLASS_BOTTLE, CoinType.BRONZE, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GLASS_BOTTLE, 3, false); })),
       		new MerchantProduct(Items.BREWING_STAND, CoinType.SILVER, 18, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BREWING_STAND, 18, false); })),
       		new MerchantProduct(Items.CAULDRON, CoinType.SILVER, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CAULDRON, 9, false); })),
			new MerchantProduct(Items.SOUL_SAND, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SOUL_SAND, 8, false); })),
       		new MerchantProduct(Items.SOUL_SOIL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SOUL_SOIL, 8, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getAlchemyIngredients()
    {
		INSTANCE.addAll(
				 new MerchantProduct(Items.PHANTOM_MEMBRANE, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PHANTOM_MEMBRANE, 1, false); })),
        		 new MerchantProduct(Items.GLOWSTONE_DUST, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GLOWSTONE_DUST, 4, false); })),
        		 new MerchantProduct(Items.ROTTEN_FLESH, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ROTTEN_FLESH, 1, false); })),
        		 new MerchantProduct(Items.GOLDEN_APPLE, CoinType.GOLD, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_APPLE, 64, false); })),
        		 new MerchantProduct(Items.ENCHANTED_GOLDEN_APPLE, CoinType.GOLD, 68, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ENCHANTED_GOLDEN_APPLE, 68, false); })),
        		 new MerchantProduct(Items.ENDER_PEARL, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ENDER_PEARL, 8, false); })),
        		 new MerchantProduct(Items.BLAZE_ROD, CoinType.SILVER, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLAZE_ROD, 16, false); })),
        		 new MerchantProduct(Items.GHAST_TEAR, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GHAST_TEAR, 8, false); })), 
        		 new MerchantProduct(Items.NETHER_WART, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_WART, 16, false); })),
        		 new MerchantProduct(Items.SPIDER_EYE, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPIDER_EYE, 64, false); })),
        		 new MerchantProduct(Items.FERMENTED_SPIDER_EYE, CoinType.BRONZE, 88, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.FERMENTED_SPIDER_EYE, 88, false); })),
        		 new MerchantProduct(Items.BLAZE_POWDER, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLAZE_POWDER, 8, false); })),
        		 new MerchantProduct(Items.MAGMA_CREAM, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAGMA_CREAM, 32, false); })),
        		 new MerchantProduct(Items.GLISTERING_MELON_SLICE, CoinType.GOLD, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GLISTERING_MELON_SLICE, 8, false); })),
        		 new MerchantProduct(Items.EXPERIENCE_BOTTLE, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.EXPERIENCE_BOTTLE, 8, false); })),
        		 new MerchantProduct(Items.GOLDEN_CARROT, CoinType.GOLD, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_CARROT, 8, false); })),
        		 new MerchantProduct(Items.GLOWSTONE_DUST, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GLOWSTONE_DUST, 8, false); })),
 				 new MerchantProduct(Items.RABBIT_FOOT, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RABBIT_FOOT, 1, false); }))
		);
		
		return INSTANCE.LIST;
    }
	
	public static final AlchemistTrades INSTANCE = new AlchemistTrades();

}
