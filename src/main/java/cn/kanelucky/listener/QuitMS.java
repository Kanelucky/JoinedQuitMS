package cn.kanelucky.listener;

import cn.kanelucky.JoinedQuitMS;
import org.powernukkitx.Player;
import org.powernukkitx.event.EventHandler;
import org.powernukkitx.event.Listener;
import org.powernukkitx.event.player.PlayerQuitEvent;
import org.powernukkitx.utils.TextFormat;

public class QuitMS implements Listener {
    private final JoinedQuitMS plugin;

    public QuitMS(JoinedQuitMS plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void on_player_quit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        String msg = plugin.getConfig().getString("quit-message");
        msg = msg.replace("{player}", player.getName());
        msg = TextFormat.colorize(msg);
        event.setQuitMessage(msg);
    }
}
