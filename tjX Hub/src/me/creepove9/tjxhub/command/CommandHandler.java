package me.creepove9.tjxhub.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		
		
		
		if(!(sender instanceof Player)) { sender.sendMessage("This command can only be executed by a player."); }
		
		else {
			if (cmd.getName().equalsIgnoreCase("Hub")){
				Player p = (Player) sender;
				
				if (args.length == 0) {
					sender.sendMessage()
				}
			}
		}
		
		return false;
	}

}
