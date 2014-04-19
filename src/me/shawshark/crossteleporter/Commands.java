package me.shawshark.crossteleporter;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] args) {
		if(!(s instanceof Player)) {
			s.sendMessage(ChatColor.RED + "Error! This command can only be run from in-game!");
		} else {
			Player p = (Player) s;
			
			if(c.getName().equalsIgnoreCase("command")) {// == command.
				
				if(args.length == 0) {
					p.sendMessage("Correct usage: /<command> <player>");
					return true;
				}
				
				else if(args.length == 1) {
					String to = args[1];
					return true;
				}
				
			}
			
		}
		return false;
	}
}
