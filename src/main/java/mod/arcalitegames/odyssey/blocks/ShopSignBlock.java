package mod.arcalitegames.odyssey.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ShopSignBlock extends Block
{
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_NORTH = VoxelShapes.or(Block.makeCuboidShape(0, 0.25, 0.9375, 0.9375, 0.75, 1), Block.makeCuboidShape(0, 0.25, 0.9375, 0.9375, 0.75, 1));
    public static final VoxelShape SHAPE_SOUTH = VoxelShapes.or(Block.makeCuboidShape(0, 0.25, 0, 0.9375, 0.75, 0.0625), Block.makeCuboidShape(0, 0.25, 0, 0.9375, 0.75, 0.0625));
    public static final VoxelShape SHAPE_WEST = VoxelShapes.or(Block.makeCuboidShape(0.9375, 0.25, 0.0625, 1, 0.75, 1), Block.makeCuboidShape(0.9375, 0.25, 0.0625, 1, 0.75, 1));
    public static final VoxelShape SHAPE_EAST = VoxelShapes.or(Block.makeCuboidShape(0, 0.25, 0, 0.0625, 0.75, 0.9375), Block.makeCuboidShape(0, 0.25, 0, 0.0625, 0.75, 0.9375));
    
    
    public ShopSignBlock(AbstractBlock.Properties properties)
    {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
    	return state.with(FACING, rot.rotate(state.get(FACING)));
    }
    
    @SuppressWarnings("deprecation")
	@Override
    public BlockState mirror(BlockState state, Mirror mirrorIn)
     {
    	return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }
    
     @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
     {
    	switch(state.get(FACING))
    	{
    		case NORTH: return SHAPE_NORTH;
    		case SOUTH: return SHAPE_SOUTH;
    		case WEST: return SHAPE_WEST;
    		case EAST: return SHAPE_EAST;
    		default: return SHAPE_NORTH;
    	}
    }
    
    @Override
    protected void fillStateContainer(Builder<Block, BlockState> builder)
    {
    	builder.add(FACING);
    }
}
