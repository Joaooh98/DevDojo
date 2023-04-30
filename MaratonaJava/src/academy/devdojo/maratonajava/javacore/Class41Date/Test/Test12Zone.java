package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class Test12Zone {
    public static void main(String[] args) {
        Map<String, String> shortids = ZoneId.SHORT_IDS;
        System.out.println(shortids);
        System.out.println(ZoneId.systemDefault());
        var Tokyozone = ZoneId.of("Asia/Tokyo");
        System.out.println(Tokyozone);

        var now = LocalDateTime.now();
        System.out.println(now);

        var zonedDateTime0 = now.atZone(Tokyozone);
        System.out.println(zonedDateTime0);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        var zonedDateTime1 = nowInstant.atZone(Tokyozone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        var offsetManaus = ZoneOffset.of("-04:00");
        var offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);

        var offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        var offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        var japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijeEralLocalDate = LocalDate.of(1900 , 2, 1);
        var meijeEra = JapaneseDate.from(meijeEralLocalDate); 
        System.out.println(meijeEra);
    }
}
