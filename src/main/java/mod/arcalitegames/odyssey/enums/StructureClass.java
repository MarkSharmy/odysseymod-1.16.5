package mod.arcalitegames.odyssey.enums;

public enum StructureClass
{
	CLASS_6("class_6", 250), CLASS_5("class_5", 200), CLASS_4("class_4", 150), CLASS_3("class_3", 100), CLASS_2("class_2", 50), CLASS_1("class_1", 25)
	;
	
	private String className;
	private int range;
	
	StructureClass(String name, int range)
	{
		this.className = name;
		this.range = range;
	}
	
	public int getRange()
	{
		return range;
	}
	
	@Override
	public String toString()
	{
		return className;
	}
	
}
