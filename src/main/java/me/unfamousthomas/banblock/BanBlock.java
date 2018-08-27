package me.unfamousthomas.banblock;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BanBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getLogger().info("WOW IT ENABLED!");
        getServer().getPluginManager().registerEvents(new CommandEvent(), this);
    }

}
