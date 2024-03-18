package mod.arcalitegames.odyssey.entity.citizens.boromirtown.guards;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.StandingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BoromirStandingGuardSkin extends MobRenderer<BoromirStandingGuard, StandingGuardModel<BoromirStandingGuard>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/standing_guard.png");
	
	public BoromirStandingGuardSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new StandingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BoromirStandingGuard entity)
	{
		return TEXTURE;
	}
	
	
}