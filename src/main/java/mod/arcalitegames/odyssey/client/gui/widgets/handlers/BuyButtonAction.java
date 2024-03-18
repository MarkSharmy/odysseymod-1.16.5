package mod.arcalitegames.odyssey.client.gui.widgets.handlers;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.client.player.PlayerWalletManager;
import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.Button.IPressable;

public class BuyButtonAction implements IPressable
{
	MerchantProduct product = null;
	CoinType coinType = null;
	
	@Override
	public void onPress(Button p_onPress_1_)
	{
		if(this.canExecute())
		{
			TradeManager.selectMerchantProduct();
			TradeManager.billCustomer(coinType, true);
			TradeManager.prepNextItem();
		}
	}

	private boolean canExecute()
	{
		if(TradeManager.displayItem == null)
		{
			return false;
		}
		
		if(!TradeManager.isInventoryProduct)
		{
			product = MerchantGui.INSTANCE.tradeOption.getItemProduct(TradeManager.displayItem);
			
			coinType = product.getCoinType();
			
			if(coinType == CoinType.GOLD)
			{
				if(this.getCost(product, TradeManager.count) > PlayerWalletManager.getGoldCoins())
				{
					MerchantGui.INSTANCE.prompt = "Insufficient funds";
					MerchantGui.INSTANCE.refresh();
					return false;
				}
			}
			
			if(coinType == CoinType.SILVER)
			{
				if(this.getCost(product, TradeManager.count) > PlayerWalletManager.getSilverCoins())
				{
					MerchantGui.INSTANCE.prompt = "Insufficient funds";
					MerchantGui.INSTANCE.refresh();
					return false;
				}
			}
			
			if(coinType == CoinType.BRONZE)
			{
				if(this.getCost(product, TradeManager.count) > PlayerWalletManager.getBronzeCoins())
				{
					MerchantGui.INSTANCE.prompt = "Insufficient funds";
					MerchantGui.INSTANCE.refresh();
					return false;
				}
			}
		}
		
		if(TradeManager.sellingInProgress)
		{
			MerchantGui.INSTANCE.prompt = "Complete current transaction!";
			MerchantGui.INSTANCE.refresh();
			return false;
		}
		return !TradeManager.isInventoryProduct;
		
	}
	
	private int getCost(MerchantProduct product, int amount)
	{
		return product.getValue() * amount;
	}
	
}
