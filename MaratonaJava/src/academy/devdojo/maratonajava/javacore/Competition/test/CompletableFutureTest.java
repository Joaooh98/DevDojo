package academy.devdojo.maratonajava.javacore.Competition.test;

import academy.devdojo.maratonajava.javacore.Competition.service.StoreService;

public class CompletableFutureTest {
    public static void main(String[] args) {
        var storeService = new StoreService();
        searchPriceSync(storeService);
    }

    private static void searchPriceSync(StoreService storeService){
        long start = System.currentTimeMillis();

        System.out.println(storeService.getpriceSync("Store one"));
        System.out.println(storeService.getpriceSync("Store two"));
        System.out.println(storeService.getpriceSync("Store three"));
        System.out.println(storeService.getpriceSync("Store for"));

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }
}
