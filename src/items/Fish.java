package src.items;
//ganti location sm weather

public class Fish extends Item{
    private String timeRanges;
    private String weathers;
    private String fishLocations;
    private Gold sellBasePrice;
    private String rarity;

    public Fish(String itemName, String timeRanges, String fishLocations, Gold sellBasePrice, String rarity){
        super(itemName, "Fish");
        this.timeRanges = timeRanges;
        this.fishLocations = fishLocations;
        this.sellBasePrice = sellBasePrice;
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

    public int getSellBasePrice(){
        return sellBasePrice.getGold();
    }
    
    public String getRarity(){
        return rarity;
    }

    public int countSellPrice(){
        // kerjain kl dah ada season time weather
        int p = 0;
        return p;
    }

}
