package academy.devdojo.maratonajava.javacore.Class42Formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class NumberFormatTest04 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1_000.2130";

        String valorSemCaracter = "10002130";  

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(nfa[0].parse(valorSemCaracter));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
