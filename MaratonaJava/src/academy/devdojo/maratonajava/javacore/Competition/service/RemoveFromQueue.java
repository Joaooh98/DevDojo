package academy.devdojo.maratonajava.javacore.Competition.service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class RemoveFromQueue implements Runnable {
    private final BlockingQueue<String> bq;

    public RemoveFromQueue(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
