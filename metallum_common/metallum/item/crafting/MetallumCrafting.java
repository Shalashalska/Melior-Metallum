package metallum.item.crafting;

import metallum.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MetallumCrafting {
    private static ItemStack vanadiumIngotStack = new ItemStack(ModItems.vanadiumIngot);
    private static ItemStack stickStack = new ItemStack(Item.stick);
    private static ItemStack thoriumIngotStack = new ItemStack(ModItems.thoriumIngot);

    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumSword), "v", "v", "s", 'v', vanadiumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumPick), "vvv", " s ", " s ", 'v', vanadiumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumShovel), "v", "s", "s", 'v', vanadiumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumHoe), "vv", "s ", "s ", 'v', vanadiumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumAxe), "vv", "sv", "s ", 'v', vanadiumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumHelmet), "vvv", "v v", 'v', vanadiumIngotStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumChestplate), "v v", "vvv", "vvv", 'v', vanadiumIngotStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumLeggings), "vvv", "v v", "v v", 'v', vanadiumIngotStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.vanadiumBoots), "v v", "v v", 'v', vanadiumIngotStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumSword), "t", "t", "s", 't', thoriumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumPick), "ttt", " s ", " s ", 't', thoriumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumAxe), "tt", "st", "s ", 't', thoriumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumHoe), "tt", "s ", "s ", 't', thoriumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumShovel), "t", "s", "s", 't', thoriumIngotStack, 's', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumHelmet), "ttt", "t t", 't', thoriumIngotStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumChestplate), "t t", "ttt", "ttt", 't', thoriumIngotStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumLeggings), "ttt", "t t", "t t", 't', thoriumIngotStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.thoriumBoots), "t t", "t t", 't', thoriumIngotStack);
    }
}
