package stylowamc.socialmediacommands.Utils;


import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import stylowamc.socialmediacommands.SocialMediaCommands;

import java.util.ArrayList;

public final class Permissions {
    public static final String COMMANDS_USE_PERM = "smc.commands";

    private static final ArrayList<Permission> perms = new ArrayList<>();

    private Permissions(){}

    public static void registerPermissions(){
        perms.add(new org.bukkit.permissions.Permission(COMMANDS_USE_PERM,"Pozwala uzywac komend", PermissionDefault.OP));

        for (Permission perm: perms){
            Bukkit.getPluginManager().addPermission(perm);
        }
    }

    public static void unregisterPermissions(){
        for(Permission perm : perms){
            Bukkit.getPluginManager().removePermission(perm);
        }
        perms.clear();
    }
}
