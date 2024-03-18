package mod.arcalitegames.odyssey.world.structure;

import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.arcalitegames.odyssey.enums.StructureClass;
import mod.arcalitegames.odyssey.world.gen.MapGenStructure;
import mod.arcalitegames.system.math.BlockPosition;

public class Structure implements Comparable<Structure>, Serializable
{
	protected boolean key;
	protected int preferredHeight;
	protected String registryName;
	protected BlockPosition spawnPoint;
	protected MapGenStructure mapGenStructure;
	protected StructureClass structureClass;
	private static final Logger LOGGER = LogManager.getLogger();
	private static final long serialVersionUID = -6515775720549355584L;
	
	public Structure(String registryName, StructureClass structureClass, MapGenStructure mapGenStructure)
	{
		this.key = true;
		this.registryName = registryName;
		this.structureClass = structureClass;
		this.mapGenStructure = mapGenStructure;
	}
	
	public boolean generate()
	{
		if(!locked())
		{
			if(this.mapGenStructure.canGenerate(spawnPoint.getBlockPos()))
			{
				this.mapGenStructure.setOrigin(spawnPoint.getBlockPos());
				LOGGER.debug("Spawned Structure at: " + spawnPoint);
				this.lock();
				return true;
			}
		}
		
		return false;
	}
	
	public void setSpawnPoint(BlockPosition pos) 
	{
		this.spawnPoint = pos;
	}
	
	public void setPreferredHeight(int height)
	{
		this.preferredHeight = height;
		BlockPosition pos = new BlockPosition(spawnPoint.getCardinal(), spawnPoint.getX(), height, spawnPoint.getZ());
		this.spawnPoint = pos;
	}
	
	public int getPreferredHeight()
	{
		return preferredHeight;
	}
	
	public StructureClass getStructureClass()
	{
		return structureClass;
	}
	
	public String getRegistryName()
	{
		return registryName;
	}
	
	public void lock()
	{
		this.key = false;
	}
	
	public boolean locked()
	{
		if(key)
			return false;
		else 
			return true;
	}
	
	@Override
	public String toString()
	{
		return registryName;
	}

	@Override
	public int compareTo(Structure otherStructure)
	{
		if(this.getStructureClass().equals(otherStructure.getStructureClass()))
		{
			return 0;
			
		}else if((this.getStructureClass().getRange()) > (otherStructure.getStructureClass().getRange()))
		{
			return 1;
			
		}else if((this.getStructureClass().getRange()) < (otherStructure.getStructureClass().getRange()))
		{
			return -1;
		}
		
		return 0;
	}

	public BlockPosition getSpawnPoint()
	{
		return spawnPoint;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Structure otherStructure = (Structure)obj;
		
		if(this.registryName.equals(otherStructure.registryName))
		{
			return true;
			
		}else {
			
			return false;
		}
		
	}
	
	public Structure clone()
	{
		return new Structure(this.registryName, this.structureClass, mapGenStructure);
	}
	
}
