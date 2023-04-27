package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
// duration nao aceita LocalDate
public class Test03Duration {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        var nowAFterTwoYears = LocalDateTime.now().plusYears(2);
        var timeNow = LocalTime.now();
        var timeMinus7Hours = LocalTime.now().minusHours(7);
        var d1 = Duration.between(now, nowAFterTwoYears);
        var d2 = Duration.between(timeNow, timeMinus7Hours);
        var d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        var d4 = Duration.ofDays(20);
        var d5 = Duration.ofMinutes(3);
        var d6 = Duration.of(3, ChronoUnit.HOURS);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        System.out.println(now);
        System.out.println(nowAFterTwoYears);
        // revisar essa aula 
        
    }
}
