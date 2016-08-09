package net.bindunity.launchsnowball.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

/**
 * Created by tckz916 on 2016/08/10.
 */
public class PlayerListener implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_AIR
                || event.getAction() == Action.LEFT_CLICK_BLOCK
                || event.getAction() == Action.PHYSICAL) {
            return;
        }
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().getType() != Material.BLAZE_ROD) {
            return;
        }
        Snowball snowball = player.launchProjectile(Snowball.class);

        Vector direction = player.getLocation().getDirection();

        Vector vector = new Vector(Math.random() * 0.1, Math.random() * 0.1, Math.random() * 0.1);

        direction.add(vector);
        snowball.setVelocity(direction);
        snowball.setShooter(player);
    }
}
