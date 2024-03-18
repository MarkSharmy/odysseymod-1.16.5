package mod.arcalitegames.buildersaddition.client.render.entity;

import mod.arcalitegames.buildersaddition.entity.SeatEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class SeatRenderFactory implements IRenderFactory<SeatEntity>{

	@Override
	public EntityRenderer<? super SeatEntity> createRenderFor(EntityRendererManager manager) {
		return new SeatRender(manager);
	}
}
