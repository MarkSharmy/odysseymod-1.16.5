package mod.arcalitegames.odyssey.entity.ai.goal;

import mod.arcalitegames.odyssey.entity.passive.PatrollingGuardEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.util.math.vector.Vector3d;

public class PatrolRandomlyGoal extends RandomWalkingGoal
{

	public PatrolRandomlyGoal(PatrollingGuardEntity guard, double speed)
	{
		super(guard, speed);
	}
	
	@Override
	protected Vector3d getPosition()
	{
		return RandomPositionGenerator.findRandomTarget(this.creature, 25, 7);
	}

}
