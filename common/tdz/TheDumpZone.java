package tdz;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import tdz.lib.Reference;
import tdz.proxy.CommonProxy;

@Mod (modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod (clientSideRequired = true)

public class TheDumpZone {

    @Instance (Reference.MODID)
    public static TheDumpZone instance;
    
    @SidedProxy (clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    public static CommonProxy proxy;
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event) {
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
