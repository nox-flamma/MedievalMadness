package com.nickpops98.medievalmadness;

import com.nickpops98.medievalmadness.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "medievalmadness", name = "Castle Chaos", version = "1.7.10-1.0")
public class MedievalMadness {
    @Mod.Instance("medievalmadness")
    public static MedievalMadness instance;

    @SidedProxy(clientSide = "com.nickpops98.medievalmadness.proxy.ClientProxy", serverSide = "com.nickpops98.medievalmadness.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
