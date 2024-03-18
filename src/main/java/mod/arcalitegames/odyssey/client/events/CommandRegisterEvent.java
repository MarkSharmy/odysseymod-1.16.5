package mod.arcalitegames.odyssey.client.events;

import mod.arcalitegames.system.commands.FindCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.server.command.ConfigCommand;

@EventBusSubscriber
public class CommandRegisterEvent
{
	@SubscribeEvent
	public static void onCommandsRegister(RegisterCommandsEvent event)
	{
		new FindCommand(event.getDispatcher());
		
		ConfigCommand.register(event.getDispatcher());
	}
}
