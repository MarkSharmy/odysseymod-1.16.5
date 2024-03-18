package mod.arcalitegames.odyssey.entity.citizens.boromirtown.guards;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.PatrollingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BoromirPatrollingGuardSkin extends MobRenderer<BoromirPatrollingGuard, PatrollingGuardModel<BoromirPatrollingGuard>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/patrolling_guard.png");
	
	public BoromirPatrollingGuardSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new PatrollingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BoromirPatrollingGuard entity)
	{
		return TEXTURE;
	}
	
	
}