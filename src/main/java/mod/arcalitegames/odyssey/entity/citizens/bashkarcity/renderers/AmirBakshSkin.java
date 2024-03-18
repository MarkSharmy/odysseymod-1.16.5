package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AmirBaksh;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AmirBakshSkin extends MobRenderer<AmirBaksh, CitizenModel<AmirBaksh>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bashkarcity/amir_baksh.png");
	
	public AmirBakshSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(AmirBaksh entity)
	{
		return TEXTURE;
	}
	
	
}
