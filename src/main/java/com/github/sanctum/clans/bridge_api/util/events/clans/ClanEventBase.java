package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.construct.Clan;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;

/**
 * Marks events that provide a Clan object reference.
 */
public interface ClanEventBase extends EventBase {
    Clan getClan();
}
