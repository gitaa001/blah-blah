package src.map;

import src.entities.*;

public class FarmMap {
    private static int farmSizeWidth = 32;
    private static int farmSizeHeight = 32;
    private Point housePosition;
    private Point pondPosition;
    private Point playerPositionFarm;
    private char[][] farmMapDisplay;

    public FarmMap(Point housePosition, Point pondPosition, Point playerPosition) {
        this.housePosition = housePosition;
        this.pondPosition = pondPosition;
        this.playerPositionFarm = playerPosition;
        this.farmMapDisplay = new char[farmSizeHeight][farmSizeWidth];
    }

    public Point getHousePosition(){
        return housePosition;
    }

    public Point getpPondPosition(){
        return pondPosition;
    }

    public Point getPlayerPosition(){
        return playerPositionFarm;
    }

    public char[][] getFarmMapDisplay(){
        return farmMapDisplay;
    }
    // nanti p ini itu parameter buat Player p
    public void movePlayer(Player p){
        
    }



}
