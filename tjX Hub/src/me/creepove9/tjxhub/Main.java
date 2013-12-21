package me.creepove9.tjxhub;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static final Logger log = Logger.getLogger("minecraft");
	
	public void onEnable() {
		log.info("[tjXHub] has been enabled.");
	}
	
	
	public void onDisable() {
		log.info("[tjXHub] has been disabled.");
	}

}
