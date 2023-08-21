package academy.devdojo.maratonajava.javacore.Competition.test;

import academy.devdojo.maratonajava.javacore.Competition.domain.Counter;

public class AtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        var counter = new Counter();

        Runnable r = () ->{
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount()+ " Operation not atomic");
        System.out.println(counter.getAtomicInteger()+ " Operation atomic");
    }
}
