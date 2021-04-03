package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@ClanEvent
public interface LandPreClaimEvent extends EventBase, Cancellable {
    // Delegates to #getPlayer on Free
    Player getClaimer();
}
