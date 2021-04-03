package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@ClanEvent
public interface ClanLeaveEvent extends ClanEventBase, Cancellable {
    // Delegates to #getJoining()
    Player getLeaving();
}
