package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import org.bukkit.OfflinePlayer;

@ClanEvent
public interface ClanCreatedEvent extends ClanEventBase {
    OfflinePlayer getMaker();
}
