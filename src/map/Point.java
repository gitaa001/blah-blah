package src.map;

public class Point {
    private int x;
    private int y;
    private int prevX;
    private int prevY;

    public Point(int x, int y) {
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

    public boolean movePlayer(String direction, char[][] mapDisplay) {
        int newX = this.x;
        int newY = this.y;

        // Simpan posisi lama
        prevX = this.x;
        prevY = this.y;

        switch (direction.toLowerCase()) {
            case "up":
                newY = this.y - 1;
                break;
            case "down":
                newY = this.y + 1;
                break;
            case "left":
                newX = this.x - 1;
                break;
            case "right":
                newX = this.x + 1;
                break;
            default:
                System.out.println("Invalid direction.");
                return false;
        }

        if (newX < 0 || newX >= mapDisplay[0].length || newY < 0 || newY >= mapDisplay.length) {
            System.out.println("You can't move outside the house!");
            return false;
        }

        if (mapDisplay[newY][newX] != '.') {
            System.out.println("There's something in the way! Can't move there.");
            return false;
        }

        this.x = newX;
        this.y = newY;
        System.out.println("Moved to: (" + this.x + "," + this.y + ")");
        return true;
    }

    public int[] getPosition() {
        return new int[] {this.x, this.y};
    }
    public int[] getPreviousPosition() {
        return new int[] {this.prevX, this.prevY};
    }

    public String printPoint() {
        return "(" + x + ", " + y + ")";
    }

}
