package academy.devdojo.maratonajava.javacore.Thread.test;

import academy.devdojo.maratonajava.javacore.Thread.folderToThreads.ThreadExample;

@SuppressWarnings("all")
public class ThreadStart {
    public static void main(String[] args) {
        var t1 = new ThreadExample('A');
        var t2 = new ThreadExample('B');
        var t3 = new ThreadExample('C');
        var t4 = new ThreadExample('D');

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
