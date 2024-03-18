package mod.arcalitegames.odyssey.client.gui.widgets;

import java.util.List;

import com.google.common.collect.Lists;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.util.ResourceLocation;

public class MerchantPageControls
{
	public static int count = 0;
	
    protected static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/demo.png");

    public static ImageButton previous;
    public static ImageButton next;
    
    
    public static void init()
    {
    	previous = new ImageButton(
        		177 + MerchantGui.INSTANCE.guiX,
        		17 + MerchantGui.INSTANCE.guiY,
        		67, 8 , 177, 17, 0, TEXTURE,
        		new PreviousButtonAction());
    	
    	next = new ImageButton(
        		177 + MerchantGui.INSTANCE.guiX,
        		139 + MerchantGui.INSTANCE.guiY,
        		67, 8 , 177, 139, 0, TEXTURE,
        		new NextButtonAction());
    }
    
    public static List<Button> getWidgets()
    {
    	return Lists.newArrayList(previous, next);
    }
    
    static class PreviousButtonAction implements Button.IPressable
    {

		@Override
		public void onPress(Button p_onPress_1_)
		{
			count--;
			MerchantGui.INSTANCE.merchantPage = count;
			System.out.println(MerchantGui.INSTANCE.merchantPage);
			MerchantGui.INSTANCE.refresh();
		}
    }
    
    static class NextButtonAction implements Button.IPressable
    {

		@Override
		public void onPress(Button p_onPress_1_)
		{
			count++;
			MerchantGui.INSTANCE.merchantPage = count;
			System.out.println(MerchantGui.INSTANCE.merchantPage);
			MerchantGui.INSTANCE.refresh();
		}
    }
    
}
