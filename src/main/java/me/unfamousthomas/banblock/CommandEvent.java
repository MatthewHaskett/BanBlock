package me.unfamousthomas.banblock;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandEvent implements Listener {


    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {

        if(e.getMessage().toLowerCase().startsWith("/ban")) {
            if (e.getPlayer().getName().equals("Tigrez_")) { //Tigrez_
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
