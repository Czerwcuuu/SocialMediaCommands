package stylowamc.socialmediacommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import stylowamc.socialmediacommands.SocialMediaCommands;
import stylowamc.socialmediacommands.Utils.Permissions;

public class Cuboid implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player p = (Player) sender;
        SocialMediaCommands plugin = SocialMediaCommands.getInstance();
        if(p.hasPermission(Permissions.COMMANDS_USE_PERM)){
            plugin.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&',SocialMediaCommands.getInternalConfig().getCuboidMes()));
            return true;
        }
        else{
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',SocialMediaCommands.getInternalConfig().getNoPermMes()));
            return false;
        }
    }
}
