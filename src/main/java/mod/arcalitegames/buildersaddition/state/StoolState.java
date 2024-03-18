package mod.arcalitegames.buildersaddition.state;

import net.minecraft.util.IStringSerializable;

public enum StoolState implements IStringSerializable {
	NONE("none"),
	WHITE("white"),
	ORANGE("orange"),
	MAGENTA("magenta"),
	LIGHT_BLUE("light_blue"),
	YELLOW("yellow"),
	LIME("lime"),
	PINK("pink"),
	GRAY("gray"),
	LIGHT_GRAY("light_gray"),
	CYAN("cyan"),
	PURPLE("purple"),
	BLUE("blue"),
	BROWN("brown"),
	GREEN("green"),
	RED("red"),
	BLACK("black");

	private String name;
	
	private static StoolState[] list = {
			WHITE,
			ORANGE,
			MAGENTA,
			LIGHT_BLUE,
			YELLOW,
			LIME,
			PINK,
			GRAY,
			LIGHT_GRAY,
			CYAN,
			PURPLE,
			BLUE,
			BROWN,
			GREEN,
			RED,
			BLACK
	};
	
	private StoolState(String name) {
		this.name = name;
	}

	@Override
	public String getString() {
		return this.name;
	}
	
	public static StoolState fromIndex(int i) {
		return list[i];
	}
}
