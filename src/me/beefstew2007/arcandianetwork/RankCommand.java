package me.beefstew2007.arcandianetwork;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class RankCommand implements CommandExecutor {

	public static String Ranks = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY; 
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if (cmd.getName().equalsIgnoreCase("rank")) {
			Player p = (Player) sender;
			if (p.isOp() || RanksSetup.owner.contains(p.getName()) || RanksSetup.dev.contains(p.getName())){
				if (args.length == 0) {
					p.sendMessage(Ranks + "Invalid Arguments!");
				}else if (args.length == 2) {
					Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null) {
						p.sendMessage(Ranks + "Player Not Found!");
					}else{
						if (args[1].equalsIgnoreCase("Owner")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.add(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("Dev")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.add(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("JrDev")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.add(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("Admin")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.add(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("SrStaff")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.add(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("JrStaff")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.add(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("Trainee")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.add(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("Donor")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.add(p.getName());
							RanksSetup.normal.remove(p.getName());
						}
						else if (args[1].equalsIgnoreCase("Normal")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(p.getName());
							RanksSetup.dev.remove(p.getName());
							RanksSetup.jrdev.remove(p.getName());
							RanksSetup.admin.remove(p.getName());
							RanksSetup.staffsr.remove(p.getName());
							RanksSetup.staffjr.remove(p.getName());
							RanksSetup.trainee.remove(p.getName());
							RanksSetup.donor.remove(p.getName());
							RanksSetup.normal.add(p.getName());
						}
					}
				}else if (args.length > 2 || args.length < 2){
					p.sendMessage(Ranks + "Invalid Arguments!");
				}
				
			} else {
				p.sendMessage(Ranks + "You do not have permission!");
			}
			
		}
		return false;
	}
}
