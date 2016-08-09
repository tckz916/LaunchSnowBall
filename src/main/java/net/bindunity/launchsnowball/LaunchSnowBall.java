package net.bindunity.launchsnowball;

import net.bindunity.launchsnowball.listener.PlayerListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by tckz916 on 2016/08/10.
 */
public class LaunchSnowBall extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        PluginManager pluginManager = this.getServer().getPluginManager();

        pluginManager.registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
