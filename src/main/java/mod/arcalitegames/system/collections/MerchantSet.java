package mod.arcalitegames.system.collections;

import java.util.LinkedHashSet;

public class MerchantSet<E> extends LinkedHashSet<E>
{
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	public void addMultiple(E...objects)
	{
		for(E e: objects)
		{
			this.add(e);
		}
	}

}
