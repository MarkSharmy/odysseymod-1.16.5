package mod.arcalitegames.odyssey.blocks;

import mod.arcalitegames.odyssey.containers.CurrencyExchangerContainer;
import mod.arcalitegames.odyssey.tileentities.CurrencyExchangerTile;
import mod.arcalitegames.odyssey.tileentities.ModTileEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class CurrencyExchanger extends Block
{
	public CurrencyExchanger(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit)
	{
		if(!worldIn.isRemote)
		{
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			
			if(!player.isCrouching())
			{
				if(tileEntity instanceof CurrencyExchangerTile)
				{
					INamedContainerProvider containerProvider = createContainerProvider(worldIn, pos);
					NetworkHooks.openGui((ServerPlayerEntity)player, containerProvider, tileEntity.getPos());
				}else
				{
					throw new IllegalStateException("Our Container provider is missing");
				}
			}
		}
		
		return ActionResultType.SUCCESS;
	}
	
	private INamedContainerProvider createContainerProvider(World worldIn, BlockPos pos)
	{
		return new INamedContainerProvider()
				{
					@Override
					public ITextComponent getDisplayName()
					{
						return new TranslationTextComponent("screen.odysseymod.currency_exchanger");
					}
					
					@Override
					public Container createMenu(int i, PlayerInventory playerInventory,
							PlayerEntity playerEntity)
					{
						return new CurrencyExchangerContainer(i, worldIn, pos, playerInventory, playerEntity);
					}
				};
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world)
	{
		return ModTileEntities.CURRENCY_EXCHANGER_TILE.get().create();
	}
	
	@Override
	public boolean hasTileEntity(BlockState state)
	{
		return true;
	}

}
