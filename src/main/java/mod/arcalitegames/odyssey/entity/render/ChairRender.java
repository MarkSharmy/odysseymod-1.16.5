package mod.arcalitegames.odyssey.entity.render;

import javax.annotation.Nullable;

import com.mojang.blaze3d.matrix.MatrixStack;

import mod.arcalitegames.buildersaddition.blocks.base.ISeat.ChairSeat;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;

public class ChairRender extends EntityRenderer<ChairSeat>
{
	public ChairRender(EntityRendererManager manager)
	{
		super(manager);
	}
	
	@Nullable
	@Override
	public net.minecraft.util.ResourceLocation getEntityTexture(ChairSeat entity)
	{
		return null;
	}
	
	@Override
	public void render(ChairSeat entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}
}
