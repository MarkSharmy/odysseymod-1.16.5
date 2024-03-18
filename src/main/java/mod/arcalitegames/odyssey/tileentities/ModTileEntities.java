package mod.arcalitegames.odyssey.tileentities;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.blocks.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities
{
	public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES = 
			DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, OdysseyMod.MODID );
	
	
	public static RegistryObject<TileEntityType<CurrencyExchangerTile>> CURRENCY_EXCHANGER_TILE = TILE_ENTITIES.register("currency_exchanger_tile", () ->
		TileEntityType.Builder.create(CurrencyExchangerTile::new, ModBlocks.CURRENCY_EXCHANGER.get()).build(null));
	
	public static void register(IEventBus eventbus)
	{
		TILE_ENTITIES.register(eventbus);
	}
}
