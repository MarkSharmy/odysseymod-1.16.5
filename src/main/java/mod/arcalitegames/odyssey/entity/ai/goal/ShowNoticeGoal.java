package mod.arcalitegames.odyssey.entity.ai.goal;

import mod.arcalitegames.odyssey.client.gui.NoticeGui;
import mod.arcalitegames.system.util.Counter;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ShowNoticeGoal
{
	private static boolean canShowNotice = false;
    @SubscribeEvent
    public static void updateNotice(ServerTickEvent event)
    {
    	if(Counter.timeElapsed(500) && canShowNotice)
        {
            Minecraft.getInstance().displayGuiScreen(new NoticeGui.Page1());
            canShowNotice = false;
        }
    }
    
    public static void showNotice()
    {
    	canShowNotice = true;
    }
}
