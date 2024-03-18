package mod.arcalitegames.system.ai;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;

import mod.arcalitegames.buildersaddition.blocks.Arcade;
import mod.arcalitegames.buildersaddition.blocks.BedsideTable;
import mod.arcalitegames.buildersaddition.blocks.Bench;
import mod.arcalitegames.buildersaddition.blocks.Bookshelf;
import mod.arcalitegames.buildersaddition.blocks.Cabinet;
import mod.arcalitegames.buildersaddition.blocks.Candle;
import mod.arcalitegames.buildersaddition.blocks.Counter;
import mod.arcalitegames.buildersaddition.blocks.Crossrail;
import mod.arcalitegames.buildersaddition.blocks.Cupboard;
import mod.arcalitegames.buildersaddition.blocks.EntityDetector;
import mod.arcalitegames.buildersaddition.blocks.FireplaceGuard;
import mod.arcalitegames.buildersaddition.blocks.Hedge;
import mod.arcalitegames.buildersaddition.blocks.IronFence;
import mod.arcalitegames.buildersaddition.blocks.IronLadder;
import mod.arcalitegames.buildersaddition.blocks.LargeCandle;
import mod.arcalitegames.buildersaddition.blocks.Pillar;
import mod.arcalitegames.buildersaddition.blocks.Shelf;
import mod.arcalitegames.buildersaddition.blocks.Sofa;
import mod.arcalitegames.buildersaddition.blocks.Speaker;
import mod.arcalitegames.buildersaddition.blocks.Stool;
import mod.arcalitegames.buildersaddition.blocks.SupportBracket;
import mod.arcalitegames.buildersaddition.blocks.Table;
import mod.arcalitegames.buildersaddition.blocks.VerticalComparatorBlock;
import mod.arcalitegames.buildersaddition.blocks.VerticalRepeaterBlock;
import mod.arcalitegames.buildersaddition.blocks.VerticalSlab;
import mod.arcalitegames.buildersaddition.blocks.base.GenericBlock;
import mod.arcalitegames.odyssey.blocks.ChairBlock;
import mod.arcalitegames.odyssey.blocks.MarkerBlock;
import mod.arcalitegames.odyssey.blocks.ModBlocks;
import mod.arcalitegames.odyssey.blocks.ShopSignBlock;
import mod.arcalitegames.system.util.BlockPerimeter;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BambooBlock;
import net.minecraft.block.BannerBlock;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BeetrootBlock;
import net.minecraft.block.BellBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BrewingStandBlock;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.block.CactusBlock;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.CarrotBlock;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.CauldronBlock;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.ChorusFlowerBlock;
import net.minecraft.block.CocoaBlock;
import net.minecraft.block.ComparatorBlock;
import net.minecraft.block.ComposterBlock;
import net.minecraft.block.ConduitBlock;
import net.minecraft.block.DaylightDetectorBlock;
import net.minecraft.block.DeadCoralWallFanBlock;
import net.minecraft.block.DetectorRailBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.EndPortalFrameBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.HopperBlock;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LecternBlock;
import net.minecraft.block.LeverBlock;
import net.minecraft.block.MovingPistonBlock;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.block.NoteBlock;
import net.minecraft.block.ObserverBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.PistonHeadBlock;
import net.minecraft.block.PotatoBlock;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RailBlock;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.block.RedstoneWallTorchBlock;
import net.minecraft.block.RedstoneWireBlock;
import net.minecraft.block.RepeaterBlock;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.ScaffoldingBlock;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.SkullBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SmokerBlock;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.SnowyDirtBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.block.TallSeaGrassBlock;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.TripWireBlock;
import net.minecraft.block.TripWireHookBlock;
import net.minecraft.block.TurtleEggBlock;
import net.minecraft.block.TwistingVinesTopBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.block.WallBannerBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WallSkullBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.WeepingVinesTopBlock;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class StructureScanner {

	private static File file;
	private static int count = 1;
	private static BlockPos origin;
	private static String fileName;
	private static String designatedName;
	private static String path = "C:\\Users\\Wilmac\\Documents\\Minecraft\\Structures-1.16.5\\";
	
	/** Start position for the structure. */
	private static BlockPos pos1;
	
	/** End position for the structure. */
	private static BlockPos pos2;
	
	/** A complete set of start and end positions to trace
	 * for each rectangular space within a structure.
	 */
	private static Set<BlockPerimeter> blockbase;
	
	/** A complete set of occupied positions within a structure */
	private static Set<BlockPos> database;
	
	
	/** Creates a new file with the designated name for structure data. 
	 * 
	 * @param designatedName
	 * @return
	 */
	public static boolean createNewFile(String name)
	{
		count = 1;
		designatedName = name;
        fileName = path + designatedName + ".str";
        blockbase = new LinkedHashSet<BlockPerimeter>();
        database = new LinkedHashSet<BlockPos>();

        try {

            file = new File(fileName);
            file.createNewFile();
            return true;

        } catch (Exception e) {
            System.out.println("FAILED");
            e.printStackTrace();
        }

        return false;

    }
	
	/** Opens a file with the given name. 
	 * 
	 * @param name
	 * @return
	 */
	public static boolean openFile(String name) {
        fileName = "C:\\Users\\Wilmac\\Documents\\Minecraft\\Structures-1.16.5\\" + name + ".str";
        try {

            file = new File(fileName);

            return true;

        } catch (Exception e) {
            System.out.println("FAILED");
            e.printStackTrace();
        }

        return false;
    }
	
	/** Takes a BlockPos and sets it as the origin point for a structure. */
	public static boolean setOrigin() {
        if (file != null) {
            if (pos1 != null) {
                origin = pos1;

                return true;
            }
        }

        return false;
    }
	
	private static void setBlockState(String block, BlockPos pos)
    {
        database.add(pos);
        setBlock(block, pos);
    }
	
	public static void setFirstPosition(BlockPos pos) {
        pos1 = pos;
        System.out.println("First pos set to: " + pos1.toString());
    }

    public static void setSecondPosition(BlockPos pos) {
        pos2 = pos;
        System.out.println("Second pos set to: " + pos2.toString());
    }
    
    /*
     * Writes structure data to the designated file.
     */
    private static void create3DModel()
    {
    	World world = Minecraft.getInstance().world;
    	PlayerEntity player = world.getPlayers().get(0);
    	
        for (BlockPerimeter perimeter : blockbase)
        {
        	/** Resets Pos1 to perimeter min position */
            pos1 = perimeter.getMinPos();
            
            /** Resets Pos1 to perimeter min position */
            pos2 = perimeter.getMaxPos();
            
            /** Prompt to Player 1 */
            player.sendMessage(new StringTextComponent("Block: " + perimeter.getBlock() + ", First Pos: " + pos1.toString() + ", Second Pos: " + pos2.toString()), player.getUniqueID());
            
            /** Call to fillblock writes structure data to the file */
            fillBlock(perimeter.getBlock());
        }
    }
    
    public static boolean fillBlock(String block)
    {
        if (file != null)
        {
        	
            int xMin = pos1.getX() - origin.getX();
            int yMin = pos1.getY() - origin.getY();
            int zMin = pos1.getZ() - origin.getZ();
            int xMax = pos2.getX() - origin.getX();
            int yMax = pos2.getY() - origin.getY();
            int zMax = pos2.getZ() - origin.getZ();

            try
            {
                FileWriter writer = new FileWriter(file, true);
                PrintWriter output = new PrintWriter(writer);
                output.println("        this.fillWithBlocks(world, start, " + xMin + ", " + yMin + ", " + zMin + ", " + xMax + ", " + yMax + ", " + zMax + ", " + block + ");");

                output.close();
                writer.close();

                return true;

            } catch (IOException e)
            {
                System.out.println("ERROR");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        return false;
    }
    
    public static boolean setBlock(String block, BlockPos blockpos) {
        if (file != null)
        {
        	
            int xMin = blockpos.getX() - origin.getX();
            int yMin = blockpos.getY() - origin.getY();
            int zMin = blockpos.getZ() - origin.getZ();

            try {
                FileWriter writer = new FileWriter(file, true);
                PrintWriter output = new PrintWriter(writer);
                output.println("        this.setBlockState(world, " + block + ", " + xMin + ", " + yMin + ", " + zMin + ", start);");

                output.close();
                writer.close();

                return true;

            } catch (IOException e) {
                System.out.println("ERROR");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return false;
    }
    
    /** Returns true of pos has already been traced.
     * 
     * @param pos
     * @return
     */
    public static boolean isBlockOccupied(BlockPos pos)
    {
    	for(BlockPos blockPos: database)
    	{
    		if(blockPos.equals(pos))
    			return true;
    	}
    	
    	return false;
    }
    
    /** Looks for the next Rectangular shape to trace  
     *  towards positive X, Y or Z.
     * @param world
     * @param blockstate
     * @param pos
     */
    private static void scanNextBox(World world, BlockState blockstate, BlockPos pos)
    {
    	boolean flag = StructureScanner.isBlockOccupied(pos);
        
    	if(!flag)////////////////////////////////////////////////////////////////////////////
    	{
    		/** Returns a String with the complete BlockState of the Block in pos */
    		String block = StructureScanner.getBlockState(world, blockstate, pos);
    		
    		
    		if(StructureScanner.isColumn(world, blockstate, pos))
    		{
    			StructureScanner.fillTowardPosY(world, block, blockstate, pos);
    		}
    		else if(StructureScanner.isFloor(world, blockstate, pos))
    		{
    			boolean successful = StructureScanner.checkPossibleFloor(world, blockstate, pos);
    			
    			if(!successful) StructureScanner.fillTowardPosZ(world, block, blockstate, pos);
    		}
    		else if(StructureScanner.isWallZ(world, blockstate, pos))
    		{
    			boolean successful = StructureScanner.checkNextSquareZ(world, blockstate, pos);
    			
    			if(!successful) StructureScanner.fillTowardPosZ(world, block, blockstate, pos);
    		}
    		else if(StructureScanner.isWallX(world, blockstate, pos))
    		{
    			boolean successful = StructureScanner.checkNextSquareX(world, blockstate, pos);
    			
    			if(!successful) StructureScanner.fillTowardPosX(world, block, blockstate, pos);
    		}
    		
    		/** If BlockStates south of pos does not match blockstate, set as single block */
    		else StructureScanner.setBlockState(block, pos);
    	}
    }
    
    private static boolean isWallX(World world, BlockState blockState, BlockPos blockPos)
    {
		return world.getBlockState(blockPos.east()).equals(blockState);
	}
    
    private static boolean isWallZ(World world, BlockState blockState, BlockPos blockPos)
    {
		return world.getBlockState(blockPos.south()).equals(blockState);
	}

	private static boolean isFloor(World world, BlockState blockState, BlockPos blockPos)
    {
		BlockPos pos = blockPos.east();
		pos = pos.south();
		
		boolean flag = (world.getBlockState(pos).equals(blockState));
		
		return flag;
	}

	private static boolean isColumn(World world, BlockState blockState, BlockPos blockPos)
    {
		
		boolean flag = (world.getBlockState(blockPos.up()).equals(blockState))
				&& !(world.getBlockState(blockPos.east()).equals(blockState))
				&& !(world.getBlockState(blockPos.south()).equals(blockState));
		
		return flag;
	}

	private static void fillTowardPosZ(World world, String block, BlockState blockstate, BlockPos pos)
    {
        BlockPos max = pos;
        BlockPos min = pos;
        boolean hasNextBlock = true;

        while (hasNextBlock) {
            if (blockstate.equals(world.getBlockState(pos))) {
                database.add(pos);
                max = pos;
                pos = pos.south();
            } else
                hasNextBlock = false;
        }

        BlockPerimeter perimeter = new BlockPerimeter(min, max, block, blockstate);
        blockbase.add(perimeter);
    }
    
    /*
     * Scans the next wall of blocks towards positive Z
     * to trace squared BlockPos positions with the 
     * same blockstate.
     */
    private static boolean checkNextSquareZ(World world, BlockState blockstate, BlockPos origin)
    {
    	/** n represents number to square */
    	int n = 1;
    	
    	/** gives the green to whether or not the loop should continue
    	 *  increment n */
    	boolean greenlight = true;
    	
    	/** Returns true if StructureScanner can successfully trace a squared perimeter */
    	boolean successful = false;
    	
    	/** Returns a String with the complete BlockState of the Block in origin */
    	String block = StructureScanner.getBlockState(world, blockstate, origin);
    	
    	/** BlockPerimeter instance of the structure data */
    	BlockPerimeter perimeter = new BlockPerimeter(origin, origin, block, blockstate);
    	
    	/** Keeps a temporary list of BlockPos to be added to [database] if a square wall is found */
    	List<BlockPos> temps = Lists.newArrayList();
    	
    	/** The loops continues to increment n which
    	 *  is used to determine which squared positions to trace*/
    	while(greenlight)
    	{
    		for(int k = 0; k <= n; k++)
    		{
    			for(int j = 0; j <= n; j++)
    			{
    				/**Moves the BlockPos up +Y*/
    				BlockPos nextBlock = origin.up(j);
    				
    				/**Moves the BlockPos towards +Z */
    				nextBlock = nextBlock.south(k);
    				
    				/**Returns the blockpos on the new BlockPos */
    				BlockState state = world.getBlockState(nextBlock);
    				
    				if(state.equals(blockstate))
    				{
    					/**Adds the new BlockPos to the [database] */
    					temps.add(nextBlock);
    					
    					/** Makes sure that the max BlockPos is a squared position from the origin */
    					boolean flag = (j == n) && (k == n);
    					
    					if(flag)
    					{
    						perimeter.setMaxPos(nextBlock);
    						successful = true;
    						database.addAll(temps);
    					}
    					
    				}
    				else
    				{
    					/**Breaks the For Loop and While Loop */
    					j = n + 1; k = n + 1;
    					greenlight = false;
    				}
    			}
    		}
    		
    		/**Increments the number to be squared */
    		n++;
    	}
    	
    	if(successful) StructureScanner.stretchCurrentSquareZ(world, perimeter);
    	return successful;
    }
    
    private static void stretchCurrentSquareZ(World world, BlockPerimeter perimeter)
    {
    	int n = 1;
    	BlockState blockstate = perimeter.getBlockState();
    	
    	/** Remains true if each strip of blocks of height y has the same blockstate as the starting block */
    	boolean consistent = true;
    	
    	/** Represents the height of the */
    	int y = perimeter.getMaxPos().getY() - perimeter.getMinPos().getY();
    	
    	List<BlockPos> temps = Lists.newArrayList();
    	BlockPos start = perimeter.getMaxPos().down(y);
    	
    	while(consistent)
    	{
			BlockPos blockPos = start.south(n);
			
			for(int j = 0; j <= y; j++)
    		{
    			BlockPos nextBlock = blockPos.up(j);
    			BlockState state = world.getBlockState(nextBlock);
    			
    			if(state.equals(blockstate))
    			{
    				/** Adds temporary BlockPos positions to the list
    		    	 * to be added to [database] is the scan is consistent */
    				temps.add(nextBlock);
    				
    				if(j == y)
    				{
    					perimeter.setMaxPos(nextBlock);
    					for(BlockPos pos: temps)
    					{
    						database.add(pos);
    					}
    				}
    			}
    			else 
    			{
    				consistent = false;
    				break;
    			}
    		}
    		
    		n++;
    	}
    	
    	blockbase.add(perimeter);
    }
    
    private static void fillTowardPosY(World world, String block, BlockState blockstate, BlockPos pos)
    {
        BlockPos max = pos;
        BlockPos min = pos;
        boolean hasNextBlock = true;

        while (hasNextBlock) {
            if (blockstate.equals(world.getBlockState(pos))) {
                database.add(pos);
                max = pos;
                pos = pos.up();
            } else
                hasNextBlock = false;
        }

        BlockPerimeter perimeter = new BlockPerimeter(min, max, block, blockstate);
        blockbase.add(perimeter);
    }
    
    /*
     * Scans the next floor of blocks towards positive X & Z
     * to trace squared BlockPos positions with the 
     * same blockstate.
     */
    private static boolean checkPossibleFloor(World world, BlockState blockstate, BlockPos origin)
    {
    	/** n represents number to square */
    	int n = 1;
    	
    	/** gives the green to whether or not the loop should continue
    	 *  increment n */
    	boolean greenlight = true;
    	
    	/** Returns true if StructureScanner can successfully trace a squared perimeter */
    	boolean successful = false;
    	
    	/** Returns a String with the complete BlockState of the Block in origin */
    	String block = StructureScanner.getBlockState(world, blockstate, origin);
    	
    	/** BlockPerimeter instance of the structure data */
    	BlockPerimeter perimeter = new BlockPerimeter(origin, origin, block, blockstate);
    	
    	/** Keeps a temporary list of BlockPos to be added to [database] if a square wall is found */
    	List<BlockPos> temps = Lists.newArrayList();
    	
    	/** The loops continues to increment n which
    	 *  is used to determine which squared positions to trace*/
    	while(greenlight)
    	{
    		for(int i = 0; i <= n; i++)
    		{
    			for(int k = 0; k <= n; k++)
    			{
    				/**Moves the BlockPos up +X*/
    				BlockPos nextBlock = origin.east(i);
    				
    				/**Moves the BlockPos towards +Z */
    				nextBlock = nextBlock.south(k);
    				
    				/**Returns the blockpos on the new BlockPos */
    				BlockState state = world.getBlockState(nextBlock);
    				
    				if(state.equals(blockstate))
    				{
    					/**Adds the new BlockPos to the [database] */
    					temps.add(nextBlock);
    					
    					/** Makes sure that the max BlockPos is a squared position from the origin */
    					boolean flag = (i == n) && (k == n);
    					
    					if(flag)
    					{
    						perimeter.setMaxPos(nextBlock);
    						database.addAll(temps);
    						successful = true;
    					}
    					
    				}
    				else
    				{
    					/**Breaks the For Loop and While Loop */
    					i = n + 1; k = n + 1;
    					greenlight = false;
    				}
    			}
    		}
    		
    		/**Increments the number to be squared */
    		n++;
    	}
    	
    	if(successful) StructureScanner.stretchCompoundedFloor(world, perimeter);
    	return successful;
    }
    
    private static void stretchCompoundedFloor(World world, BlockPerimeter perimeter)
    {
    	int n = 1;
    	BlockState blockstate = perimeter.getBlockState();
    	
    	/** Remains true if each strip of blocks of length x has the same blockstate as the starting block */
    	boolean consistent = true;
    	
    	/** Represents the length of the floor*/
    	int x = perimeter.getMaxPos().getX() - perimeter.getMinPos().getX();
    	
    	List<BlockPos> temps = Lists.newArrayList();
    	BlockPos start = perimeter.getMaxPos().west(x);
    	
    	while(consistent)
    	{
			BlockPos blockPos = start.south(n);
			
			for(int i = 0; i <= x; i++)
    		{
    			BlockPos nextBlock = blockPos.east(i);
    			BlockState state = world.getBlockState(nextBlock);
    			
    			if(state.equals(blockstate))
    			{
    				/** Adds temporary BlockPos positions to the list
    		    	 * to be added to [database] is the scan is consistent */
    				temps.add(nextBlock);
    				
    				if(i == x)
    				{
    					perimeter.setMaxPos(nextBlock);
    					for(BlockPos pos: temps)
    					{
    						database.add(pos);
    					}
    				}
    			}
    			else 
    			{
    				consistent = false;
    				break;
    			}
    		}
    		
    		n++;
    	}
    	
    	blockbase.add(perimeter);
    }
    
    
    private static void fillTowardPosX(World world, String block, BlockState blockstate, BlockPos pos)
    {
        BlockPos max = pos;
        BlockPos min = pos;
        boolean hasNextBlock = true;

        while (hasNextBlock) {
            if (blockstate.equals(world.getBlockState(pos))) {
                database.add(pos);
                max = pos;
                pos = pos.east();
            } else
                hasNextBlock = false;
        }

        BlockPerimeter perimeter = new BlockPerimeter(min, max, block, blockstate);
        blockbase.add(perimeter);
    }
    
    /*
     * Scans the next wall of blocks towards positive X
     * to trace squared BlockPos positions with the 
     * same blockstate.
     */
    private static boolean checkNextSquareX(World world, BlockState blockstate, BlockPos origin)
    {
    	/** n represents number to square */
    	int n = 1;
    	
    	/** gives the green to whether or not the loop should continue
    	 *  increment n */
    	boolean greenlight = true;
    	
    	/** Returns true if StructureScanner can successfully trace a squared perimeter */
    	boolean successful = false;
    	
    	/** Returns a String with the complete BlockState of the Block in origin */
    	String block = StructureScanner.getBlockState(world, blockstate, origin);
    	
    	/** BlockPerimeter instance of the structure data */
    	BlockPerimeter perimeter = new BlockPerimeter(origin, origin, block, blockstate);
    	
    	/** Keeps a temporary list of BlockPos to be added to [database] if a square wall is found */
    	List<BlockPos> temps = Lists.newArrayList();
    	
    	/** The loops continues to increment n which
    	 *  is used to determine which squared positions to trace*/
    	while(greenlight)
    	{
    		for(int i = 0; i <= n; i++)
    		{
    			for(int j = 0; j <= n; j++)
    			{
    				/**Moves the BlockPos up +Y*/
    				BlockPos nextBlock = origin.up(j);
    				
    				/**Moves the BlockPos towards +X */
    				nextBlock = nextBlock.east(i);
    				
    				/**Returns the blockpos on the new BlockPos */
    				BlockState state = world.getBlockState(nextBlock);
    				
    				if(state.equals(blockstate))
    				{
    					/**Adds the new BlockPos to the [database] */
    					temps.add(nextBlock);
    					
    					/** Makes sure that the max BlockPos is a squared position from the origin */
    					boolean flag = (j == n) && (i == n);
    					
    					if(flag)
    					{
    						perimeter.setMaxPos(nextBlock);
    						database.addAll(temps);
    						successful = true;
    					}
    					
    				}
    				else
    				{
    					/**Breaks the For Loop and While Loop */
    					j = n + 1; i = n + 1;
    					greenlight = false;
    				}
    			}
    		}
    		
    		/**Increments the number to be squared */
    		n++;
    	}
    	
    	if(successful) StructureScanner.stretchCurrentSquareX(world, perimeter);
    	return successful;
    }
    
    private static void stretchCurrentSquareX(World world, BlockPerimeter perimeter)
    {
    	int n = 1;
    	BlockState blockstate = perimeter.getBlockState();
    	
    	/** Remains true if each strip of blocks of height y has the same blockstate as the starting block */
    	boolean consistent = true;
    	
    	/** Represents the height of the */
    	int y = perimeter.getMaxPos().getY() - perimeter.getMinPos().getY();
    	
    	List<BlockPos> temps = Lists.newArrayList();
    	BlockPos start = perimeter.getMaxPos().down(y);
    	
    	while(consistent)
    	{
			BlockPos blockPos = start.east(n);
			
			for(int j = 0; j <= y; j++)
    		{
    			BlockPos nextBlock = blockPos.up(j);
    			BlockState state = world.getBlockState(nextBlock);
    			
    			if(state.equals(blockstate))
    			{
    				/** Adds temporary BlockPos positions to the list
    		    	 * to be added to [database] is the scan is consistent */
    				temps.add(nextBlock);
    				
    				if(j == y)
    				{
    					perimeter.setMaxPos(nextBlock);
    					for(BlockPos pos: temps)
    					{
    						database.add(pos);
    					}
    				}
    			}
    			else 
    			{
    				consistent = false;
    				break;
    			}
    		}
    		
    		n++;
    	}
    	
    	blockbase.add(perimeter);
    }
    
    public static void create3DScan(World world, PlayerEntity player)
    {
    	
        int xMax = pos2.getX() - pos1.getX();
        int yMax = pos2.getY() - pos1.getY();
        int zMax = pos2.getZ() - pos1.getZ();
        
        int totalBlocks = xMax * yMax * zMax;
        
        player.sendMessage(new StringTextComponent("Scanning..."), player.getUniqueID());
        
        for (int i = 0; i <= xMax; i++) {
            for (int j = 0; j <= yMax; j++) {
                for (int k = 0; k <= zMax; k++) {
                    BlockPos blockpos = pos1.add(i, j, k);
                    BlockState blockstate = world.getBlockState(blockpos);
                    System.out.println("Scanning: " + "(" + count + "/" + totalBlocks + ")");
                    if (blockstate.getBlock() != Blocks.AIR) {
                        scanNextBox(world, blockstate, blockpos);
                    }
                    
                    count++;
                }
            }
        }

        player.sendMessage(new StringTextComponent("Filling blocks in 3D model."), player.getUniqueID());
        create3DModel();
    }
    
    private static String getBlockState(World world, BlockState state, BlockPos pos) {
        List<String> args = new ArrayList<>();
        Block block = state.getBlock();
        String data = state.toString();
        String blockstate;
        String name;
        String facing;
        String property;
        String half;
        String extract = "";

        char[] cat = data.toCharArray();

        for (char c : cat) {
            if (c == ':')
                extract += new String(new char[]{','});
            else if (c == '{')
                extract += new String(new char[]{','});
            else if (c == '}')
                extract += new String(new char[]{','});
            else if (c == '[')
                extract += new String(new char[]{','});
            else if (c == '=')
                extract += new String(new char[]{','});
            else if (c == ']')
                extract += new String(new char[]{','});
            else
                extract += new String(new char[]{c});
        }

        String[] values = extract.split(",");

        name = values[2];

        for (int i = 0; i < values.length; i++) {
            args.add(values[i]);
        }

        if (block instanceof MarkerBlock)
        {
            //Ignore All Marker Blocks
        	return "Blocks.AIR.getDefaultState()";
        }
        else if (block == Blocks.DRIED_KELP_BLOCK)
        {
            //Ignore All Kelp Blocks
        	return "Blocks.AIR.getDefaultState()";
        }
        else if (block == ModBlocks.FILLER_BLOCK.get()) {
            return "Blocks.AIR.getDefaultState()";

        } else if (block instanceof Arcade) {
            facing = "Arcade.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            half = "Arcade.HALF, DoubleBlockHalf." + args.get(args.indexOf("half") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, facing, half);
            return blockstate;
        } else if (block instanceof BedsideTable) {
            facing = "BedsideTable.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "BedsideTable.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, facing, property);
            return blockstate;
        } else if (block instanceof Bench) {
            property = "Bench.STATE, BenchState." + args.get(args.indexOf("state") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, property);
            return blockstate;
        } else if (block instanceof Bookshelf) {
            facing = "Bookshelf.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String book0 = "Bookshelf.BOOK0, " + args.get(args.indexOf("book0") + 1);
            String book1 = "Bookshelf.BOOK1, " + args.get(args.indexOf("book1") + 1);
            String book2 = "Bookshelf.BOOK2, " + args.get(args.indexOf("book1") + 1);
            String book3 = "Bookshelf.BOOK3, " + args.get(args.indexOf("book1") + 1);
            String book4 = "Bookshelf.BOOK4, " + args.get(args.indexOf("book1") + 1);
            String book5 = "Bookshelf.BOOK5, " + args.get(args.indexOf("book1") + 1);
            String book6 = "Bookshelf.BOOK6, " + args.get(args.indexOf("book1") + 1);
            String book7 = "Bookshelf.BOOK7, " + args.get(args.indexOf("book1") + 1);
            blockstate = addonBlock(pos, name, facing, book0, book1, book2, book3, book4, book5, book6, book7);
            return blockstate;
        } else if (block instanceof Cabinet) {
            facing = "Cabinet.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "Cabinet.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, facing, property);
            return blockstate;
        } else if (block instanceof Candle) {
            facing = "Candle.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "Candle.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = addonBlock(pos, name, facing, property);
            return blockstate;
        } else if (block instanceof Counter) {
            facing = "Counter.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "Counter.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, facing, property);
            return blockstate;
        } else if (block instanceof Crossrail) {
            property = "CrossRail.SHAPE, RailShape." + args.get(args.indexOf("shape") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, property);
            return blockstate;
        } else if (block instanceof Cupboard) {
            facing = "Cupboard.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            half = "Cupboard.HALF, DoubleBlockHalf." + args.get(args.indexOf("half") + 1).toUpperCase();
            String mirror = "Cupboard.MIRROR, " + args.get(args.indexOf("mirror") + 1);
            property = "Cupboard.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, facing, half, mirror, property);
            return blockstate;
        } else if (block instanceof EntityDetector) {
            facing = "EntityDetector.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "EntityDetector.POWER, " + args.get(args.indexOf("power") + 1);
            blockstate = addonBlock(pos, name, facing, property);
            return blockstate;
        } else if (block instanceof FireplaceGuard) {
            facing = "FireplaceGuard.FACING Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, facing);
            return blockstate;
        } else if (block instanceof Hedge) {
            property = "Hedge.STATE, HedgeState." + args.get(args.indexOf("state") + 1).toUpperCase();
            String waterlogged = "Hedge.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, property, waterlogged);
            return blockstate;
        } else if (block instanceof IronFence) {
            String north = "IronFence.NORTH, " + args.get(args.indexOf("north") + 1);
            String south = "IronFence.SOUTH, " + args.get(args.indexOf("south") + 1);
            String east = "IronFence.EAST, " + args.get(args.indexOf("east") + 1);
            String west = "IronFence.WEST, " + args.get(args.indexOf("west") + 1);
            property = "IronFence.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, north, south, east, west, property);
            return blockstate;
        } else if (block instanceof IronLadder) {
            facing = "IronLadder.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "IronLadder.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, facing, property);
            return blockstate;
        } else if (block instanceof LargeCandle) {
            property = "LargeCandle.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = addonBlock(pos, name, property);
            return blockstate;
        }else if(block instanceof Pillar){
        	String waterlogged = "Pillar.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
        	property =  "Pillar.STATE, PillarState." + args.get(args.indexOf("state") + 1).toUpperCase();
        	blockstate = addonBlock(pos, name, waterlogged, property);
        	return blockstate;
        } else if (block instanceof Shelf) {
            facing = "Shelf.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, facing);
            return blockstate;
        } else if (block instanceof ShopSignBlock) {
        	name = "SHOP_" + name;
            property = "ShopSignBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, true, property);
            return blockstate;
        } else if (block instanceof Sofa) {
            property = "Sofa.STATE, SofaState." + args.get(args.indexOf("state") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, property);
            return blockstate;
        } else if (block instanceof Speaker) {
            facing = "Speaker.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, facing);
            return blockstate;
        } else if (block instanceof Stool) {
            property = "Stool.PILLOW, StoolState." + args.get(args.indexOf("pillow") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, property);
            return blockstate;
        } else if (block instanceof SupportBracket) {
            facing = "SupportBracket.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String mount = "SupportBracket.MOUNT, MountState." + args.get(args.indexOf("mount") + 1).toUpperCase();
            
            if(args.get(args.indexOf("mount")).equalsIgnoreCase("full"))
            {
            	mount = "SupportBracket.MOUNT, MountState.FULL_BLOCK";
            }
            
            String supporting = "SupportBracket.SUPPORTING, Direction." + args.get(args.indexOf("supporting") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, facing, mount, supporting);
            return blockstate;
        } else if (block instanceof Table) {
            String ne = "Table.NE, " + args.get(args.indexOf("ne") + 1);
            String nw = "Table.NW, " + args.get(args.indexOf("nw") + 1);
            String se = "Table.SE, " + args.get(args.indexOf("se") + 1);
            String sw = "Table.SW, " + args.get(args.indexOf("sw") + 1);
            blockstate = addonBlock(pos, name, ne, nw, se, sw);
            return blockstate;
        } else if (block instanceof VerticalComparatorBlock) {
            String h_facing = "VerticalRedstoneDiodeBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String v_facing = "VerticalRedstoneDiodeBlock.VERTICAL_FACING, Direction." + args.get(args.indexOf("vertical_facing") + 1).toUpperCase();
            String powered = "VerticalRedstoneDiodeBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            String mode = "VerticalComparatorBlock.MODE, ComparatorMode." + args.get(args.indexOf("mode") + 1).toUpperCase();
            blockstate = addonBlock(pos, name, h_facing, v_facing, powered, mode);
            return blockstate;
        } else if (block instanceof VerticalRepeaterBlock) {
            String h_facing = "VerticalRedstoneDiodeBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String v_facing = "VerticalRedstoneDiodeBlock.VERTICAL_FACING, Direction." + args.get(args.indexOf("vertical_facing") + 1).toUpperCase();
            String powered = "VerticalRedstoneDiodeBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            String delay = "VerticalRepeaterBlock.DELAY, " + args.get(args.indexOf("delay") + 1);
            String locked = "VerticalRepeaterBlock.LOCKED, " + args.get(args.indexOf("locked") + 1);
            blockstate = addonBlock(pos, name, h_facing, v_facing, powered, delay, locked);
            return blockstate;
        } else if (block instanceof VerticalSlab) {
            String type = "VerticalSlab.TYPE, VerticalSlabState." + args.get(args.indexOf("type") + 1).toUpperCase();
            property = "VerticalSlab.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = addonBlock(pos, name, type, property);
            return blockstate;
        } else if (block instanceof GenericBlock) {
            return "Index." + name.toUpperCase() + ".getDefaultState()";
        } else if (block instanceof BedBlock) {
            facing = "HorizontalBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String part = "BedBlock.PART, BedPart." + args.get(args.indexOf("part") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing, part);
            return blockstate;
        } else if (block instanceof AnvilBlock) {
            facing = "AnvilBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof BambooBlock) {
            String age = "BambooBlock.PROPERTY_AGE, " + args.get(args.indexOf("age") + 1);
            property = "BambooBLock.PROPERTY_LEAVES, BambooLeaves." + args.get(args.indexOf("leaves") + 1).toUpperCase();
            String stage = "BambooBlock.PROPERTY_STAGE, " + args.get(args.indexOf("stage") + 1);
            blockstate = traceBlock(pos, name, false, age, property, stage);
            return blockstate;
        } else if (block instanceof BannerBlock) {
            String rotation = "BannerBlock.ROTATION, " + args.get(args.indexOf("rotation") + 1);
            blockstate = traceBlock(pos, name, false, rotation);
            return blockstate;
        } else if (block instanceof BarrelBlock) {
            facing = "BarrelBlock.PROPERTY_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String open = "BarrelBlock.PROPERTY_OPEN, " + args.get(args.indexOf("open") + 1);
            blockstate = traceBlock(pos, name, false, facing, open);
            return blockstate;
        } else if (block instanceof BeehiveBlock) {
            facing = "BeehiveBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String honey = "BeehiveBlock.HONEY_LEVEL, " + args.get(args.indexOf("honey_level") + 1);
            blockstate = traceBlock(pos, name, false, facing, honey);
            return blockstate;
        } else if (block instanceof BeetrootBlock) {
            String age = "BeetrootBlock.BEETROOT_AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, age);
            return blockstate;
        } else if (block instanceof BellBlock) {
            facing = "BellBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "BellBlock.ATTACHMENT, BellAttachment." + args.get(args.indexOf("attachment") + 1).toUpperCase();
            String powered = "BellBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, facing, property, powered);
            return blockstate;
        } else if (block instanceof BrewingStandBlock) {
            String bottle1 = "BrewingStandBlock.HAS_BOTTLE[0], " + args.get(args.indexOf("has_bottle_0") + 1);
            String bottle2 = "BrewingStandBlock.HAS_BOTTLE[1], " + args.get(args.indexOf("has_bottle_1") + 1);
            String bottle3 = "BrewingStandBlock.HAS_BOTTLE[2], " + args.get(args.indexOf("has_bottle_2") + 1);
            blockstate = traceBlock(pos, name, false, bottle1, bottle2, bottle3);
            return blockstate;
        } else if (block instanceof BubbleColumnBlock) {
            property = "BubbleColumnBlock.DRAG, " + args.get(args.indexOf("drag") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof CactusBlock) {
            String age = "CactusBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, age);
            return blockstate;
        } else if (block instanceof CakeBlock) {
            String bites = "CakeBlock.BITES, " + args.get(args.indexOf("bites") + 1);
            blockstate = traceBlock(pos, name, false, bites);
            return blockstate;
        } else if (block instanceof CampfireBlock) {
            facing = "CampfireBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "CampfireBlock.LIT, " + args.get(args.indexOf("lit") + 1);
            String signal_fire = "CampfireBlock.SIGNAL_FIRE, " + args.get(args.indexOf("signal_fire") + 1);
            String waterlogged = "CampfireBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = traceBlock(pos, name, false, facing, property, signal_fire, waterlogged);
            return blockstate;
        } else if (block instanceof CarrotBlock) {
            String age = "CropsBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, age);
            return blockstate;
        } else if (block instanceof CarvedPumpkinBlock) {
            facing = "CarvedPumpkinBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof CauldronBlock) {
            property = "CauldronBlock.LEVEL, " + args.get(args.indexOf("level") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof ChainBlock) {
            property = "ChainBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof ChestBlock) {
            facing = "ChestBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "ChestBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String type = "ChestBlock.TYPE, ChestType." + args.get(args.indexOf("type") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing, property, type);
            return blockstate;
        } else if (block instanceof ChorusFlowerBlock) {
            String age = "ChorusFlowerBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, age);
            return blockstate;
        } else if (block instanceof CocoaBlock) {
            String age = "CocoaBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, age);
            return blockstate;
        } else if (block instanceof ComparatorBlock) {
            facing = "HorizontalBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "Comparator.MODE, ComparatorMode." + args.get(args.indexOf("mode") + 1).toUpperCase();
            String powered = "RedstoneDiodeBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, facing, property, powered);
            return blockstate;
        } else if (block instanceof ComposterBlock) {
            String level = "ComposterBlock.LEVEL, " + args.get(args.indexOf("level") + 1);
            blockstate = traceBlock(pos, name, false, level);
            return blockstate;
        } else if (block instanceof ConduitBlock) {
            property = "ConduitBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof DaylightDetectorBlock) {
            String inverted = "DaylightDetectorBlock.INVERTED, " + args.get(args.indexOf("inverted") + 1);
            String power = "DaylightDetectorBlock.POWER, " + args.get(args.indexOf("power") + 1);
            blockstate = traceBlock(pos, name, false, inverted, power);
            return blockstate;
        } else if (block instanceof DeadCoralWallFanBlock) {
            facing = "DeadCoralWallFanBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof DetectorRailBlock) {
            String powered = "DetectorRailBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            property = "DetectorRailBlock.SHAPE, RailShape." + args.get(args.indexOf("shape") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, powered, property);
            return blockstate;
        } else if (block instanceof DispenserBlock) {
            facing = "DispenserBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof DoorBlock) {
            facing = "DoorBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            half = "DoorBlock.HALF, DoubleBlockHalf." + args.get(args.indexOf("half") + 1).toUpperCase();
            String hinge = "DoorBlock.HINGE, DoorHingeSide." + args.get(args.indexOf("hinge") + 1).toUpperCase();
            String open = "DoorBlock.OPEN, " + args.get(args.indexOf("open") + 1);
            String powered = "DoorBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, facing, half, hinge, open, powered);
            return blockstate;
        } else if (block instanceof EnderChestBlock) {
            facing = "EnderChestBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "EnderChestBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof EndPortalFrameBlock) {
            facing = "EndPortalFrameBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "EndPortalFrameBlock.EYE, " + args.get(args.indexOf("eye") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof FarmlandBlock) {
            property = "FarmlandBlock.MOISTURE, " + args.get(args.indexOf("moisture") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof FenceBlock) {
            property = "FourWayBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String north = "FourWayBlock.NORTH, " + args.get(args.indexOf("north") + 1);
            String south = "FourWayBlock.SOUTH, " + args.get(args.indexOf("south") + 1);
            String east = "FourWayBlock.EAST, " + args.get(args.indexOf("east") + 1);
            String west = "FourWayBlock.WEST, " + args.get(args.indexOf("west") + 1);
            blockstate = traceBlock(pos, name, false, property, north, south, east, west);
            return blockstate;
        } else if (block instanceof FenceGateBlock) {
            String inWall = "FenceGateBlock.IN_WALL, " + args.get(args.indexOf("in_wall") + 1);
            String open = "FenceGateBlock.OPEN, " + args.get(args.indexOf("open") + 1);
            String powered = "FenceGateBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, inWall, open, powered);
            return blockstate;
        } else if (block instanceof FurnaceBlock) {
            facing = "AbstractFurnaceBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "AbstractFurnaceBlock.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof HopperBlock) {
            facing = "HopperBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "HopperBlock.ENABLED, " + args.get(args.indexOf("enabled") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof HugeMushroomBlock) {
            String up = "HugeMushroomBlock.UP, " + args.get(args.indexOf("up") + 1);
            String down = "HugeMushroomBlock.DOWN, " + args.get(args.indexOf("down") + 1);
            String north = "HugeMushroomBlock.NORTH, " + args.get(args.indexOf("north") + 1);
            String south = "HugeMushroomBlock.SOUTH, " + args.get(args.indexOf("south") + 1);
            String east = "HugeMushroomBlock.EAST, " + args.get(args.indexOf("east") + 1);
            String west = "HugeMushroomBlock.WEST, " + args.get(args.indexOf("west") + 1);
            blockstate = traceBlock(pos, name, false, up, down, north, south, east, west);
            return blockstate;
        } else if (block instanceof JukeboxBlock) {
            property = "JukeboxBlock.HAS_RECORD, " + args.get(args.indexOf("has_record") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof LadderBlock) {
            facing = "LadderBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "LadderBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof LanternBlock) {
            property = "LanternBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String hanging = "LanternBlock.HANGING, " + args.get(args.indexOf("hanging") + 1);
            blockstate = traceBlock(pos, name, false, property, hanging);
            return blockstate;
        } else if (block instanceof LeavesBlock) {
            property = "LeavesBlock.PERSISTENT, " + args.get(args.indexOf("persistent") + 1);
            String distance = "LeavesBlock.DISTANCE, " + args.get(args.indexOf("distance") + 1);
            blockstate = traceBlock(pos, name, false, property, distance);
            return blockstate;
        } else if (block instanceof LecternBlock) {
            facing = "LecternBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String powered = "LecternBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            property = "LecternBlock.HAS_BOOK, " + args.get(args.indexOf("has_book") + 1);
            blockstate = traceBlock(pos, name, false, facing, property, powered);
            return blockstate;
        }
        else if(block instanceof LeverBlock)
        {

        }else if (block instanceof MovingPistonBlock) {
            facing = "MovingPistonBlock.FACING, " + args.get(args.indexOf("facing") + 1).toUpperCase();
            String str = args.get(args.indexOf("type") + 1);
            String type = "";
            switch (str) {
                case "normal":
                    type = "MovingPistonBlock.TYPE, PistonType.DEFAULT";
                    break;
                case "sticky":
                    type = "MovingPistonBlock.TYPE, PistonType.STICKY";
                    break;
            }
            blockstate = traceBlock(pos, name, false, facing, type);
            return blockstate;
        } else if (block instanceof NetherPortalBlock) {
            property = "NetherPortalBlock.AXIS, Direction.Axis." + args.get(args.indexOf("axis") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof NetherWartBlock) {
            String age = "NetherWartBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, age);
            return blockstate;
        } else if (block instanceof NoteBlock) {
            String instrument = "NoteBlock.INSTRUMENT, NoteBlockInstrument." + args.get(args.indexOf("instrument") + 1).toUpperCase();
            String note = "NoteBlock.NOTE, " + args.get(args.indexOf("note") + 1);
            String powered = "NoteBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, instrument, note, powered);
            return blockstate;
        } else if (block instanceof ObserverBlock) {
            property = "ObserverBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof PaneBlock) {
            property = "FourWayBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String north = "FourWayBlock.NORTH, " + args.get(args.indexOf("north") + 1);
            String south = "FourWayBlock.SOUTH, " + args.get(args.indexOf("south") + 1);
            String east = "FourWayBlock.EAST, " + args.get(args.indexOf("east") + 1);
            String west = "FourWayBlock.WEST, " + args.get(args.indexOf("west") + 1);
            blockstate = traceBlock(pos, name, false, property, north, south, east, west);
            return blockstate;
        } else if (block instanceof PistonBlock) {
            facing = "DirectionalBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "PistonBlock.EXTENDED, " + args.get(args.indexOf("extended") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof PistonHeadBlock) {
            facing = "DirectionalBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String type = "PistonHeadBlock.TYPE, PistonType." + args.get(args.indexOf("type") + 1).toUpperCase();
            property = "PistonHeadBlock.SHORT, " + args.get(args.indexOf("short") + 1);
            blockstate = traceBlock(pos, name, false, facing, type, property);
            return blockstate;
        } else if (block instanceof PotatoBlock) {
            property = "CropsBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof PoweredRailBlock) {
            String shape = "PoweredRailedBlock.SHAPE, RailShape." + args.get(args.indexOf("shape") + 1).toUpperCase();
            String powered = "PoweredRailBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, shape, powered);
            return blockstate;
        } else if (block instanceof PressurePlateBlock) {
            property = "PressurePlateBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof RailBlock) {
            property = "RailBlock.SHAPE, RailShape." + args.get(args.indexOf("shape") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof RedstoneLampBlock) {
            property = "RedstoneLampBlock.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof RedstoneOreBlock) {
            property = "RedstoneOreBlock.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof RedstoneWallTorchBlock) {
            facing = "RedstoneWallTorchBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "RedstoneWallTorchBlock.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof RedstoneTorchBlock) {
            property = "RedstoneTorchBlock.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof RedstoneWireBlock) {
            property = "RedstoneWireBlock.POWER, " + args.get(args.indexOf("power") + 1);
            String north = "RedstoneWireBlock.NORTH, RedstoneSide." + args.get(args.indexOf("north") + 1).toUpperCase();
            String south = "RedstoneWireBlock.SOUTH, RedstoneSide." + args.get(args.indexOf("south") + 1).toUpperCase();
            String east = "RedstoneWireBlock.EAST, RedstoneSide." + args.get(args.indexOf("east") + 1).toUpperCase();
            String west = "RedstoneWireBlock.WEST, RedstoneSide." + args.get(args.indexOf("west") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, property, north, south, east, west);
            return blockstate;
        } else if (block instanceof RepeaterBlock) {
            facing = "HorizontalBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String locked = "RepeaterBlock.LOCKED, " + args.get(args.indexOf("locked") + 1);
            String delay = "RepeaterBlock.DELAY, " + args.get(args.indexOf("delay") + 1);
            String powered = "RepeaterBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, facing, locked, delay, powered);
            return blockstate;
        } else if (block instanceof RespawnAnchorBlock) {
            property = "RespawnAnchorBlock.CHARGE, " + args.get(args.indexOf("charge") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof SaplingBlock) {
            property = "SaplingBlock.STAGE, " + args.get(args.indexOf("stage") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof ScaffoldingBlock) {
            property = "ScaffoldingBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String distance = "ScaffoldingBlock.DISTANCE, " + args.get(args.indexOf("distance") + 1);
            String bottom = "ScaffoldingBlock.BOTTOM, " + args.get(args.indexOf("bottom") + 1);
            blockstate = traceBlock(pos, name, false, property, distance, bottom);
            return blockstate;
        } else if (block instanceof SeaPickleBlock) {
            property = "SeaPickleBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String pickles = "SeaPickleBlock.PICKLES, " + args.get(args.indexOf("pickles") + 1);
            blockstate = traceBlock(pos, name, false, property, pickles);
            return blockstate;
        } else if (block instanceof ShulkerBoxBlock) {
            facing = "ShulkerBoxBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof SkullBlock) {
            property = "SkullBlock.ROTATION, " + args.get(args.indexOf("rotation") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof SlabBlock) {
            String type = "SlabBlock.TYPE, SlabType." + args.get(args.indexOf("type") + 1).toUpperCase();
            property = "SlabBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            blockstate = traceBlock(pos, name, false, type, property);
            return blockstate;
        } else if (block instanceof SmokerBlock) {
            facing = "AbstractFurnaceBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "AbstractFurnaceBlock.LIT, " + args.get(args.indexOf("lit") + 1);
            blockstate = traceBlock(pos, name, false, facing, property);
            return blockstate;
        } else if (block instanceof SnowBlock) {
            property = "SnowBlock.LAYERS, " + args.get(args.indexOf("layers") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof SnowyDirtBlock) {
            property = "SnowyDirtBlock.SNOWY, " + args.get(args.indexOf("snowy") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof StairsBlock) {
            facing = "StairsBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            property = "StairsBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String shape = "StairsBlock.SHAPE, StairsShape." + args.get(args.indexOf("shape") + 1).toUpperCase();
            half = "StairsBlock.HALF, Half." + args.get(args.indexOf("half") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing, property, shape, half);
            return blockstate;
        } else if (block instanceof StandingSignBlock) {
            property = "StandingSignBlock.ROTATION, " + args.get(args.indexOf("rotation") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof StemBlock) {
            property = "StemBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof StoneButtonBlock) {
            facing = "HorizontalBlock.FACING, " + args.get(args.indexOf("facing") + 1).toUpperCase();
            String face = "HorizontalFaceBlock.FACE, AttachFace." + args.get(args.indexOf("face") + 1).toUpperCase();
            String powered = "AbstractButtonBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, facing, face, powered);
            return blockstate;
        } else if (block instanceof StonecutterBlock) {
            facing = "StonecutterBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof SugarCaneBlock) {
            property = "SugarCaneBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof SweetBerryBushBlock) {
            property = "SweetBerryBushBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof TallSeaGrassBlock) {
            half = "TallSeaGrassBlock.HALF, DoubleBlockHalf." + args.get(args.indexOf("half") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, half);
            return blockstate;
        } else if (block instanceof TrapDoorBlock) {
            facing = "HorizontalBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            half = "TrapDoorBlock.HALF, Half." + args.get(args.indexOf("half") + 1).toUpperCase();
            property = "TrapDoorBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String powered = "TrapDoorBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            String open = "TrapDoorBlock.OPEN, " + args.get(args.indexOf("open") + 1);
            blockstate = traceBlock(pos, name, false, facing, half, property, powered, open);
            return blockstate;
        } else if (block instanceof TripWireBlock) {
            String attached = "TripWireBlock.ATTACHED, " + args.get(args.indexOf("attached") + 1);
            String disarmed = "TripWireBlock.DISARMED, " + args.get(args.indexOf("disarmed") + 1);
            String powered = "TripWireBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            String north = "TripWireBlock.NORTH, " + args.get(args.indexOf("north") + 1);
            String south = "TripWireBlock.SOUTH, " + args.get(args.indexOf("south") + 1);
            String east = "TripWireBlock.EAST, " + args.get(args.indexOf("east") + 1);
            String west = "TripWireBlock.WEST, " + args.get(args.indexOf("west") + 1);
            blockstate = traceBlock(pos, name, false, attached, disarmed, powered, north, south, east, west);
            return blockstate;
        } else if (block instanceof TripWireHookBlock) {
            facing = "TripWireHookBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String attached = "TripWireHookBlock.ATTACHED, " + args.get(args.indexOf("attached") + 1);
            String powered = "TripWireHookBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, facing, attached, powered);
            return blockstate;
        } else if (block instanceof TurtleEggBlock) {
            String eggs = "TurtleEggBlock.EGGS, " + args.get(args.indexOf("eggs") + 1);
            String hatch = "TurtleEggBlock.HATCH, " + args.get(args.indexOf("hatch") + 1);
            blockstate = traceBlock(pos, name, false, eggs, hatch);
            return blockstate;
        } else if (block instanceof TwistingVinesTopBlock) {
            property = "AbstractTopPlantBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof VineBlock) {
            String up = "VineBlock.UP, " + args.get(args.indexOf("up") + 1);
            String north = "VineBlock.NORTH, " + args.get(args.indexOf("north") + 1);
            String south = "VineBlock.SOUTH, " + args.get(args.indexOf("south") + 1);
            String east = "VineBlock.EAST, " + args.get(args.indexOf("east") + 1);
            String west = "VineBlock.WEST, " + args.get(args.indexOf("west") + 1);
            blockstate = traceBlock(pos, name, false, up, north, south, east, west);
            return blockstate;
        } else if (block instanceof WallBannerBlock) {
            facing = "WallBannerBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof WallBlock) {
            property = "WallBlock.WATERLOGGED, " + args.get(args.indexOf("waterlogged") + 1);
            String up = "WallBlock.UP, " + args.get(args.indexOf("up") + 1);
            String north_wall = "WallBlock.WALL_HEIGHT_NORTH, WallHeight.LOW";
            String south_wall = "WallBlock.WALL_HEIGHT_SOUTH, WallHeight.LOW";
            String east_wall = "WallBlock.WALL_HEIGHT_EAST, WallHeight.LOW";
            String west_wall = "WallBlock.WALL_HEIGHT_WEST, WallHeight.LOW";
            blockstate = traceBlock(pos, name, false, property, up, north_wall, south_wall, east_wall, west_wall);
            return blockstate;
        } else if (block instanceof WallSignBlock) {
            facing = "WallSignBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof WallSkullBlock) {
            facing = "WallSkullBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof WallTorchBlock) {
            facing = "WallTorchBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, false, facing);
            return blockstate;
        } else if (block instanceof WeepingVinesTopBlock) {
            property = "AbstractTopPlantBlock.AGE, " + args.get(args.indexOf("age") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof WeightedPressurePlateBlock) {
            property = "WeightedPressurePlateBlock.POWER, " + args.get(args.indexOf("power") + 1);
            blockstate = traceBlock(pos, name, false, property);
            return blockstate;
        } else if (block instanceof WoodButtonBlock) {
            facing = "HorizontalBlock.HORIZONTAL_FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            String face = "HorizontalFaceBlock.FACE, AttachFace." + args.get(args.indexOf("face") + 1).toUpperCase();
            String powered = "AbstractButtonBlock.POWERED, " + args.get(args.indexOf("powered") + 1);
            blockstate = traceBlock(pos, name, false, facing, face, powered);
            return blockstate;
        } else if (block instanceof ChairBlock) {
            facing = "ChairBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, true, facing);
            return blockstate;
        } else if (block instanceof ShopSignBlock) {
            name = "shop_" + name;
            facing = "ChairBlock.FACING, Direction." + args.get(args.indexOf("facing") + 1).toUpperCase();
            blockstate = traceBlock(pos, name, true, facing);
            return blockstate;
        } else if (block instanceof Block) {
            return "Blocks." + name.toUpperCase() + ".getDefaultState()";
        }
            return "Blocks.GLASS.defaultBlockState()";
    }
    
    private static String traceBlock(BlockPos blockpos, String name, boolean modBlock, String... properties) {
        String blockstate = "";

        if (modBlock) {
            blockstate = "ModBlocks." + name.toUpperCase() + ".get().getDefaultState()";
        } else {
            blockstate = "Blocks." + name.toUpperCase() + ".getDefaultState()";
        }

        if (properties != null) {
            for (String property : properties) {
                blockstate += ".with(" + property + ")";
            }
        }
        return blockstate;
    }
    
    private static String addonBlock(BlockPos blockpos, String name, String... properties) {
        String blockstate = "";

        blockstate = "Index." + name.toUpperCase() + ".getDefaultState()";

        if (properties != null) {
            for (String property : properties) {
                blockstate += ".with(" + property + ")";
            }
        }
        return blockstate;
    }
}
