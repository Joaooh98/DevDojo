package academy.devdojo.maratonajava.javacore.Thread.test;

import academy.devdojo.maratonajava.javacore.Thread.folderToThreads.ThreadRunnableExemple;

@SuppressWarnings("all")
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
