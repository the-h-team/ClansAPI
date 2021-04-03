package com.github.sanctum.clans.bridge_api.util.events.damage;

import com.github.sanctum.clans.bridge_api.util.events.EventBase;

/**
 * Marks a Damage event that can be cancelled/altered.
 */
public interface CancellableDamage extends EventBase {
    boolean canHurt();
    void setCanHurt(boolean canHurt);
}
