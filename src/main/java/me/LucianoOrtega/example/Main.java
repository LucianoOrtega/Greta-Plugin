package me.LucianoOrtega.example;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    public void onEnable(){
        System.out.println("¡Greta Thunberg plugin!");
        getServer().getPluginManager().registerEvents(new Ambientalismo(), this);
        getServer().getPluginManager().registerEvents(new Veganismo(), this);
    }
}