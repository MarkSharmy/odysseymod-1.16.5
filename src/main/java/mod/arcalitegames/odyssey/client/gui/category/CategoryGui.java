package mod.arcalitegames.odyssey.client.gui.category;

import com.mojang.blaze3d.matrix.MatrixStack;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;

abstract class CategoryGui extends Screen
{
	public int guiX = 0;
	public int guiY = 20;
	public int texWidth = 248;
	public int texHeight = 256;
	
	protected MerchantEntity merchant;
	protected PlayerEntity player;
	protected MerchantType type;
	
	protected final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/category.png");
	protected final ResourceLocation BUTTON_TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/buttons.png");
	
	public CategoryGui(MerchantEntity merchantEntity, MerchantType typeIn, PlayerEntity playerEntity)
	{
		super(new StringTextComponent("Merchant"));
		this.merchant = merchantEntity;
		this.player = playerEntity;
		this.type = typeIn;
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		// Darken the screen behind the GUI.
        this.renderBackground(matrixStack);
	 
        //Relocate to center.
        this.setLocationRelativeToCenter();
        
        // Opens the texture defined in the ResourceLocation TEXTURE.
        this.minecraft.textureManager.bindTexture(TEXTURE);
        
        // Draws the texture onto the screen using the defined points.
        this.blit(matrixStack, guiX, guiY, 0, 0, texWidth, texHeight);
		
		// Always make final call to super.
        super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
	
	/*
	 * Relocates background TEXTURE and control widgets relative to the center.
	 */
	protected void setLocationRelativeToCenter()
	{
		guiX = (this.width/2) - (texWidth/2);
	}
	
	@Override
	protected void init()
	{
		//Relocate relative to center of screen.
		this.setLocationRelativeToCenter();
		
		//Always make final call to super.
		super.init();
	}

}
