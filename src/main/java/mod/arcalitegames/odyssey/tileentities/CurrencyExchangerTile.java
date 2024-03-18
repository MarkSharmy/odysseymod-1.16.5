package mod.arcalitegames.odyssey.tileentities;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.items.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class CurrencyExchangerTile extends TileEntity
{
	private final ItemStackHandler itemHandler = createHandler();
	private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);
	
	public CurrencyExchangerTile(TileEntityType<?> tileEntityTypeIn)
	{
		super(tileEntityTypeIn);
	}
	
	public CurrencyExchangerTile()
	{
		this(ModTileEntities.CURRENCY_EXCHANGER_TILE.get());
	}
	
	private ItemStackHandler createHandler()
	{
		return new ItemStackHandler(2) {
			
			@Override
			protected void onContentsChanged(int slot)
			{
				markDirty();
			}
			
			@Override
			public boolean isItemValid(int slot, ItemStack stack)
			{
				switch(slot)
				{
					case 0: this.validity(stack);
					case 1: this.validity(stack);
					default:
						return false;
				}
			}
			
			@Override
			public int getSlotLimit(int slot)
			{
				return super.getSlotLimit(slot);
			}
			
			@Nullable
			@Override
			public ItemStack insertItem(int slot, ItemStack stack, boolean simulate)
			{
				if(!(this.isItemValid(slot, stack)))
				{
					return stack;
				}
				
				return super.insertItem(slot, stack, simulate);
			}
			
			private boolean validity(ItemStack stack)
			{
				return this.isGoldCoin(stack) || this.isSilverCoin(stack);
			}
			
			private boolean isSilverCoin(ItemStack stack)
			{
				return stack.getItem() == ModItems.SILVER_COIN.get();
			}
			
			private boolean isGoldCoin(ItemStack stack)
			{
				return stack.getItem() == ModItems.GOLD_COIN.get();
			}
			
		};
	}
 
	@Override
	public void read(BlockState state, CompoundNBT nbt)
	{
		itemHandler.deserializeNBT(nbt.getCompound("inv"));
		super.read(state, nbt);
	}
	
	@Override
	public CompoundNBT write(CompoundNBT compound)
	{
		compound.put("inv", itemHandler.serializeNBT());
		return super.write(compound);
	} 
	
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side)
	{
		if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return handler.cast();
		}
		
		return super.getCapability(cap, side);
	}
	
	public void convertCurrency()
	{
		boolean hasSilverCurrency = 
				(this.itemHandler.getStackInSlot(0).getItem() == ModItems.SILVER_COIN.get());
		
		boolean hasGoldCurrency = 
				(this.itemHandler.getStackInSlot(0).getItem() == ModItems.GOLD_COIN.get());
		
		if(hasSilverCurrency)
		{
			int count = itemHandler.getStackInSlot(0).getCount();
			int remainder = count % 10;
			int amount = count - remainder;
			int resultant = amount /10;
			
			this.itemHandler.getStackInSlot(0).shrink(amount);
			this.itemHandler.insertItem(1, new ItemStack(ModItems.GOLD_COIN.get(), resultant), false);
		
		}else if(hasGoldCurrency)
		{
			int count = itemHandler.getStackInSlot(0).getCount();
			int resultant = count * 10;
			
			this.itemHandler.getStackInSlot(0).shrink(count);
			this.itemHandler.insertItem(1, new ItemStack(ModItems.SILVER_COIN.get(), resultant), false);
			
		}
	}
	
}
