package mod.arcalitegames.odyssey.capabilities.commerce;

import java.io.Serializable;

public class PlayerWallet implements IWallet, Serializable
{
    private int gold;
    private int silver;
    private int bronze;
    public static final long serialVersionUID = 1807965L;

    public void copyFrom(IWallet other)
    {
        this.gold = other.getGoldCoins();
        this.silver = other.getSilverCoins();
        this.bronze = other.getBronzeCoins();
    }

    @Override
    public void setGoldCoins(int goldCoins)
    {
        this.gold = goldCoins;
    }

    @Override
    public void setSilverCoins(int silverCoins)
    {
        this.silver = silverCoins;
    }
    
    @Override
    public void setBronzeCoins(int bronzeCoins)
    {
    	this.bronze = bronzeCoins;
    }

    @Override
    public int getGoldCoins()
    {
        return gold;
    }

    @Override
    public int getSilverCoins()
    {
        return silver;
    }
    
    @Override
    public int getBronzeCoins()
    {
    	return bronze;
    }

    @Override
    public String toString()
    {
        return "Wallet: Gold-" + gold + " -Silver-" + silver + " -Bronze-" + bronze;
    }
}
