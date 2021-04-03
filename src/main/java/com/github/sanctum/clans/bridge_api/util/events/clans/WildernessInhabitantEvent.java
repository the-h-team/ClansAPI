package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.construct.actions.ClaimAction;
import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@ClanEvent
public interface WildernessInhabitantEvent extends EventBase, Cancellable {
    void setTitlesAllowed(boolean titlesAllowed);
    void setWildernessTitle(String title, String subtitle);
    String getWildernessTitle();
    String getWildernessSubtitle();
    Player getPlayer();
    boolean isTitlesAllowed();
    ClaimAction getClaimUtil();
}
