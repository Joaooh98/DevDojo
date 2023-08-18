package academy.devdojo.maratonajava.javacore.Thread.test;

public class ThreadDeadlock {
    public static void main(String[] args) {
        Object lockOne = new Object();
        Object lockTwo = new Object();

        Runnable r1 = () -> {
            synchronized (lockOne) {
                System.out.println("thread 1: Segurando lock 1 ");
                System.out.println("thread 1: Esperando lock 2 ");
                synchronized (lockTwo) {
                    System.out.println("thread 1: Segurando lock 1 ");

                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lockTwo) {
                System.out.println("thread 2: Segurando lock 1 ");
                System.out.println("thread 2: Esperando lock 2 ");
                synchronized (lockOne) {
                    System.out.println("thread 2: Segurando lock 1 ");
                }
            }
        };

        new Thread(r1).start(); 
        new Thread(r2).start(); 
    }
}
