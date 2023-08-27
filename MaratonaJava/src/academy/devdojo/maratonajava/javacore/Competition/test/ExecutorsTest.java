package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import academy.devdojo.maratonajava.javacore.Competition.domainTwo.Printer;

public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorServiceOne = Executors.newCachedThreadPool();
        ExecutorService executorServiceTwo = Executors.newSingleThreadExecutor(); // execunta e termina e passa para proxima

        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.shutdown(); // para parar o processamento
        
        executorServiceOne.execute(new Printer(1));
        executorServiceOne.execute(new Printer(2));
        executorServiceOne.execute(new Printer(3));
        executorServiceOne.execute(new Printer(4));
        executorServiceOne.shutdown();

        executorServiceTwo.execute(new Printer(1));
        executorServiceTwo.execute(new Printer(2));
        executorServiceTwo.execute(new Printer(3));
        executorServiceTwo.execute(new Printer(4));
        executorServiceTwo.shutdown();

        // necessario comentar para executar cada thread separada.
    }
}
