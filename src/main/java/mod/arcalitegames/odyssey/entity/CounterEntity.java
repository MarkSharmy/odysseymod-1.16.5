package mod.arcalitegames.odyssey.entity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class CounterEntity extends CreatureEntity
{

	public CounterEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	@Override
	public void applyEntityCollision(Entity entityIn) {
	}
	
	@Override
	public void applyKnockback(float strength, double ratioX, double ratioZ) {
	}
	
	
	
	@Override
	public boolean canBeSteered() {
		return false;
	}
	
	@Override
	protected void collideWithEntity(Entity entityIn) {
	}
	
	@Override
	protected void collideWithNearbyEntities() {
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
	public boolean canCollide(Entity entity)
	{
		return false;
	}
	
	@Override
	public boolean canBeHitWithPotion()
	{
		return false;
	}
	
	@Override
	public boolean attackable()
	{
		return false;
	}

	@Override
	public boolean canBeAttackedWithItem()
	{
		return false;
	}
	
	@Override
	public boolean canDespawn(double distanceToClosestPlayer)
	{
		return false;
	}
	
	@Override
	public boolean isInvulnerable()
	{
		return true;
	}
	
	@Override
	public boolean isInvisible()
	{
		return false;
	}
	
	@Override
	public boolean isInvisibleToPlayer(PlayerEntity player)
	{
		return false;
	}
}
