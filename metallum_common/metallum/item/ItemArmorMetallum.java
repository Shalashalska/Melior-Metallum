package metallum.item;

import metallum.Metallum;
import metallum.lib.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorMetallum extends ItemArmor{

    String material = null;
    public ItemArmorMetallum(int id, EnumArmorMaterial armorMaterial, int type, String armorName, String textureLocation, String material) {
        super(id, armorMaterial, 0, type);
        this.setUnlocalizedName(armorName);
        this.setCreativeTab(Metallum.tabsMetallum);
        this.material = material;
        func_111206_d(textureLocation);
    }
    
    @Override
    public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
        return Strings.ARMOR_LOCATION + material;
    }
}
