package academy.devdojo.maratonajava.javacore.Competition.domainTwo;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void add(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Email adicionado na lista");
            this.emails.add(email);
            lock.newCondition().signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Checking if there are emails ");
        lock.lock();
        try {
            while (this.emails.size() == 0) {
                if (!open)
                    break;
                System.out.println(Thread.currentThread().getName() + " There is no email on the list ");
                lock.newCondition().await();
                ;
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(
                    Thread.currentThread().getName() + "Notifying everyone that we are no longer receiving emails");

        } finally {
            lock.unlock();
        }
    }
}
