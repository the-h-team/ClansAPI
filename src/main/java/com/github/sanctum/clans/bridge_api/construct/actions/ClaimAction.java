package com.github.sanctum.clans.bridge_api.construct.actions;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * Encapsulates ClaimAction (Pro) or ClaimUtil (Free).
 */
// TODO: javadoc
public interface ClaimAction {
    void obtain(Player player);
    void remove(Player player);
    void removeAll(Player player);
    void loadClaims();
    boolean isInClaim(Location location);
    int maxClaims(Player player);
    String getClaimID(Location location);
    List<String> getAllClaims();
    String[] getClaimInfo(String claimID);
    int[] getClaimPosition(String[] key);
    boolean claimingAllowed();
}
