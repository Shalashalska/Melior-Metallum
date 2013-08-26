package metallum.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemPotionSword extends ItemSwordMetallum {

    private PotionEffect potionEffect;

    public ItemPotionSword(int id, EnumToolMaterial toolMaterial,
            String itemName, PotionEffect potionEffect, String textureLocation) {
        super(id, toolMaterial, itemName, textureLocation);
        this.potionEffect = potionEffect;
    }

    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player,
            Entity entity) {
        if (entity instanceof EntityLiving) {
            EntityLiving entityLiving = (EntityLiving) entity;
            entityLiving.addPotionEffect(potionEffect);
        }
        return false;
    }
}
