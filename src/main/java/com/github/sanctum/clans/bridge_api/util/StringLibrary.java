package com.github.sanctum.clans.bridge_api.util;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface StringLibrary {
    void sendMessage(Player player, String message);
    String color(String text);
    void sendComponent(CommandSender recipient, TextComponent text);
    String getPrefix();
    String alreadyInClan();
    String notInClan();
    String alreadyOwnClaim();
    String notClaimOwner(String actualOwner);
    String wrongPassword();
    String getRankStyle();
    String getWordlessStyle(@NotNull String rank);
    String getFullStyle(@NotNull String rank);
    String getChatFormat();
    void paginatedClanList(Player player, List<String> listToPaginate, String command, int page, int contentLinesPerPage);
    void paginatedMemberList(Player player, List<String> listToPaginate, int page);
    void chunkBorderHint(Player player);
}
