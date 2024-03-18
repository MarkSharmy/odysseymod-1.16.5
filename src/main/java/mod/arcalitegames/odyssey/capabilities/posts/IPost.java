package mod.arcalitegames.odyssey.capabilities.posts;

import net.minecraft.util.math.BlockPos;

public interface IPost
{
	void setPosition(int x, int y, int z);
	void setPosition(BlockPos pos);
	BlockPos getPosition();
}
