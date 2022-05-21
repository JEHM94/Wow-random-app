package com.jehm.wowrandomapp.models;

import java.util.ArrayList;

public class Character {
    private int wowAccountID;

    private String characterName;
    private int characterID;

    private String realmName;
    private int realmID;

    private String faction;
    private String characterClass;
    private long money;

    private ArrayList<Character> characterList;

    public Character(int wowAccountID, String characterName, int characterID, String realmName, int realmID, String faction, String characterClass, long money) {
        this.wowAccountID = wowAccountID;
        this.characterName = characterName;
        this.characterID = characterID;
        this.realmName = realmName;
        this.realmID = realmID;
        this.faction = faction;
        this.characterClass = characterClass;
        this.money = money;
    }

    public ArrayList<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(ArrayList<Character> characterList) {
        this.characterList = characterList;
    }

    public int getWowAccountID() {
        return wowAccountID;
    }

    public void setWowAccountID(int wowAccountID) {
        this.wowAccountID = wowAccountID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public String getRealmName() {
        return realmName;
    }

    public void setRealmName(String realmName) {
        this.realmName = realmName;
    }

    public int getRealmID() {
        return realmID;
    }

    public void setRealmID(int realmID) {
        this.realmID = realmID;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
