package mod.arcalitegames.odyssey.trades;

import javax.annotation.Nullable;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class TradeOption
{
	public static final int posY = 45;
	public static final int height = 19;
	public final MerchantSet<MerchantProduct> LIST = new MerchantSet<>();
	protected static final ResourceLocation BUTTON_TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/buttons.png");
    

    @Nullable
    public MerchantProduct getItemProduct(Button button)
    {
        for(MerchantProduct item : LIST) {
            if (button.equals(item.getImageButton())) return item;
        }

        return null;
    }

    @Nullable
    public MerchantProduct getItemProduct(Item item)
    {
        for(MerchantProduct itemProduct: LIST)
        {
            if(item == itemProduct.getItem()) return itemProduct;
        }

        return null;
    }
    
    public void addAll(MerchantProduct...products)
    {
    	LIST.clear();
    	
    	for(MerchantProduct product: products)
    	{
    		LIST.add(product);
    	}
    }
}
