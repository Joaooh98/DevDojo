package academy.devdojo.maratonajava.javacore.Competition.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private int count;

    private AtomicInteger atomicInteger = new AtomicInteger();

    public void increment() {
        count++;
        atomicInteger.incrementAndGet();
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public int getCount() {
        return count;
    }
}
