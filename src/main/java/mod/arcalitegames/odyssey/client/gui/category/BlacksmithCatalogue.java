package mod.arcalitegames.odyssey.client.gui.category;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.BlacksmithTrades;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class BlacksmithCatalogue extends CategoryGui
{
	
	public BlacksmithCatalogue(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity) {
		super(merchantEntity, typeIn, playerEntity);
	}

	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		this.setLocationRelativeToCenter();
		this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
		this.renderWeaponsCatalogue();
		this.renderArmorCatalogue();
		this.renderMiscCatalogue();
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawCenteredString(matrixStack, fontRenderer, "Select items to buy", texWidth/2 + guiX, 25 + guiY, -15);
		drawString(matrixStack, fontRenderer, "weapons", 25 + guiX, 115 + guiY, -15);
		drawString(matrixStack, fontRenderer, "armor", 110 + guiX, 115 + guiY, -15);
		drawString(matrixStack, fontRenderer, "misc", 195 + guiX, 115 + guiY, -15);

	}
	
	@SuppressWarnings("deprecation")
	private void renderWeaponsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.IRON_SWORD), 60 + guiX, 53 + guiY);
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
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.DIAMOND_CHESTPLATE), 100 + guiX, 53 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderMiscCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (42 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.SHIELD), 142 + guiX, 53 + guiY);
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
		ImageButton weapons = new ImageButton(12 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::weaponsButtonHandler);
		ImageButton armor = new ImageButton(92 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::armorButtonHandler);
		ImageButton misc = new ImageButton(171 + guiX, 45 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::miscButtonHandler);
		this.addButton(weapons);
		this.addButton(armor);
		this.addButton(misc);
	}
	
	public void weaponsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, BlacksmithTrades.getWeaponsItems());
		TradeManager.start();
	}
	
	public void armorButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, BlacksmithTrades.getArmorItems());
		TradeManager.start();
	}
	
	public void miscButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, BlacksmithTrades.getMiscellaneousItems());
		TradeManager.start();
	}
}
