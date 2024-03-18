package mod.arcalitegames.system.parser;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;
import javax.annotation.Nullable;

public class BlockParser
{
    private static final DefaultedRegistry<Block> REGISTRY = Registry.BLOCK;

    @Nullable
    public static Block getBlockFromName(String name)
    {
        ResourceLocation resourceLocation = new ResourceLocation(name);
        if(REGISTRY.containsKey(resourceLocation))
        {
            return REGISTRY.getOrDefault(resourceLocation);
        }
        else
        {
            try{
                return REGISTRY.getByValue(Integer.parseInt(name));
            }
            catch(NumberFormatException var3)
            {
                return null;
            }
        }
    }
}
