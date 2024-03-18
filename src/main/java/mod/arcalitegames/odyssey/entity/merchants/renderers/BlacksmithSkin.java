package mod.arcalitegames.odyssey.entity.merchants.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.merchants.Blacksmith;
import mod.arcalitegames.odyssey.entity.model.MerchantModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BlacksmithSkin extends MobRenderer<Blacksmith, MerchantModel<Blacksmith>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/merchant/blacksmith.png");

	public BlacksmithSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new MerchantModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(Blacksmith entity)
	{
		return TEXTURE;
	}
	
	

}
