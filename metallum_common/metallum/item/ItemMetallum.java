package metallum.item;

import metallum.lib.Reference;
import net.minecraft.item.Item;

public class ItemMetallum extends Item{

    public ItemMetallum(int id) {
        super(id - Reference.SHIFTED_RANGE_ID_CORRECTION);
        // TODO Auto-generated constructor stub
    }

}
