package com.github.sanctum.clans.bridge_api.construct;

import com.github.sanctum.clans.bridge_api.construct.entity.Resident;
import org.bukkit.Chunk;
import org.bukkit.Location;

import java.util.List;

/**
 * Represents a Claim object.
 */
public interface Claim {
    /**
     * Get the claimId for this claim.
     *
     * @return claimId
     */
    String getClaimID();

    /**
     * Get the clanId of the claim owner.
     * <p>
     * Returns empty String if missing as per both Free and Pro API.
     *
     * @return owner's clanId
     */
    String getOwnerId();

    /**
     * Get the runtime chunk specified by this claim's location.
     * <p>
     * Equivalent to {@link #getLocation()}.getChunk()
     *
     * @return the chunk object for this claim
     */
    Chunk getChunk();

    /**
     * Get a list of all known online players currently in the claim.
     *
     * @return list of resident objects
     */
    List<Resident> getResidents();

    /**
     * Get runtime location object centered in the claim's respective chunk.
     *
     * @return location at center of claimed chunk
     */
    Location getLocation();
}
