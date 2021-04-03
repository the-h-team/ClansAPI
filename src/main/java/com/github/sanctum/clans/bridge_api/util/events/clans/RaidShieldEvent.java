package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import com.github.sanctum.clans.bridge_api.util.events.EventBase;
import org.bukkit.event.Cancellable;

@ClanEvent
public interface RaidShieldEvent extends EventBase, Cancellable {
    int getStartTime();
    int getStopTime();
    String getShieldOn();
    String getShieldOff();
    boolean shieldOn();
    void setShieldOn(String shieldOn);
    void setShieldOff(String shieldOff);
    void setStartTime(int startTime);
    void setStopTime(int stopTime);
}
