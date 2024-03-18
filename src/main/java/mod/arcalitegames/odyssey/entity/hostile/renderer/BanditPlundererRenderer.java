package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.BanditPlunderer;
import mod.arcalitegames.odyssey.entity.model.BanditModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BanditPlundererRenderer extends MobRenderer<BanditPlunderer, BanditModel<BanditPlunderer>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bandit/bandit_plunderer.png");
	
	public BanditPlundererRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new BanditModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BanditPlunderer entity)
	{
		return TEXTURE;
	}
	
	
}
