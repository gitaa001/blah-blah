package src;

public class Season {
    public enum Seasons {
        SUMMER, AUTUMN, WINTER, SPRING;
    }

    public Seasons currentSeason;

    public Season() {
        this.currentSeason = Seasons.SPRING;
    }

    public void changeSeaons(){
        switch (currentSeason) {
            case SUMMER:
                currentSeason = Seasons.AUTUMN;
                break;
            case AUTUMN:
                currentSeason = Seasons.WINTER;
                break;
            case WINTER:
                currentSeason = Seasons.SPRING;
                break;
            case SPRING:
                currentSeason = Seasons.SUMMER;
                break;
        }
    }

    public Seasons getCurrentSeason() {
        return currentSeason;
    }
}
