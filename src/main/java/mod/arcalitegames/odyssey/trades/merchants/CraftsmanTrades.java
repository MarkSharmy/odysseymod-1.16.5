package mod.arcalitegames.odyssey.trades.merchants;

import mod.arcalitegames.odyssey.enums.CoinType;
import mod.arcalitegames.odyssey.trades.TradeManager;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import mod.arcalitegames.system.parser.ItemParser;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.item.Items;

public class CraftsmanTrades extends TradeOption
{
	public static MerchantSet<MerchantProduct> getWoodenBlocks()
	{
		INSTANCE.addAll( 
			 new MerchantProduct(Items.OAK_PLANKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_PLANKS, 8, false); })),
       		 new MerchantProduct(Items.SPRUCE_PLANKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_PLANKS, 8, false); })),
       		 new MerchantProduct(Items.BIRCH_PLANKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_PLANKS, 8, false); })),
       		 new MerchantProduct(Items.JUNGLE_PLANKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_PLANKS, 8, false); })),
       		 new MerchantProduct(Items.ACACIA_PLANKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_PLANKS, 8, false); })),
       		 new MerchantProduct(Items.DARK_OAK_PLANKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_PLANKS, 8, false); })),
       		 new MerchantProduct(Items.CRIMSON_PLANKS, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_PLANKS, 16, false); })),
       		 new MerchantProduct(Items.WARPED_PLANKS, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_PLANKS, 16, false); })),
			 new MerchantProduct(Items.OAK_LOG, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_LOG, 32, false); })),
       		 new MerchantProduct(Items.SPRUCE_LOG, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_LOG, 32, false); })),
       		 new MerchantProduct(Items.BIRCH_LOG, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_LOG, 32, false); })),
       		 new MerchantProduct(Items.JUNGLE_LOG, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_LOG, 32, false); })),
       		 new MerchantProduct(Items.ACACIA_LOG, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_LOG, 32, false); })),
       		 new MerchantProduct(Items.DARK_OAK_LOG, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_LOG, 32, false); })),
       		 new MerchantProduct(Items.CRIMSON_STEM, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_STEM, 64, false); })),
       		 new MerchantProduct(Items.WARPED_STEM, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_STEM, 64, false); })),
       		 new MerchantProduct(Items.OAK_WOOD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_WOOD, 8, false); })),
       		 new MerchantProduct(Items.SPRUCE_WOOD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_WOOD, 8, false); })),
       		 new MerchantProduct(Items.BIRCH_WOOD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_WOOD, 8, false); })),
       		 new MerchantProduct(Items.JUNGLE_WOOD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_WOOD, 8, false); })),
       		 new MerchantProduct(Items.DARK_OAK_WOOD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_WOOD, 8, false); })),
       		 new MerchantProduct(Items.ACACIA_WOOD, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_WOOD, 8, false); })),
       		 new MerchantProduct(Items.CRIMSON_HYPHAE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_HYPHAE, 16, false); })),
       		 new MerchantProduct(Items.WARPED_HYPHAE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_HYPHAE, 16, false); })),
       		 new MerchantProduct(Items.STRIPPED_OAK_LOG, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_OAK_LOG, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_SPRUCE_LOG, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_SPRUCE_LOG, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_BIRCH_LOG, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_BIRCH_LOG, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_JUNGLE_LOG, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_JUNGLE_LOG, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_DARK_OAK_LOG, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_DARK_OAK_LOG, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_ACACIA_LOG, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_ACACIA_LOG, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_CRIMSON_STEM, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_CRIMSON_STEM, 20, false); })),
       		 new MerchantProduct(Items.STRIPPED_WARPED_STEM, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_WARPED_STEM, 20, false); })),
       		 new MerchantProduct(Items.STRIPPED_OAK_WOOD, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_OAK_WOOD, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_SPRUCE_WOOD, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_SPRUCE_WOOD, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_BIRCH_WOOD, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_BIRCH_WOOD, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_JUNGLE_WOOD, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_JUNGLE_WOOD, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_DARK_OAK_WOOD, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_DARK_OAK_WOOD, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_ACACIA_WOOD, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_ACACIA_WOOD, 9, false); })),
       		 new MerchantProduct(Items.STRIPPED_CRIMSON_HYPHAE, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_CRIMSON_HYPHAE, 20, false); })),
       		 new MerchantProduct(Items.STRIPPED_WARPED_HYPHAE, CoinType.BRONZE, 20, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STRIPPED_WARPED_HYPHAE, 20, false); })),
			 new MerchantProduct(Items.OAK_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OAK_SLAB, 4, false); })),
       		 new MerchantProduct(Items.SPRUCE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SPRUCE_SLAB, 4, false); })),
       		 new MerchantProduct(Items.BIRCH_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BIRCH_SLAB, 4, false); })),
       		 new MerchantProduct(Items.JUNGLE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.JUNGLE_SLAB, 4, false); })),
       		 new MerchantProduct(Items.ACACIA_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ACACIA_SLAB, 4, false); })),
       		 new MerchantProduct(Items.DARK_OAK_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_OAK_SLAB, 4, false); })),
       		 new MerchantProduct(Items.CRIMSON_SLAB, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRIMSON_SLAB, 8, false); })),
       		 new MerchantProduct(Items.WARPED_SLAB, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_SLAB, 8, false); })),
			 new MerchantProduct(ItemParser.getItemFromName("odysseymod:oak_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:oak_vertical_slab"), 4, false); })),
		     new MerchantProduct(ItemParser.getItemFromName("odysseymod:spruce_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:spruce_vertical_slab"), 4, false); })),
		     new MerchantProduct(ItemParser.getItemFromName("odysseymod:birch_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:birch_vertical_slab"), 4, false); })),
		     new MerchantProduct(ItemParser.getItemFromName("odysseymod:jungle_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:jungle_vertical_slab"), 4, false); })),
		     new MerchantProduct(ItemParser.getItemFromName("odysseymod:acacia_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:acacia_vertical_slab"), 4, false); })),
		     new MerchantProduct(ItemParser.getItemFromName("odysseymod:dark_oak_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:dark_oak_vertical_slab"), 4, false); })),
		     new MerchantProduct(ItemParser.getItemFromName("odysseymod:crimson_vertical_slab"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:crimson_vertical_slab"), 8, false); })),
		     new MerchantProduct(ItemParser.getItemFromName("odysseymod:warped_vertical_slab"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:warped_vertical_slab"), 8, false); }))
			);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getStoneBlocks()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.STONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE, 8, false); })),
				new MerchantProduct(Items.COBBLESTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COBBLESTONE, 8, false); })),
				new MerchantProduct(Items.SANDSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SANDSTONE, 8, false); })),
        		new MerchantProduct(Items.SMOOTH_RED_SANDSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SMOOTH_RED_SANDSTONE, 8, false); })),
        		new MerchantProduct(Items.SMOOTH_SANDSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SMOOTH_SANDSTONE, 8, false); })),
        		new MerchantProduct(Items.SMOOTH_STONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SMOOTH_STONE, 8, false); })),
				new MerchantProduct(Items.BLACKSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLACKSTONE, 8, false); })),
        		new MerchantProduct(Items.MOSSY_COBBLESTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MOSSY_COBBLESTONE, 8, false); })),
				new MerchantProduct(Items.STONE_BRICKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_BRICKS, 8, false); })),
        		new MerchantProduct(Items.MOSSY_STONE_BRICKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MOSSY_STONE_BRICKS, 8, false); })),
				new MerchantProduct(Items.CRACKED_STONE_BRICKS, CoinType.BRONZE, 12, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRACKED_STONE_BRICKS, 12, false); })),
        		new MerchantProduct(Items.CHISELED_STONE_BRICKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHISELED_STONE_BRICKS, 8, false); })),
				new MerchantProduct(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, CoinType.BRONZE, 9, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, 9, false); })),
				new MerchantProduct(Items.RED_SANDSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_SANDSTONE, 8, false); })),
        		new MerchantProduct(Items.CHISELED_RED_SANDSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHISELED_RED_SANDSTONE, 8, false); })),
				new MerchantProduct(Items.PRISMARINE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PRISMARINE, 8, false); })),    		
				new MerchantProduct(Items.GILDED_BLACKSTONE, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GILDED_BLACKSTONE, 16, false); })),
        		new MerchantProduct(Items.POLISHED_BLACKSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POLISHED_BLACKSTONE, 8, false); })),
        		new MerchantProduct(Items.POLISHED_BLACKSTONE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POLISHED_BLACKSTONE_SLAB, 4, false); })),
        		new MerchantProduct(Items.CHISELED_POLISHED_BLACKSTONE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHISELED_POLISHED_BLACKSTONE, 8, false); })),
        		new MerchantProduct(Items.POLISHED_BLACKSTONE_BRICKS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.POLISHED_BLACKSTONE_BRICKS, 8, false); })),
				new MerchantProduct(Items.STONE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.STONE_SLAB, 4, false); })),
        		new MerchantProduct(Items.SMOOTH_STONE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SMOOTH_STONE_SLAB, 4, false); })),
        		new MerchantProduct(Items.SANDSTONE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SANDSTONE_SLAB, 4, false); })),
        		new MerchantProduct(Items.CUT_SANDSTONE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CUT_SANDSTONE_SLAB, 4, false); })),
         		new MerchantProduct(Items.RED_SANDSTONE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_SANDSTONE_SLAB, 4, false); })),
        		new MerchantProduct(Items.CUT_RED_SANDSTONE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CUT_RED_SANDSTONE_SLAB, 4, false); })),
        		new MerchantProduct(Items.PRISMARINE_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PRISMARINE_SLAB, 4, false); })),
				new MerchantProduct(ItemParser.getItemFromName("odysseymod:stone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:stone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:smooth_stone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:smooth_stone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:sandstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:sandstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:cut_sandstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:cut_sandstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:cobblestone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:cobblestone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:stone_bricks_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:stone_bricks_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:red_sandstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:red_sandstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:cut_red_sandstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:cut_red_sandstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:prismarine_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:prismarine_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:polished_granite_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:polished_granite_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:smooth_red_sandstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:smooth_red_sandstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:mossy_stone_bricks_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:mossy_stone_bricks_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:polished_diorite_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:polished_diorite_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:mossy_cobblestone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:mossy_cobblestone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:end_stone_bricks_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:end_stone_bricks_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:smooth_sandstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:smooth_sandstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:granite_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:granite_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:andsite_vertical_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:andsite_vertical_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:red_nether_bricks_vertical_slab"), CoinType.BRONZE, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:red_nether_bricks_vertical_slab"), 32, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:polished_andsite_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:polished_andsite_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:diorite_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:diorite_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:crimson_vertical_slab"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:crimson_vertical_slab"), 8, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:warped_vertical_slab"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:warped_vertical_slab"), 8, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:blackstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:blackstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:polished_blackstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:polished_blackstone_vertical_slab"), 4, false); })),
 		     	new MerchantProduct(ItemParser.getItemFromName("odysseymod:polished_blackstone_vertical_slab"), CoinType.BRONZE, 4, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:polished_blackstone_vertical_slab"), 4, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getDecorationBlocks()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.WHITE_WOOL, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WHITE_WOOL, 32, false); })),
       		 new MerchantProduct(Items.ORANGE_WOOL, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ORANGE_WOOL, 48, false); })),
       		 new MerchantProduct(Items.MAGENTA_WOOL, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAGENTA_WOOL, 48, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_WOOL, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_WOOL, 48, false); })),
       		 new MerchantProduct(Items.YELLOW_WOOL, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.YELLOW_WOOL, 40, false); })),
       		 new MerchantProduct(Items.LIME_WOOL, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIME_WOOL, 48, false); })),
       		 new MerchantProduct(Items.PINK_WOOL, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PINK_WOOL, 48, false); })),
       		 new MerchantProduct(Items.GRAY_WOOL, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRAY_WOOL, 56, false); })),
       		 new MerchantProduct(Items.LIGHT_GRAY_WOOL, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_GRAY_WOOL, 72, false); })),
       		 new MerchantProduct(Items.CYAN_WOOL, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CYAN_WOOL, 64, false); })),
       		 new MerchantProduct(Items.PURPLE_WOOL, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PURPLE_WOOL, 56, false); })),
       		 new MerchantProduct(Items.BLUE_WOOL, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLUE_WOOL, 64, false); })),
       		 new MerchantProduct(Items.BROWN_WOOL, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BROWN_WOOL, 64, false); })),
       		 new MerchantProduct(Items.GREEN_WOOL, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GREEN_WOOL, 64, false); })),
       		 new MerchantProduct(Items.RED_WOOL, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_WOOL, 40, false); })),
       		 new MerchantProduct(Items.BLACK_WOOL, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLACK_WOOL, 64, false); })),
			 new MerchantProduct(Items.WHITE_TERRACOTTA, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WHITE_TERRACOTTA, 32, false); })),
       		 new MerchantProduct(Items.ORANGE_TERRACOTTA, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ORANGE_TERRACOTTA, 48, false); })),
       		 new MerchantProduct(Items.MAGENTA_TERRACOTTA, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAGENTA_TERRACOTTA, 48, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_TERRACOTTA, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_TERRACOTTA, 48, false); })),
       		 new MerchantProduct(Items.YELLOW_TERRACOTTA, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.YELLOW_TERRACOTTA, 40, false); })),
       		 new MerchantProduct(Items.LIME_TERRACOTTA, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIME_TERRACOTTA, 48, false); })),
       		 new MerchantProduct(Items.PINK_TERRACOTTA, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PINK_TERRACOTTA, 48, false); })),
       		 new MerchantProduct(Items.GRAY_TERRACOTTA, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRAY_TERRACOTTA, 56, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_TERRACOTTA, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_TERRACOTTA, 72, false); })),
       		 new MerchantProduct(Items.CYAN_TERRACOTTA, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CYAN_TERRACOTTA, 64, false); })),
       		 new MerchantProduct(Items.PURPLE_TERRACOTTA, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PURPLE_TERRACOTTA, 56, false); })),
       		 new MerchantProduct(Items.BLUE_TERRACOTTA, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLUE_TERRACOTTA, 64, false); })),
       		 new MerchantProduct(Items.BROWN_TERRACOTTA, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BROWN_TERRACOTTA, 64, false); })),
       		 new MerchantProduct(Items.GREEN_TERRACOTTA, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GREEN_TERRACOTTA, 64, false); })),
       		 new MerchantProduct(Items.RED_TERRACOTTA, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_TERRACOTTA, 40, false); })),
       		 new MerchantProduct(Items.BLACK_TERRACOTTA, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLACK_TERRACOTTA, 64, false); })),
			 new MerchantProduct(Items.WHITE_GLAZED_TERRACOTTA, CoinType.BRONZE, 40, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WHITE_GLAZED_TERRACOTTA, 40, false); })),
       		 new MerchantProduct(Items.ORANGE_GLAZED_TERRACOTTA, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ORANGE_GLAZED_TERRACOTTA, 56, false); })),
       		 new MerchantProduct(Items.MAGENTA_GLAZED_TERRACOTTA, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAGENTA_GLAZED_TERRACOTTA, 56, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_GLAZED_TERRACOTTA, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_GLAZED_TERRACOTTA, 56, false); })),
       		 new MerchantProduct(Items.YELLOW_GLAZED_TERRACOTTA, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.YELLOW_GLAZED_TERRACOTTA, 48, false); })),
       		 new MerchantProduct(Items.LIME_GLAZED_TERRACOTTA, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIME_GLAZED_TERRACOTTA, 56, false); })),
       		 new MerchantProduct(Items.PINK_GLAZED_TERRACOTTA, CoinType.BRONZE, 56, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PINK_GLAZED_TERRACOTTA, 56, false); })),
       		 new MerchantProduct(Items.GRAY_GLAZED_TERRACOTTA, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRAY_GLAZED_TERRACOTTA, 64, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_GLAZED_TERRACOTTA, CoinType.BRONZE, 80, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_GLAZED_TERRACOTTA, 80, false); })),
       		 new MerchantProduct(Items.CYAN_GLAZED_TERRACOTTA, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CYAN_GLAZED_TERRACOTTA, 72, false); })),
       		 new MerchantProduct(Items.PURPLE_GLAZED_TERRACOTTA, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PURPLE_GLAZED_TERRACOTTA, 64, false); })),
       		 new MerchantProduct(Items.BLUE_GLAZED_TERRACOTTA, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLUE_GLAZED_TERRACOTTA, 72, false); })),
       		 new MerchantProduct(Items.BROWN_GLAZED_TERRACOTTA, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BROWN_GLAZED_TERRACOTTA, 72, false); })),
       		 new MerchantProduct(Items.GREEN_GLAZED_TERRACOTTA, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GREEN_GLAZED_TERRACOTTA, 72, false); })),
       		 new MerchantProduct(Items.RED_GLAZED_TERRACOTTA, CoinType.BRONZE, 48, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_GLAZED_TERRACOTTA, 48, false); })),
       		 new MerchantProduct(Items.BLACK_GLAZED_TERRACOTTA, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLACK_GLAZED_TERRACOTTA, 72, false); })),
       		 new MerchantProduct(Items.WHITE_CONCRETE, CoinType.BRONZE, 50, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WHITE_CONCRETE, 50, false); })),
       		 new MerchantProduct(Items.ORANGE_CONCRETE, CoinType.BRONZE, 66, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ORANGE_CONCRETE, 66, false); })),
       		 new MerchantProduct(Items.MAGENTA_CONCRETE, CoinType.BRONZE, 66, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAGENTA_CONCRETE, 66, false); })),
       		 new MerchantProduct(Items.LIGHT_BLUE_CONCRETE, CoinType.BRONZE, 66, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_BLUE_CONCRETE, 66, false); })),
       		 new MerchantProduct(Items.YELLOW_CONCRETE, CoinType.BRONZE, 58, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.YELLOW_CONCRETE, 58, false); })),
       		 new MerchantProduct(Items.LIME_CONCRETE, CoinType.BRONZE, 66, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIME_CONCRETE, 66, false); })),
       		 new MerchantProduct(Items.PINK_CONCRETE, CoinType.BRONZE, 66, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PINK_CONCRETE, 66, false); })),
       		 new MerchantProduct(Items.GRAY_CONCRETE, CoinType.BRONZE, 74, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRAY_CONCRETE, 74, false); })),
       		 new MerchantProduct(Items.LIGHT_GRAY_CONCRETE, CoinType.BRONZE, 90, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.LIGHT_GRAY_CONCRETE, 90, false); })),
       		 new MerchantProduct(Items.CYAN_CONCRETE, CoinType.BRONZE, 82, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CYAN_CONCRETE, 82, false); })),
       		 new MerchantProduct(Items.PURPLE_CONCRETE, CoinType.BRONZE, 74, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PURPLE_CONCRETE, 74, false); })),
       		 new MerchantProduct(Items.BLUE_CONCRETE, CoinType.BRONZE, 82, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLUE_CONCRETE, 82, false); })),
       		 new MerchantProduct(Items.BROWN_CONCRETE, CoinType.BRONZE, 82, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BROWN_CONCRETE, 82, false); })),
       		 new MerchantProduct(Items.GREEN_CONCRETE, CoinType.BRONZE, 82, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GREEN_CONCRETE, 82, false); })),
       		 new MerchantProduct(Items.RED_CONCRETE, CoinType.BRONZE, 58, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_CONCRETE, 58, false); })),
       		 new MerchantProduct(Items.BLACK_CONCRETE, CoinType.BRONZE, 82, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLACK_CONCRETE, 82, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getFenceNWalls()
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
	
	public static MerchantSet<MerchantProduct> getGardenBlocks()
	{
		INSTANCE.addAll(  
			 new MerchantProduct(Items.COARSE_DIRT, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.COARSE_DIRT, 16, false); })),
       		 new MerchantProduct(Items.PODZOL, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PODZOL, 32, false); })),
       		 new MerchantProduct(Items.MYCELIUM, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MYCELIUM, 16, false); })),
			 new MerchantProduct(ItemParser.getItemFromName("odysseymod:gravel_path"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:gravel_path"), 8, false); })),
			 new MerchantProduct(Items.DEAD_BUSH, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DEAD_BUSH, 16, false); })),
       		 new MerchantProduct(Items.GRASS_PATH, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRASS_PATH, 8, false); })),
       		 new MerchantProduct(Items.SAND, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SAND, 8, false); })),
       		 new MerchantProduct(Items.RED_SAND, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_SAND, 8, false); })),
       		 new MerchantProduct(Items.GRAVEL, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GRAVEL, 16, false); })),
			 new MerchantProduct(Items.RED_MUSHROOM, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_MUSHROOM, 4, false); })),
       		 new MerchantProduct(Items.RED_MUSHROOM_BLOCK, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_MUSHROOM_BLOCK, 8, false); })),
       		 new MerchantProduct(Items.BROWN_MUSHROOM, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BROWN_MUSHROOM, 4, false); })),
       		 new MerchantProduct(Items.BROWN_MUSHROOM_BLOCK, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BROWN_MUSHROOM_BLOCK, 8, false); })),
       		 new MerchantProduct(Items.MUSHROOM_STEM, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MUSHROOM_STEM, 8, false); })),
       		 new MerchantProduct(Items.SHROOMLIGHT, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SHROOMLIGHT, 32, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static MerchantSet<MerchantProduct> getDesignerBlocks()
	{
		INSTANCE.addAll(  
				new MerchantProduct(Items.GLASS, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GLASS, 8, false); })),
				 new MerchantProduct(Items.GLASS_PANE, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.GLASS_PANE, 8, false); })),
				 new MerchantProduct(Items.SEA_LANTERN, CoinType.SILVER, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SEA_LANTERN, 72, false); })),
				 new MerchantProduct(Items.ICE, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.ICE, 4, false); })),				
				 new MerchantProduct(Items.BLUE_ICE, CoinType.BRONZE, 324, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BLUE_ICE, 324, false); })),
				 new MerchantProduct(Items.SNOW_BLOCK, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.SNOW_BLOCK, 16, false); })),
				 new MerchantProduct(Items.OBSIDIAN, CoinType.SILVER, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.OBSIDIAN, 4, false); })),
				 new MerchantProduct(Items.CRYING_OBSIDIAN, CoinType.SILVER, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRYING_OBSIDIAN, 8, false); })),
				 new MerchantProduct(Items.QUARTZ_BLOCK, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.QUARTZ_BLOCK, 256, false); })),
				 new MerchantProduct(Items.CHISELED_QUARTZ_BLOCK, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHISELED_QUARTZ_BLOCK, 256, false); })),
				 new MerchantProduct(Items.QUARTZ_BRICKS, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.QUARTZ_BRICKS, 256, false); })),
       		     new MerchantProduct(Items.QUARTZ_PILLAR, CoinType.BRONZE, 256, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.QUARTZ_PILLAR, 256, false); })),
				 new MerchantProduct(Items.PURPUR_BLOCK, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PURPUR_BLOCK, 32, false); })),
				 new MerchantProduct(Items.PURPUR_SLAB, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PURPUR_SLAB, 8, false); })),
				 new MerchantProduct(Items.PRISMARINE_BRICKS, CoinType.SILVER, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PRISMARINE_BRICKS, 72, false); })),
       		     new MerchantProduct(Items.DARK_PRISMARINE, CoinType.SILVER, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.DARK_PRISMARINE, 72, false); })),
				 new MerchantProduct(Items.MAGMA_BLOCK, CoinType.BRONZE, 16, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.MAGMA_BLOCK, 16, false); })),
       		     new MerchantProduct(Items.BRICKS, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BRICKS, 64, false); })),
       		     new MerchantProduct(Items.NETHER_BRICKS, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_BRICKS, 64, false); })),
       		     new MerchantProduct(Items.CRACKED_NETHER_BRICKS, CoinType.SILVER, 1, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CRACKED_NETHER_BRICKS, 1, false); })),
       		     new MerchantProduct(Items.CHISELED_NETHER_BRICKS, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.CHISELED_NETHER_BRICKS, 64, false); })),
				 new MerchantProduct(Items.RED_NETHER_BRICKS, CoinType.BRONZE, 64, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.RED_NETHER_BRICKS, 64, false); })),
				 new MerchantProduct(Items.NETHER_WART_BLOCK, CoinType.BRONZE, 150, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_WART_BLOCK, 150, false); })),
				 new MerchantProduct(Items.WARPED_WART_BLOCK, CoinType.SILVER, 3, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.WARPED_WART_BLOCK, 3, false); })),
				 new MerchantProduct(Items.BONE_BLOCK, CoinType.BRONZE, 72, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BONE_BLOCK, 72, false); })),
				 new MerchantProduct(Items.TERRACOTTA, CoinType.BRONZE, 8, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.TERRACOTTA, 8, false); })),
				 new MerchantProduct(Items.PACKED_ICE, CoinType.BRONZE, 36, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PACKED_ICE, 36, false); })),
				 new MerchantProduct(Items.PRISMARINE_BRICK_SLAB, CoinType.SILVER, 36, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.PRISMARINE_BRICK_SLAB, 36, false); })),
      		     new MerchantProduct(Items.BRICK_SLAB, CoinType.BRONZE, 32, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.BRICK_SLAB, 32, false); })),
      		     new MerchantProduct(Items.NETHER_BRICK_SLAB, CoinType.BRONZE, 4, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.NETHER_BRICK_SLAB, 4, false); })),
      		     new MerchantProduct(Items.QUARTZ_SLAB, CoinType.BRONZE, 128, new ImageButton(5, height, 65, 20 , 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(Items.QUARTZ_SLAB, 128, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("odysseymod:quartz_vertical_slab"), CoinType.BRONZE, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:quartz_vertical_slab"), 128, false); })),				
				 new MerchantProduct(ItemParser.getItemFromName("odysseymod:smooth_quartz_vertical_slab"), CoinType.BRONZE, 128, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:smooth_quartz_vertical_slab"), 128, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("odysseymod:bricks_vertical_slab"), CoinType.BRONZE, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:bricks_vertical_slab"), 32, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("odysseymod:nether_bricks_vertical_slab"), CoinType.BRONZE, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:nether_bricks_vertical_slab"), 32, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("odysseymod:purpur_vertical_slab"), CoinType.BRONZE, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:purpur_vertical_slab"), 8, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("odysseymod:prismarine_bricks_vertical_slab"), CoinType.SILVER, 36, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:prismarine_bricks_vertical_slab"), 36, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("odysseymod:dark_prismarine_vertical_slab"), CoinType.SILVER, 36, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("odysseymod:dark_prismarine_vertical_slab"), 36, false); })),
				 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_bricks"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_bricks"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_bricks_chiseled"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_bricks_chiseled"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_bricks_cracked"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_bricks_cracked"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_bricks_mossy"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_bricks_mossy"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_tile"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_tile"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_face"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_face"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_torch"), CoinType.SILVER, 1, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_torch"), 1, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_stairs"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_stairs"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_slab"), CoinType.BRONZE, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_slab"), 32, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_slab_double"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_slab_double"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dread_stone_slab_upper"), CoinType.BRONZE, 32, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dread_stone_slab_upper"), 32, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dreadwood_log"), CoinType.BRONZE, 256, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dreadwood_log"), 256, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dreadwood_planks"), CoinType.BRONZE, 64, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dreadwood_planks"), 64, false); })),
		     	 new MerchantProduct(ItemParser.getItemFromName("iceandfire:dreadwood_planks_lock"), CoinType.SILVER, 8, new ImageButton(178, height, 65, 20, 0, 0, 0, BUTTON_TEXTURE, (button) ->{TradeManager.input(ItemParser.getItemFromName("iceandfire:dreadwood_planks_lock"), 8, false); }))
		);
		
		return INSTANCE.LIST;
	}
	
	public static final CraftsmanTrades INSTANCE = new CraftsmanTrades();
    
}
