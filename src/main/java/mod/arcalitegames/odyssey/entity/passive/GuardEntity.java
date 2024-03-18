package mod.arcalitegames.odyssey.entity.passive;

import java.util.UUID;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.ai.goal.MoveTowardsEnemyGoal;
import mod.arcalitegames.odyssey.entity.util.Priority;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IAngerable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.RangedInteger;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.TickRangeConverter;
import net.minecraft.world.World;

public class GuardEntity extends ModEntity implements IAngerable
{
	private static final RangedInteger field_234196_bu_ = TickRangeConverter.convertRange(20, 39);
	private int field_234197_bv_;
	private UUID field_234198_bw_;
	protected boolean attacking;

	public GuardEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 1500.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D)
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 1.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 15.0D);

    }
	
	@Override
	protected void registerGoals()
	{
		 this.goalSelector.addGoal(Priority.REAL_TIME, new MeleeAttackGoal(this, 0.5D, true));
	     this.goalSelector.addGoal(Priority.VERY_HIGH, new MoveTowardsEnemyGoal(this, 0.5D, 32.0F));
	     this.targetSelector.addGoal(Priority.VERY_HIGH, new HurtByTargetGoal(this));
	     this.targetSelector.addGoal(Priority.HIGH, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, this::func_233680_b_));
	     this.targetSelector.addGoal(Priority.HIGH, new NearestAttackableTargetGoal<>(this, MobEntity.class, 5, false, false, (p_234199_0_) -> {
	         return p_234199_0_ instanceof IMob && !(p_234199_0_ instanceof GhastEntity);
	      }));
	     this.goalSelector.addGoal(Priority.LOW, new LookAtGoal(this, PlayerEntity.class, 6.0F));
	     this.goalSelector.addGoal(Priority.NEGLIGIBLE, new LookRandomlyGoal(this));
	}
	
	public boolean func_233680_b_(LivingEntity p_233680_1_) {
	      if (!EntityPredicates.CAN_HOSTILE_AI_TARGET.test(p_233680_1_)) {
	         return false;
	      } else {
	         return p_233680_1_.getType() == EntityType.PLAYER && this.func_241357_a_(p_233680_1_.world) ? true : p_233680_1_.getUniqueID().equals(this.getAngerTarget());
	      }
	   }

	public void setAngerTime(int time) {
	      this.field_234197_bv_ = time;
	   }

	   public int getAngerTime() {
	      return this.field_234197_bv_;
	   }

	   public void setAngerTarget(@Nullable UUID target) {
	      this.field_234198_bw_ = target;
	   }

	   public UUID getAngerTarget() {
	      return this.field_234198_bw_;
	   }

	   private float func_226511_et_() {
	      return (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
	   }

	   public boolean attackEntityAsMob(Entity entityIn) {
	      this.world.setEntityState(this, (byte)4);
	      float f = this.func_226511_et_();
	      float f1 = (int)f > 0 ? f / 2.0F + (float)this.rand.nextInt((int)f) : f;
	      boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), f1);
	      if (flag) {
	         entityIn.setMotion(entityIn.getMotion().add(0.0D, (double)0.4F, 0.0D));
	         this.applyEnchantments(this, entityIn);
	      }

	      this.playSound(SoundEvents.ENTITY_VINDICATOR_AMBIENT, 1.0F, 1.0F);
	      return flag;
	   }

	@Override
	public void func_230258_H__() {
		this.setAngerTime(field_234196_bu_.getRandomWithinRange(this.rand));
		
	}
	
	public void setAttacking(boolean attack)
	{
		this.attacking = attack;
	}
	
	public boolean isAttacking()
	{
		return this.attacking;
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
