package mod.arcalitegames.odyssey.entity.hostile;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.ai.goal.WaterAvoidingRandomWanderingGoal;
import mod.arcalitegames.odyssey.entity.util.Priority;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public abstract class BanditEntity extends CreatureEntity
{

	public BanditEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	protected void registerGoals()
	{
	      this.goalSelector.addGoal(Priority.NEGLIGIBLE, new LookAtGoal(this, PlayerEntity.class, 8.0F));
	      this.goalSelector.addGoal(Priority.NEGLIGIBLE, new LookRandomlyGoal(this));
	      this.applyEntityAI();
	   }

	   protected void applyEntityAI()
	   {
		  this.goalSelector.addGoal(Priority.NORMAL, new MeleeAttackGoal(this, 0.4D, false));
	      this.goalSelector.addGoal(Priority.VERY_LOW, new WaterAvoidingRandomWanderingGoal(this, 0.5D));
	      this.targetSelector.addGoal(Priority.VERY_HIGH, (new HurtByTargetGoal(this)));
	      this.targetSelector.addGoal(Priority.HIGH, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	      this.targetSelector.addGoal(Priority.HIGH, new NearestAttackableTargetGoal<>(this, MonsterEntity.class, true));
	      this.targetSelector.addGoal(Priority.ABOVE_NORMAL, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
	      this.targetSelector.addGoal(Priority.ABOVE_NORMAL, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
	   }
	   
	   @Nullable
	    protected SoundEvent getAmbientSound()
	    {
	         return SoundEvents.ENTITY_VINDICATOR_AMBIENT;
	    }

	    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	    {
	       return SoundEvents.ENTITY_VINDICATOR_HURT;
	    }

	    protected SoundEvent getDeathSound() {
	       return SoundEvents.ENTITY_VINDICATOR_DEATH;
	    }

}
