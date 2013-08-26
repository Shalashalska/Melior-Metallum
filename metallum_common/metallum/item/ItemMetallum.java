package metallum.item;

import metallum.Metallum;
import metallum.lib.Reference;
import net.minecraft.item.Item;

public class ItemMetallum extends Item {

    public ItemMetallum(int id, String itemName, String textureLocation) {
        super(id - Reference.SHIFTED_RANGE_ID_CORRECTION);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(Metallum.tabsMetallum);
        func_111206_d(textureLocation);
    }
}
