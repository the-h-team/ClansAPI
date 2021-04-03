package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.construct.Claim;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;

/**
 * Intermediate base for land-related events.
 */
public interface LandEventBase extends EventBase {
    Claim getLand();
}
