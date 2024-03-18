package mod.arcalitegames.odyssey.entity.animations;

import net.minecraft.util.IStringSerializable;

public enum Animations implements IStringSerializable
{
	NONE(0, "none"),
	WALK(1, "walk"),
	YAWN(2, "yawn"),
	BARTER(3, "barter"),
	INTERACT(4, "interact"),
	WIPE(5, "wipe"),
	LEAN(6, "lean"),
	DISPENSE(7, "dispense"),
	KICK(8, "kick"),
	PANIC(9, "panic"),
	EAT(10, "eat"),
	DRINK(11, "drink"),
	RESET(12, "reset"),
	;
	
	private final int index;
	private final String name;
	
	Animations(int index, String name)
	{
		this.index = index;
		this.name = name;
	}
	
	@Override
	public String getString()
	{
		return name;
	}
	
	public int getIndex()
	{
		return index;
	}
	
}
