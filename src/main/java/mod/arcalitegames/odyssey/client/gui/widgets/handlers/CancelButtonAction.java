package mod.arcalitegames.odyssey.client.gui.widgets.handlers;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.trades.TradeManager;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.Button.IPressable;

public class CancelButtonAction implements IPressable {

	@Override
	public void onPress(Button p_onPress_1_)
	{
		TradeManager.reset();
		MerchantGui.INSTANCE.closeScreen();
	}
	
}
