package metallum.item;

import metallum.Metallum;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeMetallum extends ItemPickaxe{

    public ItemPickaxeMetallum(int id, EnumToolMaterial toolMaterial, String itemName) {
        super(id, toolMaterial);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}