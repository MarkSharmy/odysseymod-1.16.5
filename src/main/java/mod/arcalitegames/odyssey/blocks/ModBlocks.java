package mod.arcalitegames.odyssey.blocks;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.items.ItemProperties;
import mod.arcalitegames.odyssey.items.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OdysseyMod.MODID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockProperties.RUBY));
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new Block(BlockProperties.RUBY_ORE));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new Block(BlockProperties.TOPAZ));
    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore", () -> new Block(BlockProperties.TOPAZ_ORE));
    public static final RegistryObject<Block> CHAIR = registerBlock("chair", () -> new ChairBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> VILLAGE_BED = registerBlock("village_bed", () -> new BedBlock(DyeColor.BROWN, AbstractBlock.Properties.from(Blocks.BROWN_BED)));
    public static final RegistryObject<Block> INN_DOOR = registerBlock("inn_door", () -> new InnDoorBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> CURRENCY_EXCHANGER = registerBlock("currency_exchanger", () -> new CurrencyExchanger(BlockProperties.FURNITURE));
    
    public static final RegistryObject<Block> SHOP_SIGN_BAKERY = registerBlock("sign_bakery", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_BLACKSMITH = registerBlock("sign_blacksmith", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_BREWERY = registerBlock("sign_brewery", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_BUTCHERY = registerBlock("sign_butchery", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_CRAFTSMAN = registerBlock("sign_craftsman", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_DECOR = registerBlock("sign_decor", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_FARMERS_MARKET = registerBlock("sign_farmers_market", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_FLETCHER = registerBlock("sign_fletcher", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_FRUIT_STALL = registerBlock("sign_fruit_stall", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_GENERAL_GOODS = registerBlock("sign_general_goods", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_GUILDHALL = registerBlock("sign_guildhall", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_INN = registerBlock("sign_inn", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_LIBRARY = registerBlock("sign_library", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_MINING_SHOP = registerBlock("sign_mining_shop", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_PRODUCE = registerBlock("sign_produce", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_STABLES = registerBlock("sign_stables", () -> new ShopSignBlock(BlockProperties.FURNITURE));
    public static final RegistryObject<Block> SHOP_SIGN_TRINKETS = registerBlock("sign_trinkets", () -> new ShopSignBlock(BlockProperties.FURNITURE));

    public static final RegistryObject<Block> CHEST_MARKER_1 = registerMarker("chest_marker1", MarkerBlock::new);
    public static final RegistryObject<Block> CHEST_MARKER_2 = registerMarker("chest_marker2", MarkerBlock::new);
    public static final RegistryObject<Block> CHEST_MARKER_3 = registerMarker("chest_marker3", MarkerBlock::new);
    public static final RegistryObject<Block> COUNTER_MARKER = registerMarker("counter_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BANDIT_MARKER = registerMarker("bandit_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BANDIT_OUTLAW_MARKER = registerMarker("bandit_outlaw_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BANDIT_THUG_MARKER = registerMarker("bandit_thug_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BANDIT_PLUNDERER_MARKER = registerMarker("bandit_plunderer_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BANDIT_MARAUDER_MARKER = registerMarker("bandit_marauder_marker", MarkerBlock::new);
    public static final RegistryObject<Block> GOBLIN_KNOCKER_MARKER = registerMarker("goblin_knocker_marker", MarkerBlock::new);
    public static final RegistryObject<Block> GOBLIN_HOBGOBLIN_MARKER = registerMarker("goblin_hobgoblin_marker", MarkerBlock::new);
    public static final RegistryObject<Block> GOBLIN_KOBOLD_MARKER = registerMarker("goblin_kobold_marker", MarkerBlock::new);
    public static final RegistryObject<Block> GOBLIN_TROW_MARKER = registerMarker("goblin_trow_marker", MarkerBlock::new);
    public static final RegistryObject<Block> DREAD_GHOUL_MARKER = registerMarker("dread_ghoul_marker", MarkerBlock::new);
    public static final RegistryObject<Block> DREAD_THRALL_MARKER = registerMarker("dread_thrall_marker", MarkerBlock::new);
    public static final RegistryObject<Block> DREAD_KNIGHT_MARKER = registerMarker("dread_knight_marker", MarkerBlock::new);
    public static final RegistryObject<Block> DREAD_LICH_MARKER = registerMarker("dread_lich_marker", MarkerBlock::new);
    public static final RegistryObject<Block> DREAD_BEAST_MARKER = registerMarker("dread_beast_marker", MarkerBlock::new);
    public static final RegistryObject<Block> DREAD_QUEEN_MARKER = registerMarker("dread_queen_marker", MarkerBlock::new);
    public static final RegistryObject<Block> ZOMBIE_MARKER = registerMarker("zombie_marker", MarkerBlock::new);
    public static final RegistryObject<Block> HUSK_MARKER = registerMarker("husk_marker", MarkerBlock::new);
    public static final RegistryObject<Block> SKELETON_MARKER = registerMarker("skeleton_marker", MarkerBlock::new);
    public static final RegistryObject<Block> WITCH_MARKER = registerMarker("witch_marker", MarkerBlock::new);
    public static final RegistryObject<Block> VINDICATOR_MARKER = registerMarker("vindicator_marker", MarkerBlock::new);
    public static final RegistryObject<Block> EVOKER_MARKER = registerMarker("evoker_marker", MarkerBlock::new);
    public static final RegistryObject<Block> SLIME_MARKER = registerMarker("slime_marker", MarkerBlock::new);
    public static final RegistryObject<Block> ILLUSIONER_MARKER = registerMarker("illusioner_marker", MarkerBlock::new);
    public static final RegistryObject<Block> PILLAGER_MARKER = registerMarker("pillager_marker", MarkerBlock::new);
    public static final RegistryObject<Block> RAVANGER_MARKER = registerMarker("ravanger_marker", MarkerBlock::new);
    public static final RegistryObject<Block> TROLL_MARKER = registerMarker("troll_marker", MarkerBlock::new);
    public static final RegistryObject<Block> HYDRA_MARKER = registerMarker("hydra_marker", MarkerBlock::new);
    
    public static final RegistryObject<Block> CITIZEN_MARKER = registerMarker("citizen_marker", MarkerBlock::new);
    public static final RegistryObject<Block> STANDING_GUARD_MARKER = registerMarker("standing_guard_marker", MarkerBlock::new);
    public static final RegistryObject<Block> PATROLLING_GUARD_MARKER = registerMarker("patroling_guard_marker", MarkerBlock::new);
    public static final RegistryObject<Block> ALCHEMIST_MARKER = registerMarker("alchemist_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BAKERY_MARKER = registerMarker("bakery_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BLACKSMITH_MARKER = registerMarker("blacksmith_marker", MarkerBlock::new);
    public static final RegistryObject<Block> BUTCHER_MARKER = registerMarker("butcher_marker", MarkerBlock::new);
    public static final RegistryObject<Block> CRAFTSMAN_MARKER = registerMarker("craftsman_marker", MarkerBlock::new);
    public static final RegistryObject<Block> DECOR_MARKER = registerMarker("decor_marker", MarkerBlock::new);
    public static final RegistryObject<Block> FARMER_MARKER = registerMarker("farmer_marker", MarkerBlock::new);
    public static final RegistryObject<Block> FLETCHER_MARKER = registerMarker("fletcher_marker", MarkerBlock::new);
    public static final RegistryObject<Block> FRUIT_VENDOR_MARKER = registerMarker("fruit_vendor_marker", MarkerBlock::new);
    public static final RegistryObject<Block> GUILDMASTER_MARKER = registerMarker("guildmaster_marker", MarkerBlock::new);
    public static final RegistryObject<Block> RANCHER_MARKER = registerMarker("rancher_marker", MarkerBlock::new);
    public static final RegistryObject<Block> INNKEEPER_MARKER = registerMarker("innkeeper_marker", MarkerBlock::new);
    public static final RegistryObject<Block> MINER_MARKER = registerMarker("miner_marker", MarkerBlock::new);
    public static final RegistryObject<Block> MONEYCHANGER_MARKER = registerMarker("moneychanger_marker", MarkerBlock::new);
    public static final RegistryObject<Block> PRODUCE_VENDOR_MARKER = registerMarker("produce_vendor_marker", MarkerBlock::new);
    public static final RegistryObject<Block> REDSTONE_MARKER = registerMarker("redstone_marker", MarkerBlock::new);
    public static final RegistryObject<Block> SHOPKEEPER_MARKER = registerMarker("shopkeeper_marker", MarkerBlock::new);
    
    public static final RegistryObject<Block> FILLER_BLOCK = registerMarker("filler_block",() -> new Block(BlockProperties.AMETHYST));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supplier)
    {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        registerBlockItem(name, block);
        return block;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), ItemProperties.DEFAULT));
    }
    
    private static <T extends Block> RegistryObject<T> registerMarker(String name, Supplier<T> supplier)
    {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        registerMarkerItem(name, block);
        return block;
    }

    private static <T extends Block> void registerMarkerItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), ItemProperties.MARKER));
    }

    public static void register(IEventBus eventbus)
    {
        BLOCKS.register(eventbus);
    }
}
