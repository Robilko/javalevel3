package Lesson5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private static CountDownLatch start;
    private static CountDownLatch finish;
    private static final AtomicBoolean HAS_WIN = new AtomicBoolean(false);
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(CountDownLatch start, CountDownLatch finish, Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        Car.start = start;
        Car.finish = finish;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            start.countDown();
            start.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        synchronized (HAS_WIN) {
            if (!HAS_WIN.get()) {
                HAS_WIN.set(true);
                System.out.println(this.name + " WIN");
            }
        }
        finish.countDown();
    }
}