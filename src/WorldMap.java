package src;

public class WorldMap {
    private Location location;
    private Boolean active;

    public WorldMap(Location location) {
        this.location = location;
        active = false;
    }

    public Location getLocation() {
        return location;
    }

    public void toggleMap(){
        active = !active;
    }

    //parameter ini nanti diisi player.location
    public void returnToFarm(){
        location = new Location("Farm", new Point(0,0));
    }

}
