package com.github.sanctum.clans.bridge_api.util.events;

import com.github.sanctum.clans.bridge_api.construct.actions.ClanAction;
import com.github.sanctum.clans.bridge_api.construct.api.ClansAPI;
import com.github.sanctum.clans.bridge_api.util.ProStringLibrary;
import com.github.sanctum.clans.bridge_api.util.StringLibrary;

import java.util.Optional;

/**
 * Base for our events.
 */
public interface EventBase {
    /**
     * Get the ClanAction utility.
     *
     * @return ClanAction encapsulation
     */
    ClanAction getUtil();

    /**
     * Get the StringLibrary utility.
     *
     * @return StringLibrary instance
     */
    StringLibrary getStringLibrary();

    /**
     * Get the Pro-only extensions of StringLibrary.
     * <p>
     * Returns empty Optional on Free.
     *
     * @return Pro StringLibrary instance
     */
    default Optional<ProStringLibrary> getProStringLibrary() {
        return Optional.of(ClansAPI.getInstance().stringLibrary)
                .filter(ProStringLibrary.class::isInstance)
                .map(ProStringLibrary.class::cast);
    }
}
