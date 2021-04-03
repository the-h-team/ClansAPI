package com.github.sanctum.clans.bridge_api.util.data.persistent;

import com.github.sanctum.clans.bridge_api.construct.api.ClansAPI;
import com.github.sanctum.labyrinth.library.HUID;
import org.jetbrains.annotations.Nullable;

/**
 * Encapsulates a persistent meta container.
 */
public interface PersistentContainer extends MetaContainer {
    /**
     * Save most any object to the metadata.
     * <p>
     * This includes classes which properly implement Serializable
     * as well as a number of object types natively supported by
     * Bukkit's {@link org.bukkit.util.io.BukkitObjectOutputStream}.
     *
     * @param object the object to store
     */
    void setValue(Object object);

    /**
     * Save most any object to the metadata ArrayList container.
     * <p>
     * This includes classes which properly implement Serializable
     * as well as a number of object types natively supported by
     * Bukkit's {@link org.bukkit.util.io.BukkitObjectOutputStream}.
     *
     * @param object the object to insert
     * @param index the list index to set
     */
    void setValue(Object object, int index);

    /**
     * Save the metadata to cache.
     */
    void storeTemp();

    /**
     * Store the metadata to disk.
     */
    void saveMeta();

    /**
     * Store the metadata to disk under the specified delimiter.
     *
     * @param id delimiter as an integer
     */
    void saveMeta(int id);

    static MetaUtilities utilities() {
        return ClansAPI.getInstance().metaUtility;
    }

    /**
     * Provide static interface to clan meta.
     */
    interface MetaUtilities {
        /**
         * Get all currently loaded meta IDs.
         *
         * @return an array of loaded meta HUIDs
         */
        HUID[] getMetaDataContainer();

        /**
         * Get all currently loaded meta IDs for a clanId.
         *
         * @param clanId the clan's id
         * @return an array of all loaded meta HUIDs for the clan.
         */
        HUID[] getClanContainer(String clanId);

        /**
         * Display information in console with every persistent
         * data container interaction.
         *
         * @param debug true to enable display
         */
        void setDebugging(boolean debug);

        /**
         * Load an instance of metadata from hard storage.
         *
         * @param huid id of meta to load
         * @return saved data instance
         */
        @Nullable PersistentContainer loadSavedInstance(HUID huid);

        /**
         * Load an instance of metadata from cache.
         *
         * @param huid id to load from cache
         * @return cached data instance
         */
        @Nullable MetaContainer loadTempInstance(HUID huid);

        /**
         * Delete an instance metadata from both cache and hard storage.
         *
         * @param huid the id to delete
         */
        void deleteInstance(HUID huid);

        /**
         * Load all metadata from hard storage into cache.
         * <p>
         * This method is automatically called by Clans on server enable,
         * so in most cases unnecessary.
         */
        void querySaved();
    }
}
