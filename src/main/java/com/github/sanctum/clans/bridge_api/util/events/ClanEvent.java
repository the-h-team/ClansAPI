package com.github.sanctum.clans.bridge_api.util.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a complete {@link ClanEvent} for the purpose
 * of designing listeners.
 */
@Target({ElementType.TYPE, ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClanEvent {
}
