package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.concurrent.locks.ReentrantLock;

import academy.devdojo.maratonajava.javacore.Competition.domain.Worker;

public class CompetitionReentrantLock {
    public static void main(String[] args) {
        var lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
    }
}
