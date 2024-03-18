package mod.arcalitegames.odyssey.entity.citizens.saxontown.guards;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.StandingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SaxonStandingGuardSkin extends MobRenderer<SaxonStandingGuard, StandingGuardModel<SaxonStandingGuard>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/saxon_town/guard/standing_guard.png");
	
	public SaxonStandingGuardSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new StandingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(SaxonStandingGuard entity)
	{
		return TEXTURE;
	}
	
	
}