package mod.arcalitegames.buildersaddition.blocks;

import mod.arcalitegames.buildersaddition.blocks.base.BaseDerivativeBlock;
import mod.arcalitegames.buildersaddition.state.ShopSignState;
import mod.arcalitegames.buildersaddition.tileentity.ShopSignTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
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

public class ShopSign extends BaseDerivativeBlock {

	public static final EnumProperty<ShopSignState> STATE = EnumProperty.<ShopSignState>create("state", ShopSignState.class);
	
	private static VoxelShape SHAPE_DOWN_X = VoxelShapes.or(Block.makeCuboidShape(1d, 0d, 7d, 15d, 14d, 9d), 
			Block.makeCuboidShape(2d, 14d, 6d, 4d, 16d, 10d), Block.makeCuboidShape(12d, 14d, 6d, 14d, 16d, 10d));
	private static VoxelShape SHAPE_DOWN_Z = VoxelShapes.or(Block.makeCuboidShape(7d, 0d, 1d, 9d, 14d, 15d), 
			Block.makeCuboidShape(6d, 14d, 2d, 10d, 16d, 4d), Block.makeCuboidShape(6d, 14d, 12d, 10d, 16d, 14d));
	
	private static VoxelShape SHAPE_UP_X = VoxelShapes.or(Block.makeCuboidShape(1d, 2d, 7d, 15d, 16d, 9d), 
			Block.makeCuboidShape(2d, 0d, 6d, 4d, 2d, 10d), Block.makeCuboidShape(12d, 0d, 6d, 14d, 2d, 10d));
	private static VoxelShape SHAPE_UP_Z = VoxelShapes.or(Block.makeCuboidShape(7d, 2d, 1d, 9d, 16d, 15d), 
			Block.makeCuboidShape(6d, 0d, 2d, 10d, 2d, 4d), Block.makeCuboidShape(6d, 0d, 12d, 10d, 2d, 14d));
	
	private static VoxelShape SHAPE_NORTH = VoxelShapes.or(Block.makeCuboidShape(7d, 1d, 0d, 9d, 15d, 14d), 
			Block.makeCuboidShape(6d, 2d, 14d, 10d, 4d, 16d), Block.makeCuboidShape(6d, 12d, 14d, 10d, 14d, 16d));
	private static VoxelShape SHAPE_EAST = VoxelShapes.or(Block.makeCuboidShape(2d, 1d, 7d, 16d, 15d, 9d), 
			Block.makeCuboidShape(0d, 2d, 6d, 2d, 4d, 10d), Block.makeCuboidShape(0d, 12d, 6d, 2d, 14d, 10d));
	private static VoxelShape SHAPE_SOUTH = VoxelShapes.or(Block.makeCuboidShape(7d, 1d, 2d, 9d, 15d, 16d), 
			Block.makeCuboidShape(6d, 2d, 0d, 10d, 4d, 2d), Block.makeCuboidShape(6d, 12d, 0d, 10d, 14d, 2d));
	private static VoxelShape SHAPE_WEST = VoxelShapes.or(Block.makeCuboidShape(0d, 1d, 7d, 14d, 15d, 9d), 
			Block.makeCuboidShape(14d, 2d, 6d, 16d, 4d, 10d), Block.makeCuboidShape(14d, 12d, 6d, 16d, 14d, 10d));
	
	private static VoxelShape SHAPE_NORTH_PILLAR = SHAPE_NORTH.withOffset(0, 0, 2f/16f);
	private static VoxelShape SHAPE_EAST_PILLAR = SHAPE_EAST.withOffset(-2f/16f, 0, 0);
	private static VoxelShape SHAPE_SOUTH_PILLAR = SHAPE_SOUTH.withOffset(0, 0, -2f/16f);
	private static VoxelShape SHAPE_WEST_PILLAR = SHAPE_WEST.withOffset(2f/16f, 0, 0);
	
	private static VoxelShape SHAPE_NORTH_FENCE = SHAPE_NORTH.withOffset(0, 0, 6f/16f);
	private static VoxelShape SHAPE_EAST_FENCE = SHAPE_EAST.withOffset(-6f/16f, 0, 0);
	private static VoxelShape SHAPE_SOUTH_FENCE = SHAPE_SOUTH.withOffset(0, 0, -6f/16f);
	private static VoxelShape SHAPE_WEST_FENCE = SHAPE_WEST.withOffset(6f/16f, 0, 0);
	
	private static VoxelShape SHAPE_NORTH_WALL = SHAPE_NORTH.withOffset(0, 0, 4f/16f);
	private static VoxelShape SHAPE_EAST_WALL = SHAPE_EAST.withOffset(-4f/16f, 0, 0);
	private static VoxelShape SHAPE_SOUTH_WALL = SHAPE_SOUTH.withOffset(0, 0, -4f/16f);
	private static VoxelShape SHAPE_WEST_WALL = SHAPE_WEST.withOffset(4f/16f, 0, 0);
	
	
	public ShopSign(String name) {
		super("shop_sign_" + name, Blocks.OAK_WOOD);
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new ShopSignTileEntity();
	}
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(STATE);
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext c) {
		return getDefaultState().with(STATE, ShopSignState.getFor(c.getFace(), c.getPlacementHorizontalFacing().rotateY(), c.getPos(), c.getWorld()));
	}
	
	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return getShape(state.get(STATE));
	}
	
	public VoxelShape getShape(ShopSignState state) {
		switch(state) {
			case UP_X:
				return SHAPE_UP_X;
			case UP_Z:
				return SHAPE_UP_Z;
			case DOWN_X:
				return SHAPE_DOWN_X;
			case DOWN_Z:
				return SHAPE_DOWN_Z;
			case NORTH:
				return SHAPE_NORTH;
			case EAST:
				return SHAPE_EAST;
			case SOUTH:
				return SHAPE_SOUTH;
			case WEST:
				return SHAPE_WEST;
				
			case NORTH_PILLAR:
				return SHAPE_NORTH_PILLAR;
			case EAST_PILLAR:
				return SHAPE_EAST_PILLAR;
			case SOUTH_PILLAR:
				return SHAPE_SOUTH_PILLAR;
			case WEST_PILLAR:
				return SHAPE_WEST_PILLAR;
				
			case NORTH_WALL:
				return SHAPE_NORTH_WALL;
			case EAST_WALL:
				return SHAPE_EAST_WALL;
			case SOUTH_WALL:
				return SHAPE_SOUTH_WALL;
			case WEST_WALL:
				return SHAPE_WEST_WALL;
				
			case NORTH_FENCE:
				return SHAPE_NORTH_FENCE;
			case EAST_FENCE:
				return SHAPE_EAST_FENCE;
			case SOUTH_FENCE:
				return SHAPE_SOUTH_FENCE;
			case WEST_FENCE:
				return SHAPE_WEST_FENCE;
		}
		return SHAPE_UP_Z;
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if(worldIn.isRemote())
			return ActionResultType.SUCCESS;
		TileEntity te = worldIn.getTileEntity(pos);
		if(te != null) {
			if(te instanceof ShopSignTileEntity) {
				ShopSignTileEntity sste = (ShopSignTileEntity) te;
				ItemStack heald = player.getHeldItem(handIn);
				//ItemStack inTE = sste.getDisplayItem();
				if(player.isCrouching()) {
					InventoryHelper.spawnItemStack(worldIn, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), sste.getDisplayItem());
					sste.setDisplayItem(ItemStack.EMPTY);
					worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_ITEM_FRAME_ADD_ITEM, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
					return ActionResultType.CONSUME;
				}
				else if(heald != ItemStack.EMPTY) {
					if(sste.hasDisplayItem()) {
						return ActionResultType.PASS;
					}
					else {
						sste.setDisplayItem(heald);
						if(!player.isCreative())
							heald.shrink(1);
						worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_ITEM_FRAME_ADD_ITEM, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
						return ActionResultType.CONSUME;
					}
				}
			}
		}
		return ActionResultType.PASS;
	}
	
}
