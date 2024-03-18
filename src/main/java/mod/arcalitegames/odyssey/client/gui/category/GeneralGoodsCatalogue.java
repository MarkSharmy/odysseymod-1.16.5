package mod.arcalitegames.odyssey.client.gui.category;

import java.util.List;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.ShopkeeperTrades;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class GeneralGoodsCatalogue extends CategoryGui {

	public GeneralGoodsCatalogue(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity)
	{
		super(merchantEntity, typeIn, playerEntity);
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		this.setLocationRelativeToCenter();
		this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
		this.renderWeaponsCatalogue();
		this.renderArmorCatalogue();
		this.renderToolsCatalogue();
		this.renderMiscCatalogue();
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawCenteredString(matrixStack, fontRenderer, "Select items to buy", texWidth/2 + guiX, 5 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Weapons", 52 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Armor", 160 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Tools", 60 + guiX, 158 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Miscellaneous", 140 + guiX, 158 + guiY, -15);

	}
	
	@SuppressWarnings("deprecation")
	private void renderWeaponsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.BOW), 76 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderArmorCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (76 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.LEATHER_CHESTPLATE), 118 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderToolsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.CAMPFIRE), 76 + guiX, 102 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderMiscCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (76 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.COMPASS), 118 + guiX, 102 + guiY);
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
				new ImageButton(42 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::weaponsButtonHandler),
				new ImageButton(141 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::armorButtonHandler),
				new ImageButton(42 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::toolsButtonHandler),
				new ImageButton(141 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::miscButtonHandler)
		);
		
		for(Button button: catalogues)
		{
			this.addButton(button);
		}
	}
	
	public void weaponsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, ShopkeeperTrades.getWeaponsItems());
		TradeManager.start();
	}
	
	public void armorButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, ShopkeeperTrades.getArmorItems());
		TradeManager.start();
	}
	
	public void toolsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, ShopkeeperTrades.getToolItems());
		TradeManager.start();
	}
	
	public void miscButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, ShopkeeperTrades.getMiscItems());
		TradeManager.start();
	}

}
