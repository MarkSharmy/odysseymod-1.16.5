package mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities;

import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class AurelianaHuyler extends CitizenEntity {

	public AurelianaHuyler(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	@Override
	public ActionResultType applyPlayerInteraction(PlayerEntity player, Vector3d vec, Hand hand) {

		if(hand == Hand.MAIN_HAND)
		{
			player.sendMessage(new StringTextComponent("You clicked me."), player.getUniqueID());
		}
		
		return ActionResultType.SUCCESS;
	}
	
}
