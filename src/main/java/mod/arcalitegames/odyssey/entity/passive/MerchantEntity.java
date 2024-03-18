package mod.arcalitegames.odyssey.entity.passive;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.ai.goal.*;
import mod.arcalitegames.odyssey.entity.animations.Animations;
import mod.arcalitegames.odyssey.entity.util.Priority;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class MerchantEntity extends TownEntity
{
	protected boolean soldItem;
	protected boolean isWipingCounter;
	public static final DataParameter<Boolean> dispense = EntityDataManager.createKey(MerchantEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> showCloth = EntityDataManager.createKey(MerchantEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> leaning = EntityDataManager.createKey(MerchantEntity.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> wiping = EntityDataManager.createKey(MerchantEntity.class, DataSerializers.BOOLEAN);
    
	public MerchantEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	@Override
	protected void registerData()
	{
		super.registerData();
		this.dataManager.register(dispense, false);
        this.dataManager.register(showCloth, false);
        this.dataManager.register(leaning, false);
        this.dataManager.register(wiping, false);
	}
	
	@Override
	protected void registerGoals()
	{
		super.registerGoals();
		this.goalSelector.addGoal(Priority.REAL_TIME, new GiveItemToCustomerGoal(this));
		this.goalSelector.addGoal(Priority.REAL_TIME, new LeanOnCounterGoal(this));
		this.goalSelector.addGoal(Priority.NORMAL, new CounterWipeGoal(this));
		this.goalSelector.addGoal(Priority.BELOW_NORMAL, new EatSomethingGoal(this));
		this.goalSelector.addGoal(Priority.BELOW_NORMAL, new DrinkSomethingGoal(this));
	}
	
	protected void prepareForCustomer()
	{
		this.getDataManager().set(ModEntity.animation, Animations.RESET);
	}
	
	@Override
	public boolean canBeAttackedWithItem()
	{
		return false;
	}
	
	@Override
	public boolean canBeCollidedWith()
	{
		return true;
	}
	
	@Override
	public boolean canBeHitWithPotion()
	{
		return false;
	}
	
	@Override
	public boolean canBeLeashedTo(PlayerEntity player)
	{
		return false;
	}
	
	@Override
	public boolean canBePushed()
	{
		return false;
	}
	
	public void setWipingCounter(boolean wipe)
	{
		this.isWipingCounter = wipe;
	}
	
	public boolean isWipingCounter()
	{
		return this.isWipingCounter;
	}
	
	public void soldItem(boolean value)
	{
		this.soldItem = value;
	}
	
	public boolean hasSoldItem()
	{
		return this.soldItem;
	}
	
}
