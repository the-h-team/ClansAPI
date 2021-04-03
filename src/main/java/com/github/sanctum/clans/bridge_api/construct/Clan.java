package com.github.sanctum.clans.bridge_api.construct;

import com.github.sanctum.labyrinth.library.HUID;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Represents a Clan object.
 */
public interface Clan {
    /**
     * Get the core-side-reserved meta container id.
     * <p>
     * In most cases, addons will need to use {@link #getId(int)}.
     *
     * @return a persistent data id
     */
    HUID getId();

    /**
     * Get a meta container id with an int key.
     *
     * @param id key
     * @return a persistent data id with set delimiter
     */
    HUID getId(int id);

    /**
     * Update a clan's base to the specified location.
     *
     * @param location the new location
     */
    void updateBase(@NotNull Location location);

    /**
     * Get the clanId of this clan object, represented as a String.
     * <p>
     * Note: Pro uses HUIDs natively.
     *
     * @return clanId
     */
    @NotNull String getClanID();

    /**
     * Get the location of the clan's base.
     *
     * @return the clan's base location, if it has been set.
     */
    @Nullable Location getBase();

    /**
     * Get the clan's information as an array.
     *
     * @return array of clan information Strings
     */
    String[] getClanInfo();

    /**
     * Get the clan's password if one has been set.
     * <p>
     * Will always return null for Pro.
     *
     * @return password or null
     */
    @Nullable String getPassword();

    /**
     * Change the clan's password.
     * <p>
     * Set to null to clear.
     * <p>
     * Do not use the word 'empty', in some cases this will
     * also clear the password.
     *
     * @param newPassword a new password or null to clear.
     */
    void changePassword(@Nullable String newPassword);

    /**
     * Set the clan's name to a new one.
     *
     * @param newName desired display name without color
     */
    void setName(@NotNull String newName);

    /**
     * Set the clan's color to a new color.
     * <p>
     * Set to null to clear.
     *
     * @param newColor new color as color name
     * @see net.md_5.bungee.api.ChatColor
     */
    void setColor(@Nullable String newColor);

    /**
     * Get the clan's name.
     *
     * @return clan's name
     */
    String getName();

    /**
     * Get the color string used for display of clan name.
     *
     * @return color code string
     */
    String getChatColor();

    /**
     * Get a list of clan members.
     *
     * @return array of clan members from file
     */
    String[] getMembers();

    /**
     * Send a message to all online players in the clan.
     * <p>
     * The message will be prefixed by the clan name.
     *
     * @param message a message
     */
    void broadcastMessage(String message);

    /**
     * Format a number into configured language types.
     *
     * @param amount number to format
     * @return localized String
     */
    String formatAmount(String amount);

    /**
     * Give the clan a specified amount of power.
     *
     * @param amount amount of power to grant
     */
    void givePower(double amount);

    /**
     * Take a specified amount of power away from the clan.
     *
     * @param amount amount of power to remove
     */
    void takePower(double amount);

    /**
     * Get the clan's current power level.
     *
     * @return clan power as double
     */
    double getPower();

    /**
     * Get an array of all owned clan claims by claimID.
     *
     * @return an array of claim ids representing clan claims.
     */
    String[] getOwnedClaims();

    /**
     * Get a list of the clan's allies.
     *
     * @return list of allies
     */
    List<String> getAllies();

    /**
     * Get a list of the clan's enemies.
     *
     * @return list of enemies
     */
    List<String> getEnemies();
}
