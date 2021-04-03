package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@ClanEvent
public interface ClanJoinEvent extends ClanEventBase, Cancellable {
    Player getJoining();
}
