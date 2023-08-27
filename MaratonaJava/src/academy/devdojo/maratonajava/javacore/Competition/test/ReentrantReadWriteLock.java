package academy.devdojo.maratonajava.javacore.Competition.test;

import academy.devdojo.maratonajava.javacore.Competition.service.MapReadWrite;


public class ReentrantReadWriteLock {
    public static void main(String[] args) {
        var rwl = new java.util.concurrent.locks.ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable writer = () ->{
            for (int i = 0; i < 20; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () ->{
            if (rwl.isWriteLocked()) {
                System.out.println("write LOCKED!");
            }
            rwl.readLock().lock();   
            System.out.println("FINALLY I GOT THE DAWM LOCK");
            try {
                System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
            } finally {
                rwl.readLock().lock();   
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);

        t1.start();
        t2.start();
        t3.start();
        
    }
}
