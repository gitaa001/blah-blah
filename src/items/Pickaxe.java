package src.items;

public class Pickaxe extends Equipment {
    public Pickaxe(String pickName, Gold sellPrice, Gold buyPrice, int useEnergy){
        super(pickName, sellPrice, buyPrice, useEnergy, "Pickaxe");
    }

    public void use(){
        System.out.println("Mine something...");
    }  
}
