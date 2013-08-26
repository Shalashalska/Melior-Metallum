package metallum.item;

import metallum.Metallum;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSwordMetallum extends ItemSword{

    public ItemSwordMetallum(int id, EnumToolMaterial toolMaterial, String itemName, String textureLocation) {
        super(id, toolMaterial);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(Metallum.tabsMetallum);
        func_111206_d(textureLocation);
    }
}