package src;

import src.tsw.Season;
import src.tsw.Time;
import src.tsw.Weather;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== TESTING ALL CLASSES =====");
        
        // Test Season class
        System.out.println("\n=== Testing Season Class ===");
        Season season = new Season();
        System.out.println("Initial season: " + season.getCurrentSeason());
        
        for (int i = 0; i < 5; i++) {
            season.changeSeaons();
            System.out.println("After change #" + (i+1) + ": " + season.getCurrentSeason());
        }
        
        // Test Weather class
        System.out.println("\n=== Testing Weather Class ===");
        Weather weather = new Weather();
        System.out.println("Initial weather: " + weather.getCurrentWeather());
        
        for (int i = 0; i < 3; i++) {
            weather.changeWeatherRandomly();
            System.out.println("Weather after change #" + (i+1) + ": " + weather.getCurrentWeather());
        }
        
        // Test Time class
        System.out.println("\n=== Testing Time Class ===");
        Time time = new Time();
        
        // Print initial time
        System.out.println("Initial time: " + time.getCurrentTime());
        System.out.println("Is day? " + time.isDay());
        System.out.println("Is night? " + time.isNight());
        System.out.println("Current day: " + time.getDay());
        
        // Test time skipping
        System.out.println("\nTesting time skipping:");
        System.out.println("Adding 30 minutes...");
        time.skipTimeMinute(30);
        System.out.println("Time after skip: " + time.getCurrentTime());
        
        System.out.println("Adding 2 hours...");
        time.skipTimeHour(2);
        System.out.println("Time after skip: " + time.getCurrentTime());
        
        System.out.println("Adding 39 hours to test day change...");
        time.skipTimeHour(39);
        System.out.println("Time after skip: " + time.getCurrentTime());
        System.out.println("Current day: " + time.getDay());
        
        // Let the time thread run for a while
        System.out.println("\nLetting time thread run for 15 seconds...");
        System.out.println("You should see day changes and weather changes in the output.");
        
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Stop the time thread
        System.out.println("\nStopping time thread...");
        time.stopTime();
        
        System.out.println("\n===== TESTING COMPLETE =====");
    }
}