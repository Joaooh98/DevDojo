package academy.devdojo.maratonajava.javacore.Thread.folderToThreads;

public class ThreadRunnableExemple implements Runnable {
    private char c;

    public ThreadRunnableExemple(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            } try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
