package mod.arcalitegames.buildersaddition.blocks.base;

import mod.arcalitegames.odyssey.blocks.ChairBlock;
import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public interface ISeat{

	public class ChairSeat extends Entity
	{
		
		public ChairSeat(EntityType<?> entityTypeIn, World worldIn)
		{
			super(entityTypeIn, worldIn);
		}
		
		private ChairBlock block;
		private Vector3d vector;
		
		private ChairSeat(Block blockInstance, World worldIn, Vector3d vec)
		{
			super(Entities.SEAT_CHAIR.get(), worldIn);
			this.setPosition(vec.x + 0.5, vec.y + 0.4, vec.z + 0.5);
			this.block = (ChairBlock) blockInstance;
			this.noClip = true;
			this.vector = vec;
		}
		
		public void setParameters(Block blockInstance, World worldIn, Vector3d vec)
		{
			this.setPosition(vec.x + 0.5, vec.y + 0.4, vec.z + 0.5);
			this.block = (ChairBlock) blockInstance;
			this.noClip = true;
			this.vector = vec;
		}
		
		@Override
		public void tick()
		{
			super.tick();
			if(!world.isRemote)
			{
				if(this.getPassengers().isEmpty())
				{
					this.remove();
				}
				
				if(!(world.getBlockState(this.getPosition()).getBlock() instanceof ISeat))
				{
					this.remove();
				}
				
				for(Entity passenger: this.getPassengers())
				{
					if(passenger instanceof CitizenEntity)
					{
						this.setPosition(vector.x + 0.5, vector.y, vector.z + 0.5);
					}
					if(passenger.isSneaking())
					{
						this.remove();
					}
				}
			}
		}
		
		@Override
		protected void registerData()
		{
		}

		@Override
		protected void readAdditional(CompoundNBT compound)
		{
		}

		@Override
		protected void writeAdditional(CompoundNBT compound)
		{
		}

		@Override
		public IPacket<?> createSpawnPacket()
		{
			return NetworkHooks.getEntitySpawningPacket(this);
		}
		
		@Override
		protected boolean canBeRidden(Entity entityIn)
		{
			return true;
		}
		
		@Override
		public boolean canBePushed()
		{
			return false;
		}
		
		@Override
		public boolean canBeCollidedWith()
		{
			return false;
		}
		
		@Override
		public boolean canPassengerSteer()
		{
			return false;
		}
		
		@Override
		public double getMountedYOffset()
		{
			return -.1d;
		}
		
	}
}
