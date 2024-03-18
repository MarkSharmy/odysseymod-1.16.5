package mod.arcalitegames.odyssey.entity.hostile;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class BanditRecruit extends BanditEntity
{

	public BanditRecruit(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
        		.createMutableAttribute(Attributes.ARMOR, 1.0D)
        		.createMutableAttribute(Attributes.ARMOR_TOUGHNESS, 1.0D)
        		.createMutableAttribute(Attributes.ATTACK_DAMAGE, 2.0D)
        		.createMutableAttribute(Attributes.FOLLOW_RANGE, 10.0D)
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
    }

}
