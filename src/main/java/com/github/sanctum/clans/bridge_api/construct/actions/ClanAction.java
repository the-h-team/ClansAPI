package com.github.sanctum.clans.bridge_api.construct.actions;

import com.github.sanctum.clans.bridge_api.construct.Clan;
import com.github.sanctum.clans.bridge_api.util.RankPriority;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

/**
 * Encapsulates ClanAction (Pro), ClanUtil (Free).
 */
// TODO: javadoc
public interface ClanAction {
    void create(Player player, String clanName, String password);
    void leave(Player player);
    void joinClan(Player player, String clanName, String password);
    List<String> getAllyRequests(String clanId);
    void sendAllyRequest(Player player, String senderClanId, String targetClanId);
    void addAlly(String clanId, String targetClanId);
    void removeAlly(String clanId, String targetClanId);
    void addEnemy(String clanId, String targetClanId);
    void removeEnemy(String clanId, String targetClanId);
    double getKD(UUID playerUid);
    UUID getUserID(String playerName);
    List<UUID> getAllUsers();
    String getCurrentRank(int rankPower);
    String getRankUpgrade(int rankPower);
    String getRankDowngrade(int rankPower);
    void demotePlayer(Player targetPlayer);
    void promotePlayer(Player targetPlayer);
    void kickPlayer(String playerName);
    void teleportBase(Player player);
    void transferOwner(Player currentOwner, String target);
    @Nullable String getClan(Player player);
    void changeNickname(Player player, String newName);
    String getClanNickname(Player player);
    String getRank(Player player);
    String getRank(OfflinePlayer offlinePlayer);
    String getRankTag(String rank);
    String getMemberRank(String clanId, String member);
    int getRankPower(Player player);
    int getRankPower(OfflinePlayer offlinePlayer);
    int maxRankPower();
    @Nullable RankPriority getRankPriority(String rank);
    String getClanName(String clanId);
    void loadClans();
    @Nullable Clan getClan(String clanId);
    List<String> getAllies(String clanId);
    List<String> getEnemies(String clanId);
    boolean isNeutral(String clanId, String targetClanId);
    String clanRelationColor(String clanId, String targetClanId);
    String getClanPassword(String clanId);
    void getMyClanInfo(Player player, int page);
    @Nullable String getClanID(String clanName);
    List<String> getAllClanNames();
    List<String> getAllClanIDs();
    int invitationClearance();
    int renameClearance();
    int colorChangeClearance();
    int positionClearance();
    int unclaimAllClearance();
    int claimingClearance();
    int viewPassClearance();
    int baseClearance();
    int friendlyFireClearance();
    int kickClearance();
    int passwordClearance();
    void setRaidShield(boolean on);
    boolean shieldStatus();
    void getLeaderboard(Player player, int page);
}
