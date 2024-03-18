package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.GoblinTrow;
import mod.arcalitegames.odyssey.entity.model.goblin.GoblinTrowModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoblinTrowRenderer extends MobRenderer<GoblinTrow, GoblinTrowModel<GoblinTrow>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/monster/goblin/goblin_trow.png");
	
	public GoblinTrowRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new GoblinTrowModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(GoblinTrow entity)
	{
		return TEXTURE;
	}
	
}
