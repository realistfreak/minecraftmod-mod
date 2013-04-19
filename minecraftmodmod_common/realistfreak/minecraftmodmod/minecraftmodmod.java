package realistfreak.minecraftmodmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import realistfreak.minecraftmodmod.lib.Reference;

@Mod(
      name = Reference.MOD_NAME,
      modid = Reference.MOD_ID,
      version = Reference.VERSION
      )

public class minecraftmodmod {

    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }
    
    
    
}
