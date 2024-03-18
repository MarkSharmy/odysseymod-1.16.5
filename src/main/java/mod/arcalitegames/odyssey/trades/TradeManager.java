package mod.arcalitegames.odyssey.trades;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import mod.arcalitegames.odyssey.client.gui.HUDRenderer;
import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.client.player.PlayerWalletManager;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.merchants.AlchemistTrades;
import mod.arcalitegames.odyssey.trades.merchants.BakeryTrades;
import mod.arcalitegames.odyssey.trades.merchants.BlacksmithTrades;
import mod.arcalitegames.odyssey.trades.merchants.ButcheryTrades;
import mod.arcalitegames.odyssey.trades.merchants.CraftsmanTrades;
import mod.arcalitegames.odyssey.trades.merchants.DecorTrades;
import mod.arcalitegames.odyssey.trades.merchants.FarmerTrades;
import mod.arcalitegames.odyssey.trades.merchants.FletcherTrades;
import mod.arcalitegames.odyssey.trades.merchants.FruitStallTrades;
import mod.arcalitegames.odyssey.trades.merchants.GuildTrades;
import mod.arcalitegames.odyssey.trades.merchants.HorseRancherTrades;
import mod.arcalitegames.odyssey.trades.merchants.MinerTrades;
import mod.arcalitegames.odyssey.trades.merchants.PlayerTrades;
import mod.arcalitegames.odyssey.trades.merchants.ProduceStallTrades;
import mod.arcalitegames.odyssey.trades.merchants.ShopkeeperTrades;
import mod.arcalitegames.odyssey.trades.merchants.TavernTrades;
import mod.arcalitegames.odyssey.trades.merchants.TrinketShopTrades;
import mod.arcalitegames.odyssey.trades.products.InventoryProduct;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TradeManager
{
	public static int value = 0;
	public static int count = 1;
	public static Item displayItem;
	public static int goldBill = 0;
	public static int silverBill = 0;
	public static int bronzeBill = 0;
	public static PlayerEntity customer;
	public static MerchantEntity merchant;
	public static String totalGold = "0";
	public static String totalSilver = "0";
	public static String totalBronze = "0";
	public static TradeOption tradeOption;
	public static boolean isInventoryProduct;
	public static boolean canAddTotal = false;
	public static boolean buyingInProgress = false;
	public static boolean sellingInProgress = false;
    public static Map<InventoryProduct, Integer> SoldItems = new LinkedHashMap<>();
    private static Map<MerchantProduct, Integer> PurchasedItems = new LinkedHashMap<>();
    
    /*
     * Displays MerchantGui on the Screen.
     * 
     */
    public static void start()
    {
    	Minecraft.getInstance().displayGuiScreen(MerchantGui.INSTANCE);
		MerchantGui.INSTANCE.updateInventory();
    }
    public static void selectMerchantProduct()
    {
    	canAddTotal = true;
		buyingInProgress = true;
		MerchantProduct product = tradeOption.getItemProduct(displayItem);
		TradeManager.addToCart(product, count);
    }
    
    public static void selectInventoryProduct()
    {
    	canAddTotal = true;
    	sellingInProgress = true;
    	InventoryProduct product = PlayerTrades.getInventoryProduct(displayItem);
    	TradeManager.prepInventoryItem(product);
    }
    
    
    public static void addToCart(MerchantProduct itemProduct, int count)
    {
       PurchasedItems.put(itemProduct, count);
    }
    
    public static void prepNextItem()
    {
     	displayItem = null;
    }
    
    private static void checkOut(PlayerEntity playerIn)
    {
        PlayerInventory inventory = playerIn.inventory;

        Set<Map.Entry<MerchantProduct, Integer>> items = PurchasedItems.entrySet();
        for(Map.Entry<MerchantProduct, Integer> item: items)
        {
            int count = item.getValue();
            int value = item.getKey().getValue();
            int amount = value * count;
            int goldCoins = PlayerWalletManager.getGoldCoins();
            int silverCoins = PlayerWalletManager.getSilverCoins();
            int bronzeCoins = PlayerWalletManager.getBronzeCoins();
            
            if(item.getKey().getCoinType() == CoinType.GOLD)
                PlayerWalletManager.setGoldCoins(goldCoins - amount);
            
            if(item.getKey().getCoinType() == CoinType.SILVER)
                PlayerWalletManager.setSilverCoins(silverCoins - amount);
            
            if(item.getKey().getCoinType() == CoinType.BRONZE)
                PlayerWalletManager.setBronzeCoins(bronzeCoins - amount);
            

            ItemStack stack = item.getKey().getItemStack();
            stack.setCount(count);
           inventory.addItemStackToInventory(stack);
        }
        
        TradeManager.PurchasedItems.clear();
    }
    
    public static void prepInventoryItem(InventoryProduct product)
    {
    	product.decrItemStack(count);
    	TradeManager.addToSale(product);
    	MerchantGui.INSTANCE.refresh();
    }
    
    private static void addToSale(InventoryProduct product)
    {
    	SoldItems.put(product, count);
    }
    
    private static void sellOut(PlayerEntity playerIn)
    {
    	PlayerInventory inventory = playerIn.inventory;
    	
        Set<Map.Entry<InventoryProduct, Integer>> items = SoldItems.entrySet();
        
        for(Entry<InventoryProduct, Integer> item: items)
        {
            int count = item.getValue();
            int value = item.getKey().getValue();
            int amount = value * count;
            int goldCoins = PlayerWalletManager.getGoldCoins();
            int silverCoins = PlayerWalletManager.getSilverCoins();
            int bronzeCoins = PlayerWalletManager.getBronzeCoins();

            if(item.getKey().getCoinType() == CoinType.GOLD)
                PlayerWalletManager.setGoldCoins(goldCoins + amount);
            
            if(item.getKey().getCoinType() == CoinType.SILVER)
                PlayerWalletManager.setSilverCoins(silverCoins + amount);
            
            if(item.getKey().getCoinType() == CoinType.BRONZE)
                PlayerWalletManager.setBronzeCoins(bronzeCoins + amount);
            
            
            ItemStack stack = item.getKey().getItemStack();
            int slot = inventory.getSlotFor(stack);
            inventory.decrStackSize(slot, count);

        }
        
        TradeManager.SoldItems.clear();
    }
    
    public static void completeTransaction()
    {
    	TradeManager.sellOut(customer);
    	TradeManager.checkOut(customer);
    	TradeManager.reset();
    	
        MerchantGui.INSTANCE.updateInventory();
        HUDRenderer.Overlay.gold = PlayerWalletManager.getGoldCoins();
        HUDRenderer.Overlay.silver = PlayerWalletManager.getSilverCoins();
        HUDRenderer.Overlay.bronze = PlayerWalletManager.getBronzeCoins();
    }
    
    public static void reset()
    {
    	count = 1;
    	goldBill = 0;
    	silverBill = 0;
    	bronzeBill = 0;
    	totalGold = "";
    	totalSilver = "";
    	SoldItems.clear();
    	displayItem = null;
    	canAddTotal = false;
    	PurchasedItems.clear();
    	buyingInProgress = false;
    	sellingInProgress = false;
    	MerchantGui.INSTANCE.merchantPage = 0;
		MerchantGui.INSTANCE.playerPage = 0;
    	MerchantGui.INSTANCE.prompt = "";
    	MerchantGui.INSTANCE.refresh();
    }
    
	public static void input(Item item, int valueIn, boolean inventoryItem)
	{
		value = valueIn;
		displayItem = item;
		isInventoryProduct = inventoryItem;
	}
	
	public static void closeTrades()
	{
		
	}

	public static void billCustomer(CoinType type, boolean billCustomer)
	{
		if(billCustomer)
		{
			if(type == CoinType.GOLD)
			{
				goldBill += value * count;
				totalGold = " - " + goldBill;
			}
			
			if(type == CoinType.SILVER)
			{
				silverBill += value * count;
				totalSilver = " - " + silverBill;
			}
			
			if(type == CoinType.BRONZE)
			{
				bronzeBill += value * count;
				totalBronze = " - " + bronzeBill;
			}
			
		}
		else
		{
			if(type == CoinType.GOLD)
			{
				goldBill += value * count;
				totalGold = " + " + goldBill;
			}
			
			if(type == CoinType.SILVER)
			{
				silverBill += value * count;
				totalSilver = " + " + silverBill;
			}
			
			if(type == CoinType.BRONZE)
			{
				bronzeBill += value * count;
				totalBronze = " + " + bronzeBill;
			}
			
		}
		
		MerchantGui.INSTANCE.refresh();
	}

	public static void setCustomer(PlayerEntity playerEntity)
	{
		customer = playerEntity;
	}

	public static void setMerchant(MerchantEntity merchantEntity)
	{
		merchant = merchantEntity;
	}
	
	public static void setMerchantTrades(TradeOption tradeType)
	{
		tradeOption = tradeType;
	}

	public static TradeOption getMerchantTrades(MerchantType type)
	{
		switch(type)
		{
			case ALCHEMIST: setMerchantTrades(AlchemistTrades.INSTANCE); return AlchemistTrades.INSTANCE;
			case BAKER: setMerchantTrades(BakeryTrades.INSTANCE); return BakeryTrades.INSTANCE;
			case BLACKSMITH: setMerchantTrades(BlacksmithTrades.INSTANCE); return BlacksmithTrades.INSTANCE;
			case BUTCHER: setMerchantTrades(ButcheryTrades.INSTANCE); return ButcheryTrades.INSTANCE;
			case CRAFTSMAN: setMerchantTrades(CraftsmanTrades.INSTANCE); return CraftsmanTrades.INSTANCE;
			case DECOR: setMerchantTrades(DecorTrades.INSTANCE); return DecorTrades.INSTANCE;
			case FARMER: setMerchantTrades(FarmerTrades.INSTANCE); return FarmerTrades.INSTANCE;
			case FLETCHER: setMerchantTrades(FletcherTrades.INSTANCE); return FletcherTrades.INSTANCE;
			case FRUITVENDOR: setMerchantTrades(FruitStallTrades.INSTANCE); return FruitStallTrades.INSTANCE;
			case GUILDMASTER: setMerchantTrades(GuildTrades.INSTANCE); return GuildTrades.INSTANCE;
			case HORSERANCHER: setMerchantTrades(HorseRancherTrades.INSTANCE); return HorseRancherTrades.INSTANCE;
			case MINER: setMerchantTrades(MinerTrades.INSTANCE); return MinerTrades.INSTANCE;
			case PRODUCEVENDOR: setMerchantTrades(ProduceStallTrades.INSTANCE); return ProduceStallTrades.INSTANCE;
			case SHOPKEEPER: setMerchantTrades(ShopkeeperTrades.INSTANCE); return ShopkeeperTrades.INSTANCE;
			case INNKEEPER: setMerchantTrades(TavernTrades.INSTANCE); return TavernTrades.INSTANCE;
			case REDSTONE: setMerchantTrades(TrinketShopTrades.INSTANCE); return TrinketShopTrades.INSTANCE;
			default: return BlacksmithTrades.INSTANCE;
		}
	}
	
}
