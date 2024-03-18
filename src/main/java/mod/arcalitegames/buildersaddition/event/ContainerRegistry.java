package mod.arcalitegames.buildersaddition.event;

import mod.arcalitegames.buildersaddition.Index;
import mod.arcalitegames.buildersaddition.event.opts.ContainerOptions;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.registries.IForgeRegistry;

public class ContainerRegistry extends GenericRegistry<ContainerType<?>, ContainerOptions>{
	
	public static ContainerRegistry instance;
	
	public ContainerRegistry() {
		super();
		instance = this;
	}

	protected void init(IForgeRegistry<ContainerType<?>> reg, ContainerType<?> obj) {
		reg.register(obj);
	}
}
