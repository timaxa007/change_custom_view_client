package timaxa007.change_custom_view_client;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ChangeCustomViewClientMod.MODID, name = ChangeCustomViewClientMod.NAME, version = ChangeCustomViewClientMod.VERSION, guiFactory = "timaxa007.change_custom_view_client.GuiFactory")
public class ChangeCustomViewClientMod {

	public static final String
	MODID = "change_custom_view_client",
	NAME = "Change Custom View Client Mod",
	VERSION = "1.753";

	@Mod.Instance(MODID)
	public static ChangeCustomViewClientMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Config.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new Events());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Config.optionsBackground();
	}

}
