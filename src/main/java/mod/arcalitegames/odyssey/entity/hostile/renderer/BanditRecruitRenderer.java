package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.BanditRecruit;
import mod.arcalitegames.odyssey.entity.model.BanditModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BanditRecruitRenderer extends MobRenderer<BanditRecruit, BanditModel<BanditRecruit>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bandit/bandit.png");
	
	public BanditRecruitRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new BanditModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BanditRecruit entity)
	{
		return TEXTURE;
	}
	
	
}
