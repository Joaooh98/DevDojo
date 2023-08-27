package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        // CucurrentLikedQueue, SynchronousQueue, LinkedBlockingQueue
        // LinkedTransferQueue tem todas as funcoes das classes acima 
        TransferQueue<Object> tp = new LinkedTransferQueue<>();
        System.out.println(tp.add("John"));
        System.out.println(tp.offer("John"));
        System.out.println(tp.offer("John", 10, TimeUnit.SECONDS));

        tp.put("Developer");
        if (tp.hasWaitingConsumer()){
            
            tp.transfer("developer");
        }
        System.out.println(tp.tryTransfer("Academy"));
        System.out.println(tp.remainingCapacity());
        System.out.println(tp.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tp.element());
        System.out.println(tp.peek());
        System.out.println(tp.poll());
        System.out.println(tp.remove());
        System.out.println(tp.take());
    }    
}
