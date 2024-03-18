package mod.arcalitegames.odyssey.client.gui.widgets.handlers;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.Button.IPressable;

public class AcceptButtonAction implements IPressable
{

	CoinType coinType = CoinType.SILVER;
	
	@Override
	public void onPress(Button p_onPress_1_)
	{
		TradeManager.completeTransaction();
		TradeManager.reset();
	}
	
}
