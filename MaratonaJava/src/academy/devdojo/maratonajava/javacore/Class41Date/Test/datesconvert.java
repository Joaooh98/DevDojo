package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class datesconvert {

    public static void main(String[] args) throws Exception {
        DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter
                .ofPattern("MM/dd/yyyy'T'HH:mm:ss:SSS z");

        // Date string with zone information
        String dateString = "08/03/2019T16:20:17:717 UTC+05:30";

        // Instance with given zone
        ZonedDateTime zdtInstanceAtOffset = ZonedDateTime.parse(dateString, DATE_TIME_FORMATTER);

        // Instance in UTC
        ZonedDateTime zdtInstanceAtUTC = zdtInstanceAtOffset.withZoneSameInstant(ZoneOffset.UTC);

        // Formatting to string
        String dateStringInUTC = zdtInstanceAtUTC.format(DATE_TIME_FORMATTER);

        System.out.println(zdtInstanceAtOffset);
        System.out.println(zdtInstanceAtUTC);
        System.out.println(dateStringInUTC);

        // Convert ZonedDateTime to instant which is in UTC
        System.out.println(zdtInstanceAtOffset.toInstant());
    }
}
