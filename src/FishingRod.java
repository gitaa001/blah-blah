package src;

public class FishingRod extends Equipment {
    public FishingRod(String rodName, Gold sellPrice, Gold buyPrice, int useEnergy){
        super(rodName, sellPrice, buyPrice, useEnergy, "FishingRod");
    }

    public void use(){
        System.out.println("Fish something...");
    }
}
