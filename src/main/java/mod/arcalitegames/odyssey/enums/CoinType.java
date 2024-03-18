package mod.arcalitegames.odyssey.enums;

public enum CoinType
{
    BRONZE, SILVER, GOLD;

    @Override
    public String toString()
    {
        switch(this)
        {
        case BRONZE: return "b";
        case SILVER: return "s";
        case GOLD: return "G";
        	default: return "s";
        }
    }
}
