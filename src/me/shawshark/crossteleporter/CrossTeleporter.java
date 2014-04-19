package me.shawshark.crossteleporter;

import lilypad.client.connect.api.Connect;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CrossTeleporter extends JavaPlugin implements Listener {
	
	public static Connect connect;
	
	public void onEnable() {
		
		PluginManager pm = Bukkit.getPluginManager();
		
		/* Register events */
		pm.registerEvents(this, this);
		
		/* Lilypad */
		connect = Bukkit.getServer().getServicesManager().getRegistration(Connect.class).getProvider();
        connect.registerEvents(this);
        
        /* Register commands */
        getCommand("").setExecutor(new Commands());
	}
	
	public void onDisable() {
		connect = null;
	}
}
