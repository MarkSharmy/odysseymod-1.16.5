package mod.arcalitegames.odyssey.entity.hostile;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class BanditMarauder extends BanditEntity {

	public BanditMarauder(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
        		.createMutableAttribute(Attributes.ARMOR, 5.0D)
        		.createMutableAttribute(Attributes.ARMOR_TOUGHNESS, 5.0D)
        		.createMutableAttribute(Attributes.ATTACK_DAMAGE, 8.0D)
        		.createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 2.0D)
        		.createMutableAttribute(Attributes.FOLLOW_RANGE, 1.0D)
                .createMutableAttribute(Attributes.MAX_HEALTH, 50.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
    }

}
