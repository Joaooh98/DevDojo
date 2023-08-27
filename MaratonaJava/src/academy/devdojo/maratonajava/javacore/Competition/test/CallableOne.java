package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import academy.devdojo.maratonajava.javacore.Competition.domainTwo.RandomNumber;

public class CallableOne {
    public static void main(String[] args) {
        var randomNumber = new RandomNumber();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit = executorService.submit(randomNumber);
        System.out.println(submit);
    }
}
