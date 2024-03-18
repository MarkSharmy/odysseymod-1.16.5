package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.guards;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.PatrollingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BashkarPatrollingGuardSkin extends MobRenderer<BashkarPatrollingGuard, PatrollingGuardModel<BashkarPatrollingGuard>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bashkarcity/patrolling_guard.png");
	
	public BashkarPatrollingGuardSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new PatrollingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BashkarPatrollingGuard entity)
	{
		return TEXTURE;
	}
	
	
}