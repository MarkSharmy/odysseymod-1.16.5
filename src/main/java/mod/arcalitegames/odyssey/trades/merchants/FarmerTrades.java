package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class FarmerTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getFarmingTools()
	{
		INSTANCE.addAll(  
				 new MerchantProduct(Items.WOODEN_SHOVEL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WOODEN_SHOVEL, 8, false); })),
       		     new MerchantProduct(Items.WOODEN_HOE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WOODEN_HOE, 16, false); })),
       		     new MerchantProduct(Items.STONE_SHOVEL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_SHOVEL, 8, false); })),
       		     new MerchantProduct(Items.STONE_HOE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_HOE, 16, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_shovel"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_shovel"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:copper_hoe"), CoinType.BRONZE, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:copper_hoe"), 128, false); })),
		     	 new MerchantProduct(Items.GOLDEN_SHOVEL, CoinType.GOLD, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_SHOVEL, 8, false); })),
		     	 new MerchantProduct(Items.GOLDEN_HOE, CoinType.GOLD, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GOLDEN_HOE, 16, false); })),
		     	 new MerchantProduct(Items.IRON_SHOVEL, CoinType.BRONZE, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_SHOVEL, 128, false); })),
		     	 new MerchantProduct(Items.IRON_HOE, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.IRON_HOE, 256, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_shovel"), CoinType.SILVER, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_shovel"), 16, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:silver_hoe"), CoinType.SILVER, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:silver_hoe"), 32, false); })),
		     	 new MerchantProduct(Items.DIAMOND_SHOVEL, CoinType.GOLD, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_SHOVEL, 40, false); })),
		     	 new MerchantProduct(Items.DIAMOND_HOE, CoinType.GOLD, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIAMOND_HOE, 80, false); })),
		     	 new MerchantProduct(Items.NETHERITE_SHOVEL, CoinType.GOLD, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_SHOVEL, 64, false); })),
		     	 new MerchantProduct(Items.NETHERITE_HOE, CoinType.GOLD, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHERITE_HOE, 128, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_shovel"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_shovel"), 8, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_hoe"), CoinType.GOLD, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_fire_hoe"), 16, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_shovel"), CoinType.GOLD, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_shovel"), 8, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_hoe"), CoinType.GOLD, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_ice_hoe"), 16, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_shovel"), CoinType.GOLD, 16, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_shovel"), 16, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_hoe"), CoinType.GOLD, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dragonsteel_lightning_hoe"), 32, false); })), 
				 new MerchantProduct(Items.SHEARS, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SHEARS, 256, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getFarmingSeeds()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.BONE_MEAL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BONE_MEAL, 8, false); })),
				 new MerchantProduct(Items.WHEAT_SEEDS, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WHEAT_SEEDS, 20, false); })),
       		 new MerchantProduct(Items.MELON_SEEDS, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MELON_SEEDS, 20, false); })),
       		 new MerchantProduct(Items.PUMPKIN_SEEDS, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PUMPKIN_SEEDS, 20, false); })),
       		 new MerchantProduct(Items.BEETROOT_SEEDS, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BEETROOT_SEEDS, 20, false); })),
				 new MerchantProduct(Items.CARROT, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CARROT, 64, false); })),
       		 new MerchantProduct(Items.POTATO, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POTATO, 64, false); })),
				 new MerchantProduct(Items.BEETROOT, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BEETROOT, 64, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getFarmingFences()
	{
		INSTANCE.addAll( 
			 new MerchantProduct(Items.OAK_FENCE, CoinType.BRONZE, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_FENCE, 12, false); })),
       		 new MerchantProduct(Items.SPRUCE_FENCE, CoinType.BRONZE, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_FENCE, 12, false); })),
       		 new MerchantProduct(Items.BIRCH_FENCE, CoinType.BRONZE, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_FENCE, 12, false); })),
       		 new MerchantProduct(Items.JUNGLE_FENCE, CoinType.BRONZE, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_FENCE, 12, false); })),
       		 new MerchantProduct(Items.DARK_OAK_FENCE, CoinType.BRONZE, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_FENCE, 12, false); })),
       		 new MerchantProduct(Items.ACACIA_FENCE, CoinType.BRONZE, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_FENCE, 12, false); })),
       		 new MerchantProduct(Items.CRIMSON_FENCE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_FENCE, 24, false); })),
       		 new MerchantProduct(Items.WARPED_FENCE, CoinType.BRONZE, 24, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_FENCE, 24, false); })),
       		 new MerchantProduct(Items.NETHER_BRICK_FENCE, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_BRICK_FENCE, 48, false); })),
			 new MerchantProduct(Items.OAK_FENCE_GATE, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_FENCE_GATE, 48, false); })),
       		 new MerchantProduct(Items.SPRUCE_FENCE_GATE, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_FENCE_GATE, 48, false); })),
       		 new MerchantProduct(Items.BIRCH_FENCE_GATE, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_FENCE_GATE, 48, false); })),
       		 new MerchantProduct(Items.JUNGLE_FENCE_GATE, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_FENCE_GATE, 48, false); })),
       		 new MerchantProduct(Items.DARK_OAK_FENCE_GATE, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_FENCE_GATE, 48, false); })),
       		 new MerchantProduct(Items.ACACIA_FENCE_GATE, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_FENCE_GATE, 48, false); })),
       		 new MerchantProduct(Items.CRIMSON_FENCE_GATE, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_FENCE_GATE, 1, false); })),
       		 new MerchantProduct(Items.WARPED_FENCE_GATE, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_FENCE_GATE, 1, false); })),
			 new MerchantProduct(Items.COBBLESTONE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COBBLESTONE_WALL, 8, false); })),
       		 new MerchantProduct(Items.MOSSY_COBBLESTONE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MOSSY_COBBLESTONE_WALL, 8, false); })),
       		 new MerchantProduct(Items.BRICK_WALL, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BRICK_WALL, 64, false); })),
       		 new MerchantProduct(Items.PRISMARINE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PRISMARINE_WALL, 8, false); })),
       		 new MerchantProduct(Items.RED_SANDSTONE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_SANDSTONE_WALL, 8, false); })),
       		 new MerchantProduct(Items.MOSSY_STONE_BRICK_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MOSSY_STONE_BRICK_WALL, 8, false); })),
       		 new MerchantProduct(Items.GRANITE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRANITE_WALL, 8, false); })),
       		 new MerchantProduct(Items.STONE_BRICK_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_BRICK_WALL, 8, false); })),
       		 new MerchantProduct(Items.NETHER_BRICK_WALL, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_BRICK_WALL, 64, false); })),
       		 new MerchantProduct(Items.SANDSTONE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SANDSTONE_WALL, 8, false); })),
       		 new MerchantProduct(Items.END_STONE_BRICK_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.END_STONE_BRICK_WALL, 8, false); })),
       		 new MerchantProduct(Items.DIORITE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DIORITE_WALL, 8, false); })),
       		 new MerchantProduct(Items.BLACKSTONE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLACKSTONE_WALL, 8, false); })),
       		 new MerchantProduct(Items.POLISHED_BLACKSTONE_WALL, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POLISHED_BLACKSTONE_WALL, 8, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getFarmingAnimals()
	{
		INSTANCE.addAll(
				new MerchantProduct(Items.COW_SPAWN_EGG, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COW_SPAWN_EGG, 12, false); })),
       		 new MerchantProduct(Items.SHEEP_SPAWN_EGG, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SHEEP_SPAWN_EGG, 12, false); })),
       		 new MerchantProduct(Items.PIG_SPAWN_EGG, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PIG_SPAWN_EGG, 12, false); })),
       		 new MerchantProduct(Items.CHICKEN_SPAWN_EGG, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHICKEN_SPAWN_EGG, 4, false); })),
       		 new MerchantProduct(Items.MULE_SPAWN_EGG, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MULE_SPAWN_EGG, 12, false); })),
       		 new MerchantProduct(Items.HORSE_SPAWN_EGG, CoinType.SILVER, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.HORSE_SPAWN_EGG, 12, false); })),
       		 new MerchantProduct(Items.RABBIT_SPAWN_EGG, CoinType.SILVER, 6, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RABBIT_SPAWN_EGG, 6, false); })),
       		 new MerchantProduct(Items.WOLF_SPAWN_EGG, CoinType.SILVER, 6, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WOLF_SPAWN_EGG, 6, false); })),
       		 new MerchantProduct(Items.CAT_SPAWN_EGG, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CAT_SPAWN_EGG, 4, false); })),
       		 new MerchantProduct(Items.PARROT_SPAWN_EGG, CoinType.SILVER, 2, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PARROT_SPAWN_EGG, 2, false); }))
		);
		
		return INSTANCE.LIST;
	}

    public static final FarmerTrades INSTANCE = new FarmerTrades();

}
