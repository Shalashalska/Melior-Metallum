package metallum.block;

import metallum.Metallum;
import metallum.lib.Strings;
import net.minecraft.block.material.Material;

public class BlockVanadiumOre extends BlockMetallum {

    public BlockVanadiumOre(int id) {
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.VANADIUM_ORE_NAME);
        this.setCreativeTab(Metallum.tabsMetallum);
    }

}
