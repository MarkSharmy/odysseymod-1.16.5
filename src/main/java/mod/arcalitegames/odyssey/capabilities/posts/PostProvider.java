package mod.arcalitegames.odyssey.capabilities.posts;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class PostProvider implements ICapabilitySerializable<CompoundNBT>
{
    private final EntityPost post = new EntityPost();
    private final LazyOptional<IPost> optional = LazyOptional.of(() -> post);

    public void invalidate()
    {
        optional.invalidate();
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
    {
        return optional.cast();
    }

    @Override
    public CompoundNBT serializeNBT()
    {
        if(PositionCapability.POST == null)
        {
            return new CompoundNBT();
        }else{
            return (CompoundNBT) PositionCapability.POST.writeNBT(post, null);
        }
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt)
    {
        if(PositionCapability.POST == null)
        {
            PositionCapability.POST.readNBT(post, null, nbt);
        }
    }
}
