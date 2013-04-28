package metallum.item;

import metallum.Metallum;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemAxeMetallum extends ItemAxe{

    public ItemAxeMetallum(int id, EnumToolMaterial toolMaterial, String itemName) {
        super(id, toolMaterial);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}
