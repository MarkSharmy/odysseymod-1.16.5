package mod.arcalitegames.odyssey.capabilities.commerce;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;

import javax.annotation.Nullable;

public class WealthCapability
{
    public static Capability<IWallet> CAPABILITY = null;

    public static void register()
    {
        CapabilityManager.INSTANCE.register(IWallet.class, new EntityPurse(), PlayerWallet::new);
    }

    public static class EntityPurse implements Capability.IStorage<IWallet>
    {

        @Nullable
        @Override
        public INBT writeNBT(Capability<IWallet> capability, IWallet instance, Direction side)
        {
            CompoundNBT tag = new CompoundNBT();
            tag.putInt("gold", instance.getGoldCoins());
            tag.putInt("silver", instance.getSilverCoins());
            tag.putInt("bronze", instance.getBronzeCoins());
            return tag;
        }

        @Override
        public void readNBT(Capability<IWallet> capability, IWallet instance, Direction side, INBT nbt)
        {
            int gold = ((CompoundNBT)nbt).getInt("gold");
            int silver = ((CompoundNBT)nbt).getInt("silver");
            int bronze = ((CompoundNBT)nbt).getInt("bronze");
            instance.setGoldCoins(gold);
            instance.setSilverCoins(silver);
            instance.setBronzeCoins(bronze);
        }
    }
}
