package mod.arcalitegames.system.parser;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;

public class ItemParser
{
    private static final DefaultedRegistry<Item> REGISTRY = Registry.ITEM;

    @Nullable
    public static Item getItemFromName(String name)
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
