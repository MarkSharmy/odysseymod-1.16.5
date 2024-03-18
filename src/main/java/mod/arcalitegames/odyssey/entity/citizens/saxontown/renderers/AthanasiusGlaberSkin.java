package mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.*;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AthanasiusGlaberSkin extends MobRenderer<AthanasiusGlaber, CitizenModel<AthanasiusGlaber>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/saxon_town/male/athanasius_glaber.png");
	
	public AthanasiusGlaberSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(AthanasiusGlaber entity)
	{
		return TEXTURE;
	}
	
	
}
