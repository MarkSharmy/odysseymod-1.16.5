package mod.arcalitegames.odyssey.world.structure.town;

import mod.arcalitegames.odyssey.world.gen.MapGenerator;
import mod.arcalitegames.odyssey.world.structure.StructureBase;
import mod.arcalitegames.system.util.Counter;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;

public abstract class TownStructure extends StructureBase
{
	public TownStructure(World worldIn, BlockPos origin, int xRange, int yRange, int zRange) {
		super(worldIn, origin, xRange, yRange, zRange);
		// TODO Auto-generated constructor stub
	}

	protected void transportPlayertoTown(Structure<NoFeatureConfig> town, String message, int x_offset, int z_offset)
	{
		PlayerEntity player = world.getPlayers().get(0);
		MinecraftServer server = world.getServer();
		CommandSource source = server.getCommandSource();
		Commands manager = server.getCommandManager();

		BlockPos blockPos = source.getWorld().getStructureLocation(town, new BlockPos(source.getPos()), 100, false);
		String command = "tp @p "+ (blockPos.getX() + x_offset) +" 77 "+ (blockPos.getZ() + z_offset);
		manager.handleCommand(source, command);

		player.sendMessage(new StringTextComponent(message), player.getUniqueID());
		MapGenerator.generateMapLocations(player);
		command = "setworldspawn";
		manager.handleCommand(source, command);
		Counter.startTimer();
		
	}
}
