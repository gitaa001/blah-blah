package src.map;

public class FarmMap {
    private static int sizeWidth = 32;
    private static int sizeHeight = 32;
    private Point housePosition;
    private Point pondPosition;
    private Point playerPosition;
    private char[][] mapDisplay;

    public FarmMap(Point housePosition, Point pondPosition, Point playerPosition) {
        this.housePosition = housePosition;
        this.pondPosition = pondPosition;
        this.playerPosition = playerPosition;
        this.mapDisplay = new char[sizeHeight][sizeWidth];
    }

    public Point getHousePosition(){
        return housePosition;
    }

    public Point getpPondPosition(){
        return pondPosition;
    }

    public Point getPlayerPosition(){
        return playerPosition;
    }

    // nanti p ini itu parameter buat Player p
    public void movePlayer(){
        Point p = new Point(0,0);
    }


}
