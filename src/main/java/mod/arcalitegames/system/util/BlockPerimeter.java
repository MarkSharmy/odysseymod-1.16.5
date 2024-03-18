package mod.arcalitegames.system.util;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;

public class BlockPerimeter
{
    private BlockPos pos1;
    private BlockPos pos2;
    private String block;
    private BlockState blockstate;

    public BlockPerimeter()
    {
    	this(BlockPos.ZERO, BlockPos.ZERO, "Blocks.AIR.getDefaultState()", Blocks.AIR.getDefaultState());
    }
    
    public BlockPerimeter(BlockPos minPos, BlockPos maxPos, String block, BlockState blockstate)
    {
        this.pos1 = minPos;
        this.pos2 = maxPos;
        this.block = block;
        this.blockstate = blockstate;
    }

    public void setMinPos(BlockPos blockpos)
    {
    	pos1 = blockpos;
    }
    
    public void setMaxPos(BlockPos blockpos)
    {
    	pos2 = blockpos;
    }
    
    public void setBlock(String block)
    {
    	this.block = block;
    }
    
    public BlockPos getMinPos()
    {
        return pos1;
    }

    public BlockPos getMaxPos()
    {
        return pos2;
    }

    public String getBlock()
    {
        return block;
    }

    public BlockState getBlockState()
    {
        return blockstate;
    }
}

