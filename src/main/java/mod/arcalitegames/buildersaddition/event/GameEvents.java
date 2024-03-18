package mod.arcalitegames.buildersaddition.event;

import mod.arcalitegames.buildersaddition.config.Config;
import mod.arcalitegames.buildersaddition.tileentity.SpeakerTileEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class GameEvents {
	@SuppressWarnings("deprecation")
	@SubscribeEvent//(priority = EventPriority.LOWEST)
    public static void interact(PlayerInteractEvent.RightClickBlock evt) {
		
		
    }
	
	@SubscribeEvent
	public static void tickEvent(TickEvent.ServerTickEvent evt) {
		SpeakerTileEntity.latestNotes -= Config.MIDI_NOTES_PER_SECOND.get()/20;
		if(SpeakerTileEntity.latestNotes < 0)
			SpeakerTileEntity.latestNotes = 0;
	}
	
	/*@SubscribeEvent
	public static void torchEvent(PlayerInteractEvent.RightClickBlock evt) {
		BlockPos pos = evt.getPos();
		if(evt.getItemStack().getItem() == Items.TORCH) {
			if(evt.getFace() == Direction.UP) {
				BlockState state = evt.getWorld().getBlockState(evt.getPos());
				if(state.getBlock() instanceof SlabBlock) {
					if(state.get(SlabBlock.TYPE) == SlabType.BOTTOM) {
						evt.getWorld().setBlockState(evt.getPos().up(), Index.SLAB_TORCH.getDefaultState());
						evt.getWorld().playSound(null, pos.getX(), pos.getY(), pos.getZ(), Blocks.TORCH.getSoundType(evt.getWorld().getBlockState(pos)).getPlaceSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
						evt.getPlayer().swingArm(evt.getHand());
						if(!evt.getPlayer().isCreative())
							evt.getItemStack().shrink(1);
					}
				}
			}
		}
	}*/
	/*@SubscribeEvent
    public static void place( evt) {
		
	}*/
}
