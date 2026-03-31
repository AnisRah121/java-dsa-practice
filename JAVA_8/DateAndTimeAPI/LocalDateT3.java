package JAVA_8.DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateT3 {
    static void main() {
        ZonedDateTime a = ZonedDateTime.now();
        System.out.println(a);
        ZonedDateTime b = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(b);
        ZonedDateTime c = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(c);


    }
}
