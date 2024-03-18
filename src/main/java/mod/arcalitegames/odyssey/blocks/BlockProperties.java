package mod.arcalitegames.odyssey.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockProperties
{

    public static final AbstractBlock.Properties AMETHYST = getGemBlockProperties();
    public static final AbstractBlock.Properties AMETHYST_ORE = getGemBlockProperties();
    public static final AbstractBlock.Properties RUBY = getGemBlockProperties();
    public static final AbstractBlock.Properties RUBY_ORE = getGemBlockProperties();
    public static final AbstractBlock.Properties TOPAZ = getGemBlockProperties();
    public static final AbstractBlock.Properties TOPAZ_ORE = getGemBlockProperties();
    public static final AbstractBlock.Properties FURNITURE = getFurnitureProperties();

    private static AbstractBlock.Properties getFurnitureProperties()
    {
        return AbstractBlock.Properties.create(Material.WOOD)
                .notSolid()
                .harvestLevel(2)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
                .hardnessAndResistance(2.0f)
        ;
    }

    private static AbstractBlock.Properties getGemBlockProperties()
    {
        return AbstractBlock.Properties.create(Material.ROCK)
                .harvestLevel(2)
                .hardnessAndResistance(5.0f)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .sound(SoundType.METAL)
        ;
    }
}
