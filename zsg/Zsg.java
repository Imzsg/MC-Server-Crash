package zsggroup.zsg;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import zsggroup.zsg.Event.getopEvent;

public final class Zsg extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new getopEvent(),this);
        getLogger().info(ChatColor.GREEN + "============ZSG-Plugins============");
        getLogger().info(ChatColor.GREEN + "||                               ||");
        getLogger().info(ChatColor.GREEN + "||"+ChatColor.BLUE+"zsg-Plugins start successfully!"+ChatColor.GREEN+"||");
        getLogger().info(ChatColor.GREEN + "||                               ||");
        getLogger().info(ChatColor.GREEN + "============ZSG-Plugins============");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
