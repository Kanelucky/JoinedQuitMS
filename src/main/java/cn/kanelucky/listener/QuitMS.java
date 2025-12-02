package cn.kanelucky.listener;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.Player;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.utils.Config;
import cn.kanelucky.JoinedQuitMS;

public class QuitMS implements Listener{
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
