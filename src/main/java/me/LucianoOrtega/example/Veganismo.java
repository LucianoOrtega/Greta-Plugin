package me.LucianoOrtega.example;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import java.util.Arrays;
import java.util.List;

public class Veganismo implements Listener {

    private final List<Integer> carneIds = Arrays.asList(363, 364, 319, 365, 366, 349, 350, 460, 461, 411, 412, 423, 424);

    @EventHandler
    public void onPlayerConsumeItem(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        String playerName = player.getName();
        int itemId = event.getItem().getType().getId();

        if (carneIds.contains(itemId)) {
        player.sendMessage("OYE " + playerName + ", ¿ERES IDOTA O QUÉ? ¡RESPETA A LOS ANIMALES! ¡ELLOS SUFREN!");
        }
    }
}
