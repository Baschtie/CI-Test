package com.github.baschtie.citest;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CITest extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getServer().broadcastMessage("Hello World");
    }

    @Override
    public void onDisable() {
    }
}
