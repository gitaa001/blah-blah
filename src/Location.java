package src;

public class Location {
    private String name;
    private Point currentPoint;

    Location(String name, Point currentPoint){
        this.name = name;
        this.currentPoint = currentPoint;
    }

    public String getName() {
        return name;
    }

    public Point getCurrentPoint(){
        return currentPoint;
    }
    
    
}
