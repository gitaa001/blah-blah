package src;

public class Main {
    public static void main(String[] args) {
        // Buat beberapa item Gold
        Gold gold1 = new Gold(100);
        Gold gold2 = new Gold(50);

        // Print Gold
        System.out.println("Gold 1 amount: " + gold1.getGold());
        System.out.println("Gold 2 amount: " + gold2.getGold());

        // Tambah dan kurang Gold
        gold1.addGold(25);
        gold2.subtractGold(10);
        System.out.println("Gold 1 after adding 25: " + gold1.getGold());
        System.out.println("Gold 2 after subtracting 10: " + gold2.getGold());

        // Buat item Crops
        Crops wheat = new Crops("Wheat", new Gold(20));
        System.out.println("Crops item: " + wheat.getItemName() + ", Type: " + wheat.getItemType() + ", Sell Price: " + wheat.getSellPrice());

        // Buat item Misc
        Misc rock = new Misc("Rock", "A useless but heavy stone");
        System.out.println("Misc item: " + rock.getItemName() + ", Type: " + rock.getItemType() + ", Description: " + rock.getItemDescription());

        // Tes setter di Item
        rock.setItemName("Big Rock");
        rock.setItemType("Rare Misc");
        System.out.println("Updated Misc item: " + rock.getItemName() + ", Type: " + rock.getItemType());
    }
}
