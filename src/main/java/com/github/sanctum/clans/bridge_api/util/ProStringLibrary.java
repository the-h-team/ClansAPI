package com.github.sanctum.clans.bridge_api.util;

/**
 * Pro extension of Free's more basic StringLibrary.
 */
public interface ProStringLibrary extends StringLibrary {
    // Pro-only below
    String noClearance();
    String clanUnknown(String name);
    String passwordInvalid();
    String playerUnknown(String name);
    String commandCreate();
    String commandPassword();
    String commandJoin();
    String commandKick();
    String commandTag();
    // delegates to #commandPassowner()
    String commandPassOwner();
    String commandNick();
    String commandChat(String channel);
    String commandPromote();
    String commandDemote();
    String commandAlly();
    String commandEnemy();
    String commandColor();
    String commandMessage();
    String commandBase();
    String commandMode();
    String commandSetBase();
    String commandUnknown(String label);
    String nameInvalid(String name);
    String nameTooLong(String name);
    String alreadyMade(String name);
    String alreadyEnemies(String name);
    String alreadyAllies(String name);
    String alreadyNeutral(String name);
    String neutral(String name);
    String ally(String name);
    String waiting(String name);
    String enemy(String name);
    String noRemoval(String name);
    String breach(String name);
    // Delegates to #higherpower(String)
    String higherPower(String name);
    String alreadyMax(String insert1, String insert2);
    String claimed(int x, int z, String world);
    String unclaimed(int x, int z, String world);
    String overpowered(int x, int z, String world);
    String alreadyWild();
    String noClaims();
    String unclaimedAll(String name);
    String alreadyMaxClaims();
    String shieldDeny();
    String tooWeak();
    String selfDenial();
    String peacefulDeny();
    String defaultMode();
    String peacefulDenyOther(String name);
    String friendlyFire();
    String friendlyFireOn(String name);
    String friendlyFireOff(String name);
    String peaceful();
    String modeAnnounce(String mode, String clanName);
    String war();
    String claimHint();
    String alreadyPeaceful();
    String alreadyWar();
    String alreadyLastPage();
    String alreadyFirstPage();
    String allianceRequested();
    String allianceRequestedOut(String insert1, String insert2);
    String allianceDenial();
    String menuBorder();
    int menuSize();
    String menuTitle();
    String pageUnknown();
    String noPermission(String permission);
    String notEnemies(String name);
    String notEnough(double needed);
    String format(String string, String target, String replacement);
    String format(String string, String target1, String replacement1, String target2, String replacement2);
}
