package JAVA_8.DateAndTimeAPI;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDateT2 {
    static void main() {
        LocalDateTime st = LocalDateTime.of(2003,12, 14, 7 , 45);
        System.out.println(st);
        LocalDateTime end =LocalDateTime.now();
        System.out.println(end);
        Duration d = Duration.between(st,end);
        System.out.println(d);
        System.out.println(d.toDays()/365);
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
    }
}
