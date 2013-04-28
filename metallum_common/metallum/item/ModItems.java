package metallum.item;

import metallum.Metallum;
import metallum.lib.ItemIds;
import metallum.lib.Strings;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {

    public static EnumArmorMaterial ARMOR_VANADIUM = EnumHelper.addArmorMaterial("ARMOR_VANADIUM", 20, new int[] { 3, 7, 5, 3 }, 5);
    public static EnumToolMaterial TOOL_VANADIUM = EnumHelper.addToolMaterial("TOOL_VANADIUM", 3, 250, 12.0f, 3, 5);
    public static Item vanadiumIngot;
    public static Item vanadiumHelmet;
    public static Item vanadiumChestplate;
    public static Item vanadiumLeggings;
    public static Item vanadiumBoots;
    public static Item vanadiumSword;
    public static Item vanadiumPick;
    public static Item vanadiumAxe;
    public static Item vanadiumShovel;
    public static Item vanadiumHoe;

    public static void preInit() {

        setToolClass();
        vanadiumIngot = new ItemMetallum(ItemIds.VANADIUM_INGOT_ID, Strings.VANADIUM_INGOT_NAME);
        vanadiumHelmet = new ItemVanadiumHelmet(ItemIds.VANADIUM_HELMET_ID, ARMOR_VANADIUM, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE));
        vanadiumChestplate = new ItemArmorMetallum(ItemIds.VANADIUM_CHESTPLATE_ID, ARMOR_VANADIUM, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE), 1, Strings.VANADIUM_CHESTPLATE_NAME);
        vanadiumLeggings = new ItemArmorMetallum(ItemIds.VANADIUM_LEGGINGS_ID, ARMOR_VANADIUM, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE), 2, Strings.VANADIUM_LEGGINGS_NAME);
        vanadiumBoots = new ItemArmorMetallum(ItemIds.VANADIUM_BOOTS_ID, ARMOR_VANADIUM, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE), 3, Strings.VANADIUM_BOOTS_NAME);
        vanadiumSword = new ItemSwordMetallum(ItemIds.VANADIUM_SWORD_ID, TOOL_VANADIUM, Strings.VANADIUM_SWORD_NAME);
        vanadiumShovel = new ItemShovelMetallum(ItemIds.VANADIUM_SHOVEL_ID, TOOL_VANADIUM, Strings.VANADIUM_SHOVEL_NAME);
        vanadiumPick = new ItemPickaxeMetallum(ItemIds.VANADIUM_PICK_ID, TOOL_VANADIUM, Strings.VANADIUM_PICK_NAME);
        vanadiumAxe = new ItemAxeMetallum(ItemIds.VANADIUM_AXE_ID, TOOL_VANADIUM, Strings.VANADIUM_AXE_NAME);
        vanadiumHoe = new ItemHoeMetallum(ItemIds.VANADIUM_HOE_ID, TOOL_VANADIUM, Strings.VANADIUM_HOE_NAME);
    }

    public static void init() {
        LanguageRegistry.addName(vanadiumIngot,
                Strings.VANADIUM_INGOT_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumHelmet,
                Strings.VANADIUM_HELMET_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumChestplate,
                Strings.VANADIUM_CHESTPLATE_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumLeggings,
                Strings.VANADIUM_LEGGINGS_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumBoots,
                Strings.VANADIUM_BOOTS_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumSword,
                Strings.VANADIUM_SWORD_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumShovel,
                Strings.VANADIUM_SHOVEL_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumPick,
                Strings.VANADIUM_PICK_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumAxe,
                Strings.VANADIUM_AXE_DISPLAY_NAME);
        LanguageRegistry.addName(vanadiumHoe,
                Strings.VANADIUM_HOE_DISPLAY_NAME);
    }
    private static void setToolClass(){
        MinecraftForge.setToolClass(vanadiumSword, "sword", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumAxe, "axe", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumShovel, "shovel", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumPick, "pickaxe", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumHoe, "hoe", TOOL_VANADIUM.getHarvestLevel());
    }
}
