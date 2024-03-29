package mod.arcalitegames.buildersaddition.tileentity;

import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.blocks.Cabinet;
import mod.arcalitegames.buildersaddition.tileentity.base.BaseChestTileEntity;
import mod.arcalitegames.buildersaddition.util.IComparetorOverride;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class CabinetTileEntity extends BaseChestTileEntity implements IComparetorOverride {

	public CabinetTileEntity() {
		super(Index.CABINET_TILE_ENTITY_TYPE);
	}
	
	@Override
	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container.odysseymod.cabinet");
	}
	
	@Override
	public int getSizeInventory() {
		return 18;
	}
	
	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return new ChestContainer(ContainerType.GENERIC_9X2, id, player, this, 2);//ChestContainer.createGeneric9X3(id, player, this);
	}
	
	@Override
	protected void playSound(BlockState state, SoundEvent evt) {
		Vector3i vector3i = state.get(Cabinet.FACING).getDirectionVec();
		double d0 = (double) this.pos.getX() + 0.5D + (double) vector3i.getX() / 2.0D;
		double d1 = (double) this.pos.getY() + 0.5D + (double) vector3i.getY() / 2.0D;
		double d2 = (double) this.pos.getZ() + 0.5D + (double) vector3i.getZ() / 2.0D;
		this.world.playSound((PlayerEntity) null, d0, d1, d2, evt, SoundCategory.BLOCKS, 0.5F,
				this.world.rand.nextFloat() * 0.1F + 0.9F);
	}
	
	@Override
	public int getComparetorOverride() {
		return Container.calcRedstone(this);
	}
}
