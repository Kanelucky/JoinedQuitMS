package cn.kanelucky;
import cn.kanelucky.listener.JoinedMS;
import cn.kanelucky.listener.QuitMS;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.kanelucky.listener.JoinedMS;
import cn.kanelucky.listener.QuitMS;

public class JoinedQuitMS extends PluginBase {
    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.WHITE + "JoinedQuitMS loaded!");
    }

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getLogger().info(TextFormat.DARK_GREEN + "JoinedQuitMS successfully enabled. Enjoy!");
        this.getServer().getPluginManager().registerEvents(new JoinedMS(this), this);
        this.getServer().getPluginManager().registerEvents(new QuitMS(this), this);
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "JoinedQuitMS disabled. Goodbye!");
    }
}
