package metallum.item;

import metallum.Metallum;
import metallum.lib.ItemIds;
import metallum.lib.Strings;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {

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

        vanadiumIngot = new ItemMetallum(ItemIds.VANADIUM_INGOT_ID, Strings.VANADIUM_INGOT_NAME);
        vanadiumHelmet = new ItemVanadiumHelmet(ItemIds.VANADIUM_HELMET_ID, MetallumArmorMaterial.armorVanadium, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE));
        vanadiumChestplate = new ItemArmorMetallum(ItemIds.VANADIUM_CHESTPLATE_ID, MetallumArmorMaterial.armorVanadium, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE), 1, Strings.VANADIUM_CHESTPLATE_NAME);
        vanadiumLeggings = new ItemArmorMetallum(ItemIds.VANADIUM_LEGGINGS_ID, MetallumArmorMaterial.armorVanadium, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE), 2, Strings.VANADIUM_LEGGINGS_NAME);
        vanadiumBoots = new ItemArmorMetallum(ItemIds.VANADIUM_BOOTS_ID, MetallumArmorMaterial.armorVanadium, Metallum.proxy.addArmor(Strings.VANADIUM_ARMOR_FILE), 3, Strings.VANADIUM_BOOTS_NAME);
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
    }
}
