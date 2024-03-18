package mod.arcalitegames.buildersaddition.blocks;

import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.blocks.base.BaseDerivativeBlock;
import mod.arcalitegames.buildersaddition.blocks.base.ISeat;
import mod.arcalitegames.buildersaddition.entity.SeatEntity;
import mod.arcalitegames.buildersaddition.state.StoolState;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
public class Stool extends BaseDerivativeBlock implements ISeat {
	private static VoxelShape SHAPE_PILLOW = Block.makeCuboidShape(3d, 0d, 3d, 13d, 9d, 13d);
	private static VoxelShape SHAPE_NO_PILLOW = Block.makeCuboidShape(3d, 0d, 3d, 13d, 8d, 13d);
	private static VoxelShape SHAPE_BASE = Block.makeCuboidShape(2d, 6d, 2d, 14d, 8d, 14d);
	
	public static final EnumProperty<StoolState> PILLOW = EnumProperty.<StoolState>create("pillow", StoolState.class);
	
	public Stool(String name, Block source) {
		super(name, source);
	}
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(PILLOW);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		if(state.get(PILLOW) == StoolState.NONE)
			return VoxelShapes.or(SHAPE_NO_PILLOW, SHAPE_BASE);
		return VoxelShapes.or(SHAPE_PILLOW, SHAPE_BASE);
	}
}
