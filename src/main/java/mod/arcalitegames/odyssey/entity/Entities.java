package mod.arcalitegames.odyssey.entity;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.buildersaddition.blocks.base.ISeat;
import mod.arcalitegames.odyssey.entity.merchants.Alchemist;
import mod.arcalitegames.odyssey.entity.merchants.BakeryMerchant;
import mod.arcalitegames.odyssey.entity.merchants.Blacksmith;
import mod.arcalitegames.odyssey.entity.merchants.Butcher;
import mod.arcalitegames.odyssey.entity.merchants.Craftsman;
import mod.arcalitegames.odyssey.entity.merchants.DecorMerchant;
import mod.arcalitegames.odyssey.entity.merchants.FarmingMerchant;
import mod.arcalitegames.odyssey.entity.merchants.FletchingMerchant;
import mod.arcalitegames.odyssey.entity.merchants.FruitVendor;
import mod.arcalitegames.odyssey.entity.merchants.GuildMaster;
import mod.arcalitegames.odyssey.entity.merchants.HorseMerchant;
import mod.arcalitegames.odyssey.entity.merchants.InnKeeper;
import mod.arcalitegames.odyssey.entity.merchants.MineShopMerchant;
import mod.arcalitegames.odyssey.entity.merchants.MoneyChanger;
import mod.arcalitegames.odyssey.entity.merchants.ProduceVendor;
import mod.arcalitegames.odyssey.entity.merchants.RedstoneMerchant;
import mod.arcalitegames.odyssey.entity.merchants.ShopKeeper;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import mod.arcalitegames.odyssey.entity.passive.GenericEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Entities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, OdysseyMod.MODID);

    public static final RegistryObject<EntityType<GenericEntity>> GENERIC =
            ENTITY_TYPES.register("generic",
                    () -> EntityType.Builder.create(GenericEntity::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "generic").toString()));

    public static final RegistryObject<EntityType<CitizenEntity>> CITIZEN =
            ENTITY_TYPES.register("citizen",
                    () -> EntityType.Builder.create(CitizenEntity::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "citizen").toString()));
    
    public static final RegistryObject<EntityType<Alchemist>> ALCHEMIST =
            ENTITY_TYPES.register("alchemist",
                    () -> EntityType.Builder.create(Alchemist::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "alchemist").toString()));
    
    public static final RegistryObject<EntityType<BakeryMerchant>> BAKER =
            ENTITY_TYPES.register("baker",
                    () -> EntityType.Builder.create(BakeryMerchant::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "baker").toString()));
    
    public static final RegistryObject<EntityType<Blacksmith>> BLACKSMITH =
            ENTITY_TYPES.register("blacksmith",
                    () -> EntityType.Builder.create(Blacksmith::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "blacksmith").toString()));
    
    public static final RegistryObject<EntityType<Butcher>> BUTCHER =
            ENTITY_TYPES.register("butcher",
                    () -> EntityType.Builder.create(Butcher::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "butcher").toString()));
    
    public static final RegistryObject<EntityType<Craftsman>> CRAFTSMAN =
            ENTITY_TYPES.register("craftsman",
                    () -> EntityType.Builder.create(Craftsman::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "craftsman").toString()));
    
    public static final RegistryObject<EntityType<DecorMerchant>> DECOR_MERCHANT =
            ENTITY_TYPES.register("decor_merchant",
                    () -> EntityType.Builder.create(DecorMerchant::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "decor_merchant").toString()));
    
    public static final RegistryObject<EntityType<FarmingMerchant>> FARMING_MERCHANT =
            ENTITY_TYPES.register("farming_merchant",
                    () -> EntityType.Builder.create(FarmingMerchant::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "farming_merchant").toString()));
    
    public static final RegistryObject<EntityType<FletchingMerchant>> FLETCHING_MERCHANT =
            ENTITY_TYPES.register("fletching_merchant",
                    () -> EntityType.Builder.create(FletchingMerchant::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "fletching_merchant").toString()));
    
    public static final RegistryObject<EntityType<FruitVendor>> FRUIT_VENDOR =
            ENTITY_TYPES.register("fruit_vendor",
                    () -> EntityType.Builder.create(FruitVendor::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "fruit_vendor").toString()));
    
    public static final RegistryObject<EntityType<GuildMaster>> GUILDMASTER =
            ENTITY_TYPES.register("guildmaster",
                    () -> EntityType.Builder.create(GuildMaster::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "guildmaster").toString()));
    
    public static final RegistryObject<EntityType<HorseMerchant>> HORSE_MERCHANT =
            ENTITY_TYPES.register("horse_merchant",
                    () -> EntityType.Builder.create(HorseMerchant::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "horse_merchant").toString()));
    
    public static final RegistryObject<EntityType<InnKeeper>> INN_KEEPER =
            ENTITY_TYPES.register("inn_keeper",
                    () -> EntityType.Builder.create(InnKeeper::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "inn_keeper").toString()));
    
    public static final RegistryObject<EntityType<MineShopMerchant>> MINESHOP_MERCHANT =
            ENTITY_TYPES.register("mineshop_merchant",
                    () -> EntityType.Builder.create(MineShopMerchant::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "mineshop_merchant").toString()));
    
    public static final RegistryObject<EntityType<MoneyChanger>> MONEY_CHANGER =
            ENTITY_TYPES.register("money_changer",
                    () -> EntityType.Builder.create(MoneyChanger::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "money_changer").toString()));
    
    public static final RegistryObject<EntityType<ProduceVendor>> PRODUCE_VENDOR =
            ENTITY_TYPES.register("produce_vendor",
                    () -> EntityType.Builder.create(ProduceVendor::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "produce_vendor").toString()));
    
    public static final RegistryObject<EntityType<RedstoneMerchant>> REDSTONE_MERCHANT =
            ENTITY_TYPES.register("redstone_merchant",
                    () -> EntityType.Builder.create(RedstoneMerchant::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "redstone_merchant").toString()));
    
    public static final RegistryObject<EntityType<ShopKeeper>> SHOP_KEEPER =
            ENTITY_TYPES.register("shop_keeper",
                    () -> EntityType.Builder.create(ShopKeeper::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "shop_keeper").toString()));
    
    public static final RegistryObject<EntityType<CounterEntity>> COUNTER =
            ENTITY_TYPES.register("counter",
                    () -> EntityType.Builder.create(CounterEntity::new,
                            EntityClassification.MISC).size(0.1F, 0.1F)
                            .build(new ResourceLocation(OdysseyMod.MODID, "counter").toString()));
    
    public static final RegistryObject<EntityType<ISeat.ChairSeat>> SEAT_CHAIR =
            ENTITY_TYPES.register("seat_chair",
                    () -> EntityType.Builder.create(ISeat.ChairSeat::new,
                            EntityClassification.MISC).size(0.1F, 0.1F)
                            .build(new ResourceLocation(OdysseyMod.MODID, "seat_chair").toString()));
    
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
