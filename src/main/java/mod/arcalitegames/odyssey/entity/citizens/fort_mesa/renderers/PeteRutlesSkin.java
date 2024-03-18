package mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.PeteRutles;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PeteRutlesSkin extends MobRenderer<PeteRutles, CitizenModel<PeteRutles>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/fort_mesa/pete_rutles.png");
	
	public PeteRutlesSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(PeteRutles entity)
	{
		return TEXTURE;
	}
	
	
}
