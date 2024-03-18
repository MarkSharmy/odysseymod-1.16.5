package mod.arcalitegames.odyssey.world.gen;

import net.minecraft.util.math.BlockPos;

public abstract class MapGenStructure
{
	public BlockPos spawnPoint;
	public abstract boolean canGenerate(BlockPos start);
	public abstract void setOrigin(BlockPos spawnPoint); 
}
