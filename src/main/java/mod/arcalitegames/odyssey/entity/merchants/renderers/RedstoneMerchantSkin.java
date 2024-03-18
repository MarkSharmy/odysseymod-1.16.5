package mod.arcalitegames.odyssey.entity.merchants.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.merchants.RedstoneMerchant;
import mod.arcalitegames.odyssey.entity.model.MerchantModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneMerchantSkin extends MobRenderer<RedstoneMerchant, MerchantModel<RedstoneMerchant>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/merchant/trinketsmerchant.png");

	public RedstoneMerchantSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new MerchantModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(RedstoneMerchant entity)
	{
		return TEXTURE;
	}
}
