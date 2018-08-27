package me.UnfamousThomas.BanBlock;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class commandevent implements Listener {
    @EventHandler
    public void oncommand(PlayerCommandPreprocessEvent e) {
        if(e.getMessage().equals("/ban")) {
            if (e.getPlayer().getName().equals("Medhi")) {
               e.getPlayer().sendMessage(ChatColor.GREEN + "You are allowed!");
            } else if (e.getPlayer().getName().equals("UnfamousThomas")) {
                e.getPlayer().sendMessage(ChatColor.GREEN + "You are allowed!");
            } else if (e.getPlayer().getName().equals("HyperGuardian")) {
                e.getPlayer().sendMessage(ChatColor.GREEN + "You are allowed!");
            } else {
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.RED + "You are not allowed!");
            }
        }
    }
}
