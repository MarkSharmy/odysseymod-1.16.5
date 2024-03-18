package mod.arcalitegames.odyssey.trades.products;

import mod.arcalitegames.odyssey.enums.CoinType;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InventoryProduct extends ItemProduct
{

	protected int count = 0;
    protected ItemStack stack;

    public InventoryProduct(Item itemIn, CoinType coin, int value, ImageButton imageButtonIn)
    {
    	super(itemIn, coin, value, imageButtonIn);
    }

    public void setItem(Item item)
    {
        this.item = item;
    }
    
    public void setItemStack(ItemStack itemStack)
    {
    	this.stack = itemStack;
    	this.count = itemStack.getCount();
    }
    
    public void setCount(int count)
    {
    	this.count = count;
    }
    
    public int getCount()
    {
    	return count;
    }
    
    public boolean isStackEmpty()
    {
    	return count == 0;
    }
    
    public void decrItemStack(int amount)
    {
    	count -= amount;
    }

    public Item getItem() { return item; }
    
    public ItemStack getItemStack() { return stack; }

    public CoinType getCoinType(){ return coinType; }

    public int getValue(){ return value; };

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
