package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test13LocalDate {
    public static void main(String[] args) {
        // dataConsultaInicialFormatada = DateTimeFormatter("yyyy-MM-dd");
        // String data = "25/06/2023";

        // var convertido = LocalDate.parse(data);

        // System.out.println(convertido);

        String timeColonPattern = "HH:mm:ss SSS";
        DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern(timeColonPattern);
        LocalTime colonTime = LocalTime.of(17, 35, 50).plus(329, ChronoUnit.MILLIS);
        System.out.println(timeColonFormatter.format(colonTime));
    }
}
