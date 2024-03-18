package mod.arcalitegames.odyssey.trades.products;

import mod.arcalitegames.odyssey.client.gui.widgets.ItemButton;
import mod.arcalitegames.odyssey.enums.CoinType;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemProduct
{
	protected int value;
    protected Item item;
    protected CoinType coinType;
    protected ImageButton imageButton;

    public ItemProduct(Item itemIn, CoinType coin, int value, ImageButton imageButtonIn)
    {
        this.value = value;
        this.item = itemIn;
        this.coinType = coin;
        this.imageButton = imageButtonIn;
    }

    public ItemProduct(Item itemIn, CoinType coin, int value, ItemButton itemButton)
    {
    	this.value = value;
        this.item = itemIn;
        this.coinType = coin;
        this.imageButton = itemButton;
	}

	public Item getItem() { return item; }
    
	public ItemStack getItemStack() { return new ItemStack(item); }
	
    public CoinType getCoinType(){ return coinType; }

    public int getValue(){ return value; }

    public ImageButton getImageButton() {
        return imageButton;
    }

    @Override
    public String toString()
    {
        String str = "";
        str = "Item = " + item + ", Value = " + value + coinType;
        return str;
    }
}
