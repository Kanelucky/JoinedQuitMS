package cn.kanelucky.listener;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.Player;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.utils.Config;
import cn.kanelucky.JoinedQuitMS;


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
