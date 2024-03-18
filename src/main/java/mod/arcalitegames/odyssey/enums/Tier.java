package mod.arcalitegames.odyssey.enums;

import java.io.Serializable;

import mod.arcalitegames.OdysseyMod;

public enum Tier implements Serializable
{
	IRON("iron"), QUARTZ("quartz"), DIAMOND("diamond"), EMERALD("emerald");
	
	 Tier(String registryName)
	{
		this.registryName = registryName;
	}
	
	private String registryName;
	
	@Override
	public String toString()
	{
		return "Tier:" + registryName;
	}
	
	public String getRegistryName()
	{
		return OdysseyMod.MODID +":"+registryName;
	}
}
