package metallum.item;

import metallum.lib.ItemIds;
import metallum.lib.Strings;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {

    public static EnumArmorMaterial ARMOR_VANADIUM = EnumHelper.addArmorMaterial("ARMOR_VANADIUM", 20, new int[] { 3, 7, 5, 3 }, 5);
    public static EnumToolMaterial TOOL_VANADIUM = EnumHelper.addToolMaterial("TOOL_VANADIUM", 3, 500, 12.0f, 3, 5);
    public static EnumArmorMaterial ARMOR_THORIUM = EnumHelper.addArmorMaterial("ARMOR_THORIUM", 50, new int[] { 4, 8, 6, 4}, 50);
    public static EnumToolMaterial TOOL_THORIUM = EnumHelper.addToolMaterial("TOOL_THORIUM", 3, 100, 15.0f, 4, 50);
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
    public static Item thoriumIngot;
    public static Item thoriumSword;
    public static Item thoriumShovel;
    public static Item thoriumAxe;
    public static Item thoriumHoe;
    public static Item thoriumPick;
    public static Item thoriumHelmet;
    public static Item thoriumChestplate;
    public static Item thoriumLeggings;
    public static Item thoriumBoots;

    public static void preInit() {
        
        setToolClass();
        registerItems();

    }

    public static void init() {
        addNames();
    }
    private static void setToolClass(){
        MinecraftForge.setToolClass(vanadiumSword, "sword", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumAxe, "axe", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumShovel, "shovel", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumPick, "pickaxe", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(vanadiumHoe, "hoe", TOOL_VANADIUM.getHarvestLevel());
        MinecraftForge.setToolClass(thoriumSword, "sword", TOOL_THORIUM.getHarvestLevel());
    }
    private static void registerItems(){
        vanadiumIngot = new ItemMetallum(ItemIds.VANADIUM_INGOT_ID, Strings.VANADIUM_INGOT_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_INGOT_NAME);
        vanadiumHelmet = new ItemVanadiumHelmet(ItemIds.VANADIUM_HELMET_ID, ARMOR_VANADIUM, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_HELMET_NAME, "vanadium1.png");
        vanadiumChestplate = new ItemArmorMetallum(ItemIds.VANADIUM_CHESTPLATE_ID, ARMOR_VANADIUM, 1, Strings.VANADIUM_CHESTPLATE_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_CHESTPLATE_NAME, "vanadium1.png");
        vanadiumLeggings = new ItemArmorMetallum(ItemIds.VANADIUM_LEGGINGS_ID, ARMOR_VANADIUM, 2, Strings.VANADIUM_LEGGINGS_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_LEGGINGS_NAME, "vanadium2.png");
        vanadiumBoots = new ItemArmorMetallum(ItemIds.VANADIUM_BOOTS_ID, ARMOR_VANADIUM, 3, Strings.VANADIUM_BOOTS_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_BOOTS_NAME, "vanadium1.png");
        vanadiumSword = new ItemSwordMetallum(ItemIds.VANADIUM_SWORD_ID, TOOL_VANADIUM, Strings.VANADIUM_SWORD_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_SWORD_NAME);
        vanadiumShovel = new ItemShovelMetallum(ItemIds.VANADIUM_SHOVEL_ID, TOOL_VANADIUM, Strings.VANADIUM_SHOVEL_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_SHOVEL_NAME);
        vanadiumPick = new ItemPickaxeMetallum(ItemIds.VANADIUM_PICK_ID, TOOL_VANADIUM, Strings.VANADIUM_PICK_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_PICK_NAME);
        vanadiumAxe = new ItemAxeMetallum(ItemIds.VANADIUM_AXE_ID, TOOL_VANADIUM, Strings.VANADIUM_AXE_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_AXE_NAME);
        vanadiumHoe = new ItemHoeMetallum(ItemIds.VANADIUM_HOE_ID, TOOL_VANADIUM, Strings.VANADIUM_HOE_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.VANADIUM_HOE_NAME);
        thoriumIngot = new ItemMetallum(ItemIds.THORIUM_INGOT_ID, Strings.THORIUM_INGOT_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_INGOT_NAME);
        thoriumSword = new ItemPotionSword(ItemIds.THORIUM_SWORD_ID, TOOL_THORIUM, Strings.THORIUM_SWORD_NAME, new PotionEffect(Potion.wither.id, 1000, 1, true), Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_SWORD_NAME);
        thoriumShovel = new ItemShovelMetallum(ItemIds.THORIUM_SHOVEL_ID, TOOL_THORIUM, Strings.THORIUM_SHOVEL_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_SHOVEL_NAME);
        thoriumPick = new ItemPickaxeMetallum(ItemIds.THORIUM_PICK_ID, TOOL_THORIUM, Strings.THORIUM_PICK_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_PICK_NAME);
        thoriumAxe = new ItemAxeMetallum(ItemIds.THORIUM_AXE_ID, TOOL_THORIUM, Strings.THORIUM_AXE_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_AXE_NAME);
        thoriumHoe = new ItemHoeMetallum(ItemIds.THORIUM_HOE_ID, TOOL_THORIUM, Strings.THORIUM_HOE_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_HOE_NAME);
        thoriumHelmet = new ItemArmorMetallum(ItemIds.THORIUM_HELMET_ID, ARMOR_THORIUM, 0, Strings.THORIUM_HELMET_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_HELMET_NAME, "thorium1.png");
        thoriumChestplate = new ItemArmorMetallum(ItemIds.THORIUM_CHESTPLATE_ID, ARMOR_THORIUM,1, Strings.THORIUM_CHESTPLATE_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_CHESTPLATE_NAME, "thorium1.png");
        thoriumLeggings = new ItemArmorMetallum(ItemIds.THORIUM_LEGGINGS_ID, ARMOR_THORIUM, 2, Strings.THORIUM_LEGGINGS_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_LEGGINGS_NAME, "thorium2.png");
        thoriumBoots = new ItemArmorMetallum(ItemIds.THORIUM_BOOTS_ID, ARMOR_THORIUM, 3, Strings.THORIUM_BOOTS_NAME, Strings.TEXTURE_FOLDER + ":" + Strings.THORIUM_BOOTS_NAME, "thorium1.png");
    }
    private static void addNames(){
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
        LanguageRegistry.addName(thoriumIngot,
                Strings.THORIUM_INGOT_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumSword,
                Strings.THORIUM_SWORD_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumShovel,
                Strings.THORIUM_SHOVEL_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumAxe,
                Strings.THORIUM_AXE_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumPick,
                Strings.THORIUM_PICK_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumHoe,
                Strings.THORIUM_HOE_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumHelmet,
                Strings.THORIUM_HELMET_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumChestplate,
                Strings.THORIUM_CHESTPLATE_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumLeggings,
                Strings.THORIUM_LEGGINGS_DISPLAY_NAME);
        LanguageRegistry.addName(thoriumBoots,
                Strings.THORIUM_BOOTS_DISPLAY_NAME);
    }
}
