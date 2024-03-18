package mod.arcalitegames.odyssey.entity.render;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.CounterEntity;
import mod.arcalitegames.odyssey.entity.model.CounterModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CounterRenderer extends MobRenderer<CounterEntity, CounterModel<CounterEntity>>
{

	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/counter.png");
	
	public CounterRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new CounterModel<>(), 0.0f);
	}

	@Override
	public ResourceLocation getEntityTexture(CounterEntity entity)
	{
		return TEXTURE;
	}
	
	

}
