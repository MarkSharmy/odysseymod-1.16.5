package mod.arcalitegames.odyssey.world.gen;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Lists;

import mod.arcalitegames.odyssey.enums.Cardinal;
import mod.arcalitegames.odyssey.enums.StructureClass;
import mod.arcalitegames.odyssey.world.SuperWorld;
import mod.arcalitegames.odyssey.world.structure.Structure;
import mod.arcalitegames.odyssey.world.structure.structures.Structures;
import mod.arcalitegames.system.collections.StructureMap;
import mod.arcalitegames.system.math.BlockPosition;
import mod.arcalitegames.system.network.ModNetwork;
import mod.arcalitegames.system.packets.ClientStructureUpdatePacket;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.network.PacketDistributor;

@EventBusSubscriber
public class MapGenerator
{
	/*Number of valid block positions allowed to generate Structures.*/
	private static final Integer LIMIT = 10000;
	private static int count = 1;
	
	/*Contains potential block positions, from which new positions
	 * can be generated. The final list is passed to POSITIONS.
	 */
	private static final LinkedList<BlockPosition> locations = Lists.newLinkedList();
	
	/*Contains final block positions where Structures will generate.*/
	private static final LinkedList<BlockPos> positions = Lists.newLinkedList();
	
	/*Contains key/value data, pertaining to Structures and their block positions.*/
	public static StructureMap<Structure, BlockPosition> mappings = MapSaveData.getStructureMap();
	
	/*World instance*/
	private static World world;
	
	/*LOGGER for debugging*/
	private static Logger LOGGER = LogManager.getLogger();
	
	/*
	 * This function determines whether the player is close enough
	 * to a Structure's block position. If the player is within 100
	 * blocks, the Structure will generate.
	 */
	@SubscribeEvent
	public static void func_a4567(PlayerTickEvent event)
	{
		BlockPos spawnPoint = MapGenerator.getNearestLocation(event.player.getPosition());
		
		if(spawnPoint != null)
		{
			ModNetwork.CHANNEL.send(PacketDistributor.ALL.noArg()
					, new ClientStructureUpdatePacket(spawnPoint));
		}
	}
	
	/*
	 * This function cycles through the final block locations
	 * and uses the information to find which Structures can
	 * be compatible with the spawn points.
	 */
	@SubscribeEvent
	public static void func_a6214(ServerTickEvent event)
	{
		if((locations.peek() != null) && (count <= LIMIT) && (world != null))
		{
			count++;
			BlockPosition spawnPoint = locations.poll();
			MapGenerator.computeNewLocations(spawnPoint);
			MapGenerator.createStructureAtLocation(world, spawnPoint);
		}
	}
	
	/*
	 * This function is called when the player joins the server.
	 * If the server is new, the function uses the players position
	 * to calculate possible block locations for new Structures
	 * to generate.
	 */
	
	@SubscribeEvent
	public static void worldInit(WorldEvent.Load event)
	{
		if(event.getWorld() instanceof ServerWorld)
		{
			ServerWorld serverWorld = (ServerWorld)event.getWorld();
			SuperWorld.init(serverWorld);
			System.out.println("ServerWorld Object = " + serverWorld);
		}
	}
	
	@SubscribeEvent
	public static void worldMapUpdate(WorldEvent.Save event)
	{
		MapSaveData.writeMapData((World)event.getWorld());
	}
		
	public static void generateMapLocations(PlayerEntity player)
	{
		LOGGER.debug("Generate Map Locations has been called.................");
		BlockPos playerPos = new BlockPos(player.getPosition());
		world = player.world;
		
		LOGGER.debug("Player = " + player);
		LOGGER.debug("PlayerPos = " + playerPos);
		LOGGER.debug("World: " + world);
		
		computeNewLocations(BlockPosition.getBlockPosition(playerPos));
	}
	
	public static void generateFromMapData(World world)
	{
		MapSaveData.readMapData(world);
		MapGenerator.fillLocations();
	}
	
	public static void fillLocations()
	{
		Set<Entry<Structure, BlockPosition>> set = mappings.entrySet();
		
		for(Entry<Structure, BlockPosition> map: set)
		{
			positions.add(map.getValue().getBlockPos());
		}
	}
	
	@Nullable
	public static BlockPos getNearestLocation(BlockPos playerPos)
	{
		
		for(BlockPos spawnPoint: positions)
		{
			boolean flag = spawnPoint.withinDistance(playerPos, 100);
			
			if(flag)
				return spawnPoint;
		}
		
		return null;
	}
	
