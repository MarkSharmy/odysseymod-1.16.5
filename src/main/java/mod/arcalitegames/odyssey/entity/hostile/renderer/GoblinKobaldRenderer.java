package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.GoblinKobald;
import mod.arcalitegames.odyssey.entity.model.goblin.GoblinKobaldModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoblinKobaldRenderer extends MobRenderer<GoblinKobald, GoblinKobaldModel<GoblinKobald>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/monster/goblin/goblin_kobald.png");
	
	public GoblinKobaldRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new GoblinKobaldModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(GoblinKobald entity)
	{
		return TEXTURE;
	}
	
}
