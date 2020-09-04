package stylowamc.socialmediacommands.config;

import org.bukkit.configuration.file.FileConfiguration;
import stylowamc.socialmediacommands.SocialMediaCommands;

public class Config {

    public static final String NOPERM = "locale.noperm";
    public static final String DISCORD = "locale.discord";
    public static final String FACEBOOK = "locale.facebook";
    public static final String YOUTUBE = "locale.youtube";
    public static final String CUBOID = "locale.cub";

    private String noPermMes,discordMes,youtubeMes,facebookMes,cuboidMes;

    public Config(){
        setDefaults();
        loadConfig();
    }

    public void loadConfig(){
        FileConfiguration config = SocialMediaCommands.getInstance().getConfig();

        noPermMes = config.getString(NOPERM,"&4Nie masz do tego uprawnien");
        discordMes = config.getString(DISCORD,"&3&lNasz Discord:&6&l[Przykladowy discord]");
        youtubeMes = config.getString(YOUTUBE,"&3&lNasz kanal Youtube:&6&l[Przykładowy YT]");
        facebookMes = config.getString(FACEBOOK,"&3&lNasz Facebook:&6&l[Przykładowy FB]");
        cuboidMes = config.getString(CUBOID,"&3&lJeśli chcesz zrobić działkę, obejrzyj -> :&6&l [Przykładowy FILM]");

    }

    public void setDefaults(){
        FileConfiguration config = SocialMediaCommands.getInstance().getConfig();

        config.addDefault(NOPERM,"&4Nie masz do tego uprawnien");
        config.addDefault(DISCORD,"&3&lNasz Discord:&6&l[Przykladowy discord]");
        config.addDefault(YOUTUBE,"&3&lNasz kanal Youtube:&6&l[Przykładowy YT]");
        config.addDefault(FACEBOOK,"&3&lNasz Facebook:&6&l[Przykładowy FB]");
        config.addDefault(CUBOID,"&3&lJeśli chcesz zrobić działkę, obejrzyj -> :&6&l [Przykładowy FILM]");

        config.options().copyDefaults(true);

        SocialMediaCommands.getInstance().saveConfig();
    }

    public void saveConfig(){
        FileConfiguration config = SocialMediaCommands.getInstance().getConfig();

        config.set(NOPERM,"&4Nie masz do tego uprawnien");
        config.set(DISCORD,"&3&lNasz Discord:&6&l[Przykladowy discord]");
        config.set(YOUTUBE,"&3&lNasz kanal Youtube:&6&l[Przykładowy YT]");
        config.set(FACEBOOK,"&3&lNasz Facebook:&6&l[Przykładowy FB]");
        config.set(CUBOID,"&3&lJeśli chcesz zrobić działkę, obejrzyj -> &6&l [Przykładowy FILM]");

        SocialMediaCommands.getInstance().saveConfig();
    }

    public void reloadConfig(){
        loadConfig();
    }
//DSC
    public String getDiscordMes(){
        return discordMes;
    }
    public void setDiscordMes(String message){
        this.discordMes = message;
    }
//YT
    public void setYoutubeMes(String message){
        this.youtubeMes = message;
    }
    public String getYoutubeMes(){
        return youtubeMes;
    }
//FB
    public void setFacebookMes(String message){
        this.facebookMes = message;
    }
    public String getFacebookMes(){
        return facebookMes;
    }
//CUBOID
    public void setCuboidMes(String message){
    this.cuboidMes = message;
}
    public String getCuboidMes(){
        return cuboidMes;
    }
//NOPERMS
    public void setNoPermMes(String message){
        this.noPermMes = message;
    }
    public String getNoPermMes(){
        return noPermMes;
    }


}
