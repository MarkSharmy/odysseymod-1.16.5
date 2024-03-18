package mod.arcalitegames.odyssey.client.events;

import java.util.Random;

import mod.arcalitegames.odyssey.entity.hostile.BanditEntity;
import mod.arcalitegames.odyssey.entity.hostile.BanditMarauder;
import mod.arcalitegames.odyssey.entity.hostile.GoblinEntity;
import mod.arcalitegames.odyssey.entity.hostile.GoblinTrow;
import mod.arcalitegames.odyssey.items.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EntityDrops
{
	@SubscribeEvent
	public static void onLivingDeath(LivingDeathEvent event)
	{
		Entity entity = event.getEntity();
		
		if(entity instanceof VindicatorEntity && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.BRONZE_COIN.get(), new Random().nextInt(16)));
		}
		
		if(entity instanceof EvokerEntity && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.BRONZE_COIN.get(), new Random().nextInt(16)));
		}
		
		if(entity instanceof IllusionerEntity && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.BRONZE_COIN.get(), new Random().nextInt(16)));
		}
		
		if(entity instanceof PillagerEntity && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.BRONZE_COIN.get(), new Random().nextInt(16)));
		}
		
		if(entity instanceof BanditMarauder && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.SILVER_COIN.get(), new Random().nextInt(8)));
			
			int chance = new Random().nextInt(23);
			
			if((chance % 4) == 0)
			{
				entity.entityDropItem(new ItemStack(Items.DIAMOND_SWORD));
			}
		}
		
		if(entity instanceof BanditEntity && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.BRONZE_COIN.get(), new Random().nextInt(16)));
			
			int chance = new Random().nextInt(23);
			
			if((chance % 4) == 0)
			{
				entity.entityDropItem(new ItemStack(Items.IRON_SWORD));
			}
		}
		
		if(entity instanceof GoblinTrow && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.SILVER_COIN.get(), new Random().nextInt(8)));
			
			int chance = new Random().nextInt(23);
			
			if((chance % 4) == 0)
			{
				entity.entityDropItem(new ItemStack(Items.DIAMOND_SWORD));
			}
		}
		
		if(entity instanceof GoblinEntity && !entity.world.isRemote)
		{
			entity.entityDropItem(new ItemStack(ModItems.BRONZE_COIN.get(), new Random().nextInt(16)));
			
			int chance = new Random().nextInt(23);
			
			if((chance % 4) == 0)
			{
				entity.entityDropItem(new ItemStack(Items.IRON_SWORD));
			}
		}
		
	}
}
