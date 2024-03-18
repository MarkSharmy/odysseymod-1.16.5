package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.GoblinKnocker;
import mod.arcalitegames.odyssey.entity.model.goblin.GoblinKnockerModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoblinKnockerRenderer extends MobRenderer<GoblinKnocker, GoblinKnockerModel<GoblinKnocker>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/monster/goblin/goblin_knocker.png");
	
	public GoblinKnockerRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new GoblinKnockerModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(GoblinKnocker entity)
	{
		return TEXTURE;
	}
	
}
