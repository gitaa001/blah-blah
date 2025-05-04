package src.items;

//nanti use abis jadi player aja
public abstract class Equipment extends Item{
    private Gold buyPrice;
    private int useEnergy;
    String equipmentType;

    public Equipment(String itemName, Gold sellPrice, Gold buyPrice, int useEnergy, String equipmentType){
        super(itemName, "Equipment",true, sellPrice);
        this.buyPrice = buyPrice;
        this.useEnergy = useEnergy;
    }


    public int getBuyPrice(){
        return buyPrice.getGold();
    }

    public int getUseEnergy(){
        return useEnergy;
    }

    public String getEquipmentType(){
        return equipmentType;
    }
    
    public abstract void use();
}
