package mod.arcalitegames.odyssey.client.events;


import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.capabilities.posts.PostProvider;
import mod.arcalitegames.odyssey.entity.passive.StandingGuardEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;

public class CapabilityEvents
{
	public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event)
	{
		if(event.getObject() instanceof StandingGuardEntity)
		{
			PostProvider provider = new PostProvider();
			event.addCapability(new ResourceLocation(OdysseyMod.MODID, "post"), provider);
			event.addListener(provider::invalidate);
		}
	}
	
	
	
}
