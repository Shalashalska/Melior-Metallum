package metallum.item;

import metallum.Metallum;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemShovelMetallum extends ItemSpade{

    public ItemShovelMetallum(int id, EnumToolMaterial toolMaterial, String itemName) {
        super(id, toolMaterial);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}
