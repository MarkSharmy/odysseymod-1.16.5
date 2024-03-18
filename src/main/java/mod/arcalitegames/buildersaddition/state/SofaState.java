package mod.arcalitegames.buildersaddition.state;

import net.minecraft.util.IStringSerializable;

public enum SofaState implements IStringSerializable {
	NONE("none"),
	LEFT("left"),
	RIGHT("right"),
	BOTH("both");

	private String name;
	
	private SofaState(String name) {
		this.name = name;
	}

	@Override
	public String getString() {
		return this.name;
	}
}
