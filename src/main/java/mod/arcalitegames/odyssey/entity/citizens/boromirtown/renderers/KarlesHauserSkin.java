package mod.arcalitegames.odyssey.entity.citizens.boromirtown.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities.KarlesHauser;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class KarlesHauserSkin extends MobRenderer<KarlesHauser, CitizenModel<KarlesHauser>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/karles_hauser.png");
	
	public KarlesHauserSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CitizenModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(KarlesHauser entity)
	{
		return TEXTURE;
	}
	
	
}
