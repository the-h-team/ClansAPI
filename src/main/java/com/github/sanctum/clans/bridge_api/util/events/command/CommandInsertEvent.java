package com.github.sanctum.clans.bridge_api.util.events.command;

import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.entity.Player;

/**
 * Encapsulates CommandInsertEvent (Pro) or SubCommandEvent (Free).
 */
public interface CommandInsertEvent extends EventBase {
    void setReturn(boolean isCommand);
    boolean isCommand();
    String[] getArgs();
    Player getSender();
}
