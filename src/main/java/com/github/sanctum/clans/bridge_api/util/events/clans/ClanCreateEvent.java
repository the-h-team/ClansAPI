package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.construct.Clan;
import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.Nullable;

@ClanEvent
public interface ClanCreateEvent extends EventBase, Cancellable {
    /**
     * The clan object.
     * <p>
     * Not provided by Free; returns null.
     *
     * @return Clan (Pro) or null (Free)
     */
    @Nullable Clan getClan();
    OfflinePlayer getMaker();
    String getName();
    String getPassword();
}
