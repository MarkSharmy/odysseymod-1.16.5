package mod.arcalitegames.system.ai;

import mod.arcalitegames.odyssey.blocks.MarkerBlock;
import mod.arcalitegames.odyssey.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.google.common.collect.Lists;

public class StructureAnalyzer
{
    private static int count = 1;
    private static String fileName;
    private static File file;
    private static BlockPos origin;
    private static BlockPos pos1;
    private static BlockPos pos2;
    private static CitizenParser parser;

    public static boolean createNewFile(String designatedName)
    {
    	parser = new CitizenParser("boromir");
        fileName = "C:\\Users\\Wilmac\\Documents\\Minecraft\\Structures-1.16.5\\" + designatedName + ".dat";
        
        try {

            file = new File(fileName);
            file.createNewFile();
            System.out.println(file.toString());
            return true;

        }catch(Exception e)
        {
            System.out.println("FAILED");
            e.printStackTrace();
        }

        return false;

    }

    public static void analyze(World world, PlayerEntity player)
    {
        int xMax = pos2.getX() - pos1.getX();
        int yMax = pos2.getY() - pos1.getY();
        int zMax = pos2.getZ() - pos1.getZ();

        player.sendMessage(new StringTextComponent("Analyzing. . ."), player.getUniqueID());

        for(int i = 0; i <= xMax; i++)
        {
            for(int j = 0; j <= yMax; j++)
            {
                for(int k = 0; k <= zMax; k++)
                {
                    BlockPos blockpos = new BlockPos(pos1.getX() + i, pos1.getY() + j, pos1.getZ() + k);
                    Block block = world.getBlockState(blockpos).getBlock();
                    if(block instanceof MarkerBlock)
                    {
                        player.sendMessage(new StringTextComponent("marking: " + block.toString()), player.getUniqueID());
                        detectMarker(block, blockpos);
                    }
                }
            }
        }
    }
    
    public static void trackMarkers(World world, PlayerEntity player)
    {
        int xMax = pos2.getX() - pos1.getX();
        int yMax = pos2.getY() - pos1.getY();
        int zMax = pos2.getZ() - pos1.getZ();
        List<Block> markers = Lists.newArrayList();
        
        player.sendMessage(new StringTextComponent("Analyzing. . ."), player.getUniqueID());

        for(int i = 0; i <= xMax; i++)
        {
            for(int j = 0; j <= yMax; j++)
            {
                for(int k = 0; k <= zMax; k++)
                {
                    BlockPos blockpos = new BlockPos(pos1.getX() + i, pos1.getY() + j, pos1.getZ() + k);
                    Block block = world.getBlockState(blockpos).getBlock();
                    if(block == ModBlocks.CITIZEN_MARKER.get())
                    {
                       markers.add(block);
                    }
                }
            }
        }
        
        player.sendMessage(new StringTextComponent("Number of marker: " + markers.size()), player.getUniqueID());
    }

    public static boolean setOrigin()
    {
        System.out.println("Calling origin.");
        System.out.println("File info: " + file.getAbsolutePath()+", Exists: " + file.exists());
        System.out.println("Pos1: " + pos1.toString());
        if(file != null)
        {
            if(pos1 != null)
            {
                origin = pos1;
                System.out.println("Origin: " + origin.toString());
                return true;
            }
        }

        return false;
    }

    public static void setFirstPosition(BlockPos pos)
    {
        pos1 = pos;
        System.out.println("First pos set to: " + pos1.toString());
    }

    public static void setSecondPosition(BlockPos pos)
    {
        pos2 = pos;
        System.out.println("Second pos set to: " + pos2.toString());
    }
    
