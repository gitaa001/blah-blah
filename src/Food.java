package src;

public class Food extends Item {
    private int giveEnergy;
    private Gold buyPrice;
    private Gold sellPrice;

    public Food(String itemName, int giveEnergy, Gold buyPrice, Gold sellPrice){
        super(itemName, "Food");
        this.giveEnergy = giveEnergy;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getGiveEnergy(){
        return giveEnergy;
    }

    public int getbuyPrice(){
        return buyPrice.getGold();
    }

    public int sellPrice(){
        return sellPrice.getGold();
    }
}
