package mod.arcalitegames.system.registry;

import mod.arcalitegames.odyssey.blocks.ModBlocks;
import mod.arcalitegames.odyssey.containers.ModContainers;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.items.ModItems;
import mod.arcalitegames.odyssey.tileentities.ModTileEntities;
import mod.arcalitegames.odyssey.world.structure.town.TownStructures;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModRegistry
{
    public static void registerAll(IEventBus eventBus)
    {
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModTileEntities.register(eventBus);
        ModContainers.register(eventBus);
        Entities.register(eventBus);
        TownStructures.register(eventBus);
    }
}
