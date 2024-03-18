package mod.arcalitegames.odyssey.entity.citizens.bashkarcity;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AalamNoori;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AbdullahMahfouz;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AfraSarah;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AlyanRabbani;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AmirBaksh;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AsifaWaheed;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.AzharMadani;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.BahirIslam;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.CasildoRassi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.DabirMeer;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.FaiqaRauf;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.FanilaAbdou;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.FarazAmmar;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.GharamNaderi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.GhashiaSaab;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.HafifahMaroun;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.HashimJabbour;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.HawiyaDar;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.HaziqaKazemi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.HulyahRais;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.JamaleAzzam;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.JazaRiaz;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.KadynGhazi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.KhalidMeskin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.KhulusSatter;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.LaseefRabbani;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.LatifSani;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.LujaynSoliman;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.MahibahRahman;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.MawiyahPopal;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.MubarakAbdelrahman;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.MurtadiHariri;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.MusfirahAbed;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.NashHabib;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.NasheemMahdi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.NasyaAbad;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.NoreenWali;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.QabilShahan;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.RaainaIshmael;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.RoheenYounis;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.RukanMansouri;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.ShaffanSamara;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.ShafiqHashemi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.ShunnarKamali;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.TaimaAbdalla;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.TehminaBaluch;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.UmairKhalili;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.WajeedaKazmi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.WaleedAmen;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.entities.YaminahHashmi;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.guards.BashkarPatrollingGuard;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.guards.BashkarPatrollingGuardSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.guards.BashkarStandingGuard;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.guards.BashkarStandingGuardSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.AalamNooriSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.AbdullahMahfouzSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.AfraSarahSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.AlyanRabbaniSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.AmirBakshSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.AsifaWaheedSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.AzharMadaniSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.BahirIslamSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.CasildoRassiSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.DabirMeerSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.FaiqaRaufSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.FanilaAbdouSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.FarazAmmarSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.GharamNaderiSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.GhashiaSaabSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.HafifahMarounSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.HashimJabbourSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.HawiyaDarSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.HaziqaKazemiSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.HulyahRaisSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.JamaleAzzamSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.JazaRiazSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.KadynGhaziSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.KhalidMeskinSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.KhulusSatterSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.LaseefRabbaniSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.LatifSaniSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.LujaynSolimanSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.MahibahRahmanSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.MawiyahPopalSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.MubarakAbdelrahmanSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.MurtadiHaririSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.MusfirahAbedSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.NashHabibSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.NasheemMahdiSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.NasyaAbadSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.NoreenWaliSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.QabilShahanSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.RaainaIshmaelSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.RoheenYounisSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.RukanMansouriSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.ShaffanSamaraSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.ShafiqHashemiSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.ShunnarKamaliSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.TaimaAbdallaSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.TehminaBaluchSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.UmairKhaliliSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.WajeedaKazmiSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.WaleedAmenSkin;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.renderers.YahminahHashmiSkin;
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
public class BashkarCity
{
	public static final RegistryObject<EntityType<AalamNoori>> AALAM_NOORI =
            Entities.ENTITY_TYPES.register("aalam_noori",
                    () -> EntityType.Builder.create(AalamNoori::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "aalam_noori").toString()));
	
    public static final RegistryObject<EntityType<AbdullahMahfouz>> ABDULLAH_MAHFOUZ =
            Entities.ENTITY_TYPES.register("abdullah_mahfouz",
                    () -> EntityType.Builder.create(AbdullahMahfouz::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "abdullah_mahfouz").toString()));
    
    public static final RegistryObject<EntityType<AmirBaksh>> AMIR_BAKSH =
            Entities.ENTITY_TYPES.register("amir_baksh",
                    () -> EntityType.Builder.create(AmirBaksh::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "amir_baksh").toString()));
    
    public static final RegistryObject<EntityType<AzharMadani>> AZHAR_MADANI =
            Entities.ENTITY_TYPES.register("azhar_madani",
                    () -> EntityType.Builder.create(AzharMadani::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "azhar_madani").toString()));
    
    public static final RegistryObject<EntityType<BahirIslam>> BAHIR_ISLAM =
            Entities.ENTITY_TYPES.register("bahir_islam",
                    () -> EntityType.Builder.create(BahirIslam::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bahir_islam").toString()));
    
    public static final RegistryObject<EntityType<CasildoRassi>> CASILDO_RASSI =
            Entities.ENTITY_TYPES.register("casildo_rassi",
                    () -> EntityType.Builder.create(CasildoRassi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "casildo_rassi").toString()));
    
    public static final RegistryObject<EntityType<DabirMeer>> DABIR_MEER =
            Entities.ENTITY_TYPES.register("dabir_meer",
                    () -> EntityType.Builder.create(DabirMeer::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "dabir_meer").toString()));
    
    public static final RegistryObject<EntityType<FaiqaRauf>> FAIQA_RAUF =
            Entities.ENTITY_TYPES.register("faiqa_rauf",
                    () -> EntityType.Builder.create(FaiqaRauf::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "faiqa_rauf").toString()));
    
    public static final RegistryObject<EntityType<FarazAmmar>> FARAZ_AMMAR =
            Entities.ENTITY_TYPES.register("faraz_ammar",
                    () -> EntityType.Builder.create(FarazAmmar::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "faraz_ammar").toString()));
    
    public static final RegistryObject<EntityType<HashimJabbour>> HASHIM_JABBOUR =
            Entities.ENTITY_TYPES.register("hashim_jabbour",
                    () -> EntityType.Builder.create(HashimJabbour::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hashim_jabbour").toString()));
    
    public static final RegistryObject<EntityType<JamaleAzzam>> JAMALE_AZZAM =
            Entities.ENTITY_TYPES.register("jamale_azzam",
                    () -> EntityType.Builder.create(JamaleAzzam::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "jamale_azzam").toString()));
    
    public static final RegistryObject<EntityType<KadynGhazi>> KADYN_GHAZI =
            Entities.ENTITY_TYPES.register("kadyn_ghazi",
                    () -> EntityType.Builder.create(KadynGhazi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "kadyn_ghazi").toString()));
    
    public static final RegistryObject<EntityType<KhalidMeskin>> KHALID_MESKIN =
            Entities.ENTITY_TYPES.register("khalid_meskin",
                    () -> EntityType.Builder.create(KhalidMeskin::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "khalid_meskin").toString()));
    
    public static final RegistryObject<EntityType<LatifSani>> LATIF_SANI =
            Entities.ENTITY_TYPES.register("latif_sani",
                    () -> EntityType.Builder.create(LatifSani::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "latif_sani").toString()));
    
    public static final RegistryObject<EntityType<LujaynSoliman>> LUJAYN_SOLIMAN =
            Entities.ENTITY_TYPES.register("lujayn_soliman",
                    () -> EntityType.Builder.create(LujaynSoliman::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "lujayn_soliman").toString()));
    
    public static final RegistryObject<EntityType<MubarakAbdelrahman>> MUBARAK_ABDELRAHMAN =
            Entities.ENTITY_TYPES.register("mubarak_abdelrahman",
                    () -> EntityType.Builder.create(MubarakAbdelrahman::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "mubarak_abdelrahman").toString()));
    
    public static final RegistryObject<EntityType<MurtadiHariri>> MURTADI_HARIRI =
            Entities.ENTITY_TYPES.register("murtadi_hariri",
                    () -> EntityType.Builder.create(MurtadiHariri::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "murtadi_hariri").toString()));
    
    public static final RegistryObject<EntityType<NashHabib>> NASH_HABIB =
            Entities.ENTITY_TYPES.register("nash_habib",
                    () -> EntityType.Builder.create(NashHabib::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "nash_habib").toString()));
    
    public static final RegistryObject<EntityType<QabilShahan>> QABIL_SHAHAN =
            Entities.ENTITY_TYPES.register("qabil_shahan",
                    () -> EntityType.Builder.create(QabilShahan::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "qabil_shahan").toString()));
    
    public static final RegistryObject<EntityType<RoheenYounis>> ROHEEN_YOUNIS =
            Entities.ENTITY_TYPES.register("roheen_younis",
                    () -> EntityType.Builder.create(RoheenYounis::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "roheen_younis").toString()));
    
    public static final RegistryObject<EntityType<ShafiqHashemi>> SHAFIQ_HASHEMI =
            Entities.ENTITY_TYPES.register("shafiq_hashemi",
                    () -> EntityType.Builder.create(ShafiqHashemi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "shafiq_hashemi").toString()));
    
    public static final RegistryObject<EntityType<ShunnarKamali>> SHUNNAR_KAMALI =
            Entities.ENTITY_TYPES.register("shunnar_kamali",
                    () -> EntityType.Builder.create(ShunnarKamali::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "shunnar_kamali").toString()));
    
    public static final RegistryObject<EntityType<UmairKhalili>> UMAIR_KHALILI =
            Entities.ENTITY_TYPES.register("umair_khalili",
                    () -> EntityType.Builder.create(UmairKhalili::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "umair_khalili").toString()));
    
    public static final RegistryObject<EntityType<WajeedaKazmi>> WAJEEDA_KAZMI =
            Entities.ENTITY_TYPES.register("wajeeda_kazmi",
                    () -> EntityType.Builder.create(WajeedaKazmi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "wajeeda_kazmi").toString()));
    
    public static final RegistryObject<EntityType<WaleedAmen>> WALEED_AMEN =
            Entities.ENTITY_TYPES.register("waleed_amen",
                    () -> EntityType.Builder.create(WaleedAmen::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "waleed_amen").toString()));
    
    public static final RegistryObject<EntityType<AfraSarah>> AFRA_SARAH =
            Entities.ENTITY_TYPES.register("afra_sarah",
                    () -> EntityType.Builder.create(AfraSarah::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "afra_sarah").toString()));
    
    public static final RegistryObject<EntityType<AlyanRabbani>> ALYAN_RABBANI =
            Entities.ENTITY_TYPES.register("alyan_rabbani",
                    () -> EntityType.Builder.create(AlyanRabbani::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "alyan_rabbani").toString()));
    
    public static final RegistryObject<EntityType<AsifaWaheed>> ASIFA_WAHEED =
            Entities.ENTITY_TYPES.register("asifa_waheed",
                    () -> EntityType.Builder.create(AsifaWaheed::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "asifa_waheed").toString()));
    
    public static final RegistryObject<EntityType<FanilaAbdou>> FANILA_ABDOU =
            Entities.ENTITY_TYPES.register("fanila_abdou",
                    () -> EntityType.Builder.create(FanilaAbdou::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "fanila_abdou").toString()));
    
    public static final RegistryObject<EntityType<GharamNaderi>> GHARAM_NADERI =
            Entities.ENTITY_TYPES.register("gharam_naderi",
                    () -> EntityType.Builder.create(GharamNaderi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "gharam_naderi").toString()));
    
    public static final RegistryObject<EntityType<GhashiaSaab>> GHASHIA_SAAB =
            Entities.ENTITY_TYPES.register("ghashia_saab",
                    () -> EntityType.Builder.create(GhashiaSaab::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "ghashia_saab").toString()));
    
    public static final RegistryObject<EntityType<HafifahMaroun>> HAFIFAH_MAROUN =
            Entities.ENTITY_TYPES.register("hafifah_maroun",
                    () -> EntityType.Builder.create(HafifahMaroun::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hafifah_maroun").toString()));
    
    public static final RegistryObject<EntityType<HawiyaDar>> HAWIYA_DAR =
            Entities.ENTITY_TYPES.register("hawiya_dar",
                    () -> EntityType.Builder.create(HawiyaDar::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hawiya_dar").toString()));
    
    public static final RegistryObject<EntityType<HaziqaKazemi>> HAZIQA_KAZEMI =
            Entities.ENTITY_TYPES.register("haziqa_kazemi",
                    () -> EntityType.Builder.create(HaziqaKazemi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "haziqa_kazemi").toString()));
    
    public static final RegistryObject<EntityType<HulyahRais>> HULYAH_RAIS =
            Entities.ENTITY_TYPES.register("hulyah_rais",
                    () -> EntityType.Builder.create(HulyahRais::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "hulyah_rais").toString()));
    
    public static final RegistryObject<EntityType<JazaRiaz>> JAZA_RIAZ =
            Entities.ENTITY_TYPES.register("jaza_riaz",
                    () -> EntityType.Builder.create(JazaRiaz::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "jaza_riaz").toString()));
    
    public static final RegistryObject<EntityType<KhulusSatter>> KHULUS_SATTER =
            Entities.ENTITY_TYPES.register("khulus_satter",
                    () -> EntityType.Builder.create(KhulusSatter::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "khulus_satter").toString()));
    
    public static final RegistryObject<EntityType<LaseefRabbani>> LASEEF_RABBANI =
            Entities.ENTITY_TYPES.register("laseef_rabbani",
                    () -> EntityType.Builder.create(LaseefRabbani::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "laseef_rabbani").toString()));
    
    public static final RegistryObject<EntityType<MahibahRahman>> MAHIBAH_RAHMAN =
            Entities.ENTITY_TYPES.register("mahibah_rahman",
                    () -> EntityType.Builder.create(MahibahRahman::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "mahibah_rahman").toString()));
    
    public static final RegistryObject<EntityType<MawiyahPopal>> MAWIYAH_POPAL =
            Entities.ENTITY_TYPES.register("mawiyah_popal",
                    () -> EntityType.Builder.create(MawiyahPopal::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "mawiyah_popal").toString()));
    
    public static final RegistryObject<EntityType<MusfirahAbed>> MUSFIRAH_ABED =
            Entities.ENTITY_TYPES.register("musfirah_abed",
                    () -> EntityType.Builder.create(MusfirahAbed::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "musfirah_abed").toString()));
    
    public static final RegistryObject<EntityType<NasheemMahdi>> NASHEEM_MAHDI =
            Entities.ENTITY_TYPES.register("nasheem_mahdi",
                    () -> EntityType.Builder.create(NasheemMahdi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "nasheem_mahdi").toString()));
    
    public static final RegistryObject<EntityType<NasyaAbad>> NASYA_ABAD =
            Entities.ENTITY_TYPES.register("nasya_abad",
                    () -> EntityType.Builder.create(NasyaAbad::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "nasya_abad").toString()));
    
    public static final RegistryObject<EntityType<NoreenWali>> NOREEN_WALI =
            Entities.ENTITY_TYPES.register("noreen_wali",
                    () -> EntityType.Builder.create(NoreenWali::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "noreen_wali").toString()));
    
    public static final RegistryObject<EntityType<RaainaIshmael>> RAAINA_ISHMAEL =
            Entities.ENTITY_TYPES.register("raaina_ishmael",
                    () -> EntityType.Builder.create(RaainaIshmael::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "raaina_ishmael").toString()));
    
    public static final RegistryObject<EntityType<RukanMansouri>> RUKAN_MANSOURI =
            Entities.ENTITY_TYPES.register("rukan_mansouri",
                    () -> EntityType.Builder.create(RukanMansouri::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "rukan_mansouri").toString()));
    
    public static final RegistryObject<EntityType<ShaffanSamara>> SHAFFAN_SAMARA =
            Entities.ENTITY_TYPES.register("shaffan_samara",
                    () -> EntityType.Builder.create(ShaffanSamara::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "shaffan_samara").toString()));
    
    public static final RegistryObject<EntityType<TaimaAbdalla>> TAIMA_ABDALLA =
            Entities.ENTITY_TYPES.register("taima_abdalla",
                    () -> EntityType.Builder.create(TaimaAbdalla::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "taima_abdalla").toString()));
    
    public static final RegistryObject<EntityType<TehminaBaluch>> TEHMINA_BALUCH =
            Entities.ENTITY_TYPES.register("tehmina_baluch",
                    () -> EntityType.Builder.create(TehminaBaluch::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "tehmina_baluch").toString()));
    
    public static final RegistryObject<EntityType<YaminahHashmi>> YAHMINAH_HASHMI =
            Entities.ENTITY_TYPES.register("yahminah_hashmi",
                    () -> EntityType.Builder.create(YaminahHashmi::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "yahminah_hashmi").toString()));
    
    public static final RegistryObject<EntityType<BashkarStandingGuard>> STANDING_GUARD =
            Entities.ENTITY_TYPES.register("bashkar_standing_guard",
                    () -> EntityType.Builder.create(BashkarStandingGuard::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bashkar_standing_guard").toString()));
	
	public static final RegistryObject<EntityType<BashkarPatrollingGuard>> PATROLLING_GUARD =
            Entities.ENTITY_TYPES.register("bashkar_patrolling_guard",
                    () -> EntityType.Builder.create(BashkarPatrollingGuard::new,
                            EntityClassification.CREATURE).size(1.0f, 3.0f)
                            .build(new ResourceLocation(OdysseyMod.MODID, "bashkar_patrolling_guard").toString()));
	
	@SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event)
    {
		event.put(AALAM_NOORI.get(), TownEntity.setCustomAttributes().create());
		event.put(ABDULLAH_MAHFOUZ.get(), TownEntity.setCustomAttributes().create());
		event.put(AMIR_BAKSH.get(), TownEntity.setCustomAttributes().create());
		event.put(AZHAR_MADANI.get(), TownEntity.setCustomAttributes().create());
		event.put(BAHIR_ISLAM.get(), TownEntity.setCustomAttributes().create());
		event.put(CASILDO_RASSI.get(), TownEntity.setCustomAttributes().create());
		event.put(DABIR_MEER.get(), TownEntity.setCustomAttributes().create());
		event.put(FAIQA_RAUF.get(), TownEntity.setCustomAttributes().create());
		event.put(FARAZ_AMMAR.get(), TownEntity.setCustomAttributes().create());
		event.put(HASHIM_JABBOUR.get(), TownEntity.setCustomAttributes().create());
		event.put(JAMALE_AZZAM.get(), TownEntity.setCustomAttributes().create());
		event.put(KADYN_GHAZI.get(), TownEntity.setCustomAttributes().create());
		event.put(KHALID_MESKIN.get(), TownEntity.setCustomAttributes().create());
		event.put(LATIF_SANI.get(), TownEntity.setCustomAttributes().create());
		event.put(LUJAYN_SOLIMAN.get(), TownEntity.setCustomAttributes().create());
		event.put(MUBARAK_ABDELRAHMAN.get(), TownEntity.setCustomAttributes().create());
		event.put(MURTADI_HARIRI.get(), TownEntity.setCustomAttributes().create());
		event.put(NASH_HABIB.get(), TownEntity.setCustomAttributes().create());
		event.put(QABIL_SHAHAN.get(), TownEntity.setCustomAttributes().create());
		event.put(ROHEEN_YOUNIS.get(), TownEntity.setCustomAttributes().create());
		event.put(SHAFIQ_HASHEMI.get(), TownEntity.setCustomAttributes().create());
		event.put(SHUNNAR_KAMALI.get(), TownEntity.setCustomAttributes().create());
		event.put(UMAIR_KHALILI.get(), TownEntity.setCustomAttributes().create());
		event.put(WAJEEDA_KAZMI.get(), TownEntity.setCustomAttributes().create());
		event.put(WALEED_AMEN.get(), TownEntity.setCustomAttributes().create());
		event.put(AFRA_SARAH.get(), TownEntity.setCustomAttributes().create());
		event.put(ALYAN_RABBANI.get(), TownEntity.setCustomAttributes().create());
		event.put(ASIFA_WAHEED.get(), TownEntity.setCustomAttributes().create());
		event.put(FANILA_ABDOU.get(), TownEntity.setCustomAttributes().create());
		event.put(GHARAM_NADERI.get(), TownEntity.setCustomAttributes().create());
		event.put(GHASHIA_SAAB.get(), TownEntity.setCustomAttributes().create());
		event.put(HAFIFAH_MAROUN.get(), TownEntity.setCustomAttributes().create());
		event.put(HAWIYA_DAR.get(), TownEntity.setCustomAttributes().create());
		event.put(HAZIQA_KAZEMI.get(), TownEntity.setCustomAttributes().create());
		event.put(HULYAH_RAIS.get(), TownEntity.setCustomAttributes().create());
		event.put(JAZA_RIAZ.get(), TownEntity.setCustomAttributes().create());
		event.put(KHULUS_SATTER.get(), TownEntity.setCustomAttributes().create());
		event.put(LASEEF_RABBANI.get(), TownEntity.setCustomAttributes().create());
		event.put(MAHIBAH_RAHMAN.get(), TownEntity.setCustomAttributes().create());
		event.put(MAWIYAH_POPAL.get(), TownEntity.setCustomAttributes().create());
		event.put(MUSFIRAH_ABED.get(), TownEntity.setCustomAttributes().create());
		event.put(NASHEEM_MAHDI.get(), TownEntity.setCustomAttributes().create());
		event.put(NASYA_ABAD.get(), TownEntity.setCustomAttributes().create());
		event.put(NOREEN_WALI.get(), TownEntity.setCustomAttributes().create());
		event.put(RAAINA_ISHMAEL.get(), TownEntity.setCustomAttributes().create());
		event.put(RUKAN_MANSOURI.get(), TownEntity.setCustomAttributes().create());
		event.put(SHAFFAN_SAMARA.get(), TownEntity.setCustomAttributes().create());
		event.put(TAIMA_ABDALLA.get(), TownEntity.setCustomAttributes().create());
		event.put(TEHMINA_BALUCH.get(), TownEntity.setCustomAttributes().create());
		event.put(YAHMINAH_HASHMI.get(), TownEntity.setCustomAttributes().create());
		event.put(STANDING_GUARD.get(), GuardEntity.setCustomAttributes().create());
		event.put(PATROLLING_GUARD.get(), GuardEntity.setCustomAttributes().create());
    }
	
	public static void renderAllEntities()
	{
		RenderingRegistry.registerEntityRenderingHandler(AALAM_NOORI.get(), AalamNooriSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ABDULLAH_MAHFOUZ.get(), AbdullahMahfouzSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(AMIR_BAKSH.get(), AmirBakshSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(AZHAR_MADANI.get(), AzharMadaniSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(BAHIR_ISLAM.get(), BahirIslamSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(CASILDO_RASSI.get(), CasildoRassiSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(DABIR_MEER.get(), DabirMeerSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(FAIQA_RAUF.get(), FaiqaRaufSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(FARAZ_AMMAR.get(), FarazAmmarSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HASHIM_JABBOUR.get(), HashimJabbourSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(JAMALE_AZZAM.get(), JamaleAzzamSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(KADYN_GHAZI.get(), KadynGhaziSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(KHALID_MESKIN.get(), KhalidMeskinSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LATIF_SANI.get(), LatifSaniSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LUJAYN_SOLIMAN.get(), LujaynSolimanSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(MUBARAK_ABDELRAHMAN.get(), MubarakAbdelrahmanSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(MURTADI_HARIRI.get(), MurtadiHaririSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NASH_HABIB.get(), NashHabibSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(QABIL_SHAHAN.get(), QabilShahanSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ROHEEN_YOUNIS.get(), RoheenYounisSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(SHAFIQ_HASHEMI.get(), ShafiqHashemiSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(SHUNNAR_KAMALI.get(), ShunnarKamaliSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(UMAIR_KHALILI.get(), UmairKhaliliSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(WAJEEDA_KAZMI.get(), WajeedaKazmiSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(WALEED_AMEN.get(), WaleedAmenSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(AFRA_SARAH.get(), AfraSarahSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ALYAN_RABBANI.get(), AlyanRabbaniSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(ASIFA_WAHEED.get(), AsifaWaheedSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(FANILA_ABDOU.get(), FanilaAbdouSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(GHARAM_NADERI.get(), GharamNaderiSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(GHASHIA_SAAB.get(), GhashiaSaabSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HAFIFAH_MAROUN.get(), HafifahMarounSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HAWIYA_DAR.get(), HawiyaDarSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HAZIQA_KAZEMI.get(), HaziqaKazemiSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(HULYAH_RAIS.get(), HulyahRaisSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(JAZA_RIAZ.get(), JazaRiazSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(KHULUS_SATTER.get(), KhulusSatterSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(LASEEF_RABBANI.get(), LaseefRabbaniSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(MAHIBAH_RAHMAN.get(), MahibahRahmanSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(MAWIYAH_POPAL.get(), MawiyahPopalSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(MUSFIRAH_ABED.get(), MusfirahAbedSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NASHEEM_MAHDI.get(), NasheemMahdiSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NASYA_ABAD.get(), NasyaAbadSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(NOREEN_WALI.get(), NoreenWaliSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(RAAINA_ISHMAEL.get(), RaainaIshmaelSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(RUKAN_MANSOURI.get(), RukanMansouriSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(SHAFFAN_SAMARA.get(), ShaffanSamaraSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(TAIMA_ABDALLA.get(), TaimaAbdallaSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(TEHMINA_BALUCH.get(), TehminaBaluchSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(YAHMINAH_HASHMI.get(), YahminahHashmiSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(STANDING_GUARD.get(), BashkarStandingGuardSkin::new);
		RenderingRegistry.registerEntityRenderingHandler(PATROLLING_GUARD.get(), BashkarPatrollingGuardSkin::new);
	}
}
