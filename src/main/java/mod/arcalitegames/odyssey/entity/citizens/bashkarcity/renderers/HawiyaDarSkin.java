package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.HawiyaDar;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HawiyaDarSkin extends MobRenderer<HawiyaDar, CitizenModel<HawiyaDar>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bashkarcity/hawiya_dar.png");
	
	public HawiyaDarSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(HawiyaDar entity)
	{
		return TEXTURE;
	}
	
	
}
