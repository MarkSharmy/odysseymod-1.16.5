package mod.arcalitegames.odyssey.entity.citizens.fort_mesa.sheriffs;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.StandingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SheriffSkin extends MobRenderer<SheriffGuard, StandingGuardModel<SheriffGuard>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/fort_mesa/sheriff_guard.png");
	
	public SheriffSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new StandingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(SheriffGuard entity)
	{
		return TEXTURE;
	}
	
	
}