package mod.arcalitegames.buildersaddition.util;


import mod.arcalitegames.OdysseyMod;
import net.minecraft.entity.item.PaintingType;

public class RegistryUtil {
	public static PaintingType createPainting(String name, int w, int h) {
		PaintingType p = new PaintingType(16*w, 16*h);
		p.setRegistryName(OdysseyMod.MODID, name);
		return p;
	}
}
