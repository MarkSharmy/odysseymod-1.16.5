package mod.arcalitegames.odyssey.capabilities.posts;

import java.io.Serializable;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class EntityPost implements IPost, Serializable
{
	private BlockPos position = BlockPos.ZERO;
	public static final long serialVersionUID = -2161633367912410314L;

	public void setPosition(int x, int y, int z)
	{
		BlockPos pos = new BlockPos(x, y, z);
		this.setPosition(pos);
	}
	
	public void setPosition(double x, double y, double z)
	{
		BlockPos pos = new BlockPos(x, y, z);
		this.setPosition(pos);
	}
	
	public void setPosition(Vector3d vec3d)
	{
		BlockPos pos = new BlockPos(vec3d);
		this.setPosition(pos);
	}
	
	@Override
	public void setPosition(BlockPos pos)
	{
		this.position = pos;
	}
	
	public void updatePosition(BlockPos pos)
	{
		this.position = pos;
	}
	
	@Override
	public BlockPos getPosition()
	{
		return position;
	}

}
