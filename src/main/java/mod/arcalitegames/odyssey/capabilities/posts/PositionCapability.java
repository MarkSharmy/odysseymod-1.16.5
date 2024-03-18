package mod.arcalitegames.odyssey.capabilities.posts;

import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class PositionCapability
{
	public static Capability<IPost> POST = null;
	
	@CapabilityInject(IPost.class)
	public static void register()
	{
		CapabilityManager.INSTANCE.register(IPost.class, new HomePosition(), EntityPost::new);
	}
	
	public static class HomePosition implements Capability.IStorage<IPost>
	{
		@Nullable
		@Override
		public INBT writeNBT(Capability<IPost> capability, IPost instance, Direction side)
		{
			CompoundNBT tag = new CompoundNBT();
			
			int x = instance.getPosition().getX();
			int y = instance.getPosition().getY();
			int z = instance.getPosition().getZ();
			
			int[] data = new int[] {x, y, z};
			
			tag.putIntArray("post", data);
			
			return tag;
		}
		
		@Override
		public void readNBT(Capability<IPost> capability, IPost instance, Direction side, INBT nbt)
		{
			int[] data = ((CompoundNBT)nbt).getIntArray("post");
			instance.setPosition(data[0], data[1], data[2]);
		}
		
	}
}
