package mod.arcalitegames.odyssey.entity.citizens.fort_mesa;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.AtticusLivereux;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.BerryGester;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.BluefordBlakeley;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.CalwinSapelet;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.CashHassestatzel;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.CorrinaMccandles;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.DelfinaWhiting;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.DinkDunker;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.EvelinaMillican;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.EyesCoulter;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.FleetMartz;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.GabrielleLavera;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.HaydenWaufle;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.HortonMavity;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.HugeCoolidge;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.JulieBerrsheim;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.KantiChaney;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.MaxieBreithaupt;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.NedHively;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.NovaOkhmhaka;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.NunaSkenandore;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.OrlanderMattengley;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.PeteRutles;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.RebeccaSlawter;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.entities.ZacharyAnman;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.AtticusLivereuxSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.BerryGesterSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.BluefordBlakeleySkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.CalwinSapeletSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.CashHassestatzelSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.CorrinaMccandlesSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.DelfinaWhitingSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.DinkDunkerSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.EvelinaMillicanSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.EyesCoulterSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.FleetMartzSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.GabrielleLaveraSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.HaydenWaufleSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.HortonMavitySkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.HugeCoolidgeSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.JulieBerrsheimSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.KantiChaneySkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.MaxieBreithauptSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.NedHivelySkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.NovaOkhmhakaSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.NunaSkenandoreSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.OrlanderMattengleySkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.PeteRutlesSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.RebeccaSlawterSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.renderers.ZacharyAnmanSkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.sheriffs.DeputySheriff;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.sheriffs.DeputySkin;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.sheriffs.SheriffGuard;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.sheriffs.SheriffSkin;
import mod.arcalitegames.odyssey.entity.passive.GuardEntity;
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
public class FortMesa
{
	public static final RegistryObject<EntityType<CorrinaMccandles>> CORRINA_MCCANDLES =
            Entities.ENTITY_TYPES.register("corrina_mccandles",
                    () -> EntityType.Builder.create(CorrinaMccandles::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "corrina_mccandles").toString()));
	
    public static final RegistryObject<EntityType<DelfinaWhiting>> DELFINA_WHITING =
            Entities.ENTITY_TYPES.register("delfina_whiting",
                    () -> EntityType.Builder.create(DelfinaWhiting::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "delfina_whiting").toString()));
    
    public static final RegistryObject<EntityType<EvelinaMillican>> EVELINA_MILLICAN =
            Entities.ENTITY_TYPES.register("evelina_millican",
                    () -> EntityType.Builder.create(EvelinaMillican::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "evelina_millican").toString()));
    
    public static final RegistryObject<EntityType<GabrielleLavera>> GABRIELLE_LAVERA =
            Entities.ENTITY_TYPES.register("gabrielle_lavera",
                    () -> EntityType.Builder.create(GabrielleLavera::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "gabrielle_lavera").toString()));
    
    public static final RegistryObject<EntityType<JulieBerrsheim>> JULIE_BERRSHEIM =
            Entities.ENTITY_TYPES.register("julie_berrsheim",
                    () -> EntityType.Builder.create(JulieBerrsheim::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "julie_berrsheim").toString()));
    
    public static final RegistryObject<EntityType<KantiChaney>> KANTI_CHANEY =
            Entities.ENTITY_TYPES.register("kanti_chaney",
                    () -> EntityType.Builder.create(KantiChaney::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "kanti_chaney").toString()));
    
    public static final RegistryObject<EntityType<MaxieBreithaupt>> MAXIE_BREITHAUPT =
            Entities.ENTITY_TYPES.register("maxie_breithaupt",
                    () -> EntityType.Builder.create(MaxieBreithaupt::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "maxie_breithaupt").toString()));
    
    public static final RegistryObject<EntityType<NovaOkhmhaka>> NOVA_OKHMHAKA =
            Entities.ENTITY_TYPES.register("nova_okhmhaka",
                    () -> EntityType.Builder.create(NovaOkhmhaka::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "nova_okhmhaka").toString()));
    
    public static final RegistryObject<EntityType<NunaSkenandore>> NUNA_SKENANDORE =
            Entities.ENTITY_TYPES.register("nuna_skenandore",
                    () -> EntityType.Builder.create(NunaSkenandore::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "nuna_skenandore").toString()));
    
    public static final RegistryObject<EntityType<RebeccaSlawter>> REBECCA_SLAWTER =
            Entities.ENTITY_TYPES.register("rebecca_slawter",
                    () -> EntityType.Builder.create(RebeccaSlawter::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "rebecca_slawter").toString()));
    
    public static final RegistryObject<EntityType<AtticusLivereux>> ATTICUS_LIVEREUX =
            Entities.ENTITY_TYPES.register("atticus_livereux",
                    () -> EntityType.Builder.create(AtticusLivereux::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "atticus_livereux").toString()));
    
    public static final RegistryObject<EntityType<BerryGester>> BERRY_GESTER =
            Entities.ENTITY_TYPES.register("berry_gester",
                    () -> EntityType.Builder.create(BerryGester::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "berry_gester").toString()));
    
    public static final RegistryObject<EntityType<BluefordBlakeley>> BLUEFORD_BLAKELEY =
            Entities.ENTITY_TYPES.register("blueford_blakeley",
                    () -> EntityType.Builder.create(BluefordBlakeley::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "blueford_blakeley").toString()));
    
    public static final RegistryObject<EntityType<CalwinSapelet>> CALWIN_SAPELET =
            Entities.ENTITY_TYPES.register("calwin_sapelet",
                    () -> EntityType.Builder.create(CalwinSapelet::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "calwin_sapelet").toString()));
    
    public static final RegistryObject<EntityType<CashHassestatzel>> CASH_HASSESTATZEL =
            Entities.ENTITY_TYPES.register("cash_hassestatzel",
                    () -> EntityType.Builder.create(CashHassestatzel::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "cash_hassestatzel").toString()));
    
    public static final RegistryObject<EntityType<DinkDunker>> DINK_DUNKER =
            Entities.ENTITY_TYPES.register("dink_dunker",
                    () -> EntityType.Builder.create(DinkDunker::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "dink_dunker").toString()));
    
    public static final RegistryObject<EntityType<EyesCoulter>> EYES_COULTER =
            Entities.ENTITY_TYPES.register("eyes_coulter",
                    () -> EntityType.Builder.create(EyesCoulter::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "eyes_coulter").toString()));
    
    public static final RegistryObject<EntityType<FleetMartz>> FLEET_MARTZ =
            Entities.ENTITY_TYPES.register("fleet_martz",
                    () -> EntityType.Builder.create(FleetMartz::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "fleet_martz").toString()));
    
    public static final RegistryObject<EntityType<HaydenWaufle>> HAYDEN_WAUFLE =
            Entities.ENTITY_TYPES.register("hayden_waufle",
                    () -> EntityType.Builder.create(HaydenWaufle::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hayden_waufle").toString()));
    
    public static final RegistryObject<EntityType<HortonMavity>> HORTON_MAVITY =
            Entities.ENTITY_TYPES.register("horton_mavity",
                    () -> EntityType.Builder.create(HortonMavity::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "horton_mavity").toString()));
    
    public static final RegistryObject<EntityType<HugeCoolidge>> HUGE_COOLIDGE =
            Entities.ENTITY_TYPES.register("huge_coolidge",
                    () -> EntityType.Builder.create(HugeCoolidge::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "huge_coolidge").toString()));
    
    public static final RegistryObject<EntityType<NedHively>> NED_HIVELY =
            Entities.ENTITY_TYPES.register("ned_hively",
                    () -> EntityType.Builder.create(NedHively::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "ned_hively").toString()));
    
    public static final RegistryObject<EntityType<OrlanderMattengley>> ORLANDER_MATTENGLEY =
            Entities.ENTITY_TYPES.register("orlander_mattengley",
                    () -> EntityType.Builder.create(OrlanderMattengley::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "orlander_mattengley").toString()));
    
    public static final RegistryObject<EntityType<PeteRutles>> PETE_RUTLES =
            Entities.ENTITY_TYPES.register("pete_rutles",
                    () -> EntityType.Builder.create(PeteRutles::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "pete_rutles").toString()));
    
    public static final RegistryObject<EntityType<ZacharyAnman>> ZACHARY_ANMAN =
            Entities.ENTITY_TYPES.register("zachary_anman",
                    () -> EntityType.Builder.create(ZacharyAnman::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "zachary_anman").toString()));
    
    public static final RegistryObject<EntityType<SheriffGuard>> SHERIFF =
            Entities.ENTITY_TYPES.register("sheriff",
                    () -> EntityType.Builder.create(SheriffGuard::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "sheriff").toString()));
	
	public static final RegistryObject<EntityType<DeputySheriff>> DEPUTY =
            Entities.ENTITY_TYPES.register("deputy_sheriff",
                    () -> EntityType.Builder.create(DeputySheriff::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "deputy_sheriff").toString()));
    
	
	@SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event)
    {
		event.put(CORRINA_MCCANDLES.get(), TownEntity.setCustomAttributes().create());
		event.put(DELFINA_WHITING.get(), TownEntity.setCustomAttributes().create());
		event.put(EVELINA_MILLICAN.get(), TownEntity.setCustomAttributes().create());
		event.put(GABRIELLE_LAVERA.get(), TownEntity.setCustomAttributes().create());
		event.put(JULIE_BERRSHEIM.get(), TownEntity.setCustomAttributes().create());
		event.put(KANTI_CHANEY.get(), TownEntity.setCustomAttributes().create());
		event.put(MAXIE_BREITHAUPT.get(), TownEntity.setCustomAttributes().create());
		event.put(NOVA_OKHMHAKA.get(), TownEntity.setCustomAttributes().create());
		event.put(NUNA_SKENANDORE.get(), TownEntity.setCustomAttributes().create());
		event.put(REBECCA_SLAWTER.get(), TownEntity.setCustomAttributes().create());
		event.put(ATTICUS_LIVEREUX.get(), TownEntity.setCustomAttributes().create());
		event.put(BERRY_GESTER.get(), TownEntity.setCustomAttributes().create());
		event.put(BLUEFORD_BLAKELEY.get(), TownEntity.setCustomAttributes().create());
		event.put(CALWIN_SAPELET.get(), TownEntity.setCustomAttributes().create());
		event.put(CASH_HASSESTATZEL.get(), TownEntity.setCustomAttributes().create());
		event.put(DINK_DUNKER.get(), TownEntity.setCustomAttributes().create());
		event.put(EYES_COULTER.get(), TownEntity.setCustomAttributes().create());
		event.put(FLEET_MARTZ.get(), TownEntity.setCustomAttributes().create());
		event.put(HAYDEN_WAUFLE.get(), TownEntity.setCustomAttributes().create());
		event.put(HORTON_MAVITY.get(), TownEntity.setCustomAttributes().create());
		event.put(HUGE_COOLIDGE.get(), TownEntity.setCustomAttributes().create());
		event.put(NED_HIVELY.get(), TownEntity.setCustomAttributes().create());
		event.put(ORLANDER_MATTENGLEY.get(), TownEntity.setCustomAttributes().create());
		event.put(PETE_RUTLES.get(), TownEntity.setCustomAttributes().create());
		event.put(ZACHARY_ANMAN.get(), TownEntity.setCustomAttributes().create());
		event.put(SHERIFF.get(), GuardEntity.setCustomAttributes().create());
		event.put(DEPUTY.get(), GuardEntity.setCustomAttributes().create());
    }
	
	public static void renderAllEntities()
	{
		RenderingRegistry.registerEntityRenderingHandler(CORRINA_MCCANDLES.get(), CorrinaMccandlesSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(DELFINA_WHITING.get(), DelfinaWhitingSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(EVELINA_MILLICAN.get(), EvelinaMillicanSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(GABRIELLE_LAVERA.get(), GabrielleLaveraSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(JULIE_BERRSHEIM.get(), JulieBerrsheimSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(KANTI_CHANEY.get(), KantiChaneySkin::new);
		RenderingRegistry.registerEntityRenderingHandler(MAXIE_BREITHAUPT.get(), MaxieBreithauptSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NOVA_OKHMHAKA.get(), NovaOkhmhakaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NUNA_SKENANDORE.get(), NunaSkenandoreSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(REBECCA_SLAWTER.get(), RebeccaSlawterSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ATTICUS_LIVEREUX.get(), AtticusLivereuxSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(BERRY_GESTER.get(), BerryGesterSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(BLUEFORD_BLAKELEY.get(), BluefordBlakeleySkin::new);
		RenderingRegistry.registerEntityRenderingHandler(CALWIN_SAPELET.get(), CalwinSapeletSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(CASH_HASSESTATZEL.get(), CashHassestatzelSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(DINK_DUNKER.get(), DinkDunkerSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(EYES_COULTER.get(), EyesCoulterSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(FLEET_MARTZ.get(), FleetMartzSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HAYDEN_WAUFLE.get(), HaydenWaufleSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HORTON_MAVITY.get(), HortonMavitySkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HUGE_COOLIDGE.get(), HugeCoolidgeSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NED_HIVELY.get(), NedHivelySkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ORLANDER_MATTENGLEY.get(), OrlanderMattengleySkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PETE_RUTLES.get(), PeteRutlesSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ZACHARY_ANMAN.get(), ZacharyAnmanSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(SHERIFF.get(), SheriffSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(DEPUTY.get(), DeputySkin::new);
	}
}
