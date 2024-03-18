package mod.arcalitegames.buildersaddition.tileentity.base;

import mod.arcalitegames.OdysseyMod;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public abstract class BaseInstrument extends TileEntity {
	public BaseInstrument(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}

	public abstract void playNote(int note);
	
	@Override
	public void remove() {
		if(OdysseyMod.midi != null)
			if(OdysseyMod.midi.midiEvent == this)
				OdysseyMod.midi.midiEvent = null;
		super.remove();
	}
	
	@Override
	public void onChunkUnloaded() {
		super.onChunkUnloaded();
		if(OdysseyMod.midi != null)
			if(OdysseyMod.midi.midiEvent == this)
				OdysseyMod.midi.midiEvent = null;
	}
}
