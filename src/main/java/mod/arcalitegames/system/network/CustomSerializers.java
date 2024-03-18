package mod.arcalitegames.system.network;

import mod.arcalitegames.odyssey.entity.animations.Animations;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.IDataSerializer;

public class CustomSerializers
{
	public static final IDataSerializer<Animations> ANIMATION = new IDataSerializer<Animations>() {
		public void write(PacketBuffer buf, Animations value)
		{
			buf.writeEnumValue(value);
		}
		
		public Animations read(PacketBuffer buf)
		{
			return buf.readEnumValue(Animations.class);
		}
		
		public Animations copyValue(Animations value)
		{
			return value;
		}
	};
	
	public static void registerSerializers()
	{
		DataSerializers.registerSerializer(ANIMATION);
	}
}
