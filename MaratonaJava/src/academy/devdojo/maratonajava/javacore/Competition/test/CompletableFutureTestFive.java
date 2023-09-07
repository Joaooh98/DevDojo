package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Competition.domain.Quoto;
import academy.devdojo.maratonajava.javacore.Competition.service.StoreServiceWithDiscount;

public class CompletableFutureTestFive {
    public static void main(String[] args) {
        var service = new StoreServiceWithDiscount();
        searchPricesWithDiscountASync(service);
    }

    private static void searchPricesWithDiscountASync(StoreServiceWithDiscount service) {

        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<String>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getpriceSync(s)))
                .map(cf -> cf.thenApply(Quoto::newQuoto))
                .map(cf -> cf.thenCompose(quoto -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quoto))))
                .collect(Collectors.toList());

        collect.stream().map(CompletableFuture::join).forEach(System.out::print);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

}
