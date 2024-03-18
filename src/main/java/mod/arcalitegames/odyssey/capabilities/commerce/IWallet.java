package mod.arcalitegames.odyssey.capabilities.commerce;

public interface IWallet
{
    void setGoldCoins(int goldCoins);
    void setSilverCoins(int silverCoins);
    void setBronzeCoins(int bronzeCoins);
    int getGoldCoins();
    int getSilverCoins();
    int getBronzeCoins();
    void copyFrom(IWallet other);
}
