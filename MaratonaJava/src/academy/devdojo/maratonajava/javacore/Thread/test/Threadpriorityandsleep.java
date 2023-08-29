package academy.devdojo.maratonajava.javacore.Thread.test;

import academy.devdojo.maratonajava.javacore.Thread.folderToThreads.ThreadRunnableExemple;

@SuppressWarnings("all")
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
