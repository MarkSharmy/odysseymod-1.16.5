package mod.arcalitegames.odyssey.entity.passive;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class GenericEntity extends CreatureEntity
{
    public GenericEntity(EntityType<? extends CreatureEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH,3000.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED,0.7D);

    }

}