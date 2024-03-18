package mod.arcalitegames.odyssey.entity.hostile;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.hostile.renderer.*;
import mod.arcalitegames.odyssey.entity.passive.TownEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OdysseyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HostileMobs
{
	public static final RegistryObject<EntityType<BanditRecruit>> BANDIT =
            Entities.ENTITY_TYPES.register("bandit",
                    () -> EntityType.Builder.create(BanditRecruit::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bandit").toString()));
	
	public static final RegistryObject<EntityType<BanditOutlaw>> BANDIT_OUTLAW =
            Entities.ENTITY_TYPES.register("bandit_outlaw",
                    () -> EntityType.Builder.create(BanditOutlaw::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bandit_outlaw").toString()));
	
	public static final RegistryObject<EntityType<BanditThug>> BANDIT_THUG =
            Entities.ENTITY_TYPES.register("bandit_thug",
                    () -> EntityType.Builder.create(BanditThug::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bandit_thug").toString()));
	
	public static final RegistryObject<EntityType<BanditPlunderer>> BANDIT_PLUNDERER =
            Entities.ENTITY_TYPES.register("bandit_plunderer",
                    () -> EntityType.Builder.create(BanditPlunderer::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bandit_plunderer").toString()));
	
	public static final RegistryObject<EntityType<BanditMarauder>> BANDIT_MARAUDER =
            Entities.ENTITY_TYPES.register("bandit_marauder",
                    () -> EntityType.Builder.create(BanditMarauder::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bandit_marauder").toString()));
	
	public static final RegistryObject<EntityType<GoblinKnocker>> GOBLIN_KNOCKER =
            Entities.ENTITY_TYPES.register("goblin_knocker",
                    () -> EntityType.Builder.create(GoblinKnocker::new,
                            EntityClassification.MONSTER).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "goblin_knocker").toString()));
	
	public static final RegistryObject<EntityType<GoblinHobgoblin>> GOBLIN_HOBGOBLIN =
            Entities.ENTITY_TYPES.register("goblin_hobgoblin",
                    () -> EntityType.Builder.create(GoblinHobgoblin::new,
                            EntityClassification.MONSTER).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "goblin_hobgoblin").toString()));
	
	public static final RegistryObject<EntityType<GoblinKobald>> GOBLIN_KOBALD =
            Entities.ENTITY_TYPES.register("goblin_kobold",
                    () -> EntityType.Builder.create(GoblinKobald::new,
                            EntityClassification.MONSTER).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "goblin_kobold").toString()));
	
	public static final RegistryObject<EntityType<GoblinTrow>> GOBLIN_TROW =
            Entities.ENTITY_TYPES.register("goblin_trow",
                    () -> EntityType.Builder.create(GoblinTrow::new,
                            EntityClassification.MONSTER).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "goblin_trow").toString()));
	
	
	@SubscribeEvent
	public static void addEntityAttributes(EntityAttributeCreationEvent event)
	{
		event.put(BANDIT.get(), BanditRecruit.setCustomAttributes().create());
		event.put(BANDIT_OUTLAW.get(), BanditOutlaw.setCustomAttributes().create());
		event.put(BANDIT_THUG.get(), BanditThug.setCustomAttributes().create());
		event.put(BANDIT_PLUNDERER.get(), BanditPlunderer.setCustomAttributes().create());
		event.put(BANDIT_MARAUDER.get(), BanditMarauder.setCustomAttributes().create());
		event.put(GOBLIN_KNOCKER.get(), GoblinKnocker.setCustomAttributes().create());
		event.put(GOBLIN_HOBGOBLIN.get(), GoblinHobgoblin.setCustomAttributes().create());
		event.put(GOBLIN_KOBALD.get(), GoblinKobald.setCustomAttributes().create());
		event.put(GOBLIN_TROW.get(), GoblinTrow.setCustomAttributes().create());
	}
	
	public static void renderAllEntities()
	{
		RenderingRegistry.registerEntityRenderingHandler(BANDIT.get(), BanditRecruitRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(BANDIT_THUG.get(), BanditThugRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(BANDIT_OUTLAW.get(), BanditOutlawRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(BANDIT_PLUNDERER.get(), BanditPlundererRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(BANDIT_MARAUDER.get(), BanditMarauderRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(GOBLIN_KNOCKER.get(), GoblinKnockerRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(GOBLIN_HOBGOBLIN.get(), GoblinHobgoblinRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(GOBLIN_KOBALD.get(), GoblinKobaldRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(GOBLIN_TROW.get(), GoblinTrowRenderer::new);
	}
	
}
