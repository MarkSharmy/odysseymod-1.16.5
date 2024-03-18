package mod.arcalitegames;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.arcalitegames.buildersaddition.arcade.ArcadeManager;
import mod.arcalitegames.buildersaddition.config.Config;
import mod.arcalitegames.buildersaddition.event.BlockRegistry;
import mod.arcalitegames.buildersaddition.event.ClientEventHandler;
import mod.arcalitegames.buildersaddition.event.ContainerRegistry;
import mod.arcalitegames.buildersaddition.event.ItemRegistry;
import mod.arcalitegames.buildersaddition.event.TileEntityRegistry;
import mod.arcalitegames.buildersaddition.itemgroup.ModGroup;
import mod.arcalitegames.buildersaddition.midi.MidiHandler;
import mod.arcalitegames.buildersaddition.network.PlayNotePacket;
import mod.arcalitegames.buildersaddition.network.UpdateDataPacket;
import mod.arcalitegames.buildersaddition.proxy.ClientProxy;
import mod.arcalitegames.buildersaddition.proxy.CommonProxy;
import mod.arcalitegames.odyssey.client.gui.HUDRenderer;
import mod.arcalitegames.odyssey.client.gui.screen.CurrencyExchangerScreen;
import mod.arcalitegames.odyssey.containers.ModContainers;
import mod.arcalitegames.odyssey.world.structure.town.TownStructures;
import mod.arcalitegames.system.network.CustomSerializers;
import mod.arcalitegames.system.network.ModNetwork;
import mod.arcalitegames.system.registry.EntityRenders;
import mod.arcalitegames.system.registry.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OdysseyMod.MODID)
@Mod.EventBusSubscriber(modid = OdysseyMod.MODID)
public class OdysseyMod
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "odysseymod";
    public static final String VERSION = "1.16.5-1.0.0";
    @SuppressWarnings("deprecation")
	public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    private static final String PROTOCOL = "1";
    public static MidiHandler midi = null;
    public static boolean BOP_ACTIVE = false;

    public static final SimpleChannel Network = NetworkRegistry.ChannelBuilder.named(new ResourceLocation(MODID, "buildersaddition"))
            .clientAcceptedVersions(PROTOCOL::equals)
            .serverAcceptedVersions(PROTOCOL::equals)
            .networkProtocolVersion(() -> PROTOCOL)
            .simpleChannel();

    public OdysseyMod()
    {
        // Register the setup method for modloading
        IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();

        eventbus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventbus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventbus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        eventbus.addListener(this::doClientStuff);
        // Register the loadComplete method for modloading
        eventbus.addListener(this::loadComplete);
        // Register ourselves for server and other game events we are interested in
        
        CustomSerializers.registerSerializers();
        LOGGER.debug("Registered Animations Data Serializer");
        
        ModRegistry.registerAll(eventbus);

        MinecraftForge.EVENT_BUS.register(this);

        ArcadeManager.init();
        
        new ModGroup("builders_addition_group");

        new BlockRegistry();
        new ItemRegistry();
        new TileEntityRegistry();
        new ContainerRegistry();

        BOP_ACTIVE = ModList.get().isLoaded("biomesoplenty");

        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("buildersaddition-common.toml"));

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> {
            return () -> {
                MinecraftForge.EVENT_BUS.register(HUDRenderer.class);
            };
        });
    }

    @SuppressWarnings("deprecation")
	private void setup(final FMLCommonSetupEvent event)
    {
        proxy.init(event);
        ModNetwork.init();
        DistExecutor.runWhenOn(Dist.CLIENT, () -> ClientEventHandler::clientRegistry);
        event.enqueueWork(() -> { TownStructures.setupStructures(); });
    }

    private void loadComplete(final FMLLoadCompleteEvent event)
    {
        int i = 0;
        Network.registerMessage(i++, PlayNotePacket.class, PlayNotePacket::encode, PlayNotePacket::decode, PlayNotePacket::handle);
        Network.registerMessage(i++, UpdateDataPacket.class, UpdateDataPacket::encode, UpdateDataPacket::decode, UpdateDataPacket::handle);
        System.out.println("Builders Addition Initialized!");
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    	ScreenManager.registerFactory(ModContainers.CURRENCY_EXCHANGER_CONTAINER.get(), CurrencyExchangerScreen::new);
        EntityRenders.registerRenders();
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo(OdysseyMod.MODID, "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @SubscribeEvent
    public void onServerStarted(FMLServerStartedEvent event) {
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }

    }
    
    public static void displayMessage(PlayerEntity player)
    {
    	StringTextComponent prompt = new StringTextComponent("Thank you for your support. Please enjoy ");
    	StringTextComponent adventureMode = new StringTextComponent("OdysseyMod: Adventure Mode!");
    	adventureMode.setStyle(Style.EMPTY.applyFormatting(TextFormatting.GREEN));
    	player.sendMessage(prompt.appendSibling(adventureMode), player.getUniqueID());
    }
    
}
