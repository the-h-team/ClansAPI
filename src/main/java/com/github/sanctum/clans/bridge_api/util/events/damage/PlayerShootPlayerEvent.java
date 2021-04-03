package com.github.sanctum.clans.bridge_api.util.events.damage;

import org.bukkit.entity.Player;

public interface PlayerShootPlayerEvent extends CancellableDamage {
    Player getShooter();
    Player getShot();
}
