package mod.arcalitegames.odyssey.entity.citizens.boromirtown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities.LeanneEdgare;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LeanneEdgareSkin extends MobRenderer<LeanneEdgare, CitizenModel<LeanneEdgare>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/leanne_edgare.png");
	
	public LeanneEdgareSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(LeanneEdgare entity)
	{
		return TEXTURE;
	}
	
	
}
