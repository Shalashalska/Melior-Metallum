package metallum.item;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class MetallumArmorMaterial {

    public static EnumArmorMaterial armorVanadium = EnumHelper.addArmorMaterial("armorVanadium", 20, new int[] { 3, 7, 5, 3 }, 5);
    public static EnumToolMaterial toolVanadium = EnumHelper.addToolMaterial("toolVanadium", 3, 250, 12.0f, 3, 5);
}
