package academy.devdojo.maratonajava.javacore.Competition.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceDeprecated {

    public double getpriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return princeGenerator();
    }

    private double princeGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
