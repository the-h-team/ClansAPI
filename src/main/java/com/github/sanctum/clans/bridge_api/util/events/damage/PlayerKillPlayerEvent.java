package com.github.sanctum.clans.bridge_api.util.events.damage;

import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.entity.Player;

public interface PlayerKillPlayerEvent extends EventBase {
    Player getKiller();
    Player getVictim();
}
