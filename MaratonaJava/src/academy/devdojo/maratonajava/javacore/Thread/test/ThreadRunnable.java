package academy.devdojo.maratonajava.javacore.Thread.test;

@SuppressWarnings("all")
class ThreadExample extends Thread {
    private char c;

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

    public ThreadRunnableExemple(char c){
    this.c = c;
    }   

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
        System.out.print(c);
        if (i % 100 == 0) {
            System.out.println();
        }
        }
    }
}


public class ThreadRunnable {
    public static void main(String[] args) {
        var t1 = new Thread(new ThreadRunnableExemple('A'));
        var t2 = new Thread(new ThreadRunnableExemple('B'));
        var t3 = new Thread(new ThreadRunnableExemple('C'));
        var t4 = new Thread(new ThreadRunnableExemple('D'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
