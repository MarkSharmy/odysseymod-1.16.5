package mod.arcalitegames.system.registry;

import mod.arcalitegames.odyssey.entity.Entities;
import mod.arcalitegames.odyssey.entity.citizens.bashkarcity.BashkarCity;
import mod.arcalitegames.odyssey.entity.citizens.boromirtown.BoromirTown;
import mod.arcalitegames.odyssey.entity.citizens.fort_mesa.FortMesa;
import mod.arcalitegames.odyssey.entity.citizens.saxontown.SaxonTown;
import mod.arcalitegames.odyssey.entity.hostile.HostileMobs;
import mod.arcalitegames.odyssey.entity.merchants.Merchants;
import mod.arcalitegames.odyssey.entity.render.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityRenders
{
    public static void registerRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(Entities.COUNTER.get(), CounterRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(Entities.CITIZEN.get(), CitizenRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(Entities.SEAT_CHAIR.get(), new ChairRenderFactory());
        Merchants.renderAllEntities();
        HostileMobs.renderAllEntities();
        BoromirTown.renderAllEntities();
        SaxonTown.renderAllEntities();
        BashkarCity.renderAllEntities();
        FortMesa.renderAllEntities();
    }
}
