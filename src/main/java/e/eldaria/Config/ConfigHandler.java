package e.eldaria.Config;

import java.io.File;
import java.io.IOException;

import e.eldaria.Eldaria;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;



public class ConfigHandler {
	private FileConfiguration config;
	private File configFile;
	private boolean isNewConfig = false;

	public ConfigHandler(Eldaria plugin) {
		configFile = new File(plugin.getDataFolder() + File.separator + "config.yml");
		if (!this.configFile.exists()) {
			this.configFile.getParentFile().mkdirs();
			this.isNewConfig = true;
		}
		this.config = YamlConfiguration.loadConfiguration(this.configFile);
		try {
			this.config.save(this.configFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public FileConfiguration getConfig() {
		return this.config;
	}

	public boolean saveConfig() {
		try {
			this.config.save(this.configFile);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public boolean isNew() {
		return this.isNewConfig;
	}
}
