package mod.arcalitegames.odyssey.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class InnDoorBlock extends DoorBlock
{
    public InnDoorBlock(AbstractBlock.Properties properties)
    {
        super(properties);
    }

    @Mod.EventBusSubscriber
    static class onDoorBreak
    {
        @SubscribeEvent
        public static void onDoorBreakAttempt(BlockEvent.BreakEvent event)
        {
            Block block = event.getState().getBlock();

            if(block == ModBlocks.INN_DOOR.get()) event.setCanceled(true);
        }
    }

}
