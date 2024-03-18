package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;
import java.util.function.Predicate;

import mod.arcalitegames.odyssey.entity.animations.ModelAnimations;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.vector.Vector3d;

public class CustomAvoidEntityGoal<T extends LivingEntity> extends Goal {
   protected final CitizenEntity citizen;
   private final double farSpeed;
   private final double nearSpeed;
   protected T avoidTarget;
   protected final float avoidDistance;
   protected Path path;
   protected final PathNavigator navigation;
   /** Class of citizen this behavior seeks to avoid */
   protected final Class<T> classToAvoid;
   protected final Predicate<LivingEntity> avoidTargetSelector;
   protected final Predicate<LivingEntity> field_203784_k;
   private final EntityPredicate builtTargetSelector;

   public CustomAvoidEntityGoal(CitizenEntity citizen, Class<T> classToAvoidIn)
   {
	   this(citizen, classToAvoidIn, 8.0f, 0.5f, 0.5f);
   }
   
   public CustomAvoidEntityGoal(CitizenEntity citizenIn, Class<T> classToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
      this(citizenIn, classToAvoidIn, (citizen) -> {
         return true;
      }, avoidDistanceIn, farSpeedIn, nearSpeedIn, EntityPredicates.CAN_AI_TARGET::test);
   }

   public CustomAvoidEntityGoal(CitizenEntity citizenIn, Class<T> avoidClass, Predicate<LivingEntity> targetPredicate, float distance, double nearSpeedIn, double farSpeedIn, Predicate<LivingEntity> p_i48859_9_) {
      this.citizen = citizenIn;
      this.classToAvoid = avoidClass;
      this.avoidTargetSelector = targetPredicate;
      this.avoidDistance = distance;
      this.farSpeed = nearSpeedIn;
      this.nearSpeed = farSpeedIn;
      this.field_203784_k = p_i48859_9_;
      this.navigation = citizenIn.getNavigator();
      this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
      this.builtTargetSelector = (new EntityPredicate()).setDistance((double)distance).setCustomPredicate(p_i48859_9_.and(targetPredicate));
   }

   public CustomAvoidEntityGoal(CitizenEntity citizenIn, Class<T> avoidClass, float distance, double nearSpeedIn, double farSpeedIn, Predicate<LivingEntity> targetPredicate) {
      this(citizenIn, avoidClass, (citizen) -> {
         return true;
      }, distance, nearSpeedIn, farSpeedIn, targetPredicate);
   }

   /**
    * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
    * method as well.
    */
   public boolean shouldExecute() {
      this.avoidTarget = this.citizen.world.getClosestEntity(this.classToAvoid, this.builtTargetSelector, this.citizen, this.citizen.getPosX(), this.citizen.getPosY(), this.citizen.getPosZ(), this.citizen.getBoundingBox().grow((double)this.avoidDistance, 3.0D, (double)this.avoidDistance));
      if (this.avoidTarget == null) {
         return false;
      } else {
         Vector3d vector3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.citizen, 16, 7, this.avoidTarget.getPositionVec());
         if (vector3d == null) {
            return false;
         } else if (this.avoidTarget.getDistanceSq(vector3d.x, vector3d.y, vector3d.z) < this.avoidTarget.getDistanceSq(this.citizen)) {
            return false;
         } else {
            this.path = this.navigation.pathfind(vector3d.x, vector3d.y, vector3d.z, 0);
            return this.path != null;
         }
      }
   }

   /**
    * Returns whether an in-progress EntityAIBase should continue executing
    */
   public boolean shouldContinueExecuting() {
      return !this.navigation.noPath();
   }

   /**
    * Execute a one shot task or start executing a continuous task
    */
   public void startExecuting() {
      this.navigation.setPath(this.path, this.farSpeed);
      ModelAnimations.startPanickingAnimation(citizen);
   }

   /**
    * Reset the task's internal state. Called when this task is interrupted by another one
    */
   public void resetTask() {
      this.avoidTarget = null;
      ModelAnimations.endPanickingAnimation(citizen);
   }

   /**
    * Keep ticking a continuous task that has already been started
    */
   public void tick() {
      if (this.citizen.getDistanceSq(this.avoidTarget) < 49.0D) {
         this.citizen.getNavigator().setSpeed(this.nearSpeed);
      } else {
         this.citizen.getNavigator().setSpeed(this.farSpeed);
      }

   }
}