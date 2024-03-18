package mod.arcalitegames.odyssey.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.client.player.PlayerWalletManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HUDRenderer
{
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderGameOverlay(RenderGameOverlayEvent event)
    {
        if(event.getType() == RenderGameOverlayEvent.ElementType.TEXT)
        {
            HUDRenderer.Overlay overlay = new Overlay();
            overlay.render(event.getMatrixStack(), 0, 0, event.getPartialTicks());
        }
    }

    public static class Overlay extends Screen
    {
        private int texWidth = 256;
        private int texHeight = 32;
        Minecraft mc = Minecraft.getInstance();
        public static int gold = 0;
        public static int silver = 0;
        public static int bronze = 0;
        private static final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/wealth_display.png");

        protected Overlay()
        {
            super(new StringTextComponent(""));
        }

        @Override
        public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
        {
            int center = 10;
            mc.getTextureManager().bindTexture(TEXTURE);
            this.blit(matrixStack, center, 0, 0, 0, texWidth, texHeight);
            drawString(matrixStack, mc.fontRenderer, this.getGold(), center + 18, 5, -15);
            drawString(matrixStack, mc.fontRenderer, this.getSilver(), center + 105, 5, -15);
            drawString(matrixStack, mc.fontRenderer, this.getBronze(), center + 192, 5, -15);
            super.render(matrixStack, mouseX, mouseY, partialTicks);
        }

        private String getGold()
        {
            if(gold <10)
                return "00" + gold;
            else if(gold < 100)
                return "0" + gold;
            else
                return ""+gold;
        }

        private String getSilver()
        {
            if(silver <10)
                return "00" + silver;
            else if(silver < 100)
                return "0" + silver;
            else
                return ""+silver;
        }
        
        private String getBronze()
        {
            if(bronze <10)
                return "00" + bronze;
            else if(bronze < 100)
                return "0" + bronze;
            else
                return ""+bronze;
        }

    }
}
