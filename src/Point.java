package src;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveTo(int dx, int dy) {
        this.x = dx;
        this.y = dy;
    }

    public void moveForward() {
        this.y ++;
    }

    public void moveBackward() {
        this.y --;
    }

    public void moveRight() {
        this.x ++;
    }

    public void moveLeft() {
        this.x --;
    }

}
