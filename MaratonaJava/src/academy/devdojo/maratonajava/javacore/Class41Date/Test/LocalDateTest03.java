package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest03 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDate.html
        LocalDate  date = LocalDate.of(2023, Month.JANUARY, 01);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getClass());
        System.out.println(date.getMonthValue());
        System.out.println(date.getChronology());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date.get(ChronoField.DAY_OF_WEEK));
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));
        System.out.println(date);

        LocalDate agora = LocalDate.now();
        agora = agora.plusWeeks(4); //  unica forma de alterar o valor, visto que uma classe imutavel 
        System.out.println(agora); // busca a data atual de acordo com a zona que vc esta 
    
         
    }    
}
