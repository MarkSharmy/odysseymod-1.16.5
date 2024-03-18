package mod.arcalitegames.odyssey.trades.products;

import mod.arcalitegames.odyssey.client.gui.widgets.ItemButton;
import mod.arcalitegames.odyssey.enums.CoinType;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Item;

public class MerchantProduct extends ItemProduct
{
    public MerchantProduct(Item itemIn, CoinType coin, int value, ImageButton imageButtonIn)
    {
    	super(itemIn, coin, value, imageButtonIn);
    }

	public MerchantProduct(Item itemIn, CoinType coin, int value, ItemButton itemButton) {
		super(itemIn, coin, value, itemButton);
	}

}






















