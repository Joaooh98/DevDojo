package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class Test10TemporalAdjusters {
    public static void main(String[] args) {
        var now = LocalDate.now();
            System.out.println("\n--------\n");
        
        now = now.plusDays(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("\n--------\n");
        
        now = now.withDayOfMonth(20);
        System.out.println(now);
            System.out.println("\n--------\n");
        
        now = now.with(ChronoField.DAY_OF_MONTH, 18);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
            System.out.println("\n--------\n");
        
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
            System.out.println("\n--------\n");
        
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
            System.out.println("\n--------\n");
        
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
            System.out.println("\n--------\n");
        
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
            System.out.println("\n--------\n");
        
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
            System.out.println("\n--------\n");
        
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}