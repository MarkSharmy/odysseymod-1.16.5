package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.BanditMarauder;
import mod.arcalitegames.odyssey.entity.model.BanditModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BanditMarauderRenderer extends MobRenderer<BanditMarauder, BanditModel<BanditMarauder>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bandit/bandit_marauder.png");
	
	public BanditMarauderRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new BanditModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BanditMarauder entity)
	{
		return TEXTURE;
	}
	
	
}
