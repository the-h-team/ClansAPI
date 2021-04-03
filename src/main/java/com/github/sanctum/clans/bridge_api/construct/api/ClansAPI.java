package com.github.sanctum.clans.bridge_api.construct.api;

import com.github.sanctum.clans.bridge_api.construct.Clan;
import com.github.sanctum.clans.bridge_api.construct.actions.ClaimAction;
import com.github.sanctum.clans.bridge_api.construct.actions.ClanAction;
import com.github.sanctum.clans.bridge_api.util.StringLibrary;
import com.github.sanctum.clans.bridge_api.util.data.persistent.PersistentContainer;
import com.github.sanctum.clans.bridge_api.util.events.ClanEventListener;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Provide an interface to ClansAPI. Based on Pro with some edits.
 */
public abstract class ClansAPI {
    private static ClansAPI INSTANCE;
    public final PersistentContainer.MetaUtilities metaUtility;
    public final ClanAction clanAction;
    public final ClaimAction claimAction;
    public final StringLibrary stringLibrary;

    protected ClansAPI(ClanAction clanAction, ClaimAction claimAction, PersistentContainer.MetaUtilities metaUtility, StringLibrary stringLibrary) {
        this.clanAction = clanAction;
        this.claimAction = claimAction;
        this.metaUtility = metaUtility;
        this.stringLibrary = stringLibrary;
    }

    /**
     * Get the clan for a target player.
     *
     * @param targetPlayer UniqueId of player
     * @return clan for target player
     */
    @Nullable
    public abstract Clan getClan(UUID targetPlayer);

    /**
     * Get a clan object by its clanId.
     *
     * @param clanId clan id as string
     * @return a clan object
     */
    @Nullable
    public abstract Clan getClan(String clanId);

    /**
     * Check if a clan contains a player by UniqueId.
     *
     * @param playerUid player's UniqueId
     * @param clanID clan id as string
     * @return true if clan contains player uid
     */
    public abstract boolean isClanMember(UUID playerUid, String clanID);

    /**
     * Check if a target is currently a member of a clan.
     *
     * @param target player's UniqueId
     * @return true if player is in a clan
     */
    public abstract boolean isInClan(UUID target);

    /**
     * Get the name of a clan by its clanId.
     *
     * @param clanId clan's id as string
     * @return clan's name
     */
    public abstract String getClanName(String clanId);

    /**
     * Resolve a clan name into a clanId.
     *
     * @param clanName name of clan
     * @return clan's id
     */
    @Nullable
    public abstract String getClanID(String clanName);

    /**
     * Register a listener for Clans events.
     *
     * @param eventListener a {@linkplain ClanEventListener}
     * @param plugin your plugin
     */
    public abstract void registerListener(ClanEventListener eventListener, Plugin plugin);

    /**
     * Sets the implementation.
     *
     * @param clansAPI an api implementation
     */
    protected static void setInstance(ClansAPI clansAPI) {
        INSTANCE = clansAPI;
    }

    /**
     * Get the currently registered ClansAPI provider.
     *
     * @return current provider
     * @throws IllegalStateException if a provider has not been registered
     */
    public static ClansAPI getInstance() throws IllegalStateException {
        if (INSTANCE == null) throw new IllegalStateException("A ClansAPI provider has not been registered!");
        return INSTANCE;
    }
}
