package src.entities;

import src.map.*;
import src.items.*;

public class Player {
    private String playerName;
    private String gender;
    private int energy;
    private int MAX_ENERGY = 100;
    private String farmName;
    private NPC partner;
    private Gold playerGold;
    private Inventory playerInventory;
    private Location playerLocation;

    public Player(String playerName, String gender, String farmName, NPC partner, Gold playerGold, Inventory playerInventory, Location playerLocation, PlayerManager playerManagerList) {
        this.playerName = playerName;
        this.gender = gender;
        this.energy = MAX_ENERGY;
        this.farmName = farmName;
        this.partner = partner;
        this.playerGold = playerGold;
        this.playerInventory = playerInventory;
        this.playerLocation = playerLocation;
        playerManagerList.addPlayer(this);
    }

    public String getPlayerName() {
        return playerName;
    }
    
    public String getGender() {
        return gender;
    }

    public int getEnergy() {
        return energy;
    }

    public String getFarmName() {
        return farmName;
    }

    public NPC getPartner() {
        return partner;
    }


    public Gold getPlayerGold() {
        return playerGold;
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public Location getPlayerLocation() {
        return playerLocation;
    }

    public void addPlayerEnergy(int amount) {
        this.energy += amount;
    }

    public void subtractPlayerEnergy(int amount) {
        if (this.energy - amount < 0) {
            this.energy = 0;
        }
        this.energy -= amount;
    }

    
}
