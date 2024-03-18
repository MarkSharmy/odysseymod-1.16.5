package mod.arcalitegames.odyssey.client.gui.category;

import java.util.List;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.MinerTrades;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class MineshopCatalogue extends CategoryGui
{

	public MineshopCatalogue(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity)
	{
		super(merchantEntity, typeIn, playerEntity);
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		this.setLocationRelativeToCenter();
		this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
		this.renderToolsCatalogue();
		this.renderMineralsCatalogue();
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawCenteredString(matrixStack, fontRenderer, "Select items to buy", texWidth/2 + guiX, 25 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Mining Tools", 45 + guiX, 115 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Minerals", 155 + guiX, 115 + guiY, -15);

	}
	
	@SuppressWarnings("deprecation")
	private void renderToolsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.IRON_PICKAXE), 76 + guiX, 53 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderMineralsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (76 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.IRON_INGOT), 118 + guiX, 53 + guiY);
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
				new ImageButton(42 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::toolsButtonHandler),
				new ImageButton(141 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::mineralsButtonHandler)
		);
		
		for(Button button: catalogues)
		{
			this.addButton(button);
		}
	}
	
	public void toolsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, MinerTrades.getMiningTools());
		TradeManager.start();
	}
	
	public void mineralsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, MinerTrades.getMineralItems());
		TradeManager.start();
	}

}
