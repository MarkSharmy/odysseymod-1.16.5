package mod.arcalitegames.odyssey.entity.merchants.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.merchants.BakeryMerchant;
import mod.arcalitegames.odyssey.entity.model.MerchantModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BakerSkin extends MobRenderer<BakeryMerchant, MerchantModel<BakeryMerchant>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/merchant/bakery.png");

	public BakerSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new MerchantModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(BakeryMerchant entity)
	{
		return TEXTURE;
	}
	
	
}
