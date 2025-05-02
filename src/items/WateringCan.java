package src.items;

public class WateringCan extends Equipment {
    public WateringCan(String wCanName, Gold sellPrice, Gold buyPrice, int useEnergy){
        super(wCanName, sellPrice, buyPrice, useEnergy, "WateringCan");
    }

    public void use(){
        System.out.println("Water something...");
    }
}
