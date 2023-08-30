package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Competition.service.StoreService;


public class CompletableFutureTestTwo {
    public static void main(String[] args) {
        var storeService = new StoreService();
        searchPricesyncCompletableFuture(storeService);
        System.out.println("----------------------------\n");
        searchPriceAsyncCompletableFuture(storeService);
        System.out.println("---------------------\n");
    }

    private static void searchPricesyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store One","Store two", "Store three","Store for");

        List<Double> prices = stores.stream()
                .map(storeService:: getPricesAsyncCompletableFuture)
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

                System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store One","Store two", "Store three","Store for");

        List<CompletableFuture<Double>> completableFutures = stores.stream().map(storeService:: getPricesAsyncCompletableFuture).collect(Collectors.toList());
        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

                System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
