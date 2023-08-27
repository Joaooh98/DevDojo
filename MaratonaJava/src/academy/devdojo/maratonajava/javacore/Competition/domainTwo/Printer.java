package academy.devdojo.maratonajava.javacore.Competition.domainTwo;

import java.util.concurrent.TimeUnit;

public class Printer implements Runnable{
    private final int num;
    

    public Printer(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        System.out.printf("%s inicio : %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finalizou %n", Thread.currentThread().getName());
    }
}
