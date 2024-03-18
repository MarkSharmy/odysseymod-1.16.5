package mod.arcalitegames.odyssey.items;

import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AmethystItem extends Item
{
	BlockPos blockPos; 
	
    public AmethystItem(Item.Properties properties)
    {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context)
    {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        
        MinecraftServer server = world.getServer();
    	CommandSource source = server.getCommandSource();
    	
        return ActionResultType.SUCCESS;
    }
    
}
