package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import academy.devdojo.maratonajava.javacore.Competition.service.StoreService;

public class CompletableFutureTest {
    public static void main(String[] args) {
        var storeService = new StoreService();
        searchPriceSync(storeService);
        System.out.println("---------------------\n");
        searchPriceAsyncFuture(storeService);
        System.out.println("---------------------\n");
        searchPriceAsyncCompletableFuture(storeService);
        System.out.println("---------------------\n");
    }

    private static void searchPriceSync(StoreService storeService) {
        long start = System.currentTimeMillis();

        System.out.println(storeService.getpriceSync("Store one"));
        System.out.println(storeService.getpriceSync("Store two"));
        System.out.println(storeService.getpriceSync("Store three"));
        System.out.println(storeService.getpriceSync("Store for"));

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPriceAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        Future<Double> pricesAsyncFutureOne = storeService.getPricesAsyncFuture("Store one");
        Future<Double> pricesAsyncFutureTwo = storeService.getPricesAsyncFuture("Store two");
        Future<Double> pricesAsyncFutureThree = storeService.getPricesAsyncFuture("Store three");
        Future<Double> pricesAsyncFutureFor = storeService.getPricesAsyncFuture("Store for");

        try {

            System.out.println(pricesAsyncFutureOne.get());
            System.out.println(pricesAsyncFutureTwo.get());
            System.out.println(pricesAsyncFutureThree.get());
            System.out.println(pricesAsyncFutureFor.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        storeService.shutdown();
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        CompletableFuture<Double> pricesAsyncFutureOne = storeService.getPricesAsyncCompletableFuture("Store one");
        CompletableFuture<Double> pricesAsyncFutureTwo = storeService.getPricesAsyncCompletableFuture("Store two");
        CompletableFuture<Double> pricesAsyncFutureThree = storeService.getPricesAsyncCompletableFuture("Store three");
        CompletableFuture<Double> pricesAsyncFutureFor = storeService.getPricesAsyncCompletableFuture("Store for");



            System.out.println(pricesAsyncFutureOne.join());
            System.out.println(pricesAsyncFutureTwo.join());
            System.out.println(pricesAsyncFutureThree.join());
            System.out.println(pricesAsyncFutureFor.join());


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
