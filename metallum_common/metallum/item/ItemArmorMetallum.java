package metallum.item;

import metallum.Metallum;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class ItemArmorMetallum extends ItemArmor{

    public ItemArmorMetallum(int id, EnumArmorMaterial armorMaterial,
            int renderIndex, int armorType, String armorName) {
        super(id, armorMaterial, renderIndex, armorType);
        this.setUnlocalizedName(armorName);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}