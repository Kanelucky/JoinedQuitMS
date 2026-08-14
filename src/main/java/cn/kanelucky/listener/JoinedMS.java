package cn.kanelucky.listener;

import cn.kanelucky.JoinedQuitMS;
import org.powernukkitx.Player;
import org.powernukkitx.event.EventHandler;
import org.powernukkitx.event.Listener;
import org.powernukkitx.event.player.PlayerJoinEvent;
import org.powernukkitx.utils.TextFormat;

public class JoinedMS implements Listener {

    private final JoinedQuitMS plugin;

    public JoinedMS(JoinedQuitMS plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void on_player_join(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String msg = plugin.getConfig().getString("join-message");
        msg = msg.replace("{player}", player.getName());
        msg = TextFormat.colorize(msg);
        event.setJoinMessage(msg);
    }
}
