package mod.arcalitegames.odyssey.entity.ai.goal;

import javax.annotation.Nullable;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.util.math.vector.Vector3d;

public class WaterAvoidingRandomWanderingGoal extends RandomWalkingGoal
{
	protected final float probability;

	   public WaterAvoidingRandomWanderingGoal(CreatureEntity creature, double speedIn) {
	      this(creature, speedIn, 0.001F);
	   }

	   public WaterAvoidingRandomWanderingGoal(CreatureEntity creature, double speedIn, float probabilityIn) {
	      super(creature, speedIn);
	      this.probability = probabilityIn;
	   }

	   @Nullable
	   protected Vector3d getPosition() {
	      if (this.creature.isInWaterOrBubbleColumn()) {
	         Vector3d vector3d = RandomPositionGenerator.getLandPos(this.creature, 25, 7);
	         return vector3d == null ? super.getPosition() : vector3d;
	      } else {
	         return this.creature.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.creature, 25, 7) : super.getPosition();
	      }
	   }
}
