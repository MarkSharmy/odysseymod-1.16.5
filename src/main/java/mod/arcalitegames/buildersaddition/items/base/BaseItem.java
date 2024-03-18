package mod.arcalitegames.buildersaddition.items.base;

import java.util.List;
import mod.arcalitegames.buildersaddition.event.ItemRegistry;
import mod.arcalitegames.buildersaddition.event.opts.ItemOptions;
import mod.arcalitegames.buildersaddition.itemgroup.ModGroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class BaseItem extends Item {

	private String itemName;
	private ItemOptions opts;
	public BaseItem(String name, Properties properties, ItemOptions opts) {
		super(properties.group(opts.hidden?null:ModGroup.MAIN));
		this.itemName = name;
		this.opts = opts;
		setRegistryName(name);
		ItemRegistry.instance.register(this, opts);
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(opts.addTooltip)
			tooltip.add(new TranslationTextComponent("tooltip.electricaddition." + getItemName()));
    	super.addInformation(stack, worldIn, tooltip, flagIn);
    }
	
	public String getItemName() {
		return itemName;
	}
}
