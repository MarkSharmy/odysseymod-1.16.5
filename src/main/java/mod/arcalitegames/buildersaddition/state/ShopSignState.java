package mod.arcalitegames.buildersaddition.state;

import mod.arcalitegames.buildersaddition.blocks.Pillar;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.Direction.Axis;

public enum ShopSignState implements IStringSerializable {
	UP_X("up_x"),
	UP_Z("up_z"),
	DOWN_X("down_x"),
	DOWN_Z("down_z"),
	NORTH("north"),
	EAST("east"),
	SOUTH("south"),
	WEST("west"),
	
	NORTH_PILLAR("north_pillar"),
	EAST_PILLAR("east_pillar"),
	SOUTH_PILLAR("south_pillar"),
	WEST_PILLAR("west_pillar"),
	
	NORTH_WALL("north_wall"),
	EAST_WALL("east_wall"),
	SOUTH_WALL("south_wall"),
	WEST_WALL("west_wall"),
	
	NORTH_FENCE("north_fence"),
	EAST_FENCE("east_fence"),
	SOUTH_FENCE("south_fence"),
	WEST_FENCE("west_fence");

	private String name;
	
	private ShopSignState(String name) {
		this.name = name;
	}
	
	@Override
	public String getString() {
		return this.name;
	}
	
	public static ShopSignState getFor(Direction face, Direction facing, BlockPos pos, World world) {
		Block b = world.getBlockState(pos.offset(face.getOpposite())).getBlock();
		switch(face) {
			case NORTH:
				return getForBlock(face, b);
			case EAST:
				return getForBlock(face, b);
			case SOUTH:
				return getForBlock(face, b);
			case WEST:
				return getForBlock(face, b);
			case UP:
				return facing.getAxis() == Axis.X ? UP_X : UP_Z;
			case DOWN:
				return facing.getAxis() == Axis.X ? DOWN_X : DOWN_Z;
		}
		return NORTH;
	}
	
	private static ShopSignState getForBlock(Direction d, Block b) {
		if(b instanceof Pillar) {
			switch(d) {
				case NORTH:
					return NORTH_PILLAR;
				case EAST:
					return EAST_PILLAR;
				case SOUTH:
					return SOUTH_PILLAR;
				case WEST:
					return WEST_PILLAR;
			}
		}
		else if(b instanceof WallBlock) {
			switch(d) {
				case NORTH:
					return NORTH_WALL;
				case EAST:
					return EAST_WALL;
				case SOUTH:
					return SOUTH_WALL;
				case WEST:
					return WEST_WALL;
			}
		}
		else if(b instanceof FenceBlock) {
			switch(d) {
				case NORTH:
					return NORTH_FENCE;
				case EAST:
					return EAST_FENCE;
				case SOUTH:
					return SOUTH_FENCE;
				case WEST:
					return WEST_FENCE;
			}
		}
		switch(d) {
			case NORTH:
				return NORTH;
			case EAST:
				return EAST;
			case SOUTH:
				return SOUTH;
			case WEST:
				return WEST;
		}
		return NORTH;
	}
	
	public Axis getAxis() {
		if(this == EAST || this == WEST || this == UP_X || this == DOWN_X || this == EAST_PILLAR || this == WEST_PILLAR || this == EAST_WALL || this == WEST_WALL || this == EAST_FENCE || this == WEST_FENCE)
			return Axis.X;
		return Axis.Z;
	}
	
	public boolean isPillar() {
		return this == NORTH_PILLAR || this == EAST_PILLAR || this == SOUTH_PILLAR || this == WEST_PILLAR;
	}
	
	public boolean isWall() {
		return this == NORTH_WALL || this == EAST_WALL || this == SOUTH_WALL || this == WEST_WALL;
	}
	
	public boolean isFence() {
		return this == NORTH_FENCE || this == EAST_FENCE || this == SOUTH_FENCE || this == WEST_FENCE;
	}
	
	public boolean isNormal() {
		return !isPillar() && !isWall() && !isFence();
	}
	
	public float getOffset() {
		if(isPillar())
			return 2f;
		if(isWall())
			return 4f;
		if(isFence())
			return 6f;
		return 0f;
	}
	
	public Direction getDirection() {
		switch(this) {
			case UP_X:
				return Direction.UP;
			case UP_Z:
				return Direction.UP;
			case DOWN_X:
				return Direction.DOWN;
			case DOWN_Z:
				return Direction.DOWN;
			case NORTH:
				return Direction.NORTH;
			case EAST:
				return Direction.EAST;
			case SOUTH:
				return Direction.SOUTH;
			case WEST:
				return Direction.WEST;
				
			case NORTH_PILLAR:
				return Direction.NORTH;
			case EAST_PILLAR:
				return Direction.EAST;
			case SOUTH_PILLAR:
				return Direction.SOUTH;
			case WEST_PILLAR:
				return Direction.WEST;
				
			case NORTH_WALL:
				return Direction.NORTH;
			case EAST_WALL:
				return Direction.EAST;
			case SOUTH_WALL:
				return Direction.SOUTH;
			case WEST_WALL:
				return Direction.WEST;
				
			case NORTH_FENCE:
				return Direction.NORTH;
			case EAST_FENCE:
				return Direction.EAST;
			case SOUTH_FENCE:
				return Direction.SOUTH;
			case WEST_FENCE:
				return Direction.WEST;
		default:
			break;
		}
		return Direction.NORTH;
	}
	
	public boolean isHorizontal() {
		return this != UP_X && this != UP_Z && this != DOWN_X && this != DOWN_Z;
	}
}
