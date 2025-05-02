package src.items;

public class Crop extends Item{
    private Gold sellPrice;
    private Gold buyPrice;
    private int cropPerPanen;


    public Crop(String itemName, Gold sellPrice, Gold buyPrice, int cropPerPanen){
        super(itemName, "Crop");
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.cropPerPanen = cropPerPanen;
    }
    
    public int getSellPrice(){
        return sellPrice.getGold();
    }

    public int getBuyPrice(){
        return buyPrice.getGold();
    }

    public int getCropPerPanen(){
        return cropPerPanen;
    }
}
