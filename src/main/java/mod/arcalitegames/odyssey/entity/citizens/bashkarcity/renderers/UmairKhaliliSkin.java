package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.UmairKhalili;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class UmairKhaliliSkin extends MobRenderer<UmairKhalili, CitizenModel<UmairKhalili>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bashkarcity/umair_khalili.png");
	
	public UmairKhaliliSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(UmairKhalili entity)
	{
		return TEXTURE;
	}
	
	
}
