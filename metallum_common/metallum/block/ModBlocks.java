package metallum.block;

import metallum.lib.BlockIds;
import metallum.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
    
    public static Block vanadiumOre;
    public static Block vanadiumBlock;
    public static Block thoriumOre;
    public static Block thoriumBlock;
    
    public static void preInit(){
        
        registerBlocks();

    }
    public static void init(){
        addNames();
    }
    private static void registerBlocks(){
        vanadiumOre = new BlockMetallum(BlockIds.VANADIUM_ORE_ID, Material.rock, Strings.VANADIUM_ORE_NAME, 2.0f, 20.0f, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_ORE_NAME);
        vanadiumBlock = new BlockMetallum(BlockIds.VANADIUM_BLOCK_ID, Material.rock, Strings.VANADIUM_BLOCK_NAME, 4.0f, 40.0f, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_BLOCK_NAME);
        thoriumOre = new BlockMetallum(BlockIds.THORIUM_ORE_ID, Material.rock, Strings.THORIUM_ORE_NAME, 2.5f, 25.0f, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_ORE_NAME);
        thoriumBlock = new BlockMetallum(BlockIds.THORIUM_BLOCK_ID, Material.rock, Strings.THORIUM_BLOCK_NAME, 5.0f, 50.0f, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_BLOCK_NAME);
        
        GameRegistry.registerBlock(vanadiumOre, Strings.VANADIUM_ORE_NAME);
        GameRegistry.registerBlock(vanadiumBlock, Strings.VANADIUM_BLOCK_NAME);
        GameRegistry.registerBlock(thoriumOre, Strings.THORIUM_ORE_NAME);
        GameRegistry.registerBlock(thoriumBlock, Strings.THORIUM_BLOCK_NAME);
    }
    private static void addNames(){
        LanguageRegistry.addName(vanadiumOre, Strings.VANADIUM_ORE_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumBlock, Strings.VANADIUM_BLOCK_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumOre, Strings.THORIUM_ORE_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumBlock, Strings.THORIUM_BLOCK_DISPLAY_NAME);
    }
}
