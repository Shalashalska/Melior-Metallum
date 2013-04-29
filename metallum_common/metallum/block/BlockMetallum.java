package metallum.block;

import metallum.Metallum;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMetallum extends Block {

    public BlockMetallum(int id, Material material, String blockName) {
        super(id, material);
        this.setUnlocalizedName(blockName);
        this.setCreativeTab(Metallum.tabsMetallum);
    }
}
