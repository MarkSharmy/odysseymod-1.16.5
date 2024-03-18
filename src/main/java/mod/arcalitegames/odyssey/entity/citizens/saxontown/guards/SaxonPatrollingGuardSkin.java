package mod.arcalitegames.odyssey.entity.citizens.saxontown.guards;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.PatrollingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SaxonPatrollingGuardSkin extends MobRenderer<SaxonPatrollingGuard, PatrollingGuardModel<SaxonPatrollingGuard>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/saxon_town/guard/patrolling_guard.png");
	
	public SaxonPatrollingGuardSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new PatrollingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(SaxonPatrollingGuard entity)
	{
		return TEXTURE;
	}
	
	
}