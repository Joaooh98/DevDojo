package academy.devdojo.maratonajava.javacore.Thread.test;

import academy.devdojo.maratonajava.javacore.Thread.folderToThreads.ThreadRunnableExemple2;

public class Threadyieldjoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadRunnableExemple2("KA"));
        Thread t2 = new Thread(new ThreadRunnableExemple2("ME"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
    }
}
