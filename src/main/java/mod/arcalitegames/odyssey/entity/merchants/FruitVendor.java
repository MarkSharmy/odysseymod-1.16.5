package mod.arcalitegames.odyssey.entity.merchants;

import mod.arcalitegames.odyssey.client.gui.MerchantGui;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.merchants.FruitStallTrades;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class FruitVendor extends MerchantEntity {

	public FruitVendor(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	@Override
	public ActionResultType applyPlayerInteraction(PlayerEntity player, Vector3d vec, Hand hand)
	{
		if(hand == Hand.MAIN_HAND)
		{
			this.prepareForCustomer();
			MerchantGui.createInstance(this, MerchantType.FRUITVENDOR, player, FruitStallTrades.getMerchantItems());
			TradeManager.start();
		}
		
		return ActionResultType.SUCCESS;
	}

}
