package com.github.sanctum.clans.bridge_api.util.data.persistent;

import com.github.sanctum.clans.bridge_api.construct.Clan;
import com.github.sanctum.labyrinth.library.HUID;

/**
 * Encapsulates a read-only view of a meta container.
 */
// TODO: javadoc
public interface MetaContainer {
    HUID getId();
    String value();
    String value(int index);
    Clan getClan();
}
