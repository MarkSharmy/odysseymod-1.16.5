package mod.arcalitegames.odyssey.entity.passive;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.ModEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class TownEntity extends ModEntity
{

	public TownEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 200.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.4D);

    }
	
	@Override
	protected void registerGoals()
	{
		super.registerGoals();
	}

	@Nullable
    protected SoundEvent getAmbientSound()
    {
       if (this.isSleeping()) {
          return null;
       } else {
          return SoundEvents.ENTITY_VILLAGER_AMBIENT;
       }
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
       return SoundEvents.ENTITY_VILLAGER_HURT;
    }

    protected SoundEvent getDeathSound() {
       return SoundEvents.ENTITY_VILLAGER_DEATH;
    }

}
