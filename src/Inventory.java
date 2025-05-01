package src;
import java.util.Map;
import java.util.HashMap;

public class Inventory {
    private Map<Class<?>, Map<String, Integer>> inventoryStorage = new HashMap<>();
    private static final Map<String, Class<?>> typeToClassMap = Map.of(
        "Fish", Fish.class,
        "Crop", Crop.class,
        "Seed", Seed.class,
        "Food", Food.class,
        "Equipment", Equipment.class,
        "Misc", Misc.class
    );

    public Inventory(Map<Class<?>, Map<String, Integer>> inventoryStorage){
        this.inventoryStorage = inventoryStorage;
    }

    public Map<Class<?>, Map<String, Integer>> getInventoryStorage(){
        return inventoryStorage;
    }

    public int getItemAmount(Item items) {
        String type = items.getItemType();
        String name = items.getItemName();
    
        Class<?> kelas = typeToClassMap.get(type);
        if (kelas == null) {
            System.out.println("Item type not registered");
            return 0;  
        }
        Map<String, Integer> storage = inventoryStorage.get(kelas);
        if (storage == null) {
            System.out.println("Storage for item type " + type + " not found.");
            return 0; 
        }
        return storage.getOrDefault(name, 0);  
    }
    

    public void addItem(Item addedItem, int amount) {
        String type = addedItem.getItemType();
        String name = addedItem.getItemName();
    
        Class<?> kelas = typeToClassMap.get(type);
        if (kelas != null) {
            int currentAmount = getItemAmount(addedItem);
            Map<String, Integer> storage = inventoryStorage.get(kelas);
            storage.put(name, currentAmount + amount);
        } else {
            System.out.println("Item type not registered");
        }
    }
    public void removeItem(Item removedItem, int amount) {
        String type = removedItem.getItemType();
        String name = removedItem.getItemName();
    
        Class<?> kelas = typeToClassMap.get(type);
        if (kelas != null) {
            int currentAmount = getItemAmount(removedItem);
    
            if (currentAmount == 0) {
                System.out.println("Item not found in inventory.");
                return;
            }
    
            int newAmount = currentAmount - amount;
            Map<String, Integer> storage = inventoryStorage.get(kelas);
    
            if (newAmount <= 0) {
                storage.remove(name);
            } else {
                storage.put(name, newAmount);
            }
        } else {
            System.out.println("Item type not registered");
        }
    }

    public void printInventory() {
        System.out.println("---------------------------------");
        
        for (Class<?> itemClass : typeToClassMap.values()) {
            Map<String, Integer> items = inventoryStorage.get(itemClass);
            
            if (items != null && !items.isEmpty()) {
                System.out.println("Items of type: " + itemClass.getSimpleName());
                
                // Iterasi melalui item dan jumlahnya
                for (Map.Entry<String, Integer> itemEntry : items.entrySet()) {
                    String itemName = itemEntry.getKey();
                    int itemAmount = itemEntry.getValue();
                    System.out.println("  " + itemName + ": " + itemAmount);
                }
                
                System.out.println("---------------------------------");
            }
        }
    }
}
