package com.norcode.bukkit.worldloadeventtest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldLoadEventTest extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onWorldLoadEvent(WorldLoadEvent event) {
        getLogger().info("World Load Event: " + event.getWorld());
    }
}
