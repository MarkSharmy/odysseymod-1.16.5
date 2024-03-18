package mod.arcalitegames.odyssey.entity.merchants;

import net.minecraft.util.IStringSerializable;

public enum MerchantType implements IStringSerializable
{
	ALCHEMIST(0, "Alchemist"),
	BAKER(1, "Baker"),
	BLACKSMITH(2, "Blacksmith"),
	BUTCHER(3, "Butcher"),
	CRAFTSMAN(4, "Braftsman"),
	DECOR(5, "Decor Trader"),
	FARMER(6, "Farming"),
	FLETCHER(7, "Fletcher"),
	FRUITVENDOR(8, "Fruit Vender"),
	GUILDMASTER(9, "Guild Master"),
	HORSERANCHER(10, "Horse Rancher"),
	INNKEEPER(11, "Innkeeper"),
	MINER(12, "Miner"),
	MONEYCHANGER(13, "Money Changer"),
	PRODUCEVENDOR(14, "Produce Vendor"),
	REDSTONE(15, "Redstone"),
	SHOPKEEPER(16, "Shopkeeper")
	;
	
	private final int index;
	private final String name;
	
	MerchantType(int index, String name)
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
