package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterOproximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch(dayOfWeek){
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class Test11TemporalAdjustersEX {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now); // data atual
        System.out.println(now.getDayOfWeek()); // dia da semana

        now = LocalDate.now().with(new ObterOproximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new ObterOproximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(19).with(new ObterOproximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(20).with(new ObterOproximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(21).with(new ObterOproximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now().withDayOfYear(5).with(new ObterOproximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
