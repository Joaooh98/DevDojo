package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Test06LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 07, 01, 1, 1);
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:59:59");

        System.out.println(localDateTime);

        System.out.println(date);
        System.out.println(time);

        LocalDateTime cancatenaDatapTime = date.atTime(time);
        LocalDateTime cancatenaTimepDate = time.atDate(date);

        System.out.println(cancatenaDatapTime);
        System.out.println(cancatenaTimepDate);


        var teste = localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli(); // converte para milissegundos
         System.out.println(teste);

        var teste2 = localDateTime.plusDays(1).toInstant(ZoneOffset.UTC); // converte para milissegundos
         System.out.println(teste2);
 
    }
}
// toInstant(ZoneOffset.UTC).toEpochMilli()