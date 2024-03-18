package mod.arcalitegames.odyssey.entity.merchants;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.merchants.renderers.AlchemistSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.BakerSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.BlacksmithSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.ButcherSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.CraftsmanSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.DecorMerchantSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.FarmingMerchantSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.FletchingMerchantSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.FruitVendorSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.GuildMasterSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.HorseMerchantSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.InnKeeperSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.MineShopMerchantSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.MoneyChangerSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.ProduceVendorSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.RedstoneMerchantSkin;
import mod.arcalitegames.odyssey.entity.merchants.renderers.ShopKeeperSkin;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OdysseyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Merchants
{
	@SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event)
	{
        event.put(Entities.ALCHEMIST.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.BAKER.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.BLACKSMITH.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.BUTCHER.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.CRAFTSMAN.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.DECOR_MERCHANT.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.FRUIT_VENDOR.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.FARMING_MERCHANT.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.FLETCHING_MERCHANT.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.GUILDMASTER.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.HORSE_MERCHANT.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.INN_KEEPER.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.MINESHOP_MERCHANT.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.MONEY_CHANGER.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.PRODUCE_VENDOR.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.REDSTONE_MERCHANT.get(), MerchantEntity.setCustomAttributes().create());
        event.put(Entities.SHOP_KEEPER.get(), MerchantEntity.setCustomAttributes().create());
        
    }
	
	public static void renderAllEntities()
	{
		RenderingRegistry.registerEntityRenderingHandler(Entities.ALCHEMIST.get(), AlchemistSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.BAKER.get(), BakerSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.BLACKSMITH.get(), BlacksmithSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.BUTCHER.get(), ButcherSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.CRAFTSMAN.get(), CraftsmanSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.DECOR_MERCHANT.get(), DecorMerchantSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.FARMING_MERCHANT.get(), FarmingMerchantSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.FRUIT_VENDOR.get(), FruitVendorSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.FLETCHING_MERCHANT.get(), FletchingMerchantSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.GUILDMASTER.get(), GuildMasterSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.HORSE_MERCHANT.get(), HorseMerchantSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.INN_KEEPER.get(), InnKeeperSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.MINESHOP_MERCHANT.get(), MineShopMerchantSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.MONEY_CHANGER.get(), MoneyChangerSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.PRODUCE_VENDOR.get(), ProduceVendorSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.REDSTONE_MERCHANT.get(), RedstoneMerchantSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(Entities.SHOP_KEEPER.get(), ShopKeeperSkin::new);
	}
}
