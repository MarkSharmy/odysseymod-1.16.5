package mod.arcalitegames.odyssey.entity.ai.goal;

import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraft.entity.ai.goal.Goal;

public class GiveItemToCustomerGoal extends Goal
{
	private final MerchantEntity merchant;
	
	public GiveItemToCustomerGoal(MerchantEntity merchantIn)
	{
		this.merchant = merchantIn;
	}
	
	@Override
	public void startExecuting()
	{
		ModelAnimations.startDispensingAnimation(merchant);
	}
	
	@Override
	public boolean shouldContinueExecuting()
	{
		return ModelAnimations.continueAnimation(merchant);
	}
	
	
	@Override
	public boolean shouldExecute()
	{
		return this.merchant.hasSoldItem();
	}
	
	@Override
	public boolean isPreemptible()
	{
		return false;
	}
	
	@Override
	public void resetTask()
	{
		this.merchant.soldItem(false);
		ModelAnimations.endDispensingAnimation(merchant);
	}

}
