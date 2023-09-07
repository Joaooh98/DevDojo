package academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.domain;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.enumC.Country;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.face.Currency;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch(country){
            case USA:
                return new Dollar();
            case BRAZIL:
                return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
