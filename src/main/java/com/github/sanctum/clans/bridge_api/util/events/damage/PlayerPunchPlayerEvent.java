package com.github.sanctum.clans.bridge_api.util.events.damage;

import org.bukkit.entity.Player;

public interface PlayerPunchPlayerEvent extends CancellableDamage {
    Player getAttacker();
    Player getVictim();
}
