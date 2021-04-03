package com.github.sanctum.clans.bridge_api.util.events.command;

import com.github.sanctum.clans.bridge_api.util.events.EventBase;

import java.util.List;

public interface TabInsertEvent extends EventBase {
    String[] getCommandArgs();
    List<String> getArgs(int index);
    void add(int index, String value);
    void remove(int index, String value);
}
