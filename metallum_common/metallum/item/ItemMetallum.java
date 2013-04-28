package metallum.item;

import metallum.Metallum;
import metallum.lib.Reference;
import metallum.lib.Strings;
import net.minecraft.item.Item;

public class ItemMetallum extends Item{

    public ItemMetallum(int id, String itemName) {
        super(id - Reference.SHIFTED_RANGE_ID_CORRECTION);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}
