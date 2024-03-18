package mod.arcalitegames.odyssey.items;

import mod.arcalitegames.odyssey.client.gui.CreativeTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemProperties
{
    public static final Item.Properties DEFAULT = defaultItemProperties();

    private static Item.Properties defaultItemProperties()
    {
        return new Item.Properties().group(CreativeTab.CREATIVE_TAB);
    }
    
    public static final Item.Properties MARKER = markerItemProperties();
    
    private static Item.Properties markerItemProperties()
    {
        return new Item.Properties().group(CreativeTab.MARKER_TAB);
    }
}
