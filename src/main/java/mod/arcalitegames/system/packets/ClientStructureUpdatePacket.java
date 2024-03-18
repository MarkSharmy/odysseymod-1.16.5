package mod.arcalitegames.system.packets;

import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Supplier;

import mod.arcalitegames.odyssey.world.gen.MapGenerator;
import mod.arcalitegames.odyssey.world.structure.Structure;
import mod.arcalitegames.system.math.BlockPosition;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.network.NetworkEvent;

public class ClientStructureUpdatePacket
{
	private BlockPos spawnPoint;
	
	public ClientStructureUpdatePacket(BlockPos pos)
	{
		this.spawnPoint = pos;
	}
	
	public static void encode(ClientStructureUpdatePacket packet, PacketBuffer buffer)
	{
		buffer.writeBlockPos(packet.spawnPoint);
	}
	
	public static ClientStructureUpdatePacket decode(PacketBuffer buffer)
	{
		return new ClientStructureUpdatePacket(buffer.readBlockPos());
	}
	
	public static void handle(ClientStructureUpdatePacket packet, Supplier<NetworkEvent.Context> supplier)
	{
		NetworkEvent.Context context = supplier.get();
		
		context.enqueueWork(() ->{
			DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () ->
			{
				Set<Entry<Structure, BlockPosition>> currentMap = MapGenerator.mappings.entrySet();
				
				BlockPos location = packet.spawnPoint;
				
				for(Entry<Structure, BlockPosition> map: currentMap)
				{
					if(map.getValue().equals(location))
					{
						Structure structure = map.getKey();
						structure.generate();
						break;
					}
				}
				
			});
		});
		
		context.setPacketHandled(true);
	}
	
}
