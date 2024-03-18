package mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities;

import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.MoveThroughVillageGoal;
import net.minecraft.world.World;

public class AlphaneusLewin extends CitizenEntity
{

	public AlphaneusLewin(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(0, new MoveThroughVillageGoal(this, 0.3D, false, 20, () -> { return false; }));
	}
	
}
