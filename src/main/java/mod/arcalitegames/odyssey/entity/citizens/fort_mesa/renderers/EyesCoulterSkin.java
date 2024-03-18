package mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.EyesCoulter;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EyesCoulterSkin extends MobRenderer<EyesCoulter, CitizenModel<EyesCoulter>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/fort_mesa/eyes_coulter.png");
	
	public EyesCoulterSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(EyesCoulter entity)
	{
		return TEXTURE;
	}
	
	
}
