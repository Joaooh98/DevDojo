package academy.devdojo.maratonajava.javacore.Thread.test;

import academy.devdojo.maratonajava.javacore.Thread.folderToThreads.ThreadExample;

@SuppressWarnings("all")
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
