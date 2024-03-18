package mod.arcalitegames.buildersaddition.itemgroup;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.buildersaddition.Index;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup extends ItemGroup{
	public static ModGroup MAIN;;
	
	public ModGroup(String name) {
		super(OdysseyMod.MODID+":"+name);
		MAIN = this;
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Index.CUT_QUARTZ_PILLAR);
	}
}
