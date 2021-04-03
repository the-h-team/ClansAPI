package com.github.sanctum.clans.bridge_api.util.events;

import org.bukkit.event.EventPriority;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation for event handling methods.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClanEventHandler {
    /**
     * Set the priority to listen to an event at.
     *
     * @return an EventPriority
     */
    EventPriority priority() default EventPriority.NORMAL;

    /**
     * Always run this event handler, even if an event was cancelled.
     * <p>
     * Defaults to false. Note that this is opposite of Bukkit!
     *
     * @return whether this handler should process cancelled events
     */
    boolean runOnCancelled() default false;
}
