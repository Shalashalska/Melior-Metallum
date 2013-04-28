package metallum.item;

import metallum.Metallum;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSwordMetallum extends ItemSword{

    public ItemSwordMetallum(int id, EnumToolMaterial toolMaterial, String itemName) {
        super(id, toolMaterial);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}