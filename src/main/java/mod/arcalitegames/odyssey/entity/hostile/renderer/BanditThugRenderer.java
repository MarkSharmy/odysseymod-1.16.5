package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.BanditThug;
import mod.arcalitegames.odyssey.entity.model.BanditModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BanditThugRenderer extends MobRenderer<BanditThug, BanditModel<BanditThug>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bandit/bandit_thug.png");
	
	public BanditThugRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new BanditModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BanditThug entity)
	{
		return TEXTURE;
	}
	
	
}
