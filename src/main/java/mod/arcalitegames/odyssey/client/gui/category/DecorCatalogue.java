package mod.arcalitegames.odyssey.client.gui.category;

import java.util.List;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.blocks.ModBlocks;
import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.DecorTrades;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class DecorCatalogue extends CategoryGui {

	public DecorCatalogue(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity)
	{
		super(merchantEntity, typeIn, playerEntity);
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		this.setLocationRelativeToCenter();
		this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
		this.renderPlantsNDyesCatalogue();
		this.renderFurnitureCatalogue();
		this.renderStairsCatalogue();
		this.renderDesignedBlocksCatalogue();
		this.renderUtilityBlocksCatalogue();
		this.renderMiscBlocksCatalogue();
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawCenteredString(matrixStack, fontRenderer, "Select items to buy", texWidth/2 + guiX, 5 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Plants & Dyes", 10 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Furniture", 98 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Stairs Blocks", 172 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Color Blocks", 13 + guiX, 158 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Utility Blocks", 93 + guiX, 158 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Misc Blocks", 175 + guiX, 158 + guiY, -15);

	}
	
	@SuppressWarnings("deprecation")
	private void renderPlantsNDyesCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.POPPY), 60 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderFurnitureCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(ModBlocks.CHAIR.get()), 100 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderStairsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.OAK_STAIRS), 140 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderDesignedBlocksCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.WHITE_GLAZED_TERRACOTTA), 60 + guiX, 102 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderUtilityBlocksCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.CRAFTING_TABLE), 100 + guiX, 102 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderMiscBlocksCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.CRYING_OBSIDIAN), 140 + guiX, 102 + guiY);
        }
        GlStateManager.popMatrix();
	}

	@Override
	protected void init()
	{
		this.setLocationRelativeToCenter();
		this.addCatalogues();
		super.init();
	}
	
	protected void addCatalogues()
	{
		List<Button> catalogues = Lists.newArrayList
		(
				new ImageButton(12 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::plantsButtonHandler),
				new ImageButton(92 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::furnitureButtonHandler),
				new ImageButton(171 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::stairsButtonHandler),
				new ImageButton(12 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::designedBlocksButtonHandler),
				new ImageButton(92 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::utilityBlocksButtonHandler),
				new ImageButton(171 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::miscBlocksButtonHandler)
		);
		
		for(Button button: catalogues)
		{
			this.addButton(button);
		}
	}
	
	public void plantsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, DecorTrades.getPlantsNDyes());
		TradeManager.start();
	}
	
	public void furnitureButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, DecorTrades.getFurnitureBlocks());
		TradeManager.start();
	}
	
	public void stairsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, DecorTrades.getStairsBlocks());
		TradeManager.start();
	}
	
	public void designedBlocksButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, DecorTrades.getDecorationBlocks());
		TradeManager.start();
	}
	
	public void utilityBlocksButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, DecorTrades.getUtilityBlocks());
		TradeManager.start();
	}
	
	public void miscBlocksButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, DecorTrades.getMicsBlocks());
		TradeManager.start();
	}

}
