package mod.arcalitegames.odyssey.world.structure.town.fortmesa;

import mod.arcalitegames.OdysseyMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.structure.AbstractVillagePiece;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.feature.template.TemplateManager;


public class MapGenFortMesa extends Structure<NoFeatureConfig>
{
    private static BlockPos origin;

    public MapGenFortMesa() {
        super(NoFeatureConfig.CODEC);
    }

    @Override
    public GenerationStage.Decoration getDecorationStage() {
        return GenerationStage.Decoration.SURFACE_STRUCTURES;
    }

    //check valid spawn chunk
    @Override
    protected boolean func_230363_a_(ChunkGenerator chunkGenerator, BiomeProvider biomeSource, long seed, SharedSeedRandom chunkRandom, int chunkX, int chunkZ, Biome biome, ChunkPos chunkPos, NoFeatureConfig featureConfig)
    {
        return true;
    }

    @Override
    public IStartFactory<NoFeatureConfig> getStartFactory() {
        return MapGenFortMesa.Start::new;
    }

    public static class Start extends StructureStart<NoFeatureConfig>
    {
        public Structure<NoFeatureConfig> structure;

        public Start(Structure<NoFeatureConfig> structureIn, int chunkX, int chunkZ,
                     MutableBoundingBox mutableBoundingBox, int referenceIn, long seedIn)
        {
            super(structureIn, chunkX, chunkZ, mutableBoundingBox, referenceIn, seedIn);
        }

        @Override // generatePieces
        public void func_230364_a_(DynamicRegistries dynamicRegistryManager, ChunkGenerator chunkGenerator,
                                   TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn,
                                   NoFeatureConfig config) {
            // Turns the chunk coordinates into actual coordinates we can use. (Gets center of that chunk)
            int x = (chunkX << 4) + 7;
            int z = (chunkZ << 4) + 7;
            BlockPos blockpos = new BlockPos(x, 0, z);

            //addpieces()
            JigsawManager.func_242837_a(dynamicRegistryManager,
                    new VillageConfig(() -> dynamicRegistryManager
                            .getRegistry(Registry.JIGSAW_POOL_KEY)
                            .getOrDefault(new ResourceLocation(OdysseyMod.MODID, "fort_mesa/start_pool")),
                            10),
                    AbstractVillagePiece::new,
                    chunkGenerator,
                    templateManagerIn,
                    blockpos,
                    this.components,
                    this.rand,
                    false,
                    true);

            this.components.forEach(piece -> piece.offset(0, 1, 0));
            this.components.forEach(piece -> piece.getBoundingBox().minY -= 1);
            this.recalculateStructureSize();

            origin = blockpos.up(74);
        }
    }

    public static class StructurePiece
    {
    	public static int generatePart = 100;
        public static FortMesa structure;

        public static void generate(World world)
        {
            if(origin != null)
            {
                structure = new FortMesa(world, origin, 0, 0, 0);
                generatePart = 1;
                origin = null;
            }
        }

        public static void generateEntitiesAndChest()
        {
            structure.addEntitiesAndSpawn();
            generatePart = 100;
        }
        
        public static boolean canGeneratePart(int part)
        {
        	return StructurePiece.generatePart == part;
        }

        public static boolean canSpawnEntitiesAndChest()
        {
            return generatePart == 0;
        }

        public static void generatePart1()
        {
            FortMesaComponent0.generatePart1();
            FortMesaComponent0.generatePart2();
            StructurePiece.generatePart = 2;
        }

        public static void generatePart2()
        {
            FortMesaComponent0.generatePart3();
            FortMesaComponent0.generatePart4();
            StructurePiece.generatePart = 3;
        }

        public static void generatePart3()
        {
            FortMesaComponent0.generatePart5();
            FortMesaComponent0.generatePart6();
            StructurePiece.generatePart = 4;
        }

        public static void generatePart4()
        {
            FortMesaComponent0.generatePart7();
            FortMesaComponent0.generatePart8();
            StructurePiece.generatePart = 5;
        }

        public static void generatePart5()
        {
            FortMesaComponent0.generatePart9();
            FortMesaComponent0.generatePart10();
            StructurePiece.generatePart = 6;
        }

        public static void generatePart6()
        {
            FortMesaComponent1.generatePart11();
            FortMesaComponent1.generatePart12();
            StructurePiece.generatePart = 7;
        }

        public static void generatePart7()
        {
        	FortMesaComponent1.generatePart13();
        	FortMesaComponent1.generatePart14();
            StructurePiece.generatePart = 8;
        }

        public static void generatePart8()
        {
        	FortMesaComponent1.generatePart15();
        	FortMesaComponent1.generatePart16();
            StructurePiece.generatePart = 9;
        }

        public static void generatePart9()
        {
        	FortMesaComponent1.generatePart17();
        	FortMesaComponent1.generatePart18();
            StructurePiece.generatePart = 10;
        }

        public static void generatePart10()
        {
        	FortMesaComponent1.generatePart19();
        	FortMesaComponent1.generatePart20();
            StructurePiece.generatePart = 0;
        }


    }
}
