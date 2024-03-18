package mod.arcalitegames.odyssey.entity.render;

import mod.arcalitegames.buildersaddition.blocks.base.ISeat.ChairSeat;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ChairRenderFactory implements IRenderFactory<ChairSeat>
{

	@Override
	public EntityRenderer<? super ChairSeat> createRenderFor(EntityRendererManager manager)
	{
		return new ChairRender(manager);
	}

}
