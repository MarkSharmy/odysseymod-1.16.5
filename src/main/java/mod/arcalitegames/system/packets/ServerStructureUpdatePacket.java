package mod.arcalitegames.system.packets;

import java.util.function.Supplier;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

public class ServerStructureUpdatePacket {
	
	
	
	
	public static void encode(ServerStructureUpdatePacket packet, PacketBuffer buffer)
	{
		//TODO
	}
	
	public static ServerStructureUpdatePacket decode(PacketBuffer buffer)
	{
		return new ServerStructureUpdatePacket();
	}
	
	public static void handle(ServerStructureUpdatePacket packet, Supplier<NetworkEvent.Context> supplier)
	{
		NetworkEvent.Context context = supplier.get();
		
		context.enqueueWork(() ->{
			
		});
		
		context.setPacketHandled(true);
	}
	
}
