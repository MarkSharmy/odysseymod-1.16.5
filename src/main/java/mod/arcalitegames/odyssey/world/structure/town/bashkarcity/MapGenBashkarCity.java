package mod.arcalitegames.odyssey.world.structure.town.bashkarcity;

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


public class MapGenBashkarCity extends Structure<NoFeatureConfig>
{
    private static BlockPos origin;

    public MapGenBashkarCity() {
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
        return MapGenBashkarCity.Start::new;
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
                            .getOrDefault(new ResourceLocation(OdysseyMod.MODID, "bashkar_city/start_pool")),
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

            origin = blockpos.up(76);
        }
    }

    public static class StructurePiece
    {
    	public static int generatePart = 100;
        public static BashkarCity structure;

        public static void generate(World world)
        {
            if(origin != null)
            {
                structure = new BashkarCity(world, origin, 0, 0, 0);
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
            BashkarComponent0.generatePart1();
            BashkarComponent0.generatePart2();
            StructurePiece.generatePart = 2;
        }

        public static void generatePart2()
        {
            BashkarComponent0.generatePart3();
            BashkarComponent0.generatePart4();
            StructurePiece.generatePart = 3;
        }

        public static void generatePart3()
        {
            BashkarComponent0.generatePart5();
            BashkarComponent0.generatePart6();
            StructurePiece.generatePart = 4;
        }

        public static void generatePart4()
        {
            BashkarComponent0.generatePart7();
            BashkarComponent0.generatePart8();
            StructurePiece.generatePart = 5;
        }

        public static void generatePart5()
        {
            BashkarComponent0.generatePart9();
            BashkarComponent0.generatePart10();
            StructurePiece.generatePart = 6;
        }

        public static void generatePart6()
        {
            BashkarComponent1.generatePart11();
            BashkarComponent1.generatePart12();
            StructurePiece.generatePart = 7;
        }

        public static void generatePart7()
        {
        	BashkarComponent1.generatePart13();
        	BashkarComponent1.generatePart14();
            StructurePiece.generatePart = 8;
        }

        public static void generatePart8()
        {
        	BashkarComponent1.generatePart15();
        	BashkarComponent1.generatePart16();
            StructurePiece.generatePart = 9;
        }

        public static void generatePart9()
        {
        	BashkarComponent1.generatePart17();
        	BashkarComponent1.generatePart18();
            StructurePiece.generatePart = 10;
        }

        public static void generatePart10()
        {
        	BashkarComponent1.generatePart19();
        	BashkarComponent1.generatePart20();
            StructurePiece.generatePart = 11;
        }

        public static void generatePart11()
        {
            BashkarComponent2.generatePart21();
            BashkarComponent2.generatePart22();
            StructurePiece.generatePart = 12;
        }
        
        public static void generatePart12()
        {
            BashkarComponent2.generatePart23();
            BashkarComponent2.generatePart24();
            BashkarComponent2.generatePart25();
            StructurePiece.generatePart = 0;
        }

    }
}
