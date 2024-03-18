package mod.arcalitegames.odyssey.client.gui;

import mod.arcalitegames.odyssey.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab
{
    public static final ItemGroup CREATIVE_TAB = new ItemGroup("odyssey_tab")
    {

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.POINTER.get());
        }
    };
    
    public static final ItemGroup MARKER_TAB = new ItemGroup("marker_tab")
    {

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.GOLD_COIN.get());
        }
    };
}
