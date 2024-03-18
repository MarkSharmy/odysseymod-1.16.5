package mod.arcalitegames.buildersaddition.tileentity;

import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.arcade.ArcadeGame;
import mod.arcalitegames.buildersaddition.arcade.ArcadeManager.GameConstructor;
import mod.arcalitegames.buildersaddition.arcade.ArcadeScreen;
import mod.arcalitegames.buildersaddition.arcade.games.ArcadeMenu;
import mod.arcalitegames.buildersaddition.arcade.games.ArcadeSnake;
import mod.arcalitegames.buildersaddition.container.ArcadeContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ArcadeTileEntity extends TileEntity implements INamedContainerProvider, ITickableTileEntity {

	public ArcadeScreen screen = null;
	public ArcadeGame game = null;
	public long time = 0;
	
	public ArcadeTileEntity() {
		super(Index.ARCADE_TILE_ENTITY_TYPE);
		screen = new ArcadeScreen();
		//game = new QSPLArcadeGame(screen, this);
	}

	@Override
	public Container createMenu(int windowId, PlayerInventory inv, PlayerEntity player) {
		return ArcadeContainer.create(windowId, inv, pos);
	}

	@Override
	public ITextComponent getDisplayName() {
		return new TranslationTextComponent("container.odysseymod.arcade");
	}

	@Override
	public void tick() {
		if(world.isRemote() && game != null)
			game.frame(time++);
	}
	
	public void setGame(GameConstructor g) {
		this.game = g.construct(screen, this);
	}
}
