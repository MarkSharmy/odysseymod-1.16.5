package mod.arcalitegames.odyssey.entity.citizens.bashkarcity.guards;

import mod.arcalitegames.odyssey.entity.passive.PatrollingGuardEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class BashkarPatrollingGuard extends PatrollingGuardEntity
{

	public BashkarPatrollingGuard(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}

}
