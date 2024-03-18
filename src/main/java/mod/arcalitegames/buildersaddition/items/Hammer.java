package mod.arcalitegames.buildersaddition.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.tags.ITag;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class Hammer extends  PickaxeItem {

	public Hammer(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
		// TODO Auto-generated constructor stub
	}
	
	public BlockState crackedState(BlockState cur) {
		if(cur.isIn((ITag<Block>) Blocks.STONE_BRICKS))
			return Blocks.CRACKED_STONE_BRICKS.getDefaultState();
		else if(cur.isIn((ITag<Block>) Blocks.NETHER_BRICKS))
			return Blocks.CRACKED_NETHER_BRICKS.getDefaultState();
		else if(cur.isIn((ITag<Block>) Blocks.POLISHED_BLACKSTONE_BRICKS))
			return Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState();
		else
			return null;
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext c) {
		BlockState bs = c.getWorld().getBlockState(c.getPos());
		BlockState next = crackedState(bs);
		if(next != null) {
			c.getWorld().setBlockState(c.getPos(), next);
			c.getWorld().playSound(c.getPlayer(), c.getPos(), SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.NEUTRAL, 1, 1);
			return ActionResultType.CONSUME;
		}
		return super.onItemUse(c);
	}
}
