package mod.arcalitegames.odyssey.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.system.odyssey.Machine;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;

public class NoticeGui
{
     public static class Page1 extends Screen
    {
    	private int guiX = 0;
        private int guiY = 20;
        private int texWidth = 248;
        private int texHeight = 256;
        private int buttonWidth = 58;
        private int buttonHeight = 20;
        private Button getTextureButton;
        private Button continueButton;

        public final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/page1.png");
        public Page1()
        {
            super(new StringTextComponent("Notice"));
        }

        @Override
        public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
            this.minecraft.textureManager.bindTexture(TEXTURE);
            this.setLocationRelativeToCenter();
            this.blit(matrixStack, guiX, guiY, 0, 0, texWidth, texHeight);
            this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
            this.renderButtons();
            super.render(matrixStack, mouseX, mouseY, partialTicks);
        }

        private void setLocationRelativeToCenter()
        {
            guiX = (this.width/2) - (texWidth/2);
        }

        @Override
        protected void init()
        {
            this.setLocationRelativeToCenter();
            super.init();
        }

        protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
        {
            drawCenteredString(matrixStack, fontRenderer, "Welcome to OdysseyMod", texWidth/2 + guiX, 50 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "Did you know, you can have Dungeons?", texWidth/2 + guiX, 60 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "Our Patrons enjoy dungeons and other", texWidth/2 + guiX, 70 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "locations featured in Adventure Mode!", texWidth/2 + guiX, 80 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "Turn your map into an Adventure RPG world.", texWidth/2 + guiX, 90 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "Press Next to see more Adventure Mode perks.", texWidth/2 + guiX, 120 + guiY, 0xd3d3d3);
        }

