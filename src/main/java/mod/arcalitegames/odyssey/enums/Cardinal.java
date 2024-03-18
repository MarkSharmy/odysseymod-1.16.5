package mod.arcalitegames.odyssey.enums;

import java.util.List;

import com.google.common.collect.Lists;

public enum Cardinal
{
	NORTH_EAST, NORTH_WEST, SOUTH_EAST, SOUTH_WEST;
	
	public Cardinal getOpposite()
	{
		switch(this)
		{
			case NORTH_EAST: return SOUTH_WEST;
			case NORTH_WEST: return SOUTH_EAST;
			case SOUTH_EAST: return NORTH_WEST;
			case SOUTH_WEST: return NORTH_EAST;
			default: return this;
		}
	}

	public static List<Cardinal> getPositions()
	{
		List<Cardinal> positions = Lists.newLinkedList();
		
		for(Cardinal position: Cardinal.values())
		{
			positions.add(position);
		}
		
		return positions;
	}
	
}
