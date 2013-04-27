package metallum.world.gen.feature;

import java.util.Random;

import metallum.lib.BlockIds;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMetallum implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if(world.provider.dimensionId == -1){
            generateNether(world, random, chunkX * 16, chunkZ * 16);
        } else { if(world.provider.dimensionId == 1){
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            } else {
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            }
        }
    }
    private void generateNether (World world, Random random, int chunkX, int chunkZ){

    }
    private void generateSurface(World world, Random random, int chunkX, int chunkZ){
        for(int i = 0; i < 2; i++){
            int xCoord = chunkX + random.nextInt(16);
            int yCoord = random.nextInt(24);
            int zCoord = chunkZ + random.nextInt(16);

            new WorldGenMinable(BlockIds.VANADIUM_ORE_ID, 10).generate(world, random, xCoord, yCoord, zCoord);
        }
    }
    private void generateEnd(World world, Random random, int chunkX, int chunkZ){

    }
}
