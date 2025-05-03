package src.entities;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
    private List<Player> playerList = new ArrayList<Player>();

    public PlayerManager(List<Player> playerList) {
        this.playerList = playerList;
    }
    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void removePlayer(Player player) {
        playerList.remove(player);
    }

    public int getPlayerCount() {
        return playerList.size();
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}
