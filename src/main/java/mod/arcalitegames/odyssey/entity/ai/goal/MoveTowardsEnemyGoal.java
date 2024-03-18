package mod.arcalitegames.odyssey.entity.ai.goal;

import java.util.EnumSet;

import mod.arcalitegames.odyssey.entity.passive.GuardEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.vector.Vector3d;

public class MoveTowardsEnemyGoal extends Goal
{
   private final GuardEntity guard;
   private LivingEntity targetEntity;
   private double movePosX;
   private double movePosY;
   private double movePosZ;
   private final double speed;
   private final float maxTargetDistance;

   public MoveTowardsEnemyGoal(GuardEntity guard, double speedIn, float targetMaxDistance)
   {
      this.guard = guard;
      this.speed = speedIn;
      this.maxTargetDistance = targetMaxDistance;
      this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
   }

   /**
    * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
    * method as well.
    */
   public boolean shouldExecute() {
      this.targetEntity = this.guard.getAttackTarget();
      if (this.targetEntity == null) {
         return false;
      } else if (this.targetEntity.getDistanceSq(this.guard) > (double)(this.maxTargetDistance * this.maxTargetDistance)) {
         return false;
      } else {
         Vector3d vector3d = RandomPositionGenerator.findRandomTargetBlockTowards(this.guard, 16, 7, this.targetEntity.getPositionVec());
         if (vector3d == null) {
            return false;
         } else {
            this.movePosX = vector3d.x;
            this.movePosY = vector3d.y;
            this.movePosZ = vector3d.z;
            return true;
         }
      }
   }

   /**
    * Returns whether an in-progress EntityAIBase should continue executing
    */
   public boolean shouldContinueExecuting() {
      return !this.guard.getNavigator().noPath() && this.targetEntity.isAlive() && this.targetEntity.getDistanceSq(this.guard) < (double)(this.maxTargetDistance * this.maxTargetDistance);
   }

   /**
    * Reset the task's internal state. Called when this task is interrupted by another one
    */
   public void resetTask() {
	  this.guard.setAttacking(false);
      this.targetEntity = null;
   }

   /**
    * Execute a one shot task or start executing a continuous task
    */
   public void startExecuting() {
	  this.guard.setAttacking(true);
      this.guard.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.speed);
   }
}