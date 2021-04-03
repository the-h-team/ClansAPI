package com.github.sanctum.clans.bridge_api.util;

/**
 * API-local version of RankPriority.
 */
public enum RankPriority {
    NORMAL(0),
    HIGH(1),
    HIGHER(2),
    HIGHEST(3);

    public final int priority;

    RankPriority(int priority) {
        this.priority = priority;
    }

    public int toInt() {
        return priority;
    }
}
