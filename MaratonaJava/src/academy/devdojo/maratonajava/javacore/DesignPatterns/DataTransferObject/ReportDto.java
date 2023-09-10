package academy.devdojo.maratonajava.javacore.DesignPatterns.DataTransferObject;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.enumC.Country;
import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.face.Currency;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String personName;

    private ReportDto(String aircraftName, Country country, Currency currency, String personName) {
        this.aircraftName = aircraftName;
        this.country = country;
        this.currency = currency;
        this.personName = personName;
    }

    public static class ReportBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        public ReportBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            return new ReportDto(aircraftName, country, currency, personName);
        }
    }

    @Override
    public String toString() {
        return "ReportDto [aircraftName=" + aircraftName + ", country=" + country + ", currencyFactory="
                + currency + ", personName=" + personName + "]";
    }

}
