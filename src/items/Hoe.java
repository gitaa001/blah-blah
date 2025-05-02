package src.items;

public class Hoe extends Equipment {
    public Hoe(String hoeName, Gold sellPrice, Gold buyPrice, int useEnergy){
        super(hoeName, sellPrice, buyPrice, useEnergy, "Hoe");
    }

    public void use(){
        System.out.println("Hoe something...");
    }
}