    public static void spawnEntity(String entity)
    {
        int xMin = pos1.getX() - origin.getX();
        int yMin = pos1.getY() - origin.getY();
        int zMin = pos1.getZ() - origin.getZ();

        try {
        	
            FileWriter writer = new FileWriter(file, true);
            PrintWriter output = new PrintWriter(writer);
            
            output.println("        ModEntity " + entity + " = " + "(ModEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entity+"\")).create(world);");
            output.println("        this.spawnEntity(" + entity + ", world, " + xMin + ", " + (yMin + 1) + ", " + zMin + ", start);");

            output.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("ERROR");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void detectMarker(Block block, BlockPos pos)
    {
        String entityObject = "";
        String entityName = "";
        String entityType = "";

        if(block == ModBlocks.CHEST_MARKER_1.get())
        {
            markChestBlock(1, pos);
        }
        else if(block == ModBlocks.CHEST_MARKER_2.get())
        {
            markChestBlock(2, pos);
        }
        else if(block ==ModBlocks.CHEST_MARKER_3.get())
        {
            markChestBlock(3, pos);
        }
        else if(block == ModBlocks.BANDIT_MARKER.get())
        {
            entityType = "bandit";
            entityName = "bandit" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:bandit\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.BANDIT_OUTLAW_MARKER.get())
        {
            entityType = "bandit_outlaw";
            entityName = "bandit_outlaw" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:bandit_outlaw\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.BANDIT_THUG_MARKER.get())
        {
            entityType = "bandit_thug";
            entityName = "bandit_thug" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:bandit_thug\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.BANDIT_PLUNDERER_MARKER.get())
        {
            entityType = "bandit_plunderer";
            entityName = "bandit_plunderer" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:bandit_plunderer\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.BANDIT_MARAUDER_MARKER.get())
        {
            entityType = "bandit_marauder";
            entityName = "bandit_marauder" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:bandit_marauder\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.COUNTER_MARKER.get())
        {
            entityType = "counter";
            entityName = "counter" + count;
            entityObject = "CounterEntity " + entityName + " = " + "(CounterEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:counter\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.GOBLIN_KNOCKER_MARKER.get())
        {
            entityType = "goblin_knocker";
            entityName = "goblin_knocker" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:goblin_knocker\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.GOBLIN_HOBGOBLIN_MARKER.get())
        {
            entityType = "hobgoblin";
            entityName = "hobgoblin" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:goblin_hobgoblin\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.GOBLIN_KOBOLD_MARKER.get())
        {
            entityType = "goblin_kobold";
            entityName = "goblin_kobold" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:goblin_kobold\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.GOBLIN_TROW_MARKER.get())
        {
            entityType = "goblin_trow";
            entityName = "goblin_trow" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:goblin_trow\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.DREAD_GHOUL_MARKER.get())
        {
            entityType = "dread_ghoul";
            entityName = "dread_ghoul" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:dread_ghoul\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.DREAD_THRALL_MARKER.get())
        {
            entityType = "dread_thrall";
            entityName = "dread_thrall" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:dread_thrall\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.DREAD_KNIGHT_MARKER.get())
        {
            entityType = "dread_knight";
            entityName = "dread_knight" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:dread_knight\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.DREAD_LICH_MARKER.get())
        {
            entityType = "dread_lich";
            entityName = "dread_lich" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:dread_lich\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.DREAD_BEAST_MARKER.get())
        {
            entityType = "dread_beast";
            entityName = "dread_beast" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:dread_beast\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.DREAD_QUEEN_MARKER.get())
        {
            entityType = "hydra";
            entityName = "hydra" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:hydra\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.ZOMBIE_MARKER.get())
        {
            entityType = "zombie";
            entityName = "zombie" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:zombie\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.HUSK_MARKER.get())
        {
            entityType = "husk";
            entityName = "husk" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:husk\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.SKELETON_MARKER.get())
        {
            entityType = "skeleton";
            entityName = "skeleton" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:skeleton\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.WITCH_MARKER.get())
        {
            entityType = "witch";
            entityName = "witch" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:witch\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.VINDICATOR_MARKER.get())
        {
            entityType = "vindicator";
            entityName = "vindicator" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:vindicator\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.EVOKER_MARKER.get())
        {
            entityType = "evoker";
            entityName = "evoker" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:evoker\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.ILLUSIONER_MARKER.get())
        {
            entityType = "illusioner";
            entityName = "illusioner" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:illusioner\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.PILLAGER_MARKER.get())
        {
            entityType = "pillager";
            entityName = "pillager" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:pillager\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.RAVANGER_MARKER.get())
        {
            entityType = "ravager";
            entityName = "ravager" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:ravager\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        else if(block == ModBlocks.SLIME_MARKER.get())
        {
            entityType = "slime";
            entityName = "slime" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"minecraft:slime\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }

        else if(block == ModBlocks.TROLL_MARKER.get())
        {
            entityType = "troll";
            entityName = "troll" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:troll\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }

        else if(block == ModBlocks.HYDRA_MARKER.get())
        {
            entityType = "hydra";
            entityName = "hydra" + count;
            entityObject = "CreatureEntity " + entityName + " = " + "(CreatureEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"iceandfire:hydra\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.CITIZEN_MARKER.get())
        {
        	entityType = "citizen";
        	entityName = parser.getEntityName();
        	entityObject = "CitizenEntity " + entityName + " = " + "(CitizenEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
        	markEntity(entityObject, entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.STANDING_GUARD_MARKER.get())
        {
        	String guard = "odysseymod:boromir_standing_guard";
        	String guardType = "BoromirStandingGuard ";
            entityType = "standing_guard";
            entityName = "standing_guard" + count;
            entityObject = guardType + entityName + " = " + "("+guardType+") Objects.requireNonNull(EntityParser.getEntityFromName(\""+guard+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.PATROLLING_GUARD_MARKER.get())
        {
        	String guard = "odysseymod:boromir_patrolling_guard";
        	String guardType = "BoromirPatrollingGuard ";
            entityType = "patrolling_guard";
            entityName = "patrolling_guard" + count;
            entityObject = guardType + entityName + " = " + "("+guardType+") Objects.requireNonNull(EntityParser.getEntityFromName(\""+guard+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.ALCHEMIST_MARKER.get())
        {
            entityType = "merchant";
            entityName = "alchemist";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:alchemist\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.BAKERY_MARKER.get())
        {
            entityType = "merchant";
            entityName = "baker";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.BLACKSMITH_MARKER.get())
        {
            entityType = "merchant";
            entityName = "blacksmith";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.BUTCHER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "butcher";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.CRAFTSMAN_MARKER.get())
        {
            entityType = "merchant";
            entityName = "craftsman";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.DECOR_MARKER.get())
        {
            entityType = "merchant";
            entityName = "decor_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.FARMER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "farming_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.FLETCHER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "fletching_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.FRUIT_VENDOR_MARKER.get())
        {
            entityType = "merchant";
            entityName = "fruit_vendor";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.GUILDMASTER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "guildmaster";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.RANCHER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "horse_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.RANCHER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "horse_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.INNKEEPER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "inn_keeper";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.MINER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "mineshop_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.MONEYCHANGER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "money_changer";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.PRODUCE_VENDOR_MARKER.get())
        {
            entityType = "merchant";
            entityName = "produce_vendor";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.REDSTONE_MARKER.get())
        {
            entityType = "merchant";
            entityName = "redstone_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.REDSTONE_MARKER.get())
        {
            entityType = "merchant";
            entityName = "redstone_merchant";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }
        
        else if(block == ModBlocks.SHOPKEEPER_MARKER.get())
        {
            entityType = "merchant";
            entityName = "shop_keeper";
            entityObject = "MerchantEntity " + entityName + " = " + "(MerchantEntity) Objects.requireNonNull(EntityParser.getEntityFromName(\"odysseymod:"+entityName+"\")).create(world);";
            markEntity(entityObject,entityType, entityName, pos);
        }

    }

    private static void markEntity(String object,String entityType, String entity, BlockPos blockPos)
    {
        int xMin = blockPos.getX() - origin.getX();
        int yMin = blockPos.getY() - origin.getY();
        int zMin = blockPos.getZ() - origin.getZ();

        try {
            FileWriter writer = new FileWriter(file, true);
            PrintWriter output = new PrintWriter(writer);
            output.println("    " + object);
            output.println("    " + "this.setItemsForEntity("+entity+", "+"\""+entityType+ "\"" +");");
            output.println("    this.spawnEntity("+ entity +", world, "+ xMin +", "+ yMin +", "+ zMin +", start);");

            output.close();
            writer.close();

        }catch(IOException e)
        {
            System.out.println("ERROR");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        count ++;
    }

    private static void markChestBlock(int level, BlockPos blockPos)
    {
        int xMin = blockPos.getX() - origin.getX();
        int yMin = blockPos.getY() - origin.getY();
        int zMin = blockPos.getZ() - origin.getZ();

        String state = "";
        List<String> args = new ArrayList<>();
        World world = Minecraft.getInstance().world;
        if(world != null)
        {
            BlockState blockState = world.getBlockState(blockPos);
            state = blockState.toString();
        }


        String data = state;
        String facing;
        String extract = "";

        char[] cat  = data.toCharArray();

        for(char c: cat)
        {
            if(c == ':')
                extract += new String(new char[] {','});
            else if(c == '{')
                extract += new String(new char[] {','});
            else if(c == '}')
                extract += new String(new char[] {','});
            else if(c == '[')
                extract += new String(new char[] {','});
            else if(c == '=')
                extract += new String(new char[] {','});
            else if(c == ']')
                extract += new String(new char[] {','});
            else
                extract += new String(new char[] {c});
        }

        String[] values = extract.split(",");

        for(int i = 0; i < values.length; i++)
        {
            args.add(values[i]);
        }

        facing = "Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();

        try {
            FileWriter writer = new FileWriter(file, true);
            PrintWriter output = new PrintWriter(writer);
            output.println("    this.generateChest(world, "+ facing +", "+ xMin +", "+ yMin +", "+ zMin +", start, "+ level +");");

            output.close();
            writer.close();

        }catch(IOException e)
        {
            System.out.println("ERROR");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
