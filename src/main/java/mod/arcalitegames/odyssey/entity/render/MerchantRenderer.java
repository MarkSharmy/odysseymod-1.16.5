package mod.arcalitegames.odyssey.entity.render;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.MerchantModel;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MerchantRenderer extends MobRenderer<MerchantEntity, MerchantModel<MerchantEntity>>
{
private static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/innkeeper.png");
	
	public MerchantRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new MerchantModel<>(), 0.5f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(MerchantEntity entity)
	{
		return TEXTURE;
	} 
}
