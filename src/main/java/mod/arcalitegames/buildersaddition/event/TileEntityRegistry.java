package mod.arcalitegames.buildersaddition.event;

import java.util.ArrayList;
import java.util.function.Supplier;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.event.opts.TileEntityOptions;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.IForgeRegistry;

public class TileEntityRegistry {
	
	public static TileEntityRegistry instance;
	
	protected ArrayList<TileEntityType<? extends TileEntity>> objs;
	
	public TileEntityRegistry() {
		objs = new ArrayList<TileEntityType<? extends TileEntity>>();
		instance = this;
	}
	
	public <T extends TileEntity> TileEntityType<T> register(Supplier<T> obj, TileEntityOptions opts) {
		TileEntityType<T> type = new TileEntityType<T>(obj, opts.isUsedByBlocks, null);
		type.setRegistryName(OdysseyMod.MODID+":"+opts.regName);
		if(opts.isEnabled) {
			objs.add(type);
		}
		return type;
	}
	
	public void initAll(IForgeRegistry<TileEntityType<?>> reg) {
		for(TileEntityType<? extends TileEntity> supp : objs) {
			init(reg, supp);
		}
	}

	protected void init(IForgeRegistry<TileEntityType<?>> reg, TileEntityType<?> type) {
		reg.register(type);
	}
}
