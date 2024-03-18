package mod.arcalitegames.buildersaddition.gui;

import java.util.ArrayList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.buildersaddition.container.BookshelfContainer;
import mod.arcalitegames.buildersaddition.tileentity.BookshelfTileEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class BookshelfGui extends ContainerScreen<BookshelfContainer> {

	private static final ResourceLocation GUI = new ResourceLocation(OdysseyMod.MODID,
			"textures/gui/container/bookshelf.png");
	//public BookshelfTileEntity te;
	//public BookshelfContainer screenContainer;

	private ArrayList<String> captext = new ArrayList<String>();

	public BookshelfGui(BookshelfContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
		//this.te = screenContainer.te;
		//this.screenContainer = screenContainer;

		this.xSize = 176;
		this.ySize = 148;
		
		this.playerInventoryTitleY = 55;
	}

	// Render
	public void render(MatrixStack stack, int p_230430_2_, int p_230430_3_, float ticks) {
		this.renderBackground(stack);
		super.render(stack, p_230430_2_, p_230430_3_, ticks);
		this.renderHoveredTooltip(stack, p_230430_2_, p_230430_3_);
	}
	
	//drawGuiContainerBackgroundLayer (i think)
	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack stack, float partialTicks, int x, int y) {
		RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.minecraft.getTextureManager().bindTexture(GUI);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.blit(stack, i, j, 0, 0, this.xSize, this.ySize);
	}
	
	/*@Override
	protected void func_230451_b_(MatrixStack p_230451_1_, int p_230451_2_, int p_230451_3_) {
		this.field_230712_o_.func_238422_b_(p_230451_1_, this.field_230704_d_, (float)this.field_238742_p_, (float)this.field_238743_q_, 4210752);
	      this.field_230712_o_.func_238422_b_(p_230451_1_, this.playerInventory.getDisplayName(), (float)this.field_238744_r_, (float)this.field_238745_s_, 4210752);
	}*/
}
