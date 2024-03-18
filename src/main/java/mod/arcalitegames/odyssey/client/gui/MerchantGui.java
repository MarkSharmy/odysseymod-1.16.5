package mod.arcalitegames.odyssey.client.gui;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.client.gui.widgets.ControlWidgets;
import mod.arcalitegames.odyssey.client.gui.widgets.CountControls;
import mod.arcalitegames.odyssey.client.gui.widgets.MerchantPageControls;
import mod.arcalitegames.odyssey.client.gui.widgets.PlayerPageControls;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.items.ModItems;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.merchants.PlayerTrades;
import mod.arcalitegames.odyssey.trades.products.InventoryProduct;
import mod.arcalitegames.odyssey.trades.products.ItemProduct;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.StringTextComponent;

public class MerchantGui extends AbstractMerchantGui
{
	
	public MerchantGui(MerchantEntity merchantEntity, MerchantType type, PlayerEntity playerEntity, MerchantSet<MerchantProduct> selectedSet)
	{
		super(new StringTextComponent("Merchant"));
		
		TradeManager.prepNextItem();
		TradeManager.setCustomer(playerEntity);
		TradeManager.setMerchant(merchantEntity);
		
		this.type = type;
		this.player = playerEntity;
		this.products = selectedSet;
		this.merchant = merchantEntity;
		this.merchantName = type.getString();
		this.tradeOption = TradeManager.getMerchantTrades(type);
		this.inventory = PlayerTrades.getInventoryProducts(playerEntity);
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	 {
	        // Darken the screen behind the GUI.
	        this.renderBackground(matrixStack);
		 
	        // Opens the texture defined in the ResourceLocation TEXTURE.
	        this.minecraft.textureManager.bindTexture(TEXTURE);
	        
	        //Relocate to center.
	        this.setLocationRelativeToCenter();
	        
	        // Draws the texture onto the screen using the defined points.
	        this.blit(matrixStack, guiX, guiY, 0, 0, texWidth, texHeight);
	        
	        //Displays merchant name on top of the column.
	        this.displayMerchantName(matrixStack, minecraft.fontRenderer);
	        
	        //Displays item from the selected trade.
	        this.displaySelectedItem(matrixStack, mouseX, mouseY, partialTicks); 
	        
	        //Render item images for the trade buttons.
	        this.displayTradeOptions(matrixStack);
	        
	        //Render item images for the inventory buttons.
	        this.displayInventoryOptions(matrixStack);
	        
	        //Shows the product details of the selected item.
	        this.showProductDetails(matrixStack);
	        
	        //Shows the total amount to be paid to complete transaction.
	        this.showTotalBill(matrixStack);
	        
	        //Displays relevant information about the transaction.
	        this.displayUserPrompt(matrixStack);
	        
		    // Always make final call to super.
	        super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	@Override
	protected void init()
	{
		//Relocate relative to center of screen.
		this.setLocationRelativeToCenter();
		
		//Displays buttons on the merchant column.
		this.renderMerchantButtons(guiX);
		
		//Displays buttons on the player column.
		this.renderPlayerButtons(guiX);
		
		//Displays control buttons.
		this.renderControlButtons();
		
		//Adds player page controls.
		this.renderPlayerPageControls();
		
		//Adds merchant page controls.
		this.renderMerchantPageControls();
		
		//Add count control buttons.
		this.renderCountControls();
		
		//Always make final call to super.
		super.init();
		
	}
	
	protected void displayMerchantName(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawString(matrixStack, fontRenderer, "My Inventory", 4 + guiX, 8 + guiY, -15);
		drawString(matrixStack, fontRenderer, merchantName, 178 + guiX, 8 + guiY, -15);
	}
	protected void displayUserPrompt(MatrixStack matrixStack)
	{
		drawCenteredString(matrixStack, minecraft.fontRenderer, this.prompt, texWidth/2 + guiX, 158 + guiY, -15);
	}
	 
	protected void renderControlButtons()
	{
		ControlWidgets.init();
		
		for(Button button: ControlWidgets.getWidgets())
		{
			this.addButton(button);
		}
	}
	
	protected void renderPlayerPageControls()
	{
		PlayerPageControls.init();
		
		for(Button button: PlayerPageControls.getWidgets())
		{
			this.addButton(button);
		}
	}
	
	protected void renderMerchantPageControls()
	{
		MerchantPageControls.init();
		
		for(Button button: MerchantPageControls.getWidgets())
		{
			this.addButton(button);
		}
	}
	
	protected void renderCountControls()
	{
		CountControls.init();
		
		for(Button button: CountControls.getWidgets())
		{
			this.addButton(button);
		}
	}
	
	protected void renderPlayerButtons(int x)
	{
		if(!(inventory.isEmpty()))
		{
			//Max number of buttons on a trade column.
			int multiplier = 0;
			
			//Max number of pages to display for player items.
			int max = 1;
			
			if(inventory.size() <= 6)
				multiplier = inventory.size();
			else
			{
				multiplier = 6;
				max = (inventory.size()) / multiplier;
			}
			
			/*
	         * Controls which player items to display. 
	         * Buttons are displayed 6 in a column.
	         * Incrementing playerPage displays the
	         * next column of trade options for the player.
	         */

	        if(playerPage > max) 
	        {
	        	playerPage = 0;
	        	PlayerPageControls.count = 0;
	        }

	        //Adds inventory items to the list of player buttons.
	        for(InventoryProduct product: inventory)
	        {
	            playerItems.add(product.getImageButton());
	        }
	        
	        for(int i = 0; i < multiplier; i++)
	        {
	        	try {
	        		
	        		//Aligns the x cood of the button to the player column.
		        	playerItems.get(multiplier * playerPage + i).x = 5 + x;
		            
		            //Stacks the buttons one on top of the other.
		        	playerItems.get(multiplier * playerPage + i).y = PlayerTrades.height * i + PlayerTrades.posY;
		            
		            //Adds selected button to screen GUI.
		            this.addButton(playerItems.get(multiplier * playerPage + i));
	        		
	        	}catch(ArrayIndexOutOfBoundsException e)
	        	{
	        		
	        	}
	        }
		}
	}
	
	protected void renderMerchantButtons(int x)
	{
		//Max number of buttons on a trade column.
		int multiplier = 0;
		
		//Max number of pages to display for merchant items.
		int max = 1;
		
		if(products.size() <= 6)
			multiplier = products.size();
		else
		{
			multiplier = 6;
			max = (products.size()) / multiplier;
		}

        /*
         * Controls which merchant items to display. 
         * Buttons are displayed 6 in a column.
         * Incrementing merchantPage displays the
         * next column of trade options for the merchant.
         */

        if(merchantPage > max) 
        {
        	merchantPage = 0;
        	MerchantPageControls.count = 0;
        }

        
        // Adds tradeOptions to the list of merchant buttons.
        for(MerchantProduct product: products)
        {
        	merchantItems.add(product.getImageButton());
        }

        for(int i = 0; i < multiplier; i++)
        {
        	try {
        		
        		//Aligns the x cood of the button to the merchant column.
            	merchantItems.get(multiplier * merchantPage + i).x = 178 + x;
                
                //Stacks the buttons one on top of the other.
            	merchantItems.get(multiplier * merchantPage + i).y = TradeOption.height * i + TradeOption.posY;
                
                //Adds selected button to screen GUI.
                this.addButton(merchantItems.get(multiplier * merchantPage + i));
        		
        	}catch(ArrayIndexOutOfBoundsException e)
        	{
        		
        	}
        }
        
	}
	
	/*
	 * Displays the selected item on the display widget.
	 */
	@SuppressWarnings("deprecation")
	protected void displaySelectedItem(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (32 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            if(TradeManager.displayItem != null)
            {
                minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(TradeManager.displayItem), 100 + guiX, 30 + guiY);
            }
        }
        GlStateManager.popMatrix();
	}
	
	/*
	 * Render item images for the inventory buttons.
	 */
	protected void displayInventoryOptions(MatrixStack matrickStackIn)
    {
        int posY = 31;
        int posX = 10;
        int height = 19;
        
        //Max number of buttons on a trade column.
		int multiplier = 0;
		
		if(inventory.size() <= 6)
			multiplier = inventory.size();
		else
		{
			multiplier = 6;
		}

        for(int i = 0; i < multiplier; i++)
        {
            InventoryProduct inventoryProduct = PlayerTrades.getInventoryProduct(playerItems.get(6 * playerPage + i));
            drawString(matrickStackIn, minecraft.fontRenderer, "x " + inventoryProduct.getCount(), 30 + guiX, height * i + posY + guiY, -15);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(inventoryProduct.getItemStack(), posX + guiX, height * i + 27 + guiY);
        }
    }
	
	/*
	 * Render item images for the trade buttons.
	 */
	protected void displayTradeOptions(MatrixStack matrickStackIn)
    {
        int posY = 31;
        int posX = 220;
        int height = 19;
        
      //Max number of buttons on a trade column.
      int multiplier = 0;
      		
      if(products.size() <= 6)
      	    multiplier = products.size();
      	else
      	{
      		multiplier = 6;
      	}

        for(int i = 0; i < multiplier; i++)
        {
            MerchantProduct itemProduct = tradeOption.getItemProduct(merchantItems.get(6 * merchantPage + i));
            drawString(matrickStackIn, minecraft.fontRenderer, "BUY", 195 + guiX, height * i + posY + guiY, -15);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(itemProduct.getItemStack(), posX + guiX, height * i + 27 + guiY);
        }
    }
	
	/*
	 * Displays the details of the selected product.
	 */
	public void showProductDetails(MatrixStack matrixStack)
	{
		if(TradeManager.displayItem != null)
        {
            ItemProduct product;
            drawString(matrixStack, minecraft.fontRenderer, "Count: " + TradeManager.count, 90 + guiX, 84 + guiY, -15);
            drawString(matrixStack, minecraft.fontRenderer, "Value: " + TradeManager.value, 90 + guiX, 108 + guiY, -15);

            if(TradeManager.isInventoryProduct)
                 product = PlayerTrades.getInventoryProduct(TradeManager.displayItem);
            else
                 product = tradeOption.getItemProduct(TradeManager.displayItem);

            if (product.getCoinType() == CoinType.GOLD)
                minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(ModItems.GOLD_COIN.get()), 147 + guiX, 103 + guiY);
            else if (product.getCoinType() == CoinType.SILVER)
                minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(ModItems.SILVER_COIN.get()), 147 + guiX, 103 + guiY);
            else if (product.getCoinType() == CoinType.BRONZE)
                minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(ModItems.BRONZE_COIN.get()), 147 + guiX, 103 + guiY);
        }
	}
	
	/*
	 * Shows the total amount to be paid to complete transaction.
	 */
	protected void showTotalBill(MatrixStack matrixStack)
	{
		 if(TradeManager.canAddTotal)
		 {
			 drawString(matrixStack, minecraft.fontRenderer, "Total G: " + TradeManager.totalGold, 85 + guiX, 125 + guiY, -15);
	         drawString(matrixStack, minecraft.fontRenderer, "Total S: " + TradeManager.totalSilver, 85 + guiX, 136 + guiY, -15);
	         drawString(matrixStack, minecraft.fontRenderer, "Total B: " + TradeManager.totalBronze, 85 + guiX, 147 + guiY, -15);
	         this.prompt = "Press Accept to complete trade";
		 }
	}

	
	/*
	 * Makes call to init causing GUI to refresh.
	 */
	public void refresh()
	{
		this.setLocationRelativeToCenter();
		this.init(minecraft, this.width, this.height);
	}
	
	/*
	 * Resets player inventory
	 */
	public void updateInventory()
	{
		this.inventory = PlayerTrades.getInventoryProducts(player);
		this.renderPlayerButtons(guiX);
		this.refresh();
		MerchantGui.createInstance(merchant, type, player, products);
		minecraft.displayGuiScreen(INSTANCE);
	}
	
	/*
	 * Relocates background TEXTURE and control widgets relative to the center.
	 */
	protected void setLocationRelativeToCenter()
	{
		guiX = (this.width/2) - (texWidth/2);
	}
	
	@Override
	public void closeScreen()
	{
		TradeManager.reset();
		super.closeScreen();
	}
	
	/*
	 * GUI instance.
	 */
	public static MerchantGui INSTANCE;
	
	public static void createInstance(MerchantEntity merchant, MerchantType type, PlayerEntity player, MerchantSet<MerchantProduct> selectedSet)
	{
		INSTANCE = new MerchantGui(merchant, type, player, selectedSet);
	}
}
