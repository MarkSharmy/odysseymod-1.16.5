package mod.arcalitegames.buildersaddition.state;

import net.minecraft.util.IStringSerializable;

public enum HedgeState implements IStringSerializable {
	NONE("none"),
	STRAIGHT_X("straight_x"),
	STRAIGHT_Z("straight_z"),
	CORNER_NW("corner_nw"),
	CORNER_NE("corner_ne"),
	CORNER_SE("corner_se"),
	CORNER_SW("corner_sw"),
	T_CROSS_N("tcross_n"),
	T_CROSS_E("tcross_e"),
	T_CROSS_S("tcross_s"),
	T_CROSS_W("tcross_w"),
	CROSS("cross");

	private String name;
	
	private HedgeState(String name) {
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