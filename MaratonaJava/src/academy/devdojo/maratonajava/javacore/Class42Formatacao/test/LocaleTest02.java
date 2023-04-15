package academy.devdojo.maratonajava.javacore.Class42Formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {

        Locale localItalia = new Locale("it", "IT");
        Locale localSuica = new Locale("ch", "CH");
        Locale localIndia = new Locale("hi", "IN");
        Locale localJapao = new Locale("ja", "JP");
        Locale localholanda = new Locale("in", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat dfItalia = DateFormat.getDateInstance(DateFormat.FULL, localItalia);
        System.out.println(
                "ITALIA: " + dfItalia.format(calendar.getTime()) + " " + localItalia.getDisplayCountry(localItalia));
        System.out.println(localItalia.getDisplayCountry(localItalia));
        //              pais que deseja                   liguagem

        DateFormat dfCH = DateFormat.getDateInstance(DateFormat.FULL, localSuica);
        System.out
                .println("SUIÇA: " + dfCH.format(calendar.getTime()) + " " + localSuica.getDisplayCountry(localSuica));
        System.out.println(localSuica.getDisplayCountry(localItalia));

        DateFormat dfIndia = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        System.out.println(
                "INDIA: " + dfIndia.format(calendar.getTime()) + " " + localIndia.getDisplayCountry(localIndia));
        System.out.println(localIndia.getDisplayCountry(localItalia));

        DateFormat dfJapao = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
        System.out.println(
                "JAPÃO: " + dfJapao.format(calendar.getTime()) + " " + localJapao.getDisplayCountry(localJapao));
        System.out.println(localJapao.getDisplayCountry(localItalia));

        DateFormat dfholanda = DateFormat.getDateInstance(DateFormat.FULL, localholanda);
        System.out.println("HOLANDA : " + dfholanda.format(calendar.getTime()) + " "
                + localholanda.getDisplayCountry(localholanda));
        System.out.println(localholanda.getDisplayCountry(localItalia));

    }
}
