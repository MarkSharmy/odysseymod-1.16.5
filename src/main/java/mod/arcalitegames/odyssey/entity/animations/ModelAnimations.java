package mod.arcalitegames.odyssey.entity.animations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import mod.arcalitegames.odyssey.entity.ModEntity;
import mod.arcalitegames.odyssey.entity.animations.common.BarteringAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.DrinkingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.EatingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.InteractingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.KickingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.PanickingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.WalkingAnimation;
import mod.arcalitegames.odyssey.entity.animations.common.YawningAnimation;
import mod.arcalitegames.odyssey.entity.animations.merchant.DispensingAnimation;
import mod.arcalitegames.odyssey.entity.animations.merchant.LeaningAnimation;
import mod.arcalitegames.odyssey.entity.animations.merchant.WipingAnimation;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.system.exceptions.SequenceInterruptedException;

public class ModelAnimations
{
	private static HashMap<ModEntity, Boolean> database = new HashMap<>();
	
	public static void renderYawningAnimation(ModEntity entity, YawningAnimation animation)
	{
		boolean flag = entity.getDataManager().get(ModEntity.yawning);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startYawningAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(ModEntity.yawning, true);
		entity.getDataManager().set(ModEntity.animation, Animations.YAWN);
	}
	
	public static void endYawningAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(ModEntity.yawning, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderWalkingAnimation(ModEntity entity, WalkingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(ModEntity.walking);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startWalkingAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(ModEntity.walking, true);
		entity.getDataManager().set(ModEntity.animation, Animations.WALK);
	}
	
	public static void endWalkingAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(ModEntity.walking, false);
		entity.getDataManager().set(ModEntity.animation, Animations.RESET);
	}
	
	public static void resetAnimation(ModEntity entity, WalkingAnimation animation)
	{
		Animations type = entity.getDataManager().get(ModEntity.animation);
		if(type == Animations.RESET)
		{
			animation.resetAnimations();
			entity.getDataManager().set(ModEntity.animation, Animations.NONE);
		}
	}
	
	public static void renderBarteringAnimation(ModEntity entity, BarteringAnimation animation)
	{
		boolean flag = entity.getDataManager().get(CitizenEntity.bartering);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startBarteringAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(CitizenEntity.bartering, true);
		entity.getDataManager().set(ModEntity.animation, Animations.BARTER);
	}
	
	public static void endBarteringAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(CitizenEntity.bartering, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderInteractioAnimation(ModEntity entity, InteractingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(CitizenEntity.interacting);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startInteractionAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(CitizenEntity.interacting, true);
		entity.getDataManager().set(ModEntity.animation, Animations.INTERACT);
	}
	
	public static void endInteractionAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(CitizenEntity.interacting, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderWipingAnimation(ModEntity entity, WipingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(MerchantEntity.wiping);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startWipingAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(MerchantEntity.wiping, true);
		entity.getDataManager().set(MerchantEntity.showCloth, true);
		entity.getDataManager().set(ModEntity.animation, Animations.WIPE);
	}
	
	public static void endWipingAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(MerchantEntity.wiping, false);
		entity.getDataManager().set(MerchantEntity.showCloth, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderLeaningAnimation(ModEntity entity, LeaningAnimation animation)
	{
		boolean flag = entity.getDataManager().get(MerchantEntity.leaning);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startLeaningAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(MerchantEntity.leaning, true);
		entity.getDataManager().set(ModEntity.animation, Animations.LEAN);
	}
	
	public static void endLeaningAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(MerchantEntity.leaning, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderDispensingAnimation(ModEntity entity, DispensingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(MerchantEntity.dispense);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startDispensingAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(MerchantEntity.dispense, true);
		entity.getDataManager().set(ModEntity.animation, Animations.DISPENSE);
	}
	
	public static void endDispensingAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(MerchantEntity.dispense, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderKickingAnimation(ModEntity entity, KickingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(ModEntity.kicking);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startKickingAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(ModEntity.kicking, true);
		entity.getDataManager().set(ModEntity.animation, Animations.KICK);
	}
	
	public static void endKickingAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(ModEntity.kicking, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderEatingAnimation(ModEntity entity, EatingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(ModEntity.eating);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startEatingAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(ModEntity.eating, true);
		entity.getDataManager().set(ModEntity.animation, Animations.EAT);
	}
	
	public static void endEatingAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(ModEntity.eating, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderDrinkingAnimation(ModEntity entity, DrinkingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(ModEntity.drinking);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startDrinkingAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(ModEntity.drinking, true);
		entity.getDataManager().set(ModEntity.animation, Animations.DRINK);
	}
	
	public static void endDrinkingAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(ModEntity.drinking, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static void renderPanickingAnimation(ModEntity entity, PanickingAnimation animation)
	{
		boolean flag = entity.getDataManager().get(CitizenEntity.panicking);
		Animations type = entity.getDataManager().get(ModEntity.animation);
		
		if(flag)
		{
			try {
				
				animation.renderAnimations(entity);
				
			}catch(SequenceInterruptedException e)
			{
				animation.resetAnimations();
			}
		}
		
		else if(!flag && (type == Animations.NONE))
		{
			animation.resetAnimations();
		}
	}
	
	public static void startPanickingAnimation(ModEntity entity)
	{
		ModelAnimations.startAnimation(entity);
		entity.getDataManager().set(CitizenEntity.panicking, true);
		entity.getDataManager().set(ModEntity.animation, Animations.PANIC);
	}
	
	public static void endPanickingAnimation(ModEntity entity)
	{
		ModelAnimations.stopAnimation(entity);
		entity.getDataManager().set(CitizenEntity.panicking, false);
		entity.getDataManager().set(ModEntity.animation, Animations.NONE);
	}
	
	public static boolean continueAnimation(ModEntity ModEntity)
	{
		boolean value = false;
		
		Set<Map.Entry<ModEntity, Boolean>> entitySet = database.entrySet();
		
		for(Map.Entry<ModEntity, Boolean> entity: entitySet)
		{
			if(entity.getKey().equals(ModEntity))
			{
				value = entity.getValue();
			}
		}
		
		return value;
	}
	
	public static void startAnimation(ModEntity ModEntity)
	{
		database.put(ModEntity, true);
	}
	
	public static void stopAnimation(ModEntity ModEntity)
	{
		database.put(ModEntity, false);
	}
	
}
