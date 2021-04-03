package com.github.sanctum.clans.bridge_api.util.events.clans;

import com.github.sanctum.clans.bridge_api.util.events.ClanEvent;
import org.bukkit.entity.Player;

/**
 * Encapsulates ChatChannelOtherEvent (Pro) or CustomChatEvent (Free).
 */
@ClanEvent
public interface ChatChannelOtherEvent extends ChatEventBase {
    String getChannel();
    String getChannel(Player target);
}
