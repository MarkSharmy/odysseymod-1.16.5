package mod.arcalitegames.odyssey.entity.passive;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.ai.goal.ReturnToPostGoal;
import mod.arcalitegames.odyssey.entity.util.Priority;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

public class StandingGuardEntity extends GuardEntity
{
	public static DataParameter<BlockPos> POST = EntityDataManager.createKey(ModEntity.class, DataSerializers.BLOCK_POS);
	
	public StandingGuardEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	@Override
	protected void registerData()
	{
		this.dataManager.register(POST, BlockPos.ZERO);
		super.registerData();
	}
	
	@Override
	protected void registerGoals()
	{
		super.registerGoals();
		this.goalSelector.addGoal(Priority.LOW, new ReturnToPostGoal(this));
	}
	
	@Override
	public void onAddedToWorld()
	{
		super.onAddedToWorld();
		this.dataManager.set(POST, this.getPosition());
	}
	
	@Override
	public ILivingEntityData onInitialSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason,
			ILivingEntityData spawnDataIn, CompoundNBT dataTag)
	{
		this.dataManager.set(POST, this.getPosition());
		return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
	}
	
}
