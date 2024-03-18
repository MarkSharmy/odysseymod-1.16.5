package mod.arcalitegames.odyssey.entity.hostile.renderer;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.hostile.GoblinHobgoblin;
import mod.arcalitegames.odyssey.entity.model.goblin.HobgoblinModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoblinHobgoblinRenderer extends MobRenderer<GoblinHobgoblin, HobgoblinModel<GoblinHobgoblin>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/monster/goblin/goblin_hobgoblin.png");
	
	public GoblinHobgoblinRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new HobgoblinModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(GoblinHobgoblin entity)
	{
		return TEXTURE;
	}
	
}
