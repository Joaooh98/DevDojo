package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import academy.devdojo.maratonajava.javacore.Competition.domainTwo.RandomNumber;

public class CallableOne {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        var randomNumber = new RandomNumber();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit = executorService.submit(randomNumber);
        String s = submit.get();
        System.out.printf("progam finished", s);
        executorService.shutdown();
    }
}
