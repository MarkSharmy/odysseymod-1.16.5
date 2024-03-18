package mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.GabrielleLavera;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GabrielleLaveraSkin extends MobRenderer<GabrielleLavera, CitizenModel<GabrielleLavera>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/fort_mesa/gabrielle_lavera.png");
	
	public GabrielleLaveraSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(GabrielleLavera entity)
	{
		return TEXTURE;
	}
	
	
}
