package mod.arcalitegames.buildersaddition.state;

import mod.arcalitegames.buildersaddition.blocks.Pillar;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public enum MountState implements IStringSerializable {
	FULL("full"),
	PILLAR("pillar"),
	WALL("wall"),
	FENCE("fence");
	
	
	private String name;
	
	private MountState(String name) {
		this.name = name;
	}
	
	@Override
	public String getString() {
		return this.name;
	}
	
	public static MountState getFor(Direction face, BlockPos pos, World world) {
		Block b = world.getBlockState(pos.offset(face.getOpposite())).getBlock();
		if(b instanceof Pillar) {
			return PILLAR;
		}
		else if(b instanceof WallBlock) {
			return WALL;
		}
		else if(b instanceof FenceBlock) {
			return FENCE;
		}
		return FULL;
	}
}
