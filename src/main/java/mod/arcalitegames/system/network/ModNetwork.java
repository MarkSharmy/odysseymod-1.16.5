package mod.arcalitegames.system.network;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.system.packets.ClientStructureUpdatePacket;
import mod.arcalitegames.system.packets.ServerStructureUpdatePacket;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class ModNetwork {

	private static final String PROTOCAL_VERSION = "1";
	
	public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
			new ResourceLocation(OdysseyMod.MODID, "main"), () -> PROTOCAL_VERSION, PROTOCAL_VERSION::equals, PROTOCAL_VERSION::equals);
	
	public static void init()
	{
		CHANNEL.registerMessage(0, ClientStructureUpdatePacket.class, ClientStructureUpdatePacket::encode, ClientStructureUpdatePacket::decode, ClientStructureUpdatePacket::handle);
		CHANNEL.registerMessage(1, ServerStructureUpdatePacket.class, ServerStructureUpdatePacket::encode, ServerStructureUpdatePacket::decode, ServerStructureUpdatePacket::handle);
	}

}
