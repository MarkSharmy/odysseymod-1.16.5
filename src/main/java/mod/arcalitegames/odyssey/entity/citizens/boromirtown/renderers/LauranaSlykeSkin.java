package mod.arcalitegames.odyssey.entity.citizens.boromirtown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities.LauranaSlyke;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LauranaSlykeSkin extends MobRenderer<LauranaSlyke, CitizenModel<LauranaSlyke>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/laurana_slyke.png");
	
	public LauranaSlykeSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(LauranaSlyke entity)
	{
		return TEXTURE;
	}
	
	
}
