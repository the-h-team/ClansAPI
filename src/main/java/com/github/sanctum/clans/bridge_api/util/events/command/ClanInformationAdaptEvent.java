package com.github.sanctum.clans.bridge_api.util.events.command;

import com.github.sanctum.clans.bridge_api.util.events.clans.ClanEventBase;

import java.util.List;

public interface ClanInformationAdaptEvent extends ClanEventBase {
    List<String> getInsertions();
    void insert(String line);
    void insert(String... lines);
}
