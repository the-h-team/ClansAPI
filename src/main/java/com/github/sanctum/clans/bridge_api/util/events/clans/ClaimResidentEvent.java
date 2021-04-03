package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.construct.Claim;
import com.github.sanctum.clans.bridge_api.construct.actions.ClaimAction;
import com.github.sanctum.clans.bridge_api.construct.entity.Resident;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.event.Cancellable;

public interface ClaimResidentEvent extends EventBase, Cancellable {
    void setTitlesAllowed(boolean titlesAllowed);
    void setClaimTitle(String title, String subtitle);
    String getClaimTitle();
    String getClaimSubtitle();
    Claim getClaim();
    boolean isTitleAllowed();
    Resident getResident();
    ClaimAction getClaimUtil();
}
