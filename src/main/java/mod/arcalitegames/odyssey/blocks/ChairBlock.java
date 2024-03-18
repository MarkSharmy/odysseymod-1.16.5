package mod.arcalitegames.odyssey.blocks;

import mod.arcalitegames.buildersaddition.blocks.base.ISeat;
import mod.arcalitegames.odyssey.entity.Entities;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class ChairBlock extends Block implements ISeat
{
	protected Direction direction = Direction.NORTH;
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final BooleanProperty OCCUPIED = BooleanProperty.create("occupied");
    
    public ChairBlock(AbstractBlock.Properties properties)
    {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(OCCUPIED, false);
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
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
    		Hand handIn, BlockRayTraceResult hit)
    {
    	/*
    	if(state.get(OCCUPIED))
    	{
    		return ActionResultType.FAIL;
    	}
    	else
    	{
    		
    	}
    	*/
    	
    	if(player.getDistanceSq(Vector3d.copy(pos)) < 4)
		{
			ChairSeat seat = new ChairSeat(Entities.SEAT_CHAIR.get(), worldIn);
			seat.setParameters(this, worldIn, Vector3d.copy(pos));
			worldIn.addEntity(seat);
			player.startRiding(seat);
			this.setOccupied(state, worldIn, pos, true);
			return ActionResultType.SUCCESS;
		}
		
	return ActionResultType.PASS;
    }
    
    public void setOccupied(BlockState state, World worldIn, BlockPos pos, boolean occupied)
    {
    	worldIn.setBlockState(pos, this.getDefaultState().with(FACING, state.get(FACING)).with(OCCUPIED, occupied));
    }
    
    public boolean isOccupied()
    {
    	return this.getDefaultState().get(OCCUPIED);
    }
    
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
    	switch(state.get(FACING))
    	{
    		case NORTH: return getNorthShape();
    		case EAST: return getEastShape();
    		case WEST: return getWestShape();
    		case SOUTH: return getSouthShape();
    		default: return getNorthShape();
    	}
    }


    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, OCCUPIED);
    }
    
    public VoxelShape getNorthShape(){
    	VoxelShape shape = VoxelShapes.empty();
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0.4375, 0.125, 0.875, 0.5625, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 1.125, 0.8125, 0.875, 1.25, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.25, 0.8125, 0.875, 0.75, 1, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0, 0.1875, 0.25, 0.4375, 0.3125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0, 0.8125, 0.25, 0.4375, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.75, 0, 0.8125, 0.875, 0.4375, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.75, 0, 0.1875, 0.875, 0.4375, 0.3125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.75, 0.5625, 0.8125, 0.875, 1.125, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0.5625, 0.8125, 0.25, 1.125, 0.9375), IBooleanFunction.OR);

    	return shape;
    }
    
    public VoxelShape getEastShape(){
    	VoxelShape shape = VoxelShapes.empty();
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0, 0.4375, 0.1875, 0.8125, 0.5625, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0, 1.125, 0.1875, 0.125, 1.25, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0, 0.8125, 0.3125, 0.0625, 1, 0.8125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.625, 0, 0.1875, 0.75, 0.4375, 0.3125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0, 0, 0.1875, 0.125, 0.4375, 0.3125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0, 0, 0.8125, 0.125, 0.4375, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.625, 0, 0.8125, 0.75, 0.4375, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0, 0.5625, 0.8125, 0.125, 1.125, 0.9375), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0, 0.5625, 0.1875, 0.125, 1.125, 0.3125), IBooleanFunction.OR);

    	return shape;
    }
    
    public VoxelShape getWestShape(){
    	VoxelShape shape = VoxelShapes.empty();
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0.4375, 0.125, 0.9375, 0.5625, 0.875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.8125, 1.125, 0.125, 0.9375, 1.25, 0.875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.875, 0.8125, 0.25, 0.9375, 1, 0.75), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.1875, 0, 0.75, 0.3125, 0.4375, 0.875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.8125, 0, 0.75, 0.9375, 0.4375, 0.875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.8125, 0, 0.125, 0.9375, 0.4375, 0.25), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.1875, 0, 0.125, 0.3125, 0.4375, 0.25), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.8125, 0.5625, 0.125, 0.9375, 1.125, 0.25), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.8125, 0.5625, 0.75, 0.9375, 1.125, 0.875), IBooleanFunction.OR);

    	return shape;
    }
    
    public VoxelShape getSouthShape(){
    	VoxelShape shape = VoxelShapes.empty();
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0.4375, 0.0625, 0.875, 0.5625, 0.875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 1.125, 0.0625, 0.875, 1.25, 0.1875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.25, 0.8125, 0.0625, 0.75, 1, 0.125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.75, 0, 0.6875, 0.875, 0.4375, 0.8125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.75, 0, 0.0625, 0.875, 0.4375, 0.1875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0, 0.0625, 0.25, 0.4375, 0.1875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0, 0.6875, 0.25, 0.4375, 0.8125), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.125, 0.5625, 0.0625, 0.25, 1.125, 0.1875), IBooleanFunction.OR);
    	shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.create(0.75, 0.5625, 0.0625, 0.875, 1.125, 0.1875), IBooleanFunction.OR);

    	return shape;
    }
}
