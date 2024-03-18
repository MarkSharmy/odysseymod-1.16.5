package mod.arcalitegames.odyssey.entity.passive;

import mod.arcalitegames.odyssey.entity.ai.goal.PatrolRandomlyGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.PatrolTownGoal;
import mod.arcalitegames.odyssey.entity.util.Priority;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

public class PatrollingGuardEntity extends GuardEntity
{

	public PatrollingGuardEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	@Override
	protected void registerGoals()
	{
		super.registerGoals();
		this.goalSelector.addGoal(Priority.REAL_TIME, new PatrolTownGoal(this, 0.5D));
		this.goalSelector.addGoal(Priority.HIGH, new PatrolRandomlyGoal(this, 0.5D));
	}
	
	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty)
	{
		  super.setEquipmentBasedOnDifficulty(difficulty);
	      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
	}
	
	@Override
	public boolean canEquipItem(ItemStack stack)
	{
		return super.canEquipItem(stack);
	}
	
	@Override
	public ILivingEntityData onInitialSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason,
			ILivingEntityData spawnDataIn, CompoundNBT dataTag)
	{
		this.setEquipmentBasedOnDifficulty(difficultyIn);
		return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
	}

}
