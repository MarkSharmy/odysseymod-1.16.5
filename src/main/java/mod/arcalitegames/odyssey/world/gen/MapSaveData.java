package mod.arcalitegames.odyssey.world.gen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.arcalitegames.odyssey.world.structure.Structure;
import mod.arcalitegames.system.cache.DataCache;
import mod.arcalitegames.system.collections.StructureMap;
import mod.arcalitegames.system.math.BlockPosition;
import mod.arcalitegames.system.parser.WorldParser;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class MapSaveData
{
	private static FileInputStream input;
	private static FileOutputStream output;
	private static ObjectInputStream dataIn;
	private static ObjectOutputStream dataOut;
	private static Logger logger = LogManager.getLogger();
	private static DataCache<Structure, BlockPosition>[] cache;
	private static StructureMap<Structure, BlockPosition> map = new StructureMap<>();
	private static String pathName = "Arcalite Games"+ File.separator +"Odyssey Mod"+ File.separator +"data"+ File.separator;
	private static String extension = ".map";
	
	public static StructureMap<Structure, BlockPosition> getStructureMap()
	{
		return map;
	}
	
	public static void readMapData(World world)
	{
		String serverName = WorldParser.getWorldName(world);
		File file = new File(pathName, serverName + extension);
		
		if(!file.exists()) return;
		
		try {
			
			input = new FileInputStream(file);
			dataIn = new ObjectInputStream(input);
			
			cache = (DataCache<Structure, BlockPosition>[]) dataIn.readObject();
			
			for(DataCache<Structure, BlockPosition> cache: cache)
			{
				map.put(cache.getCache(), cache.getData());
			}
			
			logger.debug("Loading Structures from Map data.");
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally {
			
			try {
				
				dataIn.close();
				input.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void writeMapData(World world)
	{
		String serverName = WorldParser.getWorldName(world);
		File file = new File(pathName, serverName + extension);
		
		try {
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			output = new FileOutputStream(file);
			dataOut = new ObjectOutputStream(output);
			
			Set<Entry<Structure, BlockPosition>> cacheData = map.entrySet();
			List<DataCache<Structure, BlockPosition>> cacheEntries = new LinkedList<>();
			for(Map.Entry<Structure, BlockPosition> entry: cacheData) { cacheEntries.add(new DataCache<Structure, BlockPosition>(entry.getKey(), entry.getValue())); }
			
			cache = (DataCache<Structure, BlockPosition>[])cacheEntries.toArray(new DataCache[cacheEntries.size()]);
			dataOut.writeObject(cache);
			
			logger.debug("Saving Structures to Map data.");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{
			
			try {
				
				dataOut.close();
				output.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
}
