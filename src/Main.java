package src;

import java.util.HashMap;
import java.util.Map;

import src.items.Crop;
import src.items.Equipment;
import src.items.Fish;
import src.items.FishingRod;
import src.items.Food;
import src.items.Gold;
import src.items.Hoe;
import src.items.Inventory;
import src.items.Misc;
import src.items.Seed;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi inventory
        Map<Class<?>, Map<String, Integer>> initialStorage = new HashMap<>();
        initialStorage.put(Fish.class, new HashMap<>());
        initialStorage.put(Crop.class, new HashMap<>());
        initialStorage.put(Seed.class, new HashMap<>());
        initialStorage.put(Food.class, new HashMap<>());
        initialStorage.put(Equipment.class, new HashMap<>());
        initialStorage.put(Misc.class, new HashMap<>());

        Inventory inventory = new Inventory(initialStorage);

        // Membuat beberapa item contoh
        Gold gold5 = new Gold(5);
        Gold gold10 = new Gold(10);
        Gold gold20 = new Gold(20);
        Gold gold30 = new Gold(30);
        Gold gold40 = new Gold(40);
        Gold gold50 = new Gold(50);
        Gold gold60 = new Gold(60);
        Gold gold80 = new Gold(80);
        Gold gold100 = new Gold(100);
        Gold gold120 = new Gold(120);

        Fish salmon = new Fish("Salmon", "06:00-18:00", "River", gold50, "Common");
        Crop wheat = new Crop("Wheat", gold10, gold5, 3);
        Food bread = new Food("Bread", 20, gold30, gold100);
        FishingRod basicRod = new FishingRod("Basic Rod", gold40, gold80, 10);
        Hoe ironHoe = new Hoe("Iron Hoe", gold60, gold120, 5);
        Seed tomatoSeed = new Seed("Tomato Seed", gold100, 5, "Summer");
        Seed pumpkinSeed = new Seed("Pumpkin Seed", gold20, 7, "Fall");

        // Menambahkan item ke inventory
        System.out.println("\nMenambahkan item ke inventory...");
        inventory.addItem(salmon, 5);
        inventory.addItem(wheat, 10);
        inventory.addItem(bread, 3);
        inventory.addItem(basicRod, 1);
        inventory.addItem(ironHoe, 1);
        inventory.addItem(tomatoSeed, 8);
        inventory.addItem(pumpkinSeed, 5);

        // Menampilkan inventory
        System.out.println("\nInventory setelah penambahan:");
        inventory.printInventory();

        // Mengecek jumlah item tertentu
        System.out.println("\nMengecek jumlah item:");
        System.out.println("Jumlah Salmon: " + inventory.getItemAmount(salmon));
        System.out.println("Jumlah Wheat: " + inventory.getItemAmount(wheat));
        System.out.println("Jumlah Bread: " + inventory.getItemAmount(bread));
        System.out.println("Jumlah Basic Rod: " + inventory.getItemAmount(basicRod));
        System.out.println("Jumlah Tomato Seed: " + inventory.getItemAmount(tomatoSeed));
        System.out.println("Jumlah Pumpkin Seed: " + inventory.getItemAmount(pumpkinSeed));

        // Menggunakan beberapa item
        System.out.println("\nMenggunakan item:");
        basicRod.use();
        ironHoe.use();

        // Menampilkan informasi seed
        System.out.println("\nInformasi Seed:");
        System.out.println("Tomato Seed - Harga Beli: " + tomatoSeed.getbuyPrice() + 
                          ", Hari Panen: " + tomatoSeed.getHarvestDays() + 
                          ", Musim: " + tomatoSeed.getSeason());
        System.out.println("Pumpkin Seed - Harga Beli: " + pumpkinSeed.getbuyPrice() + 
                          ", Hari Panen: " + pumpkinSeed.getHarvestDays() + 
                          ", Musim: " + pumpkinSeed.getSeason());

        // Menghapus item dari inventory
        System.out.println("\nMenghapus item dari inventory...");
        inventory.removeItem(salmon, 2);
        inventory.removeItem(wheat, 5);
        inventory.removeItem(bread, 1);
        inventory.removeItem(tomatoSeed, 3);
        inventory.removeItem(pumpkinSeed, 2);

        // Menampilkan inventory setelah penghapusan
        System.out.println("\nInventory setelah penghapusan:");
        inventory.printInventory();
    }
}