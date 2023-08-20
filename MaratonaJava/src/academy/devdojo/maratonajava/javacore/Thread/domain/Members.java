package academy.devdojo.maratonajava.javacore.Thread.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void add(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Email adicionado na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retriveEmail() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " Checking if there are emails ");
        synchronized(this.emails){
            while (this.emails.size() == 0) {
                if (!open) break;
                    System.out.println(Thread.currentThread().getName() + " There is no email on the list ");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + "Notifying everyone that we are no longer receiving emails");
        }
    }
}
