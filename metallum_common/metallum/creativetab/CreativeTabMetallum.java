package metallum.creativetab;

import metallum.lib.ItemIds;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabMetallum extends CreativeTabs{

    public CreativeTabMetallum(int par1, String par2Str) {
        
        super(par1, par2Str);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {

        return ItemIds.VANADIUM_INGOT_ID;
    }
}
