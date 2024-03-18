package mod.arcalitegames.system.cache;

import java.io.Serializable;

public class DataCache<C, D> implements Serializable
{
    private C cache;
    private D data;
    public static final long serialVersionUID = 2022L;

    public DataCache(C cache, D data)
    {
    	this.data = data;
    	this.cache = cache;
    }
    
    public D getData()
    {
    	return data;
    }
    
    public C getCache()
    {
    	return cache;
    }
}
