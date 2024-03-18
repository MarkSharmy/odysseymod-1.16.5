package mod.arcalitegames.buildersaddition.container;

import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.container.base.BaseContainer;
import mod.arcalitegames.buildersaddition.tileentity.SpeakerTileEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

public class SpeakerContainer extends BaseContainer {
	
	public final BlockPos pos;
	
	protected SpeakerContainer(int id, BlockPos pos) {
		super(Index.SPEAKER_CONTAINER, id);
		this.pos = pos;
	}
	
	public static SpeakerContainer create(int windowId, PlayerInventory playerInventory, BlockPos pos) {
		return new SpeakerContainer(windowId, pos);
	}

	public static SpeakerContainer create(int windowId, PlayerInventory playerInventory, PacketBuffer buf) {
		return new SpeakerContainer(windowId, buf.readBlockPos());
	}
}
