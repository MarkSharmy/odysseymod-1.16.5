package mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.AureliaProcillus;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AureliaProcillusSkin extends MobRenderer<AureliaProcillus, CitizenModel<AureliaProcillus>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/saxon_town/female/aurelia_procillus.png");
	
	public AureliaProcillusSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(AureliaProcillus entity)
	{
		return TEXTURE;
	}
	
	
}
