package academy.devdojo.maratonajava.javacore.Competition.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import academy.devdojo.maratonajava.javacore.Competition.domain.Discount;
import academy.devdojo.maratonajava.javacore.Competition.domain.Quoto;

public class StoreServiceWithDiscountReal {

    public String getpriceSync(String storeName) {
        double price = princeGenerator();
        Discount.Code discontCode = Discount.Code.values()[
            ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
            ];
        return String.format("%s:%.2f:%s", storeName, price, discontCode);
    }

    public String applyDiscount(Quoto quoto){
        delay();
        double discontValue = quoto.getPrice() * (100 - quoto.getDiscountCode().getPercentege()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'", 
        quoto.getStore(),
        quoto.getPrice(),
        quoto.getDiscountCode(),
        discontValue);
    }

    private double princeGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
