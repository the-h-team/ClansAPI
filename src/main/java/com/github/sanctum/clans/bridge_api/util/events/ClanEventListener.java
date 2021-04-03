package com.github.sanctum.clans.bridge_api.util.events;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Builder for event listeners.
 */
public final class ClanEventListener {
    private final Set<Consumer<? extends EventBase>> handlers = new HashSet<>();

    private ClanEventListener() {}

    public Set<Consumer<? extends EventBase>> getHandlers() {
        return Collections.unmodifiableSet(handlers);
    }

    public static <T extends EventBase> ListenerBuilder<T> listenFor(Class<T> event) {
        return new ListenerBuilder<>(new ClanEventListener());
    }

    private static class ListenerBuilder<T extends EventBase> {
        private final ClanEventListener clanEventListener;

        public ListenerBuilder(ClanEventListener clanEventListener) {
            this.clanEventListener = clanEventListener;
        }

        public ClanEventListener onEvent(Consumer<T> eventHandler) {
            clanEventListener.handlers.add(eventHandler);
            return clanEventListener;
        }
    }
}
