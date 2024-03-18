package mod.arcalitegames.odyssey.client.gui.widgets;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.util.ResourceLocation;

public class ItemButton extends ImageButton
{
	private int u = 178;
	private int v = 0;
    private int xPosition;
    private int yPosition;
	private final ResourceLocation TEXTURE;

	public ItemButton(int xIn, int yIn, int widthIn, int heightIn, int xTexStartIn, int yTexStartIn, int yDiffTextIn,
			ResourceLocation resourceLocationIn, IPressable onPressIn)
	{
		super(xIn, yIn, widthIn, heightIn, xTexStartIn, yTexStartIn, yDiffTextIn, resourceLocationIn, onPressIn);
		
		this.TEXTURE = resourceLocationIn;
	}

	@Override
    public void renderWidget(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
    {
    	Minecraft minecraft = Minecraft.getInstance();
    	
    	minecraft.textureManager.bindTexture(TEXTURE);
    	if(this.isHovered())
    		v = 20;
    	
    	this.blit(matrixStack, mouseX, mouseY, u, v, width, height);
    }

    protected boolean isHovered(int mouseX, int mouseY)
    {
    	return mouseX >= xPosition && mouseX <= xPosition + width && mouseY >= yPosition && mouseY <= yPosition + height;
    }
}
