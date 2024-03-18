package mod.arcalitegames.odyssey.client.gui.category;

import java.util.List;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.GuildTrades;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class GuildMasterCatalogue extends CategoryGui
{

	public GuildMasterCatalogue(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity)
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
		this.renderRareItemsCatalogue();
		this.renderGuildBannersCatalogue();
		this.renderArmorCatalogue();
		this.renderSpecialEggsCatalogue();
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
	{
		drawCenteredString(matrixStack, fontRenderer, "Select items to buy", texWidth/2 + guiX, 5 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Weapons", 22 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Special Tools", 93 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Rare Items", 177 + guiX, 82 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Guild Banners", 10 + guiX, 158 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Special Armor", 90 + guiX, 158 + guiY, -15);
		drawString(matrixStack, fontRenderer, "Special Eggs", 173 + guiX, 158 + guiY, -15);

	}
	
	@SuppressWarnings("deprecation")
	private void renderWeaponsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(ItemParser.getItemFromName("iceandfire:dragonbone_sword")), 60 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderToolsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.ELYTRA), 100 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderRareItemsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (22 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.ENDER_EYE), 140 + guiX, 26 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderGuildBannersCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.CREEPER_BANNER_PATTERN), 60 + guiX, 102 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderArmorCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(ItemParser.getItemFromName("iceandfire:dragonarmor_dragonsteel_fire_head")), 100 + guiX, 102 + guiY);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("deprecation")
	private void renderSpecialEggsCatalogue()
	{
		GlStateManager.pushMatrix();
        {
            GlStateManager.translated(-1 * (92 + guiX), -1 * (92 + guiY), 0);
            GlStateManager.scaled(2, 2, 2);
            minecraft.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(Items.DRAGON_EGG), 140 + guiX, 102 + guiY);
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
				new ImageButton(12 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::weaponsButtonHandler),
				new ImageButton(92 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::toolsButtonHandler),
				new ImageButton(171 + guiX, 15 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::rareItemsButtonHandler),
				new ImageButton(12 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::bannersButtonHandler),
				new ImageButton(92 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::armorButtonHandler),
				new ImageButton(171 + guiX, 92 + guiY, 65, 65, 131, 0, 0, BUTTON_TEXTURE, this::eggsButtonHandler)
		);
		
		for(Button button: catalogues)
		{
			this.addButton(button);
		}
	}
	
	public void weaponsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, GuildTrades.getSpecialWeapons());
		TradeManager.start();
	}
	
	public void toolsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, GuildTrades.getSpecialTools());
		TradeManager.start();
	}
	
	public void rareItemsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, GuildTrades.getRareItems());
		TradeManager.start();
	}
	
	public void bannersButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, GuildTrades.getGuildBanners());
		TradeManager.start();
	}
	
	public void armorButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, GuildTrades.getDragonArmor());
		TradeManager.start();
	}
	
	public void eggsButtonHandler(Button button)
	{
		MerchantGui.createInstance(merchant, type, player, GuildTrades.getSpecialEggs());
		TradeManager.start();
	}

}
