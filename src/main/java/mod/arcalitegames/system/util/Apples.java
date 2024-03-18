package mod.arcalitegames.system.util;

public class Apples {

	private static boolean value = false;
	
	public static void green()
	{
		value = true;
	}
	
	public static void red()
	{
		value = false;
	}
	
	public static boolean getValue()
	{
		return value;
	}
}
