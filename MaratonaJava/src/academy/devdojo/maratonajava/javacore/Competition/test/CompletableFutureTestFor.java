package academy.devdojo.maratonajava.javacore.Competition.test;

import java.util.List;

import academy.devdojo.maratonajava.javacore.Competition.domain.Quoto;
import academy.devdojo.maratonajava.javacore.Competition.service.StoreServiceWithDiscount;

public class CompletableFutureTestFor {
    public static void main(String[] args) {
        var service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Store 1","Store 2","Store 3", "Store 4");
        // stores.forEach(s -> System.out.print("\n"+service.getpriceSync(s)));
        stores.stream()
        .map(service::getpriceSync)
        .map(Quoto::newQuoto)
        .map(service::applyDiscount)
        .forEach(System.out::println);
    }
}
