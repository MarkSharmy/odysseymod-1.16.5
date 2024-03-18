package mod.arcalitegames.buildersaddition.state;

import net.minecraft.util.IStringSerializable;

public enum PillarState implements IStringSerializable {
	NONE("none"),
	BOTTOM("bottom"),
	TOP("top"),
	BOTH("both");

	private String name;
	
	private PillarState(String name) {
		this.name = name;
	}
	
	/*@Override
	public String getName() {
		return this.name;
	}*/

	@Override
	public String getString() {
		return this.name;
	}
}
