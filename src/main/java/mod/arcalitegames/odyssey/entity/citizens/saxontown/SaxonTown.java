package mod.arcalitegames.odyssey.entity.citizens.saxontown;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.AdeliaMessala;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.AureliaProcillus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.CyraAmbustus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.EliannaSura;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.HesterGeta;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.JoannaCinna;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.KristaVibulanus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.LorinaVestalis;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.OenoneMerula;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.females.SeraAlbus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.guards.SaxonPatrollingGuard;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.guards.SaxonPatrollingGuardSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.guards.SaxonStandingGuard;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.guards.SaxonStandingGuardSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.AthanasiusGlaber;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.CaecusCaudex;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.CosmoGetha;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.DidymusAcisculus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.EgnatiusHispallus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.FeroxAugur;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.HelierPotitus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.IanuariusCaecus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.NaeviusSalinator;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.PanteraArvina;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.PhilotheusBlasio;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.QuiqueUnimanus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.RufusCalussa;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.SeraphinusAsellus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.males.ValerianJunianus;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.AdeliaMessalaSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.AthanasiusGlaberSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.AureliaProcillusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.CaecusCaudexSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.CosmosGethaSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.CyraAmbustusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.DidymusAcisculusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.EgnatiusHispallusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.EliannaSuraSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.FeroxAugurSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.HelierPotitusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.HesterGetaSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.IanuariusCaecusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.JoannaCinnaSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.KristaVibulanusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.LorinaVestalisSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.NaeviusSalinatorSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.OenoneMerulaSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.PanteraArvinaSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.PhilotheusBlasioSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.QuiqueUnimanusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.RufusCalussaSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.SeraAlbusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.SeraphinusAsellusSkin;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.renderers.ValerianJunianusSkin;
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
public class SaxonTown
{
	public static final RegistryObject<EntityType<AthanasiusGlaber>> ATHANASIUS_GLABER =
            Entities.ENTITY_TYPES.register("athanasius_glaber",
                    () -> EntityType.Builder.create(AthanasiusGlaber::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "athanasius_glaber").toString()));
	
	public static final RegistryObject<EntityType<CaecusCaudex>> CAECUS_CAUDEX =
            Entities.ENTITY_TYPES.register("caecus_caudex",
                    () -> EntityType.Builder.create(CaecusCaudex::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "caecus_caudex").toString()));
	
	public static final RegistryObject<EntityType<CosmoGetha>> COSMO_GETHA =
            Entities.ENTITY_TYPES.register("cosmo_getha",
                    () -> EntityType.Builder.create(CosmoGetha::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "cosmo_getha").toString()));
	
	public static final RegistryObject<EntityType<DidymusAcisculus>> DIDYMUS_ACISCULUS =
            Entities.ENTITY_TYPES.register("didymus_acisculus",
                    () -> EntityType.Builder.create(DidymusAcisculus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "didymus_acisculus").toString()));
	
	public static final RegistryObject<EntityType<EgnatiusHispallus>> EGNATIUS_HISPALLUS =
            Entities.ENTITY_TYPES.register("egnatius_hispallus",
                    () -> EntityType.Builder.create(EgnatiusHispallus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "egnatius_hispallus").toString()));
	
	public static final RegistryObject<EntityType<FeroxAugur>> FEROX_AUGUR =
            Entities.ENTITY_TYPES.register("ferox_augur",
                    () -> EntityType.Builder.create(FeroxAugur::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "ferox_augur").toString()));
	
	public static final RegistryObject<EntityType<HelierPotitus>> HELIER_POTITUS =
            Entities.ENTITY_TYPES.register("helier_potitus",
                    () -> EntityType.Builder.create(HelierPotitus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "helier_potitus").toString()));
	
	public static final RegistryObject<EntityType<IanuariusCaecus>> IANUARIUS_CAECUS =
            Entities.ENTITY_TYPES.register("ianuarius_caecus",
                    () -> EntityType.Builder.create(IanuariusCaecus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "ianuarius_caecus").toString()));
	
	public static final RegistryObject<EntityType<NaeviusSalinator>> NAEVIUS_SALINATOR =
            Entities.ENTITY_TYPES.register("naevius_salinator",
                    () -> EntityType.Builder.create(NaeviusSalinator::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "naevius_salinator").toString()));
	
	public static final RegistryObject<EntityType<PanteraArvina>> PANTERA_ARVINA =
            Entities.ENTITY_TYPES.register("pantera_arvina",
                    () -> EntityType.Builder.create(PanteraArvina::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "pantera_arvina").toString()));
	
	public static final RegistryObject<EntityType<PhilotheusBlasio>> PHILOTHEUS_BLASIO =
            Entities.ENTITY_TYPES.register("philotheus_blasio",
                    () -> EntityType.Builder.create(PhilotheusBlasio::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "philotheus_blasio").toString()));
	
	public static final RegistryObject<EntityType<QuiqueUnimanus>> QUIQUE_UNIMANUS =
            Entities.ENTITY_TYPES.register("quique_unimanus",
                    () -> EntityType.Builder.create(QuiqueUnimanus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "quique_unimanus").toString()));
	
	public static final RegistryObject<EntityType<RufusCalussa>> RUFUS_CALUSSA =
            Entities.ENTITY_TYPES.register("rufus_calussa",
                    () -> EntityType.Builder.create(RufusCalussa::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "rufus_calussa").toString()));
	
	public static final RegistryObject<EntityType<SeraphinusAsellus>> SERAPHINUS_ASELLUS =
            Entities.ENTITY_TYPES.register("seraphinus_asellus",
                    () -> EntityType.Builder.create(SeraphinusAsellus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "seraphinus_asellus").toString()));
	
	public static final RegistryObject<EntityType<ValerianJunianus>> VALERIAN_JUNIANUS =
            Entities.ENTITY_TYPES.register("valerian_junianus",
                    () -> EntityType.Builder.create(ValerianJunianus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "valerian_junianus").toString()));
	
	public static final RegistryObject<EntityType<AdeliaMessala>> ADELIA_MESSALA =
            Entities.ENTITY_TYPES.register("adelia_messala",
                    () -> EntityType.Builder.create(AdeliaMessala::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "adelia_messala").toString()));
	
	public static final RegistryObject<EntityType<AureliaProcillus>> AURELIA_PROCILLUS =
            Entities.ENTITY_TYPES.register("aurelia_procillus",
                    () -> EntityType.Builder.create(AureliaProcillus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "aurelia_procillus").toString()));
	
	public static final RegistryObject<EntityType<CyraAmbustus>> CYRA_AMBUSTUS =
            Entities.ENTITY_TYPES.register("cyra_ambustus",
                    () -> EntityType.Builder.create(CyraAmbustus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "cyra_ambustus").toString()));
	
	public static final RegistryObject<EntityType<EliannaSura>> ELIANNA_SURA =
            Entities.ENTITY_TYPES.register("elianna_sura",
                    () -> EntityType.Builder.create(EliannaSura::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "elianna_sura").toString()));
	
	public static final RegistryObject<EntityType<HesterGeta>> HESTER_GETA =
            Entities.ENTITY_TYPES.register("hester_geta",
                    () -> EntityType.Builder.create(HesterGeta::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hester_geta").toString()));
	
	public static final RegistryObject<EntityType<JoannaCinna>> JOANNA_CINNA =
            Entities.ENTITY_TYPES.register("joanna_cinna",
                    () -> EntityType.Builder.create(JoannaCinna::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "joanna_cinna").toString()));
	
	public static final RegistryObject<EntityType<KristaVibulanus>> KRISTA_VIBULANUS =
            Entities.ENTITY_TYPES.register("krista_vibulanus",
                    () -> EntityType.Builder.create(KristaVibulanus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "krista_vibulanus").toString()));
	
	public static final RegistryObject<EntityType<LorinaVestalis>> LORINA_VESTALIS =
            Entities.ENTITY_TYPES.register("lorina_vestalis",
                    () -> EntityType.Builder.create(LorinaVestalis::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "lorina_vestalis").toString()));
	
	public static final RegistryObject<EntityType<OenoneMerula>> OENONE_MERULA =
            Entities.ENTITY_TYPES.register("oenone_merula",
                    () -> EntityType.Builder.create(OenoneMerula::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "oenone_merula").toString()));
	
	public static final RegistryObject<EntityType<SeraAlbus>> SERA_ALBUS =
            Entities.ENTITY_TYPES.register("sera_albus",
                    () -> EntityType.Builder.create(SeraAlbus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "sera_albus").toString()));
	
	public static final RegistryObject<EntityType<SaxonStandingGuard>> STANDING_GUARD =
            Entities.ENTITY_TYPES.register("saxon_standing_guard",
                    () -> EntityType.Builder.create(SaxonStandingGuard::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "saxon_standing_guard").toString()));
	
	public static final RegistryObject<EntityType<SaxonPatrollingGuard>> PATROLLING_GUARD =
            Entities.ENTITY_TYPES.register("saxon_patrolling_guard",
                    () -> EntityType.Builder.create(SaxonPatrollingGuard::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "saxon_patrolling_guard").toString()));
	
	@SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event)
    {
		event.put(ATHANASIUS_GLABER.get(), TownEntity.setCustomAttributes().create());
		event.put(CAECUS_CAUDEX.get(), TownEntity.setCustomAttributes().create());
		event.put(COSMO_GETHA.get(), TownEntity.setCustomAttributes().create());
		event.put(DIDYMUS_ACISCULUS.get(), TownEntity.setCustomAttributes().create());
		event.put(EGNATIUS_HISPALLUS.get(), TownEntity.setCustomAttributes().create());
		event.put(FEROX_AUGUR.get(), TownEntity.setCustomAttributes().create());
		event.put(HELIER_POTITUS.get(), TownEntity.setCustomAttributes().create());
		event.put(IANUARIUS_CAECUS.get(), TownEntity.setCustomAttributes().create());
		event.put(NAEVIUS_SALINATOR.get(), TownEntity.setCustomAttributes().create());
		event.put(PANTERA_ARVINA.get(), TownEntity.setCustomAttributes().create());
		event.put(PHILOTHEUS_BLASIO.get(), TownEntity.setCustomAttributes().create());
		event.put(QUIQUE_UNIMANUS.get(), TownEntity.setCustomAttributes().create());
		event.put(RUFUS_CALUSSA.get(), TownEntity.setCustomAttributes().create());
		event.put(SERAPHINUS_ASELLUS.get(), TownEntity.setCustomAttributes().create());
		event.put(VALERIAN_JUNIANUS.get(), TownEntity.setCustomAttributes().create());
		event.put(ADELIA_MESSALA.get(), TownEntity.setCustomAttributes().create());
		event.put(AURELIA_PROCILLUS.get(), TownEntity.setCustomAttributes().create());
		event.put(CYRA_AMBUSTUS.get(), TownEntity.setCustomAttributes().create());
		event.put(ELIANNA_SURA.get(), TownEntity.setCustomAttributes().create());
		event.put(HESTER_GETA.get(), TownEntity.setCustomAttributes().create());
		event.put(JOANNA_CINNA.get(), TownEntity.setCustomAttributes().create());
		event.put(KRISTA_VIBULANUS.get(), TownEntity.setCustomAttributes().create());
		event.put(LORINA_VESTALIS.get(), TownEntity.setCustomAttributes().create());
		event.put(OENONE_MERULA.get(), TownEntity.setCustomAttributes().create());
		event.put(SERA_ALBUS.get(), TownEntity.setCustomAttributes().create());
		event.put(STANDING_GUARD.get(), GuardEntity.setCustomAttributes().create());
		event.put(PATROLLING_GUARD.get(), GuardEntity.setCustomAttributes().create());

    }
	
	public static void renderAllEntities()
	{
		RenderingRegistry.registerEntityRenderingHandler(ATHANASIUS_GLABER.get(), AthanasiusGlaberSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(CAECUS_CAUDEX.get(), CaecusCaudexSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(COSMO_GETHA.get(), CosmosGethaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(DIDYMUS_ACISCULUS.get(), DidymusAcisculusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(EGNATIUS_HISPALLUS.get(), EgnatiusHispallusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(FEROX_AUGUR.get(), FeroxAugurSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HELIER_POTITUS.get(), HelierPotitusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(IANUARIUS_CAECUS.get(), IanuariusCaecusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NAEVIUS_SALINATOR.get(), NaeviusSalinatorSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PANTERA_ARVINA.get(), PanteraArvinaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PHILOTHEUS_BLASIO.get(), PhilotheusBlasioSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(QUIQUE_UNIMANUS.get(), QuiqueUnimanusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(RUFUS_CALUSSA.get(), RufusCalussaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(SERAPHINUS_ASELLUS.get(), SeraphinusAsellusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(VALERIAN_JUNIANUS.get(), ValerianJunianusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ADELIA_MESSALA.get(), AdeliaMessalaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(AURELIA_PROCILLUS.get(), AureliaProcillusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(CYRA_AMBUSTUS.get(), CyraAmbustusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ELIANNA_SURA.get(), EliannaSuraSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HESTER_GETA.get(), HesterGetaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(JOANNA_CINNA.get(), JoannaCinnaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(KRISTA_VIBULANUS.get(), KristaVibulanusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LORINA_VESTALIS.get(), LorinaVestalisSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(OENONE_MERULA.get(), OenoneMerulaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(SERA_ALBUS.get(), SeraAlbusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(STANDING_GUARD.get(), SaxonStandingGuardSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PATROLLING_GUARD.get(), SaxonPatrollingGuardSkin::new);
	}
	
}
