package mod.arcalitegames.odyssey.entity.merchants.renderers;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.merchants.Craftsman;
import mod.arcalitegames.odyssey.entity.model.MerchantModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CraftsmanSkin extends MobRenderer<Craftsman, MerchantModel<Craftsman>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/merchant/craftsman.png");
	
	public CraftsmanSkin(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new MerchantModel<>(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(Craftsman entity)
	{
		return TEXTURE;
	}
	
	
}
