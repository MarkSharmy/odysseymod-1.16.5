package mod.arcalitegames.odyssey.containers;

import mod.arcalitegames.OdysseyMod;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers
{
	public static DeferredRegister<ContainerType<?>> CONTAINERS
    = DeferredRegister.create(ForgeRegistries.CONTAINERS, OdysseyMod.MODID);

public static final RegistryObject<ContainerType<CurrencyExchangerContainer>> CURRENCY_EXCHANGER_CONTAINER
    = CONTAINERS.register("currency_exchanger_container",
    () -> IForgeContainerType.create(((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntityWorld();
        return new CurrencyExchangerContainer(windowId, world, pos, inv, inv.player);
    })));


public static void register(IEventBus eventBus) {
CONTAINERS.register(eventBus);
}
}
