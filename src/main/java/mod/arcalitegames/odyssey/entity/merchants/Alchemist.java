package mod.arcalitegames.odyssey.entity.merchants;

import mod.arcalitegames.odyssey.client.gui.category.AlchemistCatalogue;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Alchemist extends MerchantEntity
{

	public Alchemist(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	@Override
	public ActionResultType applyPlayerInteraction(PlayerEntity player, Vector3d vec, Hand hand)
	{
		if(hand == Hand.MAIN_HAND)
		{
			this.prepareForCustomer();
			Minecraft.getInstance().displayGuiScreen(new AlchemistCatalogue(this, MerchantType.ALCHEMIST, player));
		}
		
		return ActionResultType.SUCCESS;
	}

}
