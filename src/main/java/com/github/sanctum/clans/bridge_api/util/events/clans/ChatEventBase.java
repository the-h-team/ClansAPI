package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.AsyncEvent;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import java.util.List;

/**
 * Base for events that alter chat.
 */
public interface ChatEventBase extends AsyncEvent, ClanEventBase, Cancellable {
    Player getChatting();
    List<Player> getReceivers();
    String getMessage();
    Sound getPingSound();
    String getPrefix();
    String getDivider();
    String getHighlight();
    String getHoverMeta();
    void setPingSound(Sound pingSound);
    void setHoverMeta(String playerMeta);
    void setPrefix(String prefix);
    void setDivider(String divider);
    void setHighlight(String highlight);
    void setMessage(String message);
}
