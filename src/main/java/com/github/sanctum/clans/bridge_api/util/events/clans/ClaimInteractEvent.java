package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.construct.Claim;
import com.github.sanctum.clans.bridge_api.construct.actions.ClaimAction;
import com.github.sanctum.clans.bridge_api.util.InteractionType;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public interface ClaimInteractEvent extends EventBase, Cancellable {
    Location getLocation();
    ClaimAction getClaimUtil();

    /**
     * Get the interaction type, if available.
     * <p>
     * Not currently part of Free, returns null.
     *
     * @return InteractionType (Pro) or null (Free)
     */
    @Nullable InteractionType getType();

    /**
     * Get the player, if available.
     *
     * @return player (Pro) or null (Free)
     */
    @Nullable Player getPlayer();
    Claim getClaim();
    Block getBlock();
    ItemStack getItemInMainHand();
}
