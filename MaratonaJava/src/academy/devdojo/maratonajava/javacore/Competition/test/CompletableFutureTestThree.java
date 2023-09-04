package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Competition.service.StoreServiceDeprecated;

public class CompletableFutureTestThree {
    public static void main(String[] args) {
        var storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesyncCompletableFuture(storeServiceDeprecated);

    }

    private static void searchPricesyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store One","Store two", "Store three","Store for");

        List<CompletableFuture<Double>> completableF = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getpriceSync(s))).collect(Collectors.toList());

                completableF.stream().map(CompletableFuture::join).collect(Collectors.toList());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
