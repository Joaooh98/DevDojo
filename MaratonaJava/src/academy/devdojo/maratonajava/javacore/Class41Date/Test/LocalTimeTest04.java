package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest04 {
    public static void main(String[] args) {
        LocalTime timeCurrent = LocalTime.now(); /// para mostra a hora atual
        System.out.println(timeCurrent);
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalTime.html
        LocalTime timeParam = LocalTime.of(23, 59,59);
        System.out.println(timeParam.getHour());
        System.out.println(timeParam.getMinute());
        System.out.println(timeParam.getSecond());
        System.out.println(timeParam.getNano());
        System.out.println(timeParam.getClass());
        System.out.println(timeParam.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
