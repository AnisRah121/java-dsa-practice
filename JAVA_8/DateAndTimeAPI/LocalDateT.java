package JAVA_8.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateT {
    static void main() {
        LocalDate b = LocalDate.now();
        System.out.println(b);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime a = LocalDateTime.parse("2026-01-10T10:30:00");
        System.out.println(a);
    }
}
