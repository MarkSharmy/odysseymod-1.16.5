package mod.arcalitegames.odyssey.entity.render;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.model.CitizenModel;
import mod.arcalitegames.odyssey.entity.passive.CitizenEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CitizenRenderer extends MobRenderer<CitizenEntity, CitizenModel<CitizenEntity>>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/entity/boromir_town/axe_roseworth.png");

    public CitizenRenderer(EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn, new CitizenModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(CitizenEntity entity)
    {
        return TEXTURE;
    }
}
