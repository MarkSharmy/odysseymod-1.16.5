package mod.arcalitegames.buildersaddition.proxy;

import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.client.render.entity.SeatRenderFactory;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void init(final FMLCommonSetupEvent evt) {
		RenderingRegistry.registerEntityRenderingHandler(Index.SEAT_ENTITY_TYPE, new SeatRenderFactory());
		
		RenderType transl = RenderType.getTranslucent();
		RenderType cutout = RenderType.getCutoutMipped();       
		
        RenderTypeLookup.setRenderLayer(Index.HEDGE_OAK, cutout);
        RenderTypeLookup.setRenderLayer(Index.HEDGE_BIRCH, cutout);
        RenderTypeLookup.setRenderLayer(Index.HEDGE_SPRUCE, cutout);
        RenderTypeLookup.setRenderLayer(Index.HEDGE_DARK_OAK, cutout);
        RenderTypeLookup.setRenderLayer(Index.HEDGE_JUNGLE, cutout);
        RenderTypeLookup.setRenderLayer(Index.HEDGE_ACACIA, cutout);
        
        RenderTypeLookup.setRenderLayer(Index.CROSSRAIL, cutout);
        
        RenderTypeLookup.setRenderLayer(Index.VERTICAL_REPEATER, cutout);
        RenderTypeLookup.setRenderLayer(Index.VERTICAL_COMPARATOR, cutout);
	}
}
