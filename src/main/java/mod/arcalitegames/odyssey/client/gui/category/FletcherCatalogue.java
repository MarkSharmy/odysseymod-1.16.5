package mod.arcalitegames.odyssey.client.gui.category;

import java.util.List;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.FletcherTrades;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class FletcherCatalogue extends CategoryGui
{

	public FletcherCatalogue(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity)
	{
		super(merchantEntity, typeIn, playerEntity);
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		this.setLocationRelativeToCenter();
		this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
		this.renderWeaponsCatalogue();
		this.renderToolsCatalogue();
		this.renderArmorCatalogue();
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawCenteredString(matrixStack, fontRenderer, "Select items to buy", texWidth/2 + guiX, 25 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Weapons", 25 + guiX, 115 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Tools", 113 + guiX, 115 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Armor", 192 + guiX, 115 + guiY, -15);

	}
	
	@SuppressWarnings("deprecation")
	private void renderWeaponsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.CROSSBOW), 60 + guiX, 53 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderToolsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.FLETCHING_TABLE), 100 + guiX, 53 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderArmorCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.TURTLE_HELMET), 140 + guiX, 53 + guiY);
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
				new ImageButton(12 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::weaponsButtonHandler),
				new ImageButton(92 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::toolsButtonHandler),
				new ImageButton(171 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::armorButtonHandler)
		);
		
		for(Button button: catalogues)
		{
			this.addButton(button);
		}
	}
	
	public void weaponsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, FletcherTrades.getWeaponsItems());
		TradeManager.start();
	}
	
	public void toolsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, FletcherTrades.getFletchingTools());
		TradeManager.start();
	}
	
	public void armorButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, FletcherTrades.getArmorItems());
		TradeManager.start();
	}
	

}
