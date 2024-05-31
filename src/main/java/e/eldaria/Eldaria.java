package e.eldaria;

import e.eldaria.Commands.AddHandItemToData;
import e.eldaria.Config.ConfigHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Eldaria extends JavaPlugin {
    public static Eldaria plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        instance = this;

        getConfigHandler().getConfig().set("potato", 2);
        getConfigHandler().saveConfig();
        getCommand("AddData").setExecutor(new AddHandItemToData());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static String GetFilePath() {
        return "C:/Eldaria/Gson Testing/Data/Data.json";
    }

    public static ConfigHandler getConfigHandler() {
        return new ConfigHandler(plugin);
    }
    //get instance / plugin
    public static Eldaria GetInstance(){
        return instance;
    }
}
