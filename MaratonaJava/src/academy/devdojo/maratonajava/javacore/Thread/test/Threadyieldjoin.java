package academy.devdojo.maratonajava.javacore.Thread.test;

class ThreadRunnableExemple2 implements Runnable {
    private final String c;

    public ThreadRunnableExemple2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            } 
        }
    }
}

public class Threadyieldjoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadRunnableExemple2("KA"));
        Thread t2 = new Thread(new ThreadRunnableExemple2("ME"));
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
