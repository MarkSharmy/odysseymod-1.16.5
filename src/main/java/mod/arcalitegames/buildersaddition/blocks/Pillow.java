package mod.arcalitegames.buildersaddition.blocks;

import mod.arcalitegames.buildersaddition.blocks.base.BaseBlock;
import mod.arcalitegames.buildersaddition.blocks.base.ISeat;
import mod.arcalitegames.buildersaddition.entity.SeatEntity;
import mod.arcalitegames.buildersaddition.event.opts.BlockOptions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Pillow extends BaseBlock implements ISeat {

	private static VoxelShape SHAPE_PILLOW = Block.makeCuboidShape(3d, 0d, 3d, 13d, 2d, 13d);
	
	public Pillow(String name) {
		super(name, Properties.from(Blocks.WHITE_WOOL), new BlockOptions());
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return VoxelShapes.or(SHAPE_PILLOW);
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		return SeatEntity.createSeat(worldIn, pos, player, .02, SoundEvents.BLOCK_WOOL_HIT);
	}
}
