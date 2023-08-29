package academy.devdojo.maratonajava.javacore.Thread.test;

import academy.devdojo.maratonajava.javacore.Thread.folderToThreads.ThreadSanames;

public class ThreadSafe {
    public static void main(String[] args) {
        var threadSanames = new ThreadSanames();
        threadSanames.add("Junkrat");
        Runnable r = threadSanames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
