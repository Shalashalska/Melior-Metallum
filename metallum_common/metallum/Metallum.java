package metallum;

import metallum.block.ModBlocks;
import metallum.configuration.ConfigurationHandler;
import metallum.core.proxy.CommonProxy;
import metallum.creativetab.CreativeTabMetallum;
import metallum.item.ModItems;
import metallum.item.crafting.MetallumCrafting;
import metallum.item.crafting.MetallumSmelting;
import metallum.lib.Reference;
import metallum.world.gen.feature.WorldGeneratorMetallum;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "required-after:Forge@[7.7.1.675,)")
public class Metallum {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static CreativeTabs tabsMetallum = new CreativeTabMetallum(CreativeTabs.getNextID(), Reference.MOD_NAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.config(event);
        ModItems.preInit();
        ModBlocks.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
        MetallumSmelting.init();
        MetallumCrafting.init();
        GameRegistry.registerWorldGenerator(new WorldGeneratorMetallum());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
