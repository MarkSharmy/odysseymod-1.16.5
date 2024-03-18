package mod.arcalitegames.odyssey.client.gui;

import java.util.LinkedList;
import java.util.List;

import mod.arcalitegames.OdysseyMod;
import mod.arcalitegames.odyssey.entity.merchants.MerchantType;
import mod.arcalitegames.odyssey.entity.passive.MerchantEntity;
import mod.arcalitegames.odyssey.trades.TradeOption;
import mod.arcalitegames.odyssey.trades.products.InventoryProduct;
import mod.arcalitegames.odyssey.trades.products.MerchantProduct;
import mod.arcalitegames.system.collections.MerchantSet;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

abstract class AbstractMerchantGui extends Screen
{
	public int guiY = 20;
	public int guiX = 0;
	public String prompt = "";
	public int texWidth = 248;
	public int texHeight = 256;
	public int buttonYIn = 183;
	public int playerPage = 0;
	public int merchantPage = 0;
    public int buttonWidth = 58;
    public int buttonHeight = 18;
    protected String merchantName;
    protected PlayerEntity player;
    protected MerchantEntity merchant;
    protected MerchantType type;
    public TradeOption tradeOption;
    protected MerchantSet<MerchantProduct> products;
    protected List<Button> playerItems = new LinkedList<>();
    protected List<Button> merchantItems = new LinkedList<>();
    public List<InventoryProduct> inventory = new LinkedList<>();
    protected final ResourceLocation TEXTURE = new ResourceLocation(OdysseyMod.MODID, "textures/gui/demo.png");
	
	protected AbstractMerchantGui(ITextComponent titleIn)
	{
		super(titleIn);
	}
	
	@Override
	protected void init()
	{
		super.init();
	}

}
