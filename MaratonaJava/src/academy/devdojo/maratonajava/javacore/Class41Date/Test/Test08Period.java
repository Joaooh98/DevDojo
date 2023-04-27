package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test08Period {
    public static void main(String[] args) {
        // formato  PDD/MM/YY PDIAS/MES/ANO
        var CurrentDate =  LocalDate.now();
        var NowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(24);

        var p1 = Period.between(CurrentDate, NowAfterTwoYears);
        var p2 = Period.ofDays(10);
        var p3 = Period.ofWeeks(58);
        var p4 = Period.ofMonths(3);
        var p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(p3.getMonths()); // valor que retorna esta errado 
        System.out.println(Period.between(CurrentDate, CurrentDate.plusDays(p3.getDays())).getMonths());/// errado tbm 

        System.out.println(CurrentDate.until(CurrentDate.plusDays(p3.getDays()),ChronoUnit.DAYS)); 


    }
}
