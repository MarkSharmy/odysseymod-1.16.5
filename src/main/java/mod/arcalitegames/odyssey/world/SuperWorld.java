package mod.arcalitegames.odyssey.world;

import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.server.ServerWorld;

public class SuperWorld
{
	private static ServerWorld serverWorld;
	
	public static ServerWorld getServerWorld()
	{
		return serverWorld;
	}
	
	public static ClientWorld getClientWorld()
	{
		ClientWorld clientWorld = Minecraft.getInstance().world;
		return clientWorld;
	}

	public static boolean getValidationFunction()
	{
		return true;
	}
	
	public static void init(ServerWorld world)
	{
		serverWorld = world;
	}

}
