package mod.arcalitegames.odyssey.entity.citizens.boromirtown;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.entities.*;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.guards.BoromirPatrollingGuard;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.guards.BoromirPatrollingGuardSkin;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.guards.BoromirStandingGuard;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.guards.BoromirStandingGuardSkin;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.renderers.*;
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
public class BoromirTown
{
	public static final RegistryObject<EntityType<AlphaneusLewin>> ALPHANEUS_LEWIN =
            Entities.ENTITY_TYPES.register("alphaneus_lewin",
                    () -> EntityType.Builder.create(AlphaneusLewin::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "alphaneus_lewin").toString()));
	
	public static final RegistryObject<EntityType<AurelianaHuyler>> AURELIANA_HUYLER =
            Entities.ENTITY_TYPES.register("aureliana_huyler",
                    () -> EntityType.Builder.create(AurelianaHuyler::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "aureliana_huyler").toString()));
	
	public static final RegistryObject<EntityType<CamillaBinus>> CAMILLA_BINUS =
            Entities.ENTITY_TYPES.register("camilla_binus",
                    () -> EntityType.Builder.create(CamillaBinus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "camilla_binus").toString()));
	
	public static final RegistryObject<EntityType<CeasRosmer>> CEAS_ROSMER =
            Entities.ENTITY_TYPES.register("ceas_rosmer",
                    () -> EntityType.Builder.create(CeasRosmer::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "ceas_rosmer").toString()));
	
	public static final RegistryObject<EntityType<FerminBlommen>> FERMIN_BLOMMEN =
            Entities.ENTITY_TYPES.register("fermin_blommen",
                    () -> EntityType.Builder.create(FerminBlommen::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "fermin_blommen").toString()));
	
	public static final RegistryObject<EntityType<GeltherEchener>> GELTHER_ECHENER =
            Entities.ENTITY_TYPES.register("gelther_echener",
                    () -> EntityType.Builder.create(GeltherEchener::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "gelther_echener").toString()));
	
	public static final RegistryObject<EntityType<GeoffBoeke>> GEOFF_BOEKE =
            Entities.ENTITY_TYPES.register("geoff_boeke",
                    () -> EntityType.Builder.create(GeoffBoeke::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "geoff_boeke").toString()));
	
	public static final RegistryObject<EntityType<HedleyBakere>> HEDLEY_BAKERE =
            Entities.ENTITY_TYPES.register("hedley_bakere",
                    () -> EntityType.Builder.create(HedleyBakere::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hedley_bakere").toString()));
	
	public static final RegistryObject<EntityType<HildithaBordeaux>> HILDITHA_BORDEAUX =
            Entities.ENTITY_TYPES.register("hilditha_bordeaux",
                    () -> EntityType.Builder.create(HildithaBordeaux::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hilditha_bordeaux").toString()));
	
	public static final RegistryObject<EntityType<ImanieKarge>> IMANIE_KARGE =
            Entities.ENTITY_TYPES.register("imanie_karge",
                    () -> EntityType.Builder.create(ImanieKarge::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "imanie_karge").toString()));
	
	public static final RegistryObject<EntityType<JonathasAndretto>> JONATHAS_ANDRETTO =
            Entities.ENTITY_TYPES.register("jonathas_andretto",
                    () -> EntityType.Builder.create(JonathasAndretto::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "jonathas_andretto").toString()));
	
	public static final RegistryObject<EntityType<JulienneHunte>> JULIENNE_HUNTE =
            Entities.ENTITY_TYPES.register("julienne_hunte",
                    () -> EntityType.Builder.create(JulienneHunte::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "julienne_hunte").toString()));
	
	public static final RegistryObject<EntityType<KarlesHauser>> KARLES_HAUSER =
            Entities.ENTITY_TYPES.register("karles_hauser",
                    () -> EntityType.Builder.create(KarlesHauser::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "karles_hauser").toString()));
	
	public static final RegistryObject<EntityType<LandonBakere>> LANDON_BAKERE =
            Entities.ENTITY_TYPES.register("landon_bakere",
                    () -> EntityType.Builder.create(LandonBakere::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "landon_bakere").toString()));
	
	public static final RegistryObject<EntityType<LauranaSlyke>> LAURANA_SLYKE =
            Entities.ENTITY_TYPES.register("laurana_slyke",
                    () -> EntityType.Builder.create(LauranaSlyke::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "laurana_slyke").toString()));
	
	public static final RegistryObject<EntityType<LeanneEdgare>> LEANNE_EDGARE =
            Entities.ENTITY_TYPES.register("leanne_edgare",
                    () -> EntityType.Builder.create(LeanneEdgare::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "leanne_edgare").toString()));
	
	public static final RegistryObject<EntityType<LeontinaCrassinus>> LEONTINA_CRASSINUS =
            Entities.ENTITY_TYPES.register("leontina_crassinus",
                    () -> EntityType.Builder.create(LeontinaCrassinus::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "leontina_crassinus").toString()));
	
	public static final RegistryObject<EntityType<LudwigWinne>> LUDWIG_WINNE =
            Entities.ENTITY_TYPES.register("ludwig_winne",
                    () -> EntityType.Builder.create(LudwigWinne::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "ludwig_winne").toString()));
	
	public static final RegistryObject<EntityType<NiciaAndretto>> NICIA_ANDRETTO =
            Entities.ENTITY_TYPES.register("nicia_andretto",
                    () -> EntityType.Builder.create(NiciaAndretto::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "nicia_andretto").toString()));
	
	public static final RegistryObject<EntityType<OswinByrde>> OSWIN_BYRDE =
            Entities.ENTITY_TYPES.register("oswin_bryde",
                    () -> EntityType.Builder.create(OswinByrde::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "oswin_bryde").toString()));
	
	public static final RegistryObject<EntityType<PerinaYoxalle>> PERINA_YOXALLE =
            Entities.ENTITY_TYPES.register("perina_yoxalle",
                    () -> EntityType.Builder.create(PerinaYoxalle::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "perina_yoxalle").toString()));
	
	public static final RegistryObject<EntityType<PhaestusHunte>> PHAESTUS_HUNTE =
            Entities.ENTITY_TYPES.register("phaestus_hunte",
                    () -> EntityType.Builder.create(PhaestusHunte::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "phaestus_hunte").toString()));
	
	public static final RegistryObject<EntityType<PicotRoelofs>> PICOT_ROELOFS =
            Entities.ENTITY_TYPES.register("picot_roelofs",
                    () -> EntityType.Builder.create(PicotRoelofs::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "picot_roelofs").toString()));
	
	public static final RegistryObject<EntityType<ThaulosRaleigh>> THAULOS_RALEIGH =
            Entities.ENTITY_TYPES.register("thaulos_raleigh",
                    () -> EntityType.Builder.create(ThaulosRaleigh::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "thaulos_raleigh").toString()));
	
	public static final RegistryObject<EntityType<VelmaBordeaux>> VELMA_BORDEAUX =
            Entities.ENTITY_TYPES.register("velma_bordeaux",
                    () -> EntityType.Builder.create(VelmaBordeaux::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "velma_bordeaux").toString()));
	
	public static final RegistryObject<EntityType<YzebelRousset>> YZEBEL_ROUSSET =
            Entities.ENTITY_TYPES.register("yzebel_rousset",
                    () -> EntityType.Builder.create(YzebelRousset::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "yzebel_rousset").toString()));
	
	public static final RegistryObject<EntityType<BoromirStandingGuard>> STANDING_GUARD =
            Entities.ENTITY_TYPES.register("boromir_standing_guard",
                    () -> EntityType.Builder.create(BoromirStandingGuard::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "boromir_standing_guard").toString()));
	
	public static final RegistryObject<EntityType<BoromirPatrollingGuard>> PATROLLING_GUARD =
            Entities.ENTITY_TYPES.register("boromir_patrolling_guard",
                    () -> EntityType.Builder.create(BoromirPatrollingGuard::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "boromir_patrolling_guard").toString()));
	
	
	@SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event)
    {
		event.put(ALPHANEUS_LEWIN.get(), TownEntity.setCustomAttributes().create());
		event.put(AURELIANA_HUYLER.get(), TownEntity.setCustomAttributes().create());
		event.put(CAMILLA_BINUS.get(), TownEntity.setCustomAttributes().create());
		event.put(CEAS_ROSMER.get(), TownEntity.setCustomAttributes().create());
		event.put(FERMIN_BLOMMEN.get(), TownEntity.setCustomAttributes().create());
		event.put(GELTHER_ECHENER.get(), TownEntity.setCustomAttributes().create());
		event.put(GEOFF_BOEKE.get(), TownEntity.setCustomAttributes().create());
		event.put(HEDLEY_BAKERE.get(), TownEntity.setCustomAttributes().create());
		event.put(HILDITHA_BORDEAUX.get(), TownEntity.setCustomAttributes().create());
		event.put(IMANIE_KARGE.get(), TownEntity.setCustomAttributes().create());
		event.put(JONATHAS_ANDRETTO.get(), TownEntity.setCustomAttributes().create());
		event.put(JULIENNE_HUNTE.get(), TownEntity.setCustomAttributes().create());
		event.put(KARLES_HAUSER.get(), TownEntity.setCustomAttributes().create());
		event.put(LANDON_BAKERE.get(), TownEntity.setCustomAttributes().create());
		event.put(LAURANA_SLYKE.get(), TownEntity.setCustomAttributes().create());
		event.put(LEANNE_EDGARE.get(), TownEntity.setCustomAttributes().create());
		event.put(LEONTINA_CRASSINUS.get(), TownEntity.setCustomAttributes().create());
		event.put(LUDWIG_WINNE.get(), TownEntity.setCustomAttributes().create());
		event.put(NICIA_ANDRETTO.get(), TownEntity.setCustomAttributes().create());
		event.put(OSWIN_BYRDE.get(), TownEntity.setCustomAttributes().create());
		event.put(PERINA_YOXALLE.get(), TownEntity.setCustomAttributes().create());
		event.put(PHAESTUS_HUNTE.get(), TownEntity.setCustomAttributes().create());
		event.put(PICOT_ROELOFS.get(), TownEntity.setCustomAttributes().create());
		event.put(THAULOS_RALEIGH.get(), TownEntity.setCustomAttributes().create());
		event.put(VELMA_BORDEAUX.get(), TownEntity.setCustomAttributes().create());
		event.put(YZEBEL_ROUSSET.get(), TownEntity.setCustomAttributes().create());
		event.put(STANDING_GUARD.get(), GuardEntity.setCustomAttributes().create());
		event.put(PATROLLING_GUARD.get(), GuardEntity.setCustomAttributes().create());
    }
	
	public static void renderAllEntities()
	{
		RenderingRegistry.registerEntityRenderingHandler(ALPHANEUS_LEWIN.get(), AlphaneusLewinSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(AURELIANA_HUYLER.get(), AurelianaHuylerSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(CAMILLA_BINUS.get(), CamillaBinusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(CEAS_ROSMER.get(), CeasRosmerSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(FERMIN_BLOMMEN.get(), FerminBlommenSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(GELTHER_ECHENER.get(), GeltherEchenerSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(GEOFF_BOEKE.get(), GeoffBoekeSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HEDLEY_BAKERE.get(), HedleyBakereSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HILDITHA_BORDEAUX.get(), HildithaBordeauxSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(IMANIE_KARGE.get(), ImanieKargeSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(JONATHAS_ANDRETTO.get(), JonathasAndrettoSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(JULIENNE_HUNTE.get(), JulienneHunteSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(KARLES_HAUSER.get(), KarlesHauserSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LANDON_BAKERE.get(), LandonBakereSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LAURANA_SLYKE.get(), LauranaSlykeSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LEANNE_EDGARE.get(), LeanneEdgareSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LEONTINA_CRASSINUS.get(), LeontinaCrassinusSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LUDWIG_WINNE.get(), LudwigWinneSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NICIA_ANDRETTO.get(), NiciaAndrettoSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(OSWIN_BYRDE.get(), OswinByrdeSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PERINA_YOXALLE.get(), PerinaYoxalleSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PHAESTUS_HUNTE.get(), PhaestusHunteSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PICOT_ROELOFS.get(), PicotRoelofsSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(THAULOS_RALEIGH.get(), ThaulosRaleighSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(VELMA_BORDEAUX.get(), VelmaBordeauxSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(YZEBEL_ROUSSET.get(), YzebelRoussetSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(STANDING_GUARD.get(), BoromirStandingGuardSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PATROLLING_GUARD.get(), BoromirPatrollingGuardSkin::new);
	}
}
