package mod.arcalitegames.odyssey.entity.citizens.boromirtown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities.AurelianaHuyler;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AmberRoseworthSkin extends MobRenderer<AurelianaHuyler, CitizenModel<AurelianaHuyler>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/amber_roseworth.png");
	
	public AmberRoseworthSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(AurelianaHuyler entity)
	{
		return TEXTURE;
	}
	
	
}
