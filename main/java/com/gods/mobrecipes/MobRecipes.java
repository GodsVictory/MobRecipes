package com.gods.mobrecipes;

import com.gods.mobrecipes.proxy.CommonProxy;
import com.gods.mobrecipes.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MobRecipes.MODID, version = MobRecipes.VERSION, name = MobRecipes.NAME)
public class MobRecipes {
    public static final String MODID = "mobrecipes";
    public static final String NAME = "mobrecipes";
    public static final String VERSION = "0.0.1";
    
	@Mod.Instance(MODID)
	public static MobRecipes instance;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	@SidedProxy(serverSide = "com.gods.mobrecipes.proxy.CommonProxy", clientSide = "com.gods.mobrecipes.proxy.ClientProxy")
	public static CommonProxy proxy;
}