        protected void renderButtons()
        {
            getTextureButton = new Button(
                    40 + guiX,
                    140 + guiY,
                    buttonWidth + 20,
                    buttonHeight,
                    new StringTextComponent("Go to Patreon"), Machine::openBrowser);

            continueButton = new Button(
                    150 + guiX,
                    140 + guiY,
                    buttonWidth,
                    buttonHeight,
                    new StringTextComponent("Next"), (n) -> {Minecraft.getInstance().displayGuiScreen(new Page2());});

            this.addButton(getTextureButton);
            this.addButton(continueButton);
        }
    }
    
    static class Page2 extends Screen
    {
    	private int guiX = 0;
        private int guiY = 20;
        private int texWidth = 248;
        private int texHeight = 256;
        private int buttonWidth = 58;
        private int buttonHeight = 20;
        private Button getTextureButton;
        private Button continueButton;

        public final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/page2.png");
        public Page2()
        {
            super(new StringTextComponent("Notice"));
        }

        @Override
        public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
            this.minecraft.textureManager.bindTexture(TEXTURE);
            this.setLocationRelativeToCenter();
            this.blit(matrixStack, guiX, guiY, 0, 0, texWidth, texHeight);
            this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
            this.renderButtons();
            super.render(matrixStack, mouseX, mouseY, partialTicks);
        }

        private void setLocationRelativeToCenter()
        {
            guiX = (this.width/2) - (texWidth/2);
        }

        @Override
        protected void init()
        {
            this.setLocationRelativeToCenter();
            super.init();
        }

        protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
        {
            drawCenteredString(matrixStack, fontRenderer, "Adventure Mode features:", texWidth/2 + guiX, 50 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "20 new dungeon locations for all biomes,", texWidth/2 + guiX, 70 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "spread across your map. You can raid them,", texWidth/2 + guiX, 90 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "loot them, and fight enemies that dwell within.", texWidth/2 + guiX, 110 + guiY, 0xd3d3d3);
        }

        protected void renderButtons()
        {
            getTextureButton = new Button(
                    40 + guiX,
                    140 + guiY,
                    buttonWidth + 20,
                    buttonHeight,
                    new StringTextComponent("Go to Patreon"), Machine::openBrowser);

            continueButton = new Button(
                    150 + guiX,
                    140 + guiY,
                    buttonWidth,
                    buttonHeight,
                    new StringTextComponent("Next"), (n) -> {Minecraft.getInstance().displayGuiScreen(new Page3());});

            this.addButton(getTextureButton);
            this.addButton(continueButton);
        }
    }
    
    static class Page3 extends Screen
    {
    	private int guiX = 0;
        private int guiY = 20;
        private int texWidth = 248;
        private int texHeight = 256;
        private int buttonWidth = 58;
        private int buttonHeight = 20;
        private Button getTextureButton;
        private Button continueButton;

        public final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/page3.png");
        public Page3()
        {
            super(new StringTextComponent("Notice"));
        }

        @Override
        public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
            this.minecraft.textureManager.bindTexture(TEXTURE);
            this.setLocationRelativeToCenter();
            this.blit(matrixStack, guiX, guiY, 0, 0, texWidth, texHeight);
            this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
            this.renderButtons();
            super.render(matrixStack, mouseX, mouseY, partialTicks);
        }

        private void setLocationRelativeToCenter()
        {
            guiX = (this.width/2) - (texWidth/2);
        }

        @Override
        protected void init()
        {
            this.setLocationRelativeToCenter();
            super.init();
        }

        protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
        {
            drawCenteredString(matrixStack, fontRenderer, "Adventure Mode features:", texWidth/2 + guiX, 50 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "Bandit and Goblin mobs. These mobs usually", texWidth/2 + guiX, 70 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "occupy camps, towers and strongholds", texWidth/2 + guiX, 90 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "Illagers spawn in some strongholds too!", texWidth/2 + guiX, 110 + guiY, 0xd3d3d3);
        }

        protected void renderButtons()
        {
            getTextureButton = new Button(
                    40 + guiX,
                    140 + guiY,
                    buttonWidth + 20,
                    buttonHeight,
                    new StringTextComponent("Go to Patreon"), Machine::openBrowser);

            continueButton = new Button(
                    150 + guiX,
                    140 + guiY,
                    buttonWidth,
                    buttonHeight,
                    new StringTextComponent("Next"), (n) -> {Minecraft.getInstance().displayGuiScreen(new Page4());;});

            this.addButton(getTextureButton);
            this.addButton(continueButton);
        }
    }
    
    static class Page4 extends Screen
    {
    	private int guiX = 0;
        private int guiY = 20;
        private int texWidth = 248;
        private int texHeight = 256;
        private int buttonWidth = 58;
        private int buttonHeight = 20;
        private Button getTextureButton;
        private Button continueButton;

        public final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/page4.png");
        public Page4()
        {
            super(new StringTextComponent("Notice"));
        }

        @Override
        public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
            this.minecraft.textureManager.bindTexture(TEXTURE);
            this.setLocationRelativeToCenter();
            this.blit(matrixStack, guiX, guiY, 0, 0, texWidth, texHeight);
            this.displayUserPrompt(matrixStack, minecraft.fontRenderer);
            this.renderButtons();
            super.render(matrixStack, mouseX, mouseY, partialTicks);
        }

        private void setLocationRelativeToCenter()
        {
            guiX = (this.width/2) - (texWidth/2);
        }

        @Override
        protected void init()
        {
            this.setLocationRelativeToCenter();
            super.init();
        }

        protected void displayUserPrompt(MatrixStack matrixStack, FontRenderer fontRenderer)
        {
            drawCenteredString(matrixStack, fontRenderer, "Your support helps to keep us going.", texWidth/2 + guiX, 60 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "Please consider becoming our Patron", texWidth/2 + guiX, 80 + guiY, 0xd3d3d3);
            drawCenteredString(matrixStack, fontRenderer, "and enjoy all these Adveture Mode perks", texWidth/2 + guiX, 100 + guiY, 0xd3d3d3);
        }

        protected void renderButtons()
        {
            getTextureButton = new Button(
                    40 + guiX,
                    140 + guiY,
                    buttonWidth + 20,
                    buttonHeight,
                    new StringTextComponent("Go to Patreon"), Machine::openBrowser);

            continueButton = new Button(
                    150 + guiX,
                    140 + guiY,
                    buttonWidth,
                    buttonHeight,
                    new StringTextComponent("Close"), (n) -> {this.closeScreen();});

            this.addButton(getTextureButton);
            this.addButton(continueButton);
        }
    }
}
