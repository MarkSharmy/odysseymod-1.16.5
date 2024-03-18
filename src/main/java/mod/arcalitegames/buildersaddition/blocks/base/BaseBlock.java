package mod.arcalitegames.buildersaddition.blocks.base;

import mod.arcalitegames.buildersaddition.event.BlockRegistry;
import mod.arcalitegames.buildersaddition.event.opts.BlockOptions;
import net.minecraft.block.Block;

public class BaseBlock extends Block{

	public BaseBlock(String name, Properties block) {
		super(block);
		this.setRegistryName(name);
		BlockRegistry.instance.register(this, new BlockOptions());
	}
	
	public BaseBlock(String name, Properties block, BlockOptions opts) {
		super(block);
		this.setRegistryName(name);
		BlockRegistry.instance.register(this, opts);
	}
}