package mod.arcalitegames.odyssey.world.structure;

import java.util.Random;

import mod.arcalitegames.odyssey.blocks.ModBlocks;
import mod.arcalitegames.system.parser.ItemParser;
import mod.arcalitegames.system.util.WeightedRandomChestContent;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.MinecraftServer;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class StructureBase 
{
	protected World world;
	protected BlockPos start;
	public StructureBase(World worldIn, BlockPos origin, int xRange, int yRange, int zRange)
	{
		world = worldIn;
		int x = origin.getX();
		int y = origin.getY();
		int z = origin.getZ();
		
		start = new BlockPos(x + xRange, y + yRange, z + zRange);
		
	}
	
	public abstract void addEntitiesAndSpawn();
	
	public void executeCommand(World world)
	{
		MinecraftServer server = world.getServer();
		CommandSource source = server.getCommandSource();
		server.getCommandManager().handleCommand(source, "kill @e[type=minecraft:item]");
	}
	
	public void setBlockState(World worldIn, BlockState blockstateIn, int x, int y, int z, BlockPos start)
    {
        int originX = start.getX();
        int originY = start.getY();
        int originZ = start.getZ();
        BlockPos blockpos = new BlockPos(originX + x, originY + y, originZ + z);
        worldIn.setBlockState(blockpos, blockstateIn);
    }

	public void fillWithBlocks(World worldIn, BlockPos start, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, BlockState blockstateIn)
    {
        for (int i = yMin; i <= yMax; ++i)
        {
            for (int j = xMin; j <= xMax; ++j)
            {
                for (int k = zMin; k <= zMax; ++k)
                {
                    setBlockState(worldIn, blockstateIn, j, i, k, start);
                }
            }
        }
    }
	
	 protected void placeTorch(World world, Direction facing, int xPos, int yPos, int zPos, BlockPos start)
     {
		 this.setBlockState(world, Blocks.TORCH.getDefaultState().with(WallTorchBlock.HORIZONTAL_FACING, facing), xPos, yPos, zPos, start);
     }

	 protected void placeVillageBed(World world, Direction facing, int x, int y, int z, BlockPos start)
	 {
		 this.setBlockState(world, ModBlocks.VILLAGE_BED.get().getDefaultState(), x, y, z, start);
		 this.setBlockState(world, ModBlocks.VILLAGE_BED.get().getDefaultState().with(BedBlock.HORIZONTAL_FACING, facing).with(BedBlock.PART, BedPart.HEAD), x, y, z, start);
	 }

	 protected void placePlayerBed(World world, Direction facing, int x, int y, int z, BlockPos start)
	 {
		 this.setBlockState(world, Blocks.RED_BED.getDefaultState().with(BedBlock.HORIZONTAL_FACING, facing), x, y, z, start);
		 this.setBlockState(world, Blocks.RED_BED.getDefaultState().with(BedBlock.HORIZONTAL_FACING, facing).with(BedBlock.PART, BedPart.HEAD), x, y, z, start);
	 }

	protected void generateDoor(World worldIn, Direction facing, int x, int y, int z, DoorBlock door, BlockPos start)
    {
        this.setBlockState(worldIn, door.getDefaultState().with(DoorBlock.FACING, facing), x, y, z, start);
        this.setBlockState(worldIn, door.getDefaultState().with(DoorBlock.FACING, facing).with(DoorBlock.HALF, DoubleBlockHalf.UPPER), x, y + 1, z, start);
    }

	protected void generateChest(World world, Direction facing, int x, int y, int z, BlockPos start, int level)
	{
		this.setBlockState(world, Blocks.CHEST.getDefaultState().with(ChestBlock.FACING, facing), x, y, z, start);
		IInventory inventory = ChestBlock.getChestInventory((ChestBlock) Blocks.CHEST.getBlock(), Blocks.CHEST.getDefaultState(), world, start.add(x, y, z), true);
		WeightedRandomChestContent.generateContents(level, inventory);
	}
	
	 protected void spawnEntity(CreatureEntity entity, int i, int j, int k, BlockPos start)
     {
		 	int x = start.getX();
			int y = start.getY();
			int z = start.getZ();
			entity.setLocationAndAngles(x + i + 0.5, y + j + 0.5, z + k + 0.5, 0.0F, 0.0F);
			entity.enablePersistence();
			world.addEntity(entity);
     }
	 
	 protected void spawnEntity(CreatureEntity entity, World worldIn, int i, int j, int k, BlockPos start)
     {
		 	int x = start.getX();
			int y = start.getY();
			int z = start.getZ();
			entity.setLocationAndAngles(x + i + 0.5, y + j + 0.5, z + k + 0.5, 0.0F, 0.0F);
			entity.enablePersistence();
			world.addEntity(entity);
     }
     
     public void setItemsForEntity(Entity entity, String entityType)
	 {
	 	 if(entityType.equalsIgnoreCase("dread_thrall"))
		 {
		 	 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemParser.getItemFromName("iceandfire:dread_sword")));
		 	 if(new Random().nextInt(24) > 12)
		 	 	entity.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(Items.SHIELD));
		 }

	 	 else if(entityType.equalsIgnoreCase("dread_knight"))
		 {
			 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemParser.getItemFromName("iceandfire:dread_sword")));
			 if(new Random().nextInt(24) > 12)
				 entity.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(Items.SHIELD));
		 }

		 else if(entityType.equalsIgnoreCase("dread_lich"))
		 {
			 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemParser.getItemFromName("iceandfire:lich_staff")));
			 if(new Random().nextInt(24) > 12)
				 entity.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(Items.SHIELD));
		 }

		 else if(entityType.equalsIgnoreCase("dread_ghoul"))
		 {

		 }

		 else if(entityType.equalsIgnoreCase("dread_beast"))
		 {

		 }

		 else if(entityType.equalsIgnoreCase("goblin_knocker"))
		 {

		 }

		 else if(entityType.equalsIgnoreCase("goblin_hobgoblin"))
		 {

		 }

		 else if(entityType.equalsIgnoreCase("goblin_kobald"))
		 {

		 }

		 else if(entityType.equalsIgnoreCase("goblin_trow"))
		 {

		 }

		 else if(entityType.equalsIgnoreCase("skeleton"))
		 {
			 int i = new Random().nextInt(16);
			 
			 if((i % 8) == 0)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.STONE_SWORD));
				 
			 }else
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.BOW));
			 }
		 }

		 else if(entityType.equalsIgnoreCase("zombie"))
		 {
			 int i = new Random().nextInt(16);
			 
			 if((i % 8) == 0)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
				 
			 }else if((i % 4) == 0)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.STONE_SWORD));
			 }else {
				 
			 }
		 }

		 else if(entityType.equalsIgnoreCase("husk"))
		 {
			 int i = new Random().nextInt(16);
			 
			 if((i % 8) == 0)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
				 
			 }else if((i % 4) == 0)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.STONE_SWORD));
			 }else {
				 
			 }
		 }

		 else if(entityType.equalsIgnoreCase("vindicator"))
		 {
			 int i = new Random().nextInt(16);
			 
			 if((i % 8) == 0)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
				 
			 }else
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_AXE));
			 }
		 }

		 else if(entityType.equalsIgnoreCase("illusioner"))
		 {

		 }
	 	 
		 else if(entityType.equalsIgnoreCase("pillager"))
		 {
			 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.CROSSBOW));
		 }

		 else if(entityType.equalsIgnoreCase("evoker"))
		 {
			 int i = new Random().nextInt(16);
			 
			 if(i == 8)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.TOTEM_OF_UNDYING));
			 }
		 }

		 else if(entityType.equalsIgnoreCase("troll"))
		 {
			 int i = new Random().nextInt(3);
			 
			 if(i == 0)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemParser.getItemFromName("iceandfire:troll_weapon_axe")));
			 }else if(i == 1)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemParser.getItemFromName("iceandfire:troll_weapon_column")));
			 }else if(i == 2)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemParser.getItemFromName("iceandfire:troll_weapon_hammer")));
			 }else if(i == 3)
			 {
				 entity.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(ItemParser.getItemFromName("iceandfire:troll_weapon_tree")));
			 }
			 
					 
		 }

		 else if(entityType.equalsIgnoreCase("cyclops"))
		 {

		 }

		 else if(entityType.equalsIgnoreCase("hydra"))
		 {

		 }

	 }
}
