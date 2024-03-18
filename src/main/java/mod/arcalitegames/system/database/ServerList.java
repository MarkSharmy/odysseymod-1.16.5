package mod.arcalitegames.system.database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;

import com.google.common.collect.Lists;

import mod.arcalitegames.system.parser.WorldParser;
import net.minecraft.world.IWorld;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ServerList
{
	private static boolean newServer = false;
	public static boolean hasTransmition = false;
	private static final String FILENAME = "level.dat";
	private static final String FORMALPATH = "saves" + File.separator;
	private static Set<String> servers = new LinkedHashSet<>();
	private static final String PATH = "Arcalite Games" + File.separator + "Odyssey Mod" + File.separator + "data" + File.separator + "servers.config";

	@SubscribeEvent
	public static void loadServers(WorldEvent.Load event)
	{
		
		try {
			
			File config = new File(PATH);
			
			if(!config.exists()) config.createNewFile();
			
			Scanner scanner = new Scanner(new File(PATH));
			
			while(scanner.hasNextLine())
			{
				servers.add(scanner.nextLine());
			}
			
			scanner.close();
			
		}catch(Exception e) { e.printStackTrace();}
	}
	
	public static boolean isNewServer(IWorld world)
	{
		if(world == null)
		{
			LogManager.getLogger().debug("Server query encountered null object.");
			return false;
		}
		
		if(newServer)
		{
			LogManager.getLogger().debug("New Server!");
			return true;
		}
		
		for(String name: servers)
		{
			if(name.equals(WorldParser.getWorldName(world))) 
			{
				LogManager.getLogger().debug("Not a new Server!");
				return false;
			}
		}
		
		LogManager.getLogger().debug("New Server!");
		ServerList.establishNewServer(world);
		newServer = true;
		return true;
	}
	
	public static void refresh(WorldEvent.Save event)
	{
		List<String> serverList = Lists.newArrayList();
		
		try {
			
			Scanner scanner = new Scanner(new File(PATH));
			
			while(scanner.hasNextLine())
			{
				serverList.add(scanner.nextLine());
			}
			
			scanner.close();
			
		} catch (FileNotFoundException e)
		{
			File file = new File(PATH);
			
			try {
				
				file.createNewFile();
				
			} catch (IOException g)
			{
				g.printStackTrace();
			}
		}
		
		if(!serverList.isEmpty())
		{
			List<String> temp = Lists.newArrayList();
			for(String FOLDERNAME: serverList)
			{
				File file = new File(FORMALPATH + File.separator + FOLDERNAME + File.separator + FILENAME);
				
				if(!file.exists())
				{
					temp.add(FOLDERNAME);
				}
			}
			
			serverList.removeAll(temp);
		}
		
		ServerList.updateServerList(serverList);
	}
	
	private static void updateServerList(List<String> list)
	{
		try {
			
			PrintWriter writer = new PrintWriter(new FileWriter(new File(PATH)));
			
			for(String server: list)
			{
				writer.println(server);
			}
			
			writer.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void sendTransmition()
	{
		hasTransmition = true;
	}

	public static void endTransmition()
	{
		hasTransmition = false;
	}

	public static void establishNewServer(IWorld world)
	{
		File config = new File(PATH);
		
		try{

			PrintWriter writer = new PrintWriter(new FileWriter(config, true));
			writer.println(WorldParser.getWorldName(world));
			writer.close();

		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
