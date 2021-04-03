package com.github.sanctum.clans.bridge_api.util.events.command;

import com.github.sanctum.clans.bridge_api.util.events.EventBase;

import java.util.List;

public interface CommandHelpInsertEvent extends EventBase {
    List<String> getHelpMenu();
    void insert(String line);
    void insert(String... lines);
}
