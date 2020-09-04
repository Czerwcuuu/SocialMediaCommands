package stylowamc.socialmediacommands;

import org.bukkit.plugin.java.JavaPlugin;
import stylowamc.socialmediacommands.Utils.Permissions;
import stylowamc.socialmediacommands.commands.Cuboid;
import stylowamc.socialmediacommands.commands.Discord;
import stylowamc.socialmediacommands.commands.Facebook;
import stylowamc.socialmediacommands.commands.Youtube;
import stylowamc.socialmediacommands.config.Config;

import java.security.Permission;

public final class SocialMediaCommands extends JavaPlugin {

    private static Config config;
    private static SocialMediaCommands plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        config = new Config();
        this.getCommand("youtube").setExecutor(new Youtube());
        this.getCommand("discord").setExecutor(new Discord());
        this.getCommand("facebook").setExecutor(new Facebook());
        this.getCommand("dzialka").setExecutor(new Cuboid());
        Permissions.registerPermissions();

    }

    @Override
    public void onDisable() {
        Permissions.unregisterPermissions();
    }

    public static SocialMediaCommands getInstance(){
        return plugin;
    }
    public static Config getInternalConfig(){
        return config;
    }
}
