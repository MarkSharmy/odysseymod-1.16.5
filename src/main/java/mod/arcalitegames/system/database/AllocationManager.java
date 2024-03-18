package mod.arcalitegames.system.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mod.arcalitegames.odyssey.capabilities.commerce.PlayerWallet;
import mod.arcalitegames.odyssey.world.structure.Structure;
import mod.arcalitegames.system.cache.DataCache;
import mod.arcalitegames.system.math.BlockPosition;

public class AllocationManager
{
    private static String fileName = "player.dat";
    private static String pathName = "Arcalite Games/Odyssey Mod/data/";
    private static Map<String, PlayerWallet> database = new HashMap<>();
    private static DataCache<String, PlayerWallet>[] entries;
    private static FileInputStream input;
    private static FileOutputStream output;
    private static ObjectInputStream dataIn;
    private static ObjectOutputStream dataOut;

    public static DataCache<String, PlayerWallet>[] getEntries() {
        return entries;
    }

    public static PlayerWallet getSaveData(String world)
    {
        if(database.containsKey(world))
        {
            return database.get(world);
        }else
        {
            writeSaveData(world);
        }

        return new PlayerWallet();
    }

    public static void update(String world, PlayerWallet wallet) { database.replace(world, wallet); }

    public static void writeSaveData(String world)
    {
        File file = new File(pathName, fileName);

        try {

            if (!file.exists()) {
                file = new File(pathName);
                file.mkdirs();
                file = new File(pathName, fileName);
                file.createNewFile();
                PlayerWallet wallet = new PlayerWallet();
                wallet.setGoldCoins(0);
                wallet.setSilverCoins(0);
                wallet.setBronzeCoins(0);
                database.put(world, wallet);
            }

            if (!database.containsKey(world)) {
                PlayerWallet wallet = new PlayerWallet();
                wallet.setGoldCoins(0);
                wallet.setSilverCoins(0);
                wallet.setBronzeCoins(0);
                database.put(world, wallet);
            }

            output = new FileOutputStream(file);
            dataOut = new ObjectOutputStream(output);

            Set<Map.Entry<String, PlayerWallet>> cacheData = database.entrySet();
            List<DataCache<String, PlayerWallet>> cacheEntries = new LinkedList<>();
            for (Map.Entry<String, PlayerWallet> entry: cacheData) { cacheEntries.add(new DataCache<String, PlayerWallet>(entry.getKey(), entry.getValue())); }

            DataCache<String, PlayerWallet>[] cache = (DataCache<String, PlayerWallet>[])cacheEntries.toArray(new DataCache[cacheEntries.size()]);
            dataOut.writeObject(cache);

        }catch(NotSerializableException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            try{
                dataOut.close();
                output.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void readSaveData(String world)
    {
        File file = new File(pathName, fileName);

        if(!file.exists()) { writeSaveData(world); }

        try {
            input = new FileInputStream(file);
            dataIn = new ObjectInputStream(input);

            DataCache<String, PlayerWallet>[] cacheData = (DataCache<String, PlayerWallet>[]) dataIn.readObject();

            for(DataCache<String, PlayerWallet> cache: cacheData)
            {
                database.put(cache.getCache(), cache.getData());
            }

        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally {
            try{
                dataIn.close();
                input.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
