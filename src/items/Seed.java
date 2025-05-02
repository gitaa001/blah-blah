package src.items;
//ganti season nanti

public class Seed extends Item {
    private Gold buyPrice;
    private int harvestDays;
    private String validSeason;

    public Seed(String itemName, Gold buyPrice, int harvestDays, String validSeason){
        super(itemName, "Seed");
        this.buyPrice = buyPrice;
        this.harvestDays = harvestDays;
        this.validSeason = validSeason;
    }

    public int getbuyPrice() {
        return buyPrice.getGold();
    }
    
    public int getHarvestDays(){
        return harvestDays;
    }

    public String getSeason(){
        return validSeason;
    }

}
