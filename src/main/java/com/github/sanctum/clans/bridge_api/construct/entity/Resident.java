package com.github.sanctum.clans.bridge_api.construct.entity;

import com.github.sanctum.clans.bridge_api.construct.Claim;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Optional;

/**
 * Represents a Resident.
 */
// TODO: finish javadoc
public interface Resident {
    /**
     * Get the Player described by this Resident object.
     *
     * @return an online player
     */
    Player getPlayer();

    /**
     * Get the Claim last stored in this object.
     *
     * @return last stored claim
     */
    Claim lastKnownClaim();

    /**
     * Get the claim at the player's current location.
     * <p>
     * Returns an empty Optional if no claim exists.
     *
     * @return claim information by player location
     */
    Optional<Claim> getCurrentClaim();

    boolean isNotificationSent();
    boolean hasTraversedDifferent();
    long timeActiveInMillis();

    /**
     * Add a block to the resident's temporary interactions cache
     * as having been placed at the current time.
     *
     * @param placed the block placed by the resident
     */
    void addPlaced(Block placed);

    /**
     * Add a block to the resident's temporary interactions cache
     * as having been broken at the current time.
     *
     * @param broken the block broken by the resident
     */
    void addBroken(Block broken);

    Map<Block, Long> getPlacedBlockHistory();
    Map<Block, Long> getBrokenBlockHistory();
}
