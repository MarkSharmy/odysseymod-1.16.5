package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.BanditOutlaw;
import mod.arcalitegames.odyssey.entity.model.BanditModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BanditOutlawRenderer extends MobRenderer<BanditOutlaw, BanditModel<BanditOutlaw>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bandit/bandit_outlaw.png");
	
	public BanditOutlawRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new BanditModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BanditOutlaw entity)
	{
		return TEXTURE;
	}
	
	
}
