package mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.NunaSkenandore;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NunaSkenandoreSkin extends MobRenderer<NunaSkenandore, CitizenModel<NunaSkenandore>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/fort_mesa/nuna_skenandore.png");
	
	public NunaSkenandoreSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(NunaSkenandore entity)
	{
		return TEXTURE;
	}
	
	
}
