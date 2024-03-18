package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;

import mod.arcalitegames.odyssey.entity.CounterEntity;
import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;

public class CounterWipeGoal extends Goal
{
   protected final MerchantEntity entity;
   protected Entity closestEntity;
   protected final float maxDistance;
   protected final int chance;
   protected final Class<? extends LivingEntity> watchedClass;
   protected final EntityPredicate targetEntitySelector;
   protected boolean canReset = true;
   protected int seconds = 0;
   protected int ticks = 0;
   protected int time = 0;

   public CounterWipeGoal(MerchantEntity entityIn)
   {
	   this(entityIn, CounterEntity.class, 2.0f);
   }
   
   public CounterWipeGoal(MerchantEntity entityIn, Class<? extends LivingEntity> watchTargetClass, float maxDistance)
   {
      this(entityIn, watchTargetClass, maxDistance, 240);
   }

   public CounterWipeGoal(MerchantEntity entityIn, Class<? extends LivingEntity> watchTargetClass, float maxDistance, int chanceIn)
   {
      this.entity = entityIn;
      this.watchedClass = watchTargetClass;
      this.maxDistance = maxDistance;
      this.chance = chanceIn;
      this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
      this.targetEntitySelector = (new EntityPredicate()).setDistance((double)maxDistance).allowFriendlyFire().allowInvulnerable().setSkipAttackChecks();
   }

   public boolean shouldExecute()
   {
      if (this.entity.getRNG().nextInt(this.chance) != 0)
      {
         return false;
      } else
      {
         if (this.entity.getAttackTarget() != null)
         {
            this.closestEntity = this.entity.getAttackTarget();
         }

            this.closestEntity = this.entity.world.getClosestEntity(this.watchedClass, this.targetEntitySelector, this.entity, this.entity.getPosX(), this.entity.getPosYEye(), this.entity.getPosZ(), this.entity.getBoundingBox().grow((double)this.maxDistance, 3.0D, (double)this.maxDistance));
         }

         return this.closestEntity != null;
   }

   public boolean shouldContinueExecuting()
   {
      if (!this.closestEntity.isAlive())
      {
         return false;
      }
      else if (this.entity.getDistanceSq(this.closestEntity) > (double)(this.maxDistance * this.maxDistance))
      {
         return false;
      }
      else 
    	  return ModelAnimations.continueAnimation(entity);
   }
      

   public void startExecuting()
   {
      ModelAnimations.startWipingAnimation(entity);
   }

   public void resetTask()
   {
      this.closestEntity = null;
      ModelAnimations.endWipingAnimation(entity);
   }

   public void tick()
   {
      this.entity.getLookController().setLookPosition(this.closestEntity.getPosX(), this.closestEntity.getPosYEye(), this.closestEntity.getPosZ());
   }
   
   @Override
	public boolean isPreemptible()
    {
		return false;
	}
}