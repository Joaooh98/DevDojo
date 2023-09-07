package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import academy.devdojo.maratonajava.javacore.Competition.domain.Quoto;
import academy.devdojo.maratonajava.javacore.Competition.service.StoreServiceWithDiscountReal;

@SuppressWarnings("all")
public class CompletableFutureTestSix {
    public static void main(String[] args) {
        var service = new StoreServiceWithDiscountReal();
        searchPricesWithDiscountASync(service);
    }

    private static void searchPricesWithDiscountASync(StoreServiceWithDiscountReal service) {

        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        var collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getpriceSync(s)))
                .map(cf -> cf.thenApply(Quoto::newQuoto))
                .map(cf -> cf.thenCompose(quoto -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quoto))))
                .map(cf -> cf.thenAccept(
                        store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

        CompletableFuture<Void> allOf = CompletableFuture.allOf(collect);
        CompletableFuture<Object> anyOf = CompletableFuture.anyOf(collect);
        anyOf.join();
        // allOf.join();

        // System.out.printf("finished? %b$n", allOf.isDone());
        System.out.printf("finished? %b$n", anyOf.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

}
