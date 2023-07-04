package me.LucianoOrtega.example;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Ambientalismo implements Listener {
    @EventHandler
    public void blockBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        Player player = event.getPlayer();
        String playerName = player.getName();

        if (block.getType().toString().equals("LOG")) {
        player.sendMessage("OYE " + playerName + ", ¿ERES IDOTA O QUÉ? ¡RESPETA LA NATURALEZA!");
        }
    }
}
