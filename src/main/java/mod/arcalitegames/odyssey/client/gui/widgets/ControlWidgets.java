package mod.arcalitegames.odyssey.client.gui.widgets;

import java.util.List;

import com.google.common.collect.Lists;
import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.client.gui.widgets.handlers.AcceptButtonAction;
import mod.arcalitegames.odyssey.client.gui.widgets.handlers.BuyButtonAction;
import mod.arcalitegames.odyssey.client.gui.widgets.handlers.CancelButtonAction;
import mod.arcalitegames.odyssey.client.gui.widgets.handlers.SellButtonAction;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;

public class ControlWidgets 
{
	public static Button BUY_BUTTON;
	
	public static Button ACCEPT_BUTTON;
	
	public static Button SELL_BUTTON;
	
	public static Button CANCEL_BUTTON;
	
	public static void init()
	{
		BUY_BUTTON = new Button(
				7 + MerchantGui.INSTANCE.guiX,
				MerchantGui.INSTANCE.buttonYIn + MerchantGui.INSTANCE.guiY,
				MerchantGui.INSTANCE.buttonWidth,
				MerchantGui.INSTANCE.buttonHeight,
				new StringTextComponent("BUY"), new BuyButtonAction());
		
		ACCEPT_BUTTON = new Button(
				65 + MerchantGui.INSTANCE.guiX,
				MerchantGui.INSTANCE.buttonYIn + MerchantGui.INSTANCE.guiY,
				MerchantGui.INSTANCE.buttonWidth,
				MerchantGui.INSTANCE.buttonHeight,
				new StringTextComponent("ACCEPT"), new AcceptButtonAction());
		
		SELL_BUTTON = new Button(
				123 + MerchantGui.INSTANCE.guiX,
				MerchantGui.INSTANCE.buttonYIn + MerchantGui.INSTANCE.guiY,
				MerchantGui.INSTANCE.buttonWidth,
				MerchantGui.INSTANCE.buttonHeight,
				new StringTextComponent("SELL"), new SellButtonAction());
		
		CANCEL_BUTTON = new Button(
				181 + MerchantGui.INSTANCE.guiX,
				MerchantGui.INSTANCE.buttonYIn + MerchantGui.INSTANCE.guiY,
				MerchantGui.INSTANCE.buttonWidth,
				MerchantGui.INSTANCE.buttonHeight,
				new StringTextComponent("CANCEL"), new CancelButtonAction());
	}
	
	public static List<Button> getWidgets()
	{
		return Lists.newArrayList(BUY_BUTTON, ACCEPT_BUTTON, SELL_BUTTON, CANCEL_BUTTON);
	}
	
}
