package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public interface ClanBaseUpdateEvent extends EventBase, Cancellable {
    Player getPlayer();
    Location getLocation();
}
