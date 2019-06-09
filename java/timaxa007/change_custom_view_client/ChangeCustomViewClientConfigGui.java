package timaxa007.change_custom_view_client;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

public class ChangeCustomViewClientConfigGui extends GuiConfig {

	public ChangeCustomViewClientConfigGui(GuiScreen parent) {
		super(parent, new ConfigElement(Config.config.getCategory(Config.categoryGui)).getChildElements(),
				ChangeCustomViewClientMod.MODID, false, false, GuiConfig.getAbridgedConfigPath(Config.config.toString()));
	}

}
