package mod.arcalitegames.odyssey.capabilities.commerce;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class WealthProvider implements ICapabilitySerializable<CompoundNBT>
{
    private final PlayerWallet wallet = new PlayerWallet();
    private final LazyOptional<IWallet> optional = LazyOptional.of(() -> wallet);

    public void invalidate()
    {
        optional.invalidate();
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return optional.cast();
    }

    @Override
    public CompoundNBT serializeNBT()
    {
        if(WealthCapability.CAPABILITY == null)
        {
            return new CompoundNBT();
        }else{
            return (CompoundNBT) WealthCapability.CAPABILITY.writeNBT(wallet, null);
        }
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt)
    {
        if(WealthCapability.CAPABILITY == null)
        {
            WealthCapability.CAPABILITY.readNBT(wallet, null, nbt);
        }
    }
}
