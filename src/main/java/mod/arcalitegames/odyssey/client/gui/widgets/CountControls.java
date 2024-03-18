package mod.arcalitegames.odyssey.client.gui.widgets;

import java.util.List;

import com.google.common.collect.Lists;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.trades.TradeManager;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.util.ResourceLocation;

public class CountControls
{
	public static int count = 1;
	
    protected static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/demo.png");
    
	public static ImageButton DecreaseButton;
	
    public static ImageButton IncreaseButton;
    
    public static void init()
    {
    	DecreaseButton = new ImageButton(
    			75 + MerchantGui.INSTANCE.guiX,
    			82 + MerchantGui.INSTANCE.guiY,
    			7, 11 , 75, 82, 0, TEXTURE,
    			new DecreaseButtonAction());
    	
    	IncreaseButton = new ImageButton(
        		166 + MerchantGui.INSTANCE.guiX,
        		82 + MerchantGui.INSTANCE.guiY,
        		7, 11, 166, 82, 0, TEXTURE, 
        		new IncreaseButtonAction());
    }
    
    public static List<Button> getWidgets()
    {
    	return Lists.newArrayList(DecreaseButton, IncreaseButton);
    }
    
    static class DecreaseButtonAction implements Button.IPressable
    {

		@Override
		public void onPress(Button p_onPress_1_)
		{
			if(TradeManager.displayItem != null)
			{
				count--;
				TradeManager.count = count;
				MerchantGui.INSTANCE.refresh();
			}
		}
    	
    }
    
    static class IncreaseButtonAction implements Button.IPressable
    {

		@Override
		public void onPress(Button p_onPress_1_)
		{
			if(TradeManager.displayItem != null)
			{
				count++;
				TradeManager.count = count;
				MerchantGui.INSTANCE.refresh();
			}
		}
    	
    }
    
}
