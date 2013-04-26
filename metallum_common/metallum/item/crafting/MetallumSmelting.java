package metallum.item.crafting;

import metallum.item.ModItems;
import metallum.lib.BlockIds;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MetallumSmelting {

    public static void init(){
        GameRegistry.addSmelting(BlockIds.VANADIUM_ORE_ID, new ItemStack(ModItems.vanadiumIngot), 50.0f);
    }
}
