package academy.devdojo.maratonajava.javacore.Competition.domain;

import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {

    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.printf("Thread %s entrou em uma sessao critica %n", name);
            System.out.printf("%d Threads esperando na fila", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
