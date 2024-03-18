package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.NasyaAbad;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NasyaAbadSkin extends MobRenderer<NasyaAbad, CitizenModel<NasyaAbad>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bashkarcity/nasya_abad.png");
	
	public NasyaAbadSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(NasyaAbad entity)
	{
		return TEXTURE;
	}
	
	
}
