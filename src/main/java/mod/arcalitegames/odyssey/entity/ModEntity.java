package mod.arcalitegames.odyssey.entity;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.ai.goal.RandomKickingGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.RandomYawningGoal;
import mod.arcalitegames.odyssey.entity.animations.Animations;
import mod.arcalitegames.odyssey.entity.util.EntityPerimeter;
import mod.arcalitegames.odyssey.entity.util.Priority;
import mod.arcalitegames.system.network.CustomSerializers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class ModEntity extends CreatureEntity
{
    public static final DataParameter<Boolean> walking = EntityDataManager.createKey(ModEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> yawning = EntityDataManager.createKey(ModEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> kicking = EntityDataManager.createKey(ModEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> sitting = EntityDataManager.createKey(ModEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> eating = EntityDataManager.createKey(ModEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> drinking = EntityDataManager.createKey(ModEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Animations> animation = EntityDataManager.createKey(ModEntity.class, CustomSerializers.ANIMATION);
    
    protected final EntityPerimeter perimeter;
    
    protected ModEntity(EntityType<? extends CreatureEntity> type, World worldIn)
    {
        super(type, worldIn);
        this.perimeter = new EntityPerimeter(this);
    }
    
    @Override
    protected void registerData()
    {
        super.registerData();
        this.dataManager.register(ModEntity.walking, false);
        this.dataManager.register(ModEntity.yawning, false);
        this.dataManager.register(ModEntity.kicking, false);
        this.dataManager.register(ModEntity.sitting, false);
        this.dataManager.register(ModEntity.eating, false);
        this.dataManager.register(ModEntity.drinking, false);
        this.dataManager.register(ModEntity.animation, Animations.NONE);
    }
    
    @Override
    protected void registerGoals()
    {
    	this.goalSelector.addGoal(Priority.REAL_TIME, new SwimGoal(this));
    	//this.goalSelector.addGoal(Priority.REAL_TIME, new DismountChairGoal(this));
    	this.goalSelector.addGoal(Priority.HIGH, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(Priority.ABOVE_NORMAL, new LookAtGoal(this, PlayerEntity.class, 3.0f, 0.025f));
		//this.goalSelector.addGoal(Priority.NORMAL, new SitOnChairGoal(this, 50));
		this.goalSelector.addGoal(Priority.BELOW_NORMAL, new RandomKickingGoal(this));
		this.goalSelector.addGoal(Priority.NEGLIGIBLE, new RandomYawningGoal(this));
    }
    
    public boolean isSitting()
    {
    	return this.dataManager.get(sitting);
    }
    
    public void sit()
    {
    	this.dataManager.set(sitting, true);
    }
    
    public void stand()
    {
    	this.dataManager.set(sitting, false);
    }
    
    @Override
    public boolean canDespawn(double distanceToClosestPlayer)
    {
    	return false;
    }
    
    @Override
    public boolean canBeAttackedWithItem()
    {
    	if(this.isSitting())
    	{
    		return false;
    	}
    	
    	return super.canBeAttackedWithItem();
    }
    
    @Override
    public boolean canBeCollidedWith()
    {
    	if(this.isSitting())
    	{
    		return false;
    	}
    	
    	return super.canBeCollidedWith();
    }
    
    @Override
    public boolean canBePushed()
    {
    	if(this.isSitting())
    	{
    		return false;
    	}
    	
    	return super.canBePushed();
    }
    
    @Nullable
    public BlockPos findRandomTargetBlock(Block block, int maxDistance)
    {
    	return this.perimeter.findRandomTargetBlock(block, maxDistance);
    }
    
    @Nullable
    public BlockPos findSpecificTargetBlock(BlockState blockstate, int maxDistance)
    {
    	return this.perimeter.findSpecificTargetBlock(blockstate, maxDistance);
    }
}
