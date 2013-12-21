package me.creepove9.tjxhub.command;

import me.creepove9.tjxhub.ChatColor.HubColors;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
		
		ChatColor a = ChatColor.AQUA;
		ChatColor b = ChatColor.BLACK;
		ChatColor c = ChatColor.BLUE;
		ChatColor d = ChatColor.DARK_AQUA;
		ChatColor e = ChatColor.DARK_BLUE;
		ChatColor f = ChatColor.DARK_GRAY;
		ChatColor g = ChatColor.DARK_GREEN;
		ChatColor h = ChatColor.DARK_PURPLE;
		ChatColor i = ChatColor.DARK_RED;
		ChatColor j = ChatColor.GOLD;
		ChatColor k = ChatColor.GRAY;
		ChatColor l = ChatColor.GREEN;
		ChatColor m = ChatColor.LIGHT_PURPLE;
		ChatColor n = ChatColor.MAGIC;
		ChatColor o = ChatColor.RED;
		ChatColor p = ChatColor.WHITE;
		ChatColor q = ChatColor.YELLOW;
		// Symbols
		ChatColor r = ChatColor.RESET;
		ChatColor bo = ChatColor.BOLD;
		ChatColor it = ChatColor.ITALIC;
		ChatColor st = ChatColor.STRIKETHROUGH;
		ChatColor un = ChatColor.UNDERLINE;
		

	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		
		
		
		if(!(sender instanceof Player)) { sender.sendMessage("This command can only be executed by a player."); }
		
		else {
			if (cmd.getName().equalsIgnoreCase("Hub")){
				Player p = (Player) sender;
				
				if (args.length == 0) {
					sender.sendMessage(a + "             [Help]");
				}
			}
		}
		
		return false;
	}
	
}
