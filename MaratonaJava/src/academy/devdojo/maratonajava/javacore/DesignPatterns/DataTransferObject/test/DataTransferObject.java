package academy.devdojo.maratonajava.javacore.DesignPatterns.DataTransferObject.test;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Build.domain.Person;
import academy.devdojo.maratonajava.javacore.DesignPatterns.DataTransferObject.ReportDto;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.domain.CurrencyFactory;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.enumC.Country;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.face.Currency;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.domain.Aircraft;

public class DataTransferObject {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("AirMustang");
        Country brazil = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(brazil);
        var person = new Person.PersonBuilder()
                .firstName("Joao")
                .lastName("Carlos")
                .userName("JoaoCP")
                .email("joao@gmail.com")
                .build();

                ReportDto dto = new ReportDto.ReportBuilder()
                .aircraftName(aircraft.getName())
                .country(brazil)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

                System.out.println(dto);

    }
}
