package src.items;
//ganti location sm weather

public class Fish extends Item{
    private String timeRanges;
    private String weathers;
    private String fishLocations;
    private Gold sellBasePrice;
    private String rarity;

    public Fish(String itemName, String timeRanges, String fishLocations, Gold sellBasePrice, String rarity){
        super(itemName, "Fish", true, sellBasePrice);
        this.timeRanges = timeRanges;
        this.fishLocations = fishLocations;
        this.rarity = rarity;
    }

    public String getTimeRanges(){
        return timeRanges;
    }

    public String getWeathers(){
        return weathers;
    }

    public String getFishLocations(){
        return fishLocations;
    }

    public Gold getSellBasePrice(){
        return sellBasePrice;
    }
    
    public String getRarity(){
        return rarity;
    }

    public Gold getSellPrice(){
        // kerjain kl dah ada season time weather
        Gold p = new Gold(0);
        return p;
    }

}
