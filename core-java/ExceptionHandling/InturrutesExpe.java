package ExceptionHandling;

import static java.lang.Thread.*;

public class InturrutesExpe {
    static void main() {
        System.out.println("anis");
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("cannot devide");
                System.out.println(e);
            }
            System.out.println("rahman");
        }
    }
}
