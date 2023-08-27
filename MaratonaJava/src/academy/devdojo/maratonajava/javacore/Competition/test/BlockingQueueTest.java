package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import academy.devdojo.maratonajava.javacore.Competition.service.RemoveFromQueue;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Joao");
        System.out.printf("%s added the value %s%n",Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Carlos");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }
}
