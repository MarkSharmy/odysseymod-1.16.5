package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.guards;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.StandingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BashkarStandingGuardSkin extends MobRenderer<BashkarStandingGuard, StandingGuardModel<BashkarStandingGuard>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bashkarcity/standing_guard.png");
	
	public BashkarStandingGuardSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new StandingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BashkarStandingGuard entity)
	{
		return TEXTURE;
	}
	
	
}