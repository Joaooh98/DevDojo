package academy.devdojo.maratonajava.javacore.Class42Formatacao.test;

import java.util.Locale;
import java.util.Set;
import java.util.Locale.IsoCountryCode;

public class LocaleTest03 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // retorna em qual lingua esta o seu computador
        String[] isoContries = Locale.getISOCountries();
        String[] isolanguages = Locale.getISOLanguages();
        
        Set<String> iso = Locale.getISOCountries(IsoCountryCode.PART1_ALPHA2);
               
        System.out.println(iso+"\n");
        
        System.out.println("Paises");
        for (String isoCountry : isoContries) {
            System.out.print(isoCountry+" ");
        }
        
        System.out.println("\n");
        System.out.println("Linguas");
        for (String isoLangague : isolanguages) {
            System.out.print(isoLangague + " ");
        }

    }
}