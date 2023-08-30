package academy.devdojo.maratonajava.javacore.Competition.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreService {
    
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getpriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return princeGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::princeGenerator);
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::princeGenerator);
    }

    public void shutdown(){
        ex.shutdown();
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
