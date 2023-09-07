package academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.test;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.domain.CurrencyFactory;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.enumC.Country;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.face.Currency;


// https://refactoring.guru/pt-br/design-patterns/factory-method

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currencyBr = CurrencyFactory.newCurrency(Country.BRAZIL);
        Currency currencyUs = CurrencyFactory.newCurrency(Country.USA);

        System.out.println(currencyBr.getSymbol());
        System.out.println(currencyUs.getSymbol());
    }
}
