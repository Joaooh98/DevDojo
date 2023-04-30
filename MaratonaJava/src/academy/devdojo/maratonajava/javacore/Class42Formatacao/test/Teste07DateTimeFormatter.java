package academy.devdojo.maratonajava.javacore.Class42Formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
// obs: Quando e identificado a palavra "format" significa que esta sendo transformado do objeto para uma String
        // Se for a palavra "parse" está sendo transformado de uma String para objeto. 
public class Teste07DateTimeFormatter {
    public static void main(String[] args) {
        LocalDate date =  LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20230430", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-04-30+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2023-04-30", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2023-04-30T09:34:10.137593", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("30/04/2023",formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);

        LocalDate parseGR = LocalDate.parse("30.April.2023", formatterGR);
        System.out.println(parseGR);
    }
}
