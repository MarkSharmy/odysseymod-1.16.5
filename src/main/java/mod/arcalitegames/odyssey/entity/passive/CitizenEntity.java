package mod.arcalitegames.odyssey.entity.passive;

import javax.annotation.Nullable;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.ai.goal.BarterWithMerchantGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.CustomAvoidEntityGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.CustomPanicGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.EngageWithNeighborGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.InteractWithNeighborGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.RandomWanderingGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.ShowNoticeGoal;
import mod.arcalitegames.odyssey.entity.ai.goal.WanderThroughTownGoal;
import mod.arcalitegames.odyssey.entity.util.Priority;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

public class CitizenEntity extends TownEntity
{
	protected CitizenEntity aquaintance;
	protected boolean chatting = false;
	public static final DataParameter<Boolean> bartering = EntityDataManager.createKey(CitizenEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> interacting = EntityDataManager.createKey(CitizenEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> panicking = EntityDataManager.createKey(CitizenEntity.class, DataSerializers.BOOLEAN);
    
    public CitizenEntity(EntityType<? extends CreatureEntity> type, World worldIn)
    {
    	super(type, worldIn);
    }
    
    @Override
    protected void registerData()
    {
    	super.registerData();
    	this.dataManager.register(bartering, false);
        this.dataManager.register(interacting, false);
        this.dataManager.register(panicking, false);
    }

    @Override
    protected void registerGoals()
    {
    	super.registerGoals();
    	this.goalSelector.addGoal(Priority.REAL_TIME, new WanderThroughTownGoal(this));
    	this.goalSelector.addGoal(Priority.REAL_TIME, new EngageWithNeighborGoal(this));
    	this.goalSelector.addGoal(Priority.VERY_HIGH, new RandomWanderingGoal(this, 0.4D));
    	this.goalSelector.addGoal(Priority.HIGH, new InteractWithNeighborGoal(this));
    	this.goalSelector.addGoal(Priority.HIGH, new CustomPanicGoal(this));
		this.goalSelector.addGoal(Priority.HIGH, new CustomAvoidEntityGoal<>(this, MonsterEntity.class));
    	this.goalSelector.addGoal(Priority.NORMAL, new BarterWithMerchantGoal(this));
    	//this.goalSelector.addGoal(Priority.BELOW_NORMAL, new EatSomethingGoal(this));
		//this.goalSelector.addGoal(Priority.BELOW_NORMAL, new DrinkSomethingGoal(this));
    }
    
    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
        super.setEquipmentBasedOnDifficulty(difficulty);
        this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.BREAD));
    }

    @Nullable
    public ILivingEntityData onInitialSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
        ILivingEntityData data = super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
        BlockPos homePos = this.getPosition();
        this.setHomePosAndDistance(homePos, 10);
        return data;
    }
    
    public boolean canInteractWith(ModEntity neighbor)
    {
        if (neighbor == this)
        {
           return false;
        } else if (neighbor instanceof CitizenEntity)
        {
           if(((CitizenEntity) neighbor).isChatting())
           {
        	   return false;
           }
        }
        
        return true;
     }
    
    public void setChatting(CitizenEntity aquaintance, boolean chat)
    {
    	this.aquaintance = aquaintance;
    	this.chatting = chat;
    }
    
    public boolean isChatting()
    {
    	return chatting;
    }
    
    public CitizenEntity getAquaintance()
    {
    	return this.aquaintance;
    }
}
