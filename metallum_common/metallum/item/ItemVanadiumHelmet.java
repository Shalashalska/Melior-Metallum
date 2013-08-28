package metallum.item;

import metallum.lib.Strings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemVanadiumHelmet extends ItemArmorMetallum {

    public ItemVanadiumHelmet(int par1,
            EnumArmorMaterial par2EnumArmorMaterial, String textureLocation, String material) {
        super(par1, par2EnumArmorMaterial, 0, Strings.VANADIUM_HELMET_NAME, textureLocation, material);
    }

    @Override
    public void onArmorTickUpdate(World world, EntityPlayer player,
            ItemStack itemStack) {
        if (checkArmorInSlot(player, 0, ModItems.vanadiumBoots)
                && checkArmorInSlot(player, 1, ModItems.vanadiumLeggings)
                && checkArmorInSlot(player, 2, ModItems.vanadiumChestplate)) {

            player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 20,
                    0, true));
        }
    }

    private boolean checkArmorInSlot(EntityPlayer player, int slot, Item object) {
        return player.inventory.armorItemInSlot(slot) != null
                && player.inventory.armorItemInSlot(slot).getItem() == object;
    }
}
