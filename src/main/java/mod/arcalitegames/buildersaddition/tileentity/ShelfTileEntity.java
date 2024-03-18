package mod.arcalitegames.buildersaddition.tileentity;

import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.blocks.Bookshelf;
import mod.arcalitegames.buildersaddition.container.BookshelfContainer;
import mod.arcalitegames.buildersaddition.container.ShelfContainer;
import mod.arcalitegames.buildersaddition.inventory.ModInventory;
import mod.arcalitegames.buildersaddition.util.IComparetorOverride;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ShelfTileEntity extends LockableLootTileEntity implements INamedContainerProvider, IComparetorOverride {

	public ModInventory handler;
	
	public ShelfTileEntity() {
		super(Index.SHELF_TILE_ENTITY_TYPE);
		handler = new ModInventory(6, this::changed);
	}
	
	@Override
	public Container createMenu(int windowId, PlayerInventory inv, PlayerEntity player) {
		return ShelfContainer.create(windowId, inv, this.getPos(), this.handler);
	}
	
	@Override
	public void read(BlockState state, CompoundNBT nbt) {
		this.handler.deserializeNBT(nbt.getCompound("ItemStackHandler"));
		super.read(state, nbt);
	}
	
	@Override
	public CompoundNBT write(CompoundNBT nbt) {
		nbt.put("ItemStackHandler", this.handler.serializeNBT());
		return super.write(nbt);
	}
	
	public void changed(int slot) {
		this.markDirty();
	}

	@Override
	public int getSizeInventory() {
		return handler.getSlots();
	}

	@Override
	public boolean isEmpty() {
		for(int i = 0; i < handler.getSlots(); i++) {
			if(handler.getStackInSlot(i).getCount() > 0)
				return false;
		}
		return true;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		return handler.getStackInSlot(index);
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		return handler.extractItem(index, count, false);
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return handler.extractItem(index, handler.getStackInSlot(index).getCount(), false);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		handler.setStackInSlot(index, stack);
		this.markDirty();
	}

	@Override
	public boolean isUsableByPlayer(PlayerEntity player) {
		return !player.isSpectator();
	}

	@Override
	public void clear() {
		for(int i = 0; i < handler.getSlots(); i++) {
			handler.setStackInSlot(i, ItemStack.EMPTY);
		}
		this.markDirty();
	}

	@Override
	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container.odysseymod.shelf");
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return createMenu(id, player, player.player);
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		NonNullList<ItemStack> items = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
		for(int i = 0; i < getSizeInventory(); i++) {
			items.set(i, handler.getStackInSlot(i));
		}
		return items;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> itemsIn) {
		for(int i = 0; i < getSizeInventory(); i++) {
			handler.setStackInSlot(i, itemsIn.get(i));
		}
		this.markDirty();
	}
	
	@Override
	public SUpdateTileEntityPacket getUpdatePacket() {
		CompoundNBT update = getUpdateTag();
        int data = 0;
        return new SUpdateTileEntityPacket(this.pos, data, update);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
		CompoundNBT update = pkt.getNbtCompound();
        handleUpdateTag(this.getBlockState(), update);
	}
	
	@Override
	public CompoundNBT getUpdateTag() {
		CompoundNBT nbt = new CompoundNBT();
		write(nbt);
        return nbt;
	}
	
	@Override
	public void handleUpdateTag(BlockState state, CompoundNBT nbt) {
		read(state, nbt);
	}
	
	@Override
	public int getComparetorOverride() {
		return Container.calcRedstone(this);
	}
}
