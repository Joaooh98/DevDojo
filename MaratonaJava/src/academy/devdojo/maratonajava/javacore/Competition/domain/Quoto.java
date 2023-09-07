package academy.devdojo.maratonajava.javacore.Competition.domain;

import java.math.BigDecimal;

import academy.devdojo.maratonajava.javacore.Competition.domain.Discount.Code;

@SuppressWarnings("all")
public class Quoto {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;

    public Quoto(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;

    }

    /*
     * @param value containing storeName:price:discountCode
     * 
     * @return new Quoto with values from @param value
     */
    public static Quoto newQuoto(String value) {
        String[] values = value.split(":");
        String result = values[1].replace(",", ".");
        return new Quoto(values[0], Double.parseDouble(result), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quoto {" +
                "store= '" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }

}