	public static void computeNewLocations(BlockPosition blockPos)
	{
		//LOGGER.debug("Generating positions.");
		List<Cardinal> cardinals = Cardinal.getPositions();
		Cardinal cood = blockPos.getCardinal().getOpposite();
		cardinals.remove(cood);
		
		for(Cardinal cardinal: cardinals)
		{
			switch(cardinal)
			{
				case SOUTH_EAST: MapGenerator.computeLocationsTowardSouthEast(blockPos.getBlockPos());
				break;
				case SOUTH_WEST: MapGenerator.computeLocationsTowardSouthWest(blockPos.getBlockPos());
				break;
				case NORTH_EAST: MapGenerator.computeLocationsTowardNorthEast(blockPos.getBlockPos());
				break;
				case NORTH_WEST: MapGenerator.computeLocationsTowardNorthWest(blockPos.getBlockPos());
				break;
			}
		}
	}
	
	private static void computeLocationsTowardSouthEast(BlockPos blockPos)
	{
		int x = blockPos.getX();
		int y = blockPos.getY();
		int z = blockPos.getZ();
		
		int[][] points = {{250, 250}, {250, 500}, {500, 500}};
		
		for(int i = 0; i < points.length; i++)
		{
			int addX = points[i][0];
			int addZ = points[i][1];
			
			locations.add(new BlockPosition(Cardinal.SOUTH_EAST, (x + addX), y, (z + addZ)));
		}
	}
	
	private static void computeLocationsTowardSouthWest(BlockPos blockPos)
	{
		int x = blockPos.getX();
		int y = blockPos.getY();
		int z = blockPos.getZ();
		
		int[][] points = {{-250, 250}, {-250, 500}, {-500, 500}};
		
		for(int i = 0; i < points.length; i++)
		{
			int addX = points[i][0];
			int addZ = points[i][1];
			
			locations.add(new BlockPosition(Cardinal.SOUTH_WEST, (x + addX), y, (z + addZ)));
		}
	}
	
	private static void computeLocationsTowardNorthEast(BlockPos blockPos)
	{
		int x = blockPos.getX();
		int y = blockPos.getY();
		int z = blockPos.getZ();
		
		int[][] points = {{250, -250}, {250, -500}, {500, -500}};
		
		for(int i = 0; i < points.length; i++)
		{
			int addX = points[i][0];
			int addZ = points[i][1];
			
			locations.add(new BlockPosition(Cardinal.NORTH_WEST, (x + addX), y, (z + addZ)));
		}
	}
	
	private static void computeLocationsTowardNorthWest(BlockPos blockPos)
	{
		int x = blockPos.getX();
		int y = blockPos.getY();
		int z = blockPos.getZ();
		
		int[][] points = {{-250, -250}, {-250, -500}, {-500, -500}};
		
		for(int i = 0; i < points.length; i++)
		{
			int addX = points[i][0];
			int addZ = points[i][1];
			
			locations.add(new BlockPosition(Cardinal.NORTH_WEST, (x + addX), y, (z + addZ)));
		}
	}

	public static boolean resetCount()
	{
		count = 1;
		
		if(count == 1)
			return true;
		else 
			return false;
	}
	
	private static boolean createStructureAtLocation(World world, BlockPosition spawnPoint)
	{
		
		Biome biome = world.getBiome(spawnPoint.getBlockPos());
		
		for(StructureClass structureClass: StructureClass.values())
		{
			if(areaWithinRange(structureClass, world, biome, spawnPoint.getBlockPos()))
			{
				List<Structure> list = Structures.getStructuresOfClass(structureClass, biome);
				int size = list.size();
				//LOGGER.debug("Number of Structures Found: " + size);
				
				if(size > 0)
				{
					positions.offer(spawnPoint.getBlockPos());
					int index = new Random().nextInt(size);
					//Structure structure = Structures.GREEK_WARRIOR_SWORD_SHIELD;
					Structure structure = list.get(index);
					
					if(mappings.containsKey(structure))
					{
						Structure clone = structure.clone();
						clone.setSpawnPoint(spawnPoint);
						clone.setPreferredHeight(62);
						mappings.put(clone, spawnPoint);
						
					}else {
						
						structure.setSpawnPoint(spawnPoint);
						structure.setPreferredHeight(62);
						mappings.put(structure, spawnPoint);
					}
					
					//LOGGER.debug("Structure: " + structure.toString() + " entered in stack.");
					//LOGGER.debug("Location: " + spawnPoint);
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean areaWithinRange(StructureClass structureClass, World world, Biome biome, BlockPos spawnPoint)
	{
		//LOGGER.debug("Checking StructureClass: " + structureClass);
		for(int i = 0; i < structureClass.getRange(); i++)
		{
			for(int k = 0; k < structureClass.getRange(); k++)
			{
				BlockPos pos = new BlockPos(spawnPoint.getX() + i, spawnPoint.getY(), spawnPoint.getZ() + k);
				
				if(!biome.equals(world.getBiome(pos)))
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
}
