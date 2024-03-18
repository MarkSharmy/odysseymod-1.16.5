package mod.arcalitegames.system.math;

import java.io.Serializable;

import mod.arcalitegames.odyssey.enums.Cardinal;
import net.minecraft.util.math.BlockPos;

public class BlockPosition implements Serializable {


	private int x;
	private int y;
	private int z;
	private Cardinal cardinal;
	
	private static final long serialVersionUID = 8543411565628863646L;

	
	public BlockPosition(Cardinal cardinal, int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.cardinal = cardinal;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getZ()
	{
		return z;
	}
	
	public Cardinal getCardinal()
	{
		return cardinal;
	}
	
	public static BlockPosition getBlockPosition(BlockPos pos)
	{
		return new BlockPosition(Cardinal.SOUTH_EAST, pos.getX(), pos.getY(), pos.getZ());
	}
	
	public BlockPos getBlockPos()
	{
		return new BlockPos(x, y, z);
	}
	
	public static BlockPos changeX(BlockPos pos, int x)
	{
		return new BlockPos(x, pos.getY(), pos.getZ());
	}
	
	public static BlockPos changeY(BlockPos pos, int y)
	{
		return new BlockPos(pos.getX(), y, pos.getZ());
	}
	
	public static BlockPos changeZ(BlockPos pos, int z)
	{
		return new BlockPos(pos.getX(), pos.getY(), z);
	}
	
	public boolean equals(BlockPos pos)
	{
		return (this.getX() == pos.getX()) && (this.getY() == pos.getY()) && (this.getZ() == pos.getZ());
	}
	
	@Override
	public boolean equals(Object obj)
	{
		BlockPosition pos = (BlockPosition) obj;
		return (this.x == pos.x) && (this.y == pos.y) && (this.z == pos.z);
	}
	
	@Override
	public String toString()
	{
		return this.getX() +" "+ this.getY() +" "+ this.getZ();
	}

}
