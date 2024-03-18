package mod.arcalitegames.odyssey.client.gui.widgets.handlers;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.PlayerTrades;
import mod.arcalitegames.odyssey.trades.products.InventoryProduct;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.Button.IPressable;
import net.minecraft.item.ItemStack;

public class SellButtonAction implements IPressable {

	private CoinType coinType = CoinType.SILVER;
	
	@Override
	public void onPress(Button p_onPress_1_)
	{
		if(canExecute())
		{
			TradeManager.selectInventoryProduct();
			TradeManager.billCustomer(coinType, false);
			TradeManager.prepNextItem();
		}
	}
	
	private boolean canExecute()
	{
		if(TradeManager.isInventoryProduct)
		{
			InventoryProduct product = PlayerTrades.getInventoryProduct(TradeManager.displayItem);
			
			coinType = product.getCoinType();
			
			if(product.isStackEmpty())
			{
				MerchantGui.INSTANCE.prompt = "Not Enough Items!";
				return false;
			}
			if(notEnoughItems())
			{
				MerchantGui.INSTANCE.prompt = "Not Enough Items!";
				return false;
			}
		}
		
		if(TradeManager.displayItem == null)
		{
			return false;
		}
		if(TradeManager.buyingInProgress)
		{
			MerchantGui.INSTANCE.prompt = "Complete current transaction!";
			MerchantGui.INSTANCE.refresh();
			return false;
		}
		
		return TradeManager.isInventoryProduct;
	}
	
	private static boolean notEnoughItems()
	{
		ItemStack stack = PlayerTrades.getInventoryProduct(TradeManager.displayItem).getItemStack();
		boolean flag = TradeManager.count > stack.getCount();
		
		if(flag) return true;
		
		return false;
	}

}
