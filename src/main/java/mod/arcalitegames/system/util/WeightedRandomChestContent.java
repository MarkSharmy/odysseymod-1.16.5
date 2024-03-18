package mod.arcalitegames.system.util;

import mod.arcalitegames.odyssey.items.ModItems;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Random;

public class WeightedRandomChestContent
{
    public static IInventory generateContents(int level, IInventory chest)
    {
        if(level == 1)
        {
            return loot1(chest);
        }
        
        if(level == 2)
        {
            return loot2(chest);
        }
        
        if(level == 3)
        {
            return loot3(chest);
        }

        chest.setInventorySlotContents(1, ItemStack.EMPTY);
        return chest;
    }

    private static IInventory loot1(IInventory inventory)
    {
        Random rand = new Random();
        int chance = rand.nextInt(27);

        switch (chance)
        {
            case 0:
            {
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("minecraft:iron_nugget"), 13));
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("minecraft:potato"), 4));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:stone_pickaxe"), 1));
            	inventory.setInventorySlotContents(23, new ItemStack(ItemParser.getItemFromName("minecraft:coal"), 3));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("minecraft:cocoa_beans"), 6));
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("minecraft:ghast_tear"), 1));
            	return inventory;
            }
            case 1:
            {
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("minecraft:rabbit_hide"), 1));
            	inventory.setInventorySlotContents(21, new ItemStack(ItemParser.getItemFromName("iceandfire:silver_nugget"), 11));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:name_tag"), 1));
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("odysseymod:bronze_coin"), 1));
            	inventory.setInventorySlotContents(9, new ItemStack(ItemParser.getItemFromName("iceandfire:silver_nugget"), 9));
            	inventory.setInventorySlotContents(17, new ItemStack(ItemParser.getItemFromName("minecraft:apple"), 9));
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("minecraft:writable_book"), 1));
            	return inventory;
            }


            case 2:
            {
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("minecraft:sugar"), 15));
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("minecraft:popped_chorus_fruit"), 5));
            	inventory.setInventorySlotContents(25, new ItemStack(ItemParser.getItemFromName("iceandfire:silver_nugget"), 12));
            	inventory.setInventorySlotContents(5, new ItemStack(ItemParser.getItemFromName("minecraft:fermented_spider_eye"), 1));
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("odysseymod:wine"), 1));
            	return inventory;
            }


            case 3:
            {
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("minecraft:stone_sword"), 1));
            	inventory.setInventorySlotContents(0, new ItemStack(ItemParser.getItemFromName("minecraft:bone"), 9));
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("minecraft:fermented_spider_eye"), 1));
            	return inventory;
            }

            case 4:
            {
            	inventory.setInventorySlotContents(23, new ItemStack(ItemParser.getItemFromName("iceandfire:silver_nugget"), 6));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("minecraft:gunpowder"), 15));
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_pickaxe"), 1));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:redstone"), 5));
            	inventory.setInventorySlotContents(1, new ItemStack(ItemParser.getItemFromName("minecraft:leather_helmet"), 1));
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("minecraft:cocoa_beans"), 2));
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("betteranimalsplus:trillium"), 1));
            	return inventory;
            }

            case 5:
            {
            	inventory.setInventorySlotContents(21, new ItemStack(ItemParser.getItemFromName("minecraft:stone_axe"), 1));
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("minecraft:name_tag"), 1));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:cake"), 1));
            	inventory.setInventorySlotContents(16, new ItemStack(ItemParser.getItemFromName("minecraft:paper"), 2));
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("odysseymod:fine_wine"), 1));
            	inventory.setInventorySlotContents(9, new ItemStack(ItemParser.getItemFromName("minecraft:stone_sword"), 1));
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_axe"), 1));
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("minecraft:spider_eye"), 3));
            	return inventory;
            }
            
            case 6:
            {
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_sword"), 1));
            	inventory.setInventorySlotContents(25, new ItemStack(ItemParser.getItemFromName("minecraft:bowl"), 1));
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_hoe"), 1));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_hoe"), 1));
            	return inventory;
            }
            
            case 7:
            {
            	inventory.setInventorySlotContents(17, new ItemStack(ItemParser.getItemFromName("minecraft:slime_ball"), 1));
            	return inventory;
            }
            
            case 8:
            {
            	inventory.setInventorySlotContents(12, new ItemStack(ItemParser.getItemFromName("minecraft:arrow"), 11));
            	return inventory;
            }
            
            case 9:
            {
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("minecraft:flint_and_steel"), 1));
            	return inventory;
            }
            
            case 10:
            {
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_nugget"), 4));
            	inventory.setInventorySlotContents(6, new ItemStack(ItemParser.getItemFromName("minecraft:fermented_spider_eye"), 1));
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_nugget"), 5));
            	inventory.setInventorySlotContents(21, new ItemStack(ItemParser.getItemFromName("minecraft:arrow"), 15));
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("minecraft:carrot"), 3));
            	return inventory;
            }
            
            case 11:
            {
            	inventory.setInventorySlotContents(5, new ItemStack(ItemParser.getItemFromName("minecraft:spider_eye"), 4));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:flint"), 1));
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("minecraft:popped_chorus_fruit"), 11));
            	inventory.setInventorySlotContents(23, new ItemStack(ItemParser.getItemFromName("odysseymod:bronze_coin"), 12));
            	inventory.setInventorySlotContents(0, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_hoe"), 1));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("minecraft:coal"), 11));
            	return inventory;
            }
            
            case 12:
            {
            	inventory.setInventorySlotContents(1, new ItemStack(ItemParser.getItemFromName("minecraft:bread"), 12));
            	return inventory;
            }
            
            case 13:
            {
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("minecraft:spider_eye"), 7));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("minecraft:fermented_spider_eye"), 1));
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("minecraft:writable_book"), 1));
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("minecraft:rotten_flesh"), 6));
            	inventory.setInventorySlotContents(17, new ItemStack(ItemParser.getItemFromName("minecraft:nether_wart"), 1));
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("minecraft:iron_nugget"), 4));
            	return inventory;
            }
            
            case 14:
            {
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("minecraft:shears"), 1));
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("minecraft:leather_boots"), 1));
            	return inventory;
            }
            
            case 15:
            {
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("minecraft:writable_book"), 1));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:leather"), 3));
            	inventory.setInventorySlotContents(9, new ItemStack(ItemParser.getItemFromName("minecraft:cake"), 1));
            	return inventory;
            }
            
            case 16:
            {
            	inventory.setInventorySlotContents(25, new ItemStack(ItemParser.getItemFromName("minecraft:phantom_membrane"), 1));
            	inventory.setInventorySlotContents(16, new ItemStack(ItemParser.getItemFromName("minecraft:feather"), 1));
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("minecraft:writable_book"), 1));
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_axe"), 1));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_axe"), 1));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("minecraft:sweet_berries"), 3));
            	return inventory;
            }
            
            case 17:
            {
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("minecraft:leather"), 7));
            	return inventory;
            }
            
            case 18:
            {
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("minecraft:leather_helmet"), 1));
            	inventory.setInventorySlotContents(6, new ItemStack(ItemParser.getItemFromName("minecraft:slime_ball"), 1));
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("minecraft:cocoa_beans"), 3));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:shears"), 1));
            	return inventory;
            }
            
            case 19:
            {
            	inventory.setInventorySlotContents(5, new ItemStack(ItemParser.getItemFromName("minecraft:rotten_flesh"), 2));
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("minecraft:leather_leggings"), 1));
            	inventory.setInventorySlotContents(23, new ItemStack(ItemParser.getItemFromName("minecraft:gunpowder"), 1));
            	inventory.setInventorySlotContents(0, new ItemStack(ItemParser.getItemFromName("minecraft:map"), 1));
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("odysseymod:bronze_coin"), 8));
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("minecraft:rabbit_hide"), 1));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("minecraft:string"), 6));
            	return inventory;
            }
            
        }

        inventory.setInventorySlotContents(1, ItemStack.EMPTY);
        return inventory;
    }

    private static IInventory loot2(IInventory inventory)
    {
    	Random rand = new Random();
        int chance = rand.nextInt(19);

        switch (chance)
        {
            case 0:
            {
            	inventory.setInventorySlotContents(5, new ItemStack(ItemParser.getItemFromName("iceandfire:amethyst_gem"), 1));
            	inventory.setInventorySlotContents(1, new ItemStack(ItemParser.getItemFromName("minecraft:end_rod"), 1));
            	inventory.setInventorySlotContents(16, new ItemStack(ItemParser.getItemFromName("minecraft:chainmail_boots"), 1));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:iron_shovel"), 1));
            	return inventory;
            }
            case 1:
            {
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("odysseymod:topaz"), 1));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("minecraft:iron_chestplate"), 1));
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("minecraft:quartz"), 1));
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_white"), 1));
            	return inventory;
            }


            case 2:
            {
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:iron_sword"), 1));
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("iceandfire:deathworm_gauntlet_red"), 1));
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("minecraft:iron_leggings"), 1));
            	inventory.setInventorySlotContents(0, new ItemStack(ItemParser.getItemFromName("odysseymod:silver_coin"), 1));
            	return inventory;
            }


            case 3:
            {
            	inventory.setInventorySlotContents(9, new ItemStack(ItemParser.getItemFromName("minecraft:blaze_rod"), 1));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:iron_pickaxe"), 1));
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("minecraft:skeleton_skull"), 1));
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("minecraft:chainmail_helmet"), 1));
            	return inventory;
            }

            case 4:
            {
            	inventory.setInventorySlotContents(21, new ItemStack(ItemParser.getItemFromName("minecraft:chainmail_chestplate"), 1));
            	inventory.setInventorySlotContents(12, new ItemStack(ItemParser.getItemFromName("minecraft:firework_star"), 1));
            	inventory.setInventorySlotContents(17, new ItemStack(ItemParser.getItemFromName("iceandfire:manuscript"), 1));
            	inventory.setInventorySlotContents(23, new ItemStack(ItemParser.getItemFromName("iceandfire:dread_shard"), 1));
            	return inventory;
            }

            case 5:
            {
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("minecraft:firework_star"), 1));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("iceandfire:armor_copper_metal_leggings"), 1));
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("minecraft:skeleton_skull"), 1));
            	inventory.setInventorySlotContents(16, new ItemStack(ItemParser.getItemFromName("minecraft:firework_rocket"), 1));
            	return inventory;
            }
            
            case 6:
            {
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("iceandfire:troll_leather_forest"), 1));
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("minecraft:iron_shovel"), 1));
            	inventory.setInventorySlotContents(21, new ItemStack(ItemParser.getItemFromName("minecraft:blaze_rod"), 1));
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("minecraft:gold_nugget"), 3));
            	return inventory;
            }
            
            case 7:
            {
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("minecraft:firework_rocket"), 1));
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("minecraft:creeper_head"), 1));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:glistering_melon_slice"), 1));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("minecraft:spectral_arrow"), 1));
            	return inventory;
            }
            
            case 8:
            {
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("minecraft:golden_carrot"), 1));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("minecraft:prismarine_shard"), 1));
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("minecraft:firework_rocket"), 1));
            	inventory.setInventorySlotContents(6, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_sword"), 1));
            	return inventory;
            }
            
            case 9:
            {
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("minecraft:skeleton_skull"), 1));
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("iceandfire:amphithere_arrow"), 1));
            	inventory.setInventorySlotContents(9, new ItemStack(ItemParser.getItemFromName("odysseymod:silver_coin"), 1));
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("minecraft:chainmail_leggings"), 1));
            	return inventory;
            }
            
            case 10:
            {
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("iceandfire:manuscript"), 1));
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("minecraft:iron_leggings"), 1));
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_shovel"), 1));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:firework_rocket"), 1));
            	return inventory;
            }
            
            case 11:
            {
            	inventory.setInventorySlotContents(1, new ItemStack(ItemParser.getItemFromName("minecraft:blaze_powder"), 1));
            	inventory.setInventorySlotContents(5, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_shovel"), 1));
            	inventory.setInventorySlotContents(25, new ItemStack(ItemParser.getItemFromName("iceandfire:amphithere_feather"), 1));
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("minecraft:golden_apple"), 1));
            	return inventory;
            }
            
            case 12:
            {
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("minecraft:firework_star"), 1));
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("iceandfire:amethyst_gem"), 1));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("minecraft:iron_shovel"), 1));
            	inventory.setInventorySlotContents(12, new ItemStack(ItemParser.getItemFromName("minecraft:experience_bottle"), 13));
            	return inventory;
            }
            
            case 13:
            {
            	inventory.setInventorySlotContents(21, new ItemStack(ItemParser.getItemFromName("minecraft:compass"), 1));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("iceandfire:dread_sword"), 1));
            	inventory.setInventorySlotContents(6, new ItemStack(ItemParser.getItemFromName("minecraft:wither_skeleton_skull"), 1));
            	inventory.setInventorySlotContents(16, new ItemStack(ItemParser.getItemFromName("minecraft:iron_ingot"), 9));
            	return inventory;
            }
            
            case 14:
            {
            	inventory.setInventorySlotContents(9, new ItemStack(ItemParser.getItemFromName("iceandfire:cockatrice_scepter"), 1));
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("minecraft:chainmail_boots"), 1));
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("minecraft:gold_nugget"), 12));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("odysseymod:bronze_coin"), 4));
            	return inventory;
            }
            
            case 15:
            {
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("minecraft:golden_carrot"), 1));
            	inventory.setInventorySlotContents(25, new ItemStack(ItemParser.getItemFromName("minecraft:ender_pearl"), 1));
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("minecraft:iron_helmet"), 1));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:clock"), 1));
            	return inventory;
            }
            
            case 16:
            {
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("iceandfire:armor_copper_metal_chestplate"), 1));
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("minecraft:clock"), 1));
            	inventory.setInventorySlotContents(12, new ItemStack(ItemParser.getItemFromName("odysseymod:bronze_coin"), 15));
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("iceandfire:stymphalian_bird_feather"), 1));
            	return inventory;
            }
            
            case 17:
            {
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("iceandfire:dread_shard"), 1));
            	inventory.setInventorySlotContents(17, new ItemStack(ItemParser.getItemFromName("minecraft:glowstone_dust"), 1));
            	inventory.setInventorySlotContents(0, new ItemStack(ItemParser.getItemFromName("iceandfire:amphithere_feather"), 1));
            	inventory.setInventorySlotContents(23, new ItemStack(ItemParser.getItemFromName("iceandfire:copper_sword"), 1));
            	return inventory;
            }
            
            case 18:
            {
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("iceandfire:troll_tusk"), 1));
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("iceandfire:armor_copper_metal_helmet"), 1));
            	inventory.setInventorySlotContents(6, new ItemStack(ItemParser.getItemFromName("minecraft:iron_boots"), 1));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("iceandfire:dread_key"), 1));
            	return inventory;
            }
            
            case 19:
            {
            	inventory.setInventorySlotContents(1, new ItemStack(ItemParser.getItemFromName("minecraft:iron_helmet"), 1));
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("iceandfire:stymphalian_bird_feather"), 1));
            	inventory.setInventorySlotContents(16, new ItemStack(ItemParser.getItemFromName("minecraft:iron_hoe"), 1));
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("minecraft:ender_pearl"), 1));
            	return inventory;
            }
            
        }

        inventory.setInventorySlotContents(1, ItemStack.EMPTY);
        return inventory;
    }
    
    private static IInventory loot3(IInventory inventory)
    {
    	Random rand = new Random();
        int chance = rand.nextInt(36);

        switch (chance)
        {
            case 0:
            {
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("minecraft:diamond_hoe"), 1));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:diamond_leggings"), 1));
            	return inventory;
            }
            case 1:
            {
            	inventory.setInventorySlotContents(17, new ItemStack(ItemParser.getItemFromName("iceandfire:tide_trident"), 1));
            	inventory.setInventorySlotContents(6, new ItemStack(ItemParser.getItemFromName("minecraft:diamond_hoe"), 1));
            	return inventory;
            }


            case 2:
            {
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("iceandfire:myrmex_desert_swarm"), 1));
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("odysseymod:ruby"), 1));
            	return inventory;
            }


            case 3:
            {
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("odysseymod:silver_coin"), 10));
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("iceandfire:silver_hoe"), 1));
            	return inventory;
            }

            case 4:
            {
            	inventory.setInventorySlotContents(12, new ItemStack(ItemParser.getItemFromName("iceandfire:silver_pickaxe"), 1));
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("iceandfire:sea_serpent_arrow"), 1));
            	return inventory;
            }

            case 5:
            {
            	inventory.setInventorySlotContents(25, new ItemStack(ItemParser.getItemFromName("iceandfire:amphithere_macuahuitl"), 1));
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("minecraft:golden_boots"), 1));
            	return inventory;
            }
            
            case 6:
            {
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("iceandfire:myrmex_jungle_swarm"), 1));
            	inventory.setInventorySlotContents(5, new ItemStack(ItemParser.getItemFromName("minecraft:netherite_scrap"), 1));
            	return inventory;
            }
            
            case 7:
            {
            	inventory.setInventorySlotContents(9, new ItemStack(ItemParser.getItemFromName("odysseymod:ruby"), 1));
            	inventory.setInventorySlotContents(11, new ItemStack(ItemParser.getItemFromName("odysseymod:gold_coin"), 1));
            	return inventory;
            }
            
            case 8:
            {
            	inventory.setInventorySlotContents(0, new ItemStack(ItemParser.getItemFromName("minecraft:golden_shovel"), 1));
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("odysseymod:gold_coin"), 1));
            	return inventory;
            }
            
            case 9:
            {
            	inventory.setInventorySlotContents(24, new ItemStack(ItemParser.getItemFromName("minecraft:totem_of_undying"), 1));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:diamond_pickaxe"), 1));
            	return inventory;
            }
            
            case 10:
            {
            	inventory.setInventorySlotContents(10, new ItemStack(ItemParser.getItemFromName("minecraft:nether_star"), 1));
            	inventory.setInventorySlotContents(1, new ItemStack(ItemParser.getItemFromName("minecraft:golden_shovel"), 1));
            	return inventory;
            }
            
            case 11:
            {
            	inventory.setInventorySlotContents(13, new ItemStack(ItemParser.getItemFromName("minecraft:netherite_scrap"), 1));
            	inventory.setInventorySlotContents(23, new ItemStack(ItemParser.getItemFromName("odysseymod:ruby"), 1));
            	return inventory;
            }
            
            case 12:
            {
            	inventory.setInventorySlotContents(14, new ItemStack(ItemParser.getItemFromName("minecraft:golden_helmet"), 1));
            	inventory.setInventorySlotContents(25, new ItemStack(ItemParser.getItemFromName("minecraft:diamond_chestplate"), 1));
            	return inventory;
            }
            
            case 13:
            {
            	inventory.setInventorySlotContents(16, new ItemStack(ItemParser.getItemFromName("odysseymod:silver_coin"), 10));
            	inventory.setInventorySlotContents(17, new ItemStack(ItemParser.getItemFromName("minecraft:emerald"), 1));
            	return inventory;
            }
            
            case 14:
            {
            	inventory.setInventorySlotContents(20, new ItemStack(ItemParser.getItemFromName("iceandfire:sea_serpent_arrow"), 1));
            	inventory.setInventorySlotContents(22, new ItemStack(ItemParser.getItemFromName("minecraft:crying_obsidian"), 1));
            	return inventory;
            }
            
            case 15:
            {
            	inventory.setInventorySlotContents(7, new ItemStack(ItemParser.getItemFromName("minecraft:totem_of_undying"), 1));
            	inventory.setInventorySlotContents(8, new ItemStack(ItemParser.getItemFromName("minecraft:trident"), 1));
            	return inventory;
            }
            
            case 16:
            {
            	inventory.setInventorySlotContents(2, new ItemStack(ItemParser.getItemFromName("minecraft:golden_chestplate"), 1));
            	inventory.setInventorySlotContents(15, new ItemStack(ItemParser.getItemFromName("iceandfire:armor_silver_metal_chestplate"), 1));
            	return inventory;
            }
            
            case 17:
            {
            	inventory.setInventorySlotContents(3, new ItemStack(ItemParser.getItemFromName("iceandfire:amphithere_macuahuitl"), 1));
            	inventory.setInventorySlotContents(18, new ItemStack(ItemParser.getItemFromName("minecraft:golden_chestplate"), 1));
            	return inventory;
            }
            
            case 18:
            {
            	inventory.setInventorySlotContents(6, new ItemStack(ItemParser.getItemFromName("minecraft:enchanted_golden_apple"), 1));
            	inventory.setInventorySlotContents(4, new ItemStack(ItemParser.getItemFromName("iceandfire:armor_silver_metal_leggings"), 1));
            	return inventory;
            }
            
            case 19:
            {
            	inventory.setInventorySlotContents(19, new ItemStack(ItemParser.getItemFromName("iceandfire:armor_silver_metal_chestplate"), 1));
            	inventory.setInventorySlotContents(5, new ItemStack(ItemParser.getItemFromName("iceandfire:armor_silver_metal_leggings"), 1));
            	return inventory;
            }
            
        }

        inventory.setInventorySlotContents(1, ItemStack.EMPTY);
        return inventory;
    }

}
