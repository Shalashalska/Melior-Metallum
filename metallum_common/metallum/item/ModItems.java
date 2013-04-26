package metallum.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import metallum.lib.ItemIds;
import metallum.lib.Strings;
import net.minecraft.item.Item;

public class ModItems {

    public static Item vanadiumIngot;
    
    public static void preInit(){
        
        vanadiumIngot = new ItemVanadiumIngot(ItemIds.VANADIUM_INGOT_ID);
    }
    public static void init(){
        LanguageRegistry.addName(vanadiumIngot, Strings.VANADIUM_INGOT_DISPLAY_NAME);
    }
}
