package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CopyOnWrite {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        Runnable runnableInterator = ()->{
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnableRemouve = () ->{
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableInterator).start();
        new Thread(runnableRemouve).start();
    }
}
