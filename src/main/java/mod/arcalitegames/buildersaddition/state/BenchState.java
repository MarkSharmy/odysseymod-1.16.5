package mod.arcalitegames.buildersaddition.state;

import net.minecraft.util.Direction.Axis;
import net.minecraft.util.IStringSerializable;

public enum BenchState implements IStringSerializable {
	NORTH("north"),
	WEST("west"),
	SOUTH("south"),
	EAST("east"),
	NONE_X("none_x"),
	NONE_Z("none_z"),
	BOTH_X("both_x"),
	BOTH_Z("both_z");

	private String name;
	
	private BenchState(String name) {
		this.name = name;
	}

	@Override
	public String getString() {
		return this.name;
	}
	
	public Axis getAxis() {
		if(this == NORTH || this == SOUTH || this == NONE_Z || this == BOTH_Z)
			return Axis.Z;
		return Axis.X;
	}
	
	public boolean hasLegNorth() {
		return this == SOUTH || this == BOTH_Z;
	}
	
	public boolean hasLegWest() {
		return this == EAST || this == BOTH_X;
	}
	
	public boolean hasLegSouth() {
		return this == NORTH || this == BOTH_Z;
	}
	
	public boolean hasLegEast() {
		return this == WEST || this == BOTH_X;
	}
}
