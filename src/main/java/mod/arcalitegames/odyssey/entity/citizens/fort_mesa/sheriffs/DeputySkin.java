package mod.arcalitegames.odyssey.entity.citizens.fort_mesa.sheriffs;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.PatrollingGuardModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DeputySkin extends MobRenderer<DeputySheriff, PatrollingGuardModel<DeputySheriff>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/fort_mesa/deputy_sheriff.png");
	
	public DeputySkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new PatrollingGuardModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(DeputySheriff entity)
	{
		return TEXTURE;
	}
	
	
}