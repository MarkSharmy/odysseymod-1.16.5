package mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.DinkDunker;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DinkDunkerSkin extends MobRenderer<DinkDunker, CitizenModel<DinkDunker>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/fort_mesa/dink_dunker.png");
	
	public DinkDunkerSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(DinkDunker entity)
	{
		return TEXTURE;
	}
	
	
}
