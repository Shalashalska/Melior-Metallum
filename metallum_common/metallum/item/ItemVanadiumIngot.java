package metallum.item;

import metallum.Metallum;
import metallum.lib.Strings;

public class ItemVanadiumIngot extends ItemMetallum {

    public ItemVanadiumIngot(int id) {
        super(id);
        this.setUnlocalizedName(Strings.VANADIUM_INGOT_NAME);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}
