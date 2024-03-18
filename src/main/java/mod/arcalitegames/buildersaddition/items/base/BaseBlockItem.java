package mod.arcalitegames.buildersaddition.items.base;

import mod.arcalitegames.buildersaddition.event.opts.ItemOptions;
import mod.arcalitegames.buildersaddition.itemgroup.ModGroup;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BaseBlockItem extends BlockItem {

	public BaseBlockItem(Block block, ItemOptions opts) {
		super(block,  new Properties().group(opts.group));//
		this.setRegistryName(block.getRegistryName());
	}
	
	public BaseBlockItem(Block block, ItemGroup group) {
		super(block,  new Properties().group(group));
		this.setRegistryName(block.getRegistryName());
	}
	
}
