package mod.arcalitegames.system.parser;

import net.minecraft.world.IWorld;

import java.util.ArrayList;
import java.util.List;

public class WorldParser
{
    private static List<String> names;

    public static <T extends IWorld> String  getWorldName(T rawData)
    {
        names = new ArrayList<>();
        String data = rawData.toString();

        String extract = "";

        char[] cat  = data.toCharArray();

        for(char c: cat)
        {
            if(c == ':')
                extract += new String(new char[] {','});
            else if(c == '{')
                extract += new String(new char[] {','});
            else if(c == '}')
                extract += new String(new char[] {','});
            else if(c == '[')
                extract += new String(new char[] {','});
            else if(c == '=')
                extract += new String(new char[] {','});
            else if(c == ']')
                extract += new String(new char[] {','});
            else
                extract += new String(new char[] {c});
        }

        String[] values = extract.split(",");

        for(String str: values) { names.add(str); }

        for(String name: names)
        {
           if(!name.equals("ClientLevel") && !name.equals("ServerLevel"))
               return name;
        }

        return null;
    }
}
