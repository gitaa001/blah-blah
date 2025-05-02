package src;
import java.lang.Thread;

public class Time implements Runnable{
    private int hour = 6;
    private int minute = 0;
    private int day = 1;
    private int lastDay = 1;
    private boolean running = true;
    Season season;
    Weather weather;

    public Time() {
        Thread timeThread = new Thread(this);
        season = new Season();
        weather = new Weather();
        timeThread.start();
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
                advanceTime(5);
                changeDay();
                if (day % 10 == 0) {
                    season.changeSeaons();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    

    private synchronized void advanceTime(int minutesToAdd) {
        minute += minutesToAdd;
        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }
        if (hour >= 24) {
            hour = hour % 24;
            day++;
        }
    }

    public synchronized void skipTimeHour(int hoursToAdd) {
        hour += hoursToAdd;
        if (hour >= 24) {
            hour = hour % 24;
            day++;
        }
    }
    public synchronized void skipTimeMinute(int minuteToAdd) {
        advanceTime(minuteToAdd);
    }

    public synchronized String getCurrentTime() {
        return String.format("%02d:%02d", hour, minute);
    }

    public synchronized int getDay() {
        return day;
    }

    public synchronized int getHour() {
        return hour;
    }

    public synchronized int getMinute() {
        return minute;
    }

    public synchronized void changeDay(){
        if (day > lastDay) {
            System.out.println("Day-" + day + " has started");
            weather.nextDayWeather();
            lastDay = day;
        }
    }

    public synchronized boolean isDay() {
        return hour >= 6 && hour <= 17;
    }

    public synchronized boolean isNight() {
        return !isDay();
    }

    public void stopTime() {
        running = false;
    }
}
