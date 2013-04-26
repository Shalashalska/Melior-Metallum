package metallum.block;

import metallum.lib.BlockIds;
import metallum.lib.Strings;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
    
    public static Block vanadiumOre;
    
    public static void preInit(){
        
        vanadiumOre = new BlockVanadiumOre(BlockIds.VANADIUM_ORE_ID);
        
        GameRegistry.registerBlock(vanadiumOre, Strings.VANADIUM_ORE_NAME);
    }
    public static void init(){
        LanguageRegistry.addName(vanadiumOre, Strings.VANADIUM_ORE_DISPLAY_NAME);
    }
}
