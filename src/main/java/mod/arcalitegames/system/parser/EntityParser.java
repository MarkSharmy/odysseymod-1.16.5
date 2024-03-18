package mod.arcalitegames.system.parser;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;

public class EntityParser
{
    private static final DefaultedRegistry<EntityType<?>> REGISTRY = Registry.ENTITY_TYPE;

    @Nullable
    public static EntityType<? extends Entity> getEntityFromName(String name)
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
