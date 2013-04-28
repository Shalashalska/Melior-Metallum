package metallum;

import metallum.block.ModBlocks;
import metallum.configuration.ConfigurationHandler;
import metallum.core.proxy.CommonProxy;
import metallum.creativetab.CreativeTabMetallum;
import metallum.item.ModItems;
import metallum.item.crafting.MetallumSmelting;
import metallum.lib.Reference;
import metallum.world.gen.feature.WorldGeneratorMetallum;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Metallum {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static CreativeTabs tabsMetallum = new CreativeTabMetallum(CreativeTabs.getNextID(), Reference.MOD_NAME);

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.config(event);
        ModItems.preInit();
        ModBlocks.preInit();
    }

    @Init
    public void init(FMLInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
        MetallumSmelting.init();
        GameRegistry.registerWorldGenerator(new WorldGeneratorMetallum());
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }
}
