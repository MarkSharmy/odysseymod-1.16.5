package mod.arcalitegames.odyssey.entity.hostile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class GoblinTrow extends GoblinEntity {

	public GoblinTrow(EntityType<? extends MonsterEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
        		.createMutableAttribute(Attributes.ARMOR, 4.0D)
        		.createMutableAttribute(Attributes.ARMOR_TOUGHNESS, 4.0D)
        		.createMutableAttribute(Attributes.ATTACK_DAMAGE, 8.0D)
        		.createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 2.0D)
        		.createMutableAttribute(Attributes.FOLLOW_RANGE, 2.0D)
                .createMutableAttribute(Attributes.MAX_HEALTH, 50.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
    }

}
