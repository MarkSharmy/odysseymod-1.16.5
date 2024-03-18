package mod.arcalitegames.odyssey.entity.merchants.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.merchants.GuildMaster;
import mod.arcalitegames.odyssey.entity.model.MerchantModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GuildMasterSkin extends MobRenderer<GuildMaster, MerchantModel<GuildMaster>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/merchant/guildmaster.png");

	
	public GuildMasterSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new MerchantModel<>(), 0.5F);
	}


	@Override
	public ResourceLocation getEntityTexture(GuildMaster entity)
	{
		return TEXTURE;
	}
	
	

}
