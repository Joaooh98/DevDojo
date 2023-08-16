package academy.devdojo.maratonajava.javacore.Thread.test;

@SuppressWarnings("all")
class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

    class ThreadRunnableExemple implements Runnable {
    private char c;

    public ThreadRunnableExemple(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            } try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threadpriorityandsleep {
    public static void main(String[] args) {
        var t1 = new Thread(new ThreadRunnableExemple('A'),"T1A");
        var t2 = new Thread(new ThreadRunnableExemple('B'),"T2B");
        var t3 = new Thread(new ThreadRunnableExemple('C'),"T3C");
        var t4 = new Thread(new ThreadRunnableExemple('D'),"T4D");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("#######################"+Thread.currentThread().getName());
    }
}
