package mod.arcalitegames.odyssey.entity.citizens.boromirtown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities.NiciaAndretto;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NiciaAndrettoSkin extends MobRenderer<NiciaAndretto, CitizenModel<NiciaAndretto>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/nicia_andretto.png");
	
	public NiciaAndrettoSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(NiciaAndretto entity)
	{
		return TEXTURE;
	}
	
	
}
