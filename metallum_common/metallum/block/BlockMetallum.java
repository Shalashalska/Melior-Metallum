package metallum.block;

import metallum.Metallum;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMetallum extends Block {

    public BlockMetallum(int id, Material material, String blockName, float hardness, float resistance, String textureLocation) {
        super(id, material);
        this.setUnlocalizedName(blockName);
        this.setCreativeTab(Metallum.tabsMetallum);
        this.setHardness(hardness);
        this.setResistance(resistance);
        func_111022_d(textureLocation);
    }
}
