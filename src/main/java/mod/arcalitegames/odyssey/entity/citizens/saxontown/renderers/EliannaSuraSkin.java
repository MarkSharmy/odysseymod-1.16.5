package mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.*;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EliannaSuraSkin extends MobRenderer<EliannaSura, CitizenModel<EliannaSura>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/saxon_town/female/elianna_sura.png");
	
	public EliannaSuraSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(EliannaSura entity)
	{
		return TEXTURE;
	}
	
	
}
