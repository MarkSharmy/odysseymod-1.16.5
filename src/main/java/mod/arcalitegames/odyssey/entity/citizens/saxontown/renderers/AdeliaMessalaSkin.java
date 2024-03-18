package mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.AdeliaMessala;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AdeliaMessalaSkin extends MobRenderer<AdeliaMessala, CitizenModel<AdeliaMessala>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/saxon_town/female/adelia_messala.png");
	
	public AdeliaMessalaSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(AdeliaMessala entity)
	{
		return TEXTURE;
	}
	
	
}
