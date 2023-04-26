package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest09 {
    public static void main(String[] args) {
        var aniversario = LocalDateTime.of(1998, Month.JULY, 4, 9, 0, 0);
        var now = LocalDateTime.now();

        System.out.println("dias de vida: "+ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("total de semanas de vida: "+ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("total de meses de vida: "+ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Anos de vida: "+ChronoUnit.YEARS.between(aniversario, now));
    }
}
