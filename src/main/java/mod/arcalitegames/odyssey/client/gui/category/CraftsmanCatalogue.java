package mod.arcalitegames.odyssey.client.gui.category;

import java.util.List;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.CraftsmanTrades;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CraftsmanCatalogue extends CategoryGui
{

	public CraftsmanCatalogue(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity) {
		super(merchantEntity, typeIn, playerEntity);
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		this.setLocationRelativeToCenter();
		this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
		this.renderWoodsCatalogue();
		this.renderStoneCatalogue();
		this.renderDecorationCatalogue();
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawCenteredString(matrixStack, fontRenderer, "Select items to buy", texWidth/2 + guiX, 25 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Wooden Blocks", 10 + guiX, 115 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Stone Blocks", 93 + guiX, 115 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Decor Blocks", 172 + guiX, 115 + guiY, -15);

	}
	
	@SuppressWarnings("deprecation")
	private void renderWoodsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.OAK_LOG), 60 + guiX, 53 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderStoneCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.STONE_BRICKS), 100 + guiX, 53 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderDecorationCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.MAGENTA_WOOL), 140 + guiX, 53 + guiY);
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
				new ImageButton(12 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::woodenBlocksButtonHandler),
				new ImageButton(92 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::stoneBlocksButtonHandler),
				new ImageButton(171 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::decorationBlocksButtonHandler)
		);
		
		for(Button button: catalogues)
		{
			this.addButton(button);
		}
	}
	
	public void woodenBlocksButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, CraftsmanTrades.getWoodenBlocks());
		TradeManager.start();
	}
	
	public void stoneBlocksButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, CraftsmanTrades.getStoneBlocks());
		TradeManager.start();
	}
	
	public void decorationBlocksButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, CraftsmanTrades.getDecorationBlocks());
		TradeManager.start();
	}
	
}
