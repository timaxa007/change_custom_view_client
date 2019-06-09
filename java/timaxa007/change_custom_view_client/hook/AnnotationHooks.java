package timaxa007.change_custom_view_client.hook;

import java.io.File;

import gloomyfolken.hooklib.asm.Hook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraftforge.client.ForgeHooksClient;
import timaxa007.change_custom_view_client.ChangeCustomViewClientMod;
import timaxa007.change_custom_view_client.Config;

public class AnnotationHooks {

	@Hook
	public static void createDisplay(ForgeHooksClient clazz) {
		Config.init(new File(Minecraft.getMinecraft().mcDataDir, "/config/" + ChangeCustomViewClientMod.MODID + ".cfg"));
	}

	@Hook
	public static void initializeTextures(OpenGlHelper clazz) {
		Config.cursor();
	}

}
