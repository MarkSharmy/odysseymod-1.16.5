package mod.arcalitegames.odyssey.items;

import mod.arcalitegames.system.ai.StructureScanner;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;

public class Pointer extends Item {

	public Pointer(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context)
	{
		BlockPos pos = context.getPos();

		StructureScanner.setSecondPosition(pos);
		PlayerEntity player = context.getPlayer();

		if(player != null)
		player.sendMessage(new StringTextComponent("Second Position set: " + pos.toString()), player.getUniqueID());

		return ActionResultType.SUCCESS;
	}
}
