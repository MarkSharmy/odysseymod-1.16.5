package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.LujaynSoliman;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LujaynSolimanSkin extends MobRenderer<LujaynSoliman, CitizenModel<LujaynSoliman>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/bashkarcity/lujayn_soliman.png");
	
	public LujaynSolimanSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(LujaynSoliman entity)
	{
		return TEXTURE;
	}
	
	
}
