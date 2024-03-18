package mod.arcalitegames.system.commands;

import java.util.Map.Entry;
import java.util.Set;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import mod.arcalitegames.odyssey.world.gen.MapGenerator;
import mod.arcalitegames.odyssey.world.structure.Structure;
import mod.arcalitegames.system.math.BlockPosition;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;

public class FindCommand
{
	public FindCommand(CommandDispatcher<CommandSource> dispatcher)
	{
		dispatcher.register(Commands.literal("find")
		.then(Commands.literal("all").executes((command) -> {return executeAllCommand(command.getSource());}))
		.then(Commands.literal("boromir_town").executes((command) -> { return executeSpecifiedCommand("boromir_town", command.getSource());}))
		.then(Commands.literal("bashkar_city").executes((command) -> { return executeSpecifiedCommand("bashkar_city", command.getSource());}))
		.then(Commands.literal("saxon_town").executes((command) -> { return executeSpecifiedCommand("saxon_town", command.getSource());}))
		.then(Commands.literal("saxon_snow").executes((command) -> { return executeSpecifiedCommand("saxon_snow", command.getSource());}))
		.then(Commands.literal("fort_mesa").executes((command) -> { return executeSpecifiedCommand("fort_mesa", command.getSource());}))
		.then(Commands.literal("ziggurat").executes((command) -> { return executeSpecifiedCommand("ziggurat", command.getSource());}))
		.then(Commands.literal("masoleum").executes((command) -> { return executeSpecifiedCommand("masoleum", command.getSource());}))
		.then(Commands.literal("shrine").executes((command) -> { return executeSpecifiedCommand("shrine", command.getSource());}))
		.then(Commands.literal("kagrenzal").executes((command) -> { return executeSpecifiedCommand("kagrenzal", command.getSource());}))
		.then(Commands.literal("temple").executes((command) -> { return executeSpecifiedCommand("temple", command.getSource());}))
		.then(Commands.literal("mayan_pyramid").executes((command) -> { return executeSpecifiedCommand("mayan_pyramid", command.getSource());}))
		.then(Commands.literal("mayan_temple").executes((command) -> { return executeSpecifiedCommand("mayan_temple", command.getSource());}))
		.then(Commands.literal("abandoned_fort").executes((command) -> { return executeSpecifiedCommand("abandoned_fort", command.getSource());}))
		.then(Commands.literal("fort_neograd").executes((command) -> { return executeSpecifiedCommand("fort_neograd", command.getSource());}))
		.then(Commands.literal("fort_hraggstad").executes((command) -> { return executeSpecifiedCommand("fort_hraggstad", command.getSource());}))
		.then(Commands.literal("fort_greymoor").executes((command) -> { return executeSpecifiedCommand("fort_greymoor", command.getSource());}))
		.then(Commands.literal("goblin_ruins").executes((command) -> { return executeSpecifiedCommand("goblin_ruins", command.getSource());}))
		.then(Commands.literal("ancient_ruins").executes((command) -> { return executeSpecifiedCommand("ancient_ruins", command.getSource());}))
		.then(Commands.literal("cathedral_ruins").executes((command) -> { return executeSpecifiedCommand("cathedral_ruins", command.getSource());}))
		.then(Commands.literal("ruins").executes((command) -> { return executeSpecifiedCommand("ruins", command.getSource());}))
		.then(Commands.literal("desert_ruins").executes((command) -> { return executeSpecifiedCommand("desert_ruins", command.getSource());}))
		.then(Commands.literal("jungle_ruins").executes((command) -> { return executeSpecifiedCommand("jungle_ruins", command.getSource());}))
		.then(Commands.literal("greek_warrior_sword_shield").executes((command) -> { return executeSpecifiedCommand("greek_warrior_sword_shield", command.getSource());}))
		.then(Commands.literal("greek_warrior_sword_pointing").executes((command) -> { return executeSpecifiedCommand("greek_warrior_sword_pointing", command.getSource());}))
		.then(Commands.literal("greek_warrior_spear_shield").executes((command) -> { return executeSpecifiedCommand("greek_warrior_spear_shield", command.getSource());}))
		.then(Commands.literal("greek_warrior_spear_pointing").executes((command) -> { return executeSpecifiedCommand("greek_warrior_spear_pointing", command.getSource());}))
		.then(Commands.literal("stone_hedge").executes((command) -> { return executeSpecifiedCommand("stone_hedge", command.getSource());}))
		.then(Commands.literal("sphinx").executes((command) -> { return executeSpecifiedCommand("sphinx", command.getSource());}))
				
		);

	}
	
	private int executeAllCommand(CommandSource source) throws CommandSyntaxException
	{
		ServerPlayerEntity player = source.asPlayer();
		
		Set<Entry<Structure, BlockPosition>> set = MapGenerator.mappings.entrySet();
		if(set.isEmpty())
		{
			StringTextComponent failedMessage = new StringTextComponent("No structures found on this map");
			failedMessage.setStyle(Style.EMPTY.applyFormatting(TextFormatting.RED));
			player.sendMessage(failedMessage, player.getUniqueID());
			return 0;
		}
		
		
		for(Entry<Structure, BlockPosition> map: set)
		{
			player.sendMessage(new StringTextComponent("Structure: " + map.getKey() + ", Location: " + map.getValue()), player.getUniqueID());
		}
		
		return 1;
	}

	private int executeSpecifiedCommand(String name, CommandSource source) throws CommandSyntaxException
	{
		ServerPlayerEntity player = source.asPlayer();
		
		Set<Entry<Structure, BlockPosition>> set = MapGenerator.mappings.entrySet();
		
		for(Entry<Structure, BlockPosition> map: set)
		{
			if(map.getKey().toString().equals(name))
			{
				player.sendMessage(new StringTextComponent("Structure: " + map.getKey() + ", Location: " + map.getValue()), player.getUniqueID());
				map.getKey().generate();
				return 1;
			}
		}
		
		StringTextComponent failedMessage = new StringTextComponent("Could not locate " + name);
		failedMessage.setStyle(Style.EMPTY.applyFormatting(TextFormatting.RED));
		player.sendMessage(failedMessage, player.getUniqueID());
		
		return 0;
	}
}
