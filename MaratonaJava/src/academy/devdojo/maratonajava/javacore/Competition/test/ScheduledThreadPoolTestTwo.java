package academy.devdojo.maratonajava.javacore.Competition.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTestTwo {
    private static final ScheduledExecutorService serv = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper(){
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + "beep");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ScheduledFuture<?> scheduleWithFixedDelay = serv.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        serv.schedule( () ->{
            System.out.println("cancel scheduleWithFixedDelay");
            scheduleWithFixedDelay.cancel(false);
            serv.shutdown();
        }, 20, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formatter));
        beeper();
    }
}
