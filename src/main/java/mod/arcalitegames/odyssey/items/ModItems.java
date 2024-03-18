package mod.arcalitegames.odyssey.items;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.Entities;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OdysseyMod.MODID);
    public static final RegistryObject<Item> POINTER = ITEMS.register("pointer", () -> new Pointer(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> WAND = ITEMS.register("wand", () -> new WandItem(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> ALE = ITEMS.register("ale", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> BEER = ITEMS.register("beer", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> EMPTY_CUP = ITEMS.register("empty_cup", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> FINE_WINE = ITEMS.register("fine_wine", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> FULL_CUP = ITEMS.register("full_cup", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> INN_KEY = ITEMS.register("inn_key", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(ItemProperties.DEFAULT));
    public static final RegistryObject<Item> WINE = ITEMS.register("wine", () -> new Item(ItemProperties.DEFAULT));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new AmethystItem(ItemProperties.DEFAULT));

    public static final RegistryObject<SpawnEgg> COUNTER_SPAWNER =
            ITEMS.register("counter_spawner",
                    () -> new SpawnEgg(Entities.COUNTER,
                    		0xc8c9c5,
                            0x5c4b38,
                            ItemProperties.DEFAULT));

    public static void register(IEventBus eventbus)
    {
        ITEMS.register(eventbus);
    }
}