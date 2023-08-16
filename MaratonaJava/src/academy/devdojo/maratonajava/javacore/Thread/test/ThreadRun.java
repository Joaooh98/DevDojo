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

public class ThreadRun {
    public static void main(String[] args) {
        var t1 = new ThreadExample('A');
        var t2 = new ThreadExample('B');
        var t3 = new ThreadExample('C');
        var t4 = new ThreadExample('D');

        t1.run();
        t1.start();
        // t1.start(); nao e permitido realizar 2x o start na
        t2.run();
        t3.run();
        t4.run();
    }
}
