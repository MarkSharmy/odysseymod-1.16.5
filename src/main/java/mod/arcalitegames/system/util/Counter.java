package mod.arcalitegames.system.util;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class Counter {


    private static int ticks = 0;
    private static int currentTicks;
    private static boolean start = false;

    @SubscribeEvent
    public static void updateTick(TickEvent.WorldTickEvent event)
    {
        if(start) ticks++;
    }

    @SubscribeEvent
    public static void onUpdate(TickEvent.WorldTickEvent event) {
        Countable.startCounter();
    }

    public static class Countable {
        private static List<ICounter> setlist = new ArrayList<>();

        public static void registerCounter(ICounter counter) {
            setlist.add(counter);
        }

        private static void startCounter() {
            if (!setlist.isEmpty()) {
                for (ICounter counter : setlist) {
                    counter.setTime();
                }
            }
        }
    }

    public static void startTimer()
    {
        start = true;
        currentTicks = ticks;
    }

    public static boolean timeElapsed(int time)
    {

        if(ticks > (currentTicks + time))
        {
            return true;

        }else{

            return false;
        }
    }

    public static void resetTime()
    {
        start = false;
        currentTicks = 0;
    }


}
