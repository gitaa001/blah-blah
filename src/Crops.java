package src;

public class Crops extends Item{
    private Gold sellPrice;

    public Crops(String itemName, Gold sellPrice){
        super(itemName, "Crops");
        this.sellPrice = sellPrice;
    }

    public int getSellPrice(){
        return sellPrice.getGold();
    }
}
