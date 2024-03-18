package mod.arcalitegames.odyssey.entity.hostile;

import mod.arcalitegames.odyssey.entity.ai.goal.WaterAvoidingRandomWanderingGoal;
import mod.arcalitegames.odyssey.entity.util.Priority;
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
import net.minecraft.world.World;

public abstract class GoblinEntity extends MonsterEntity
{

	public GoblinEntity(EntityType<? extends MonsterEntity> type, World worldIn)
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
	      this.targetSelector.addGoal(Priority.VERY_HIGH, (new HurtByTargetGoal(this)).setCallsForHelp(GoblinHobgoblin.class));
	      this.targetSelector.addGoal(Priority.HIGH, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	      this.targetSelector.addGoal(Priority.ABOVE_NORMAL, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
	      this.targetSelector.addGoal(Priority.ABOVE_NORMAL, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
	   }

}
