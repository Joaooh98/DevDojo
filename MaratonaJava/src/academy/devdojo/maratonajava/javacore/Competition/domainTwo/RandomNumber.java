package academy.devdojo.maratonajava.javacore.Competition.domainTwo;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber implements Callable<String> {

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callable.. ", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), count);
    }

}
