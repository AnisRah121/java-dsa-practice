package JAVA_8.LamdaExpression;

@FunctionalInterface
interface I1 {
    int m1(int n);
}

@FunctionalInterface
interface I2 {
    int m2(int m, int n);
}

public class SquarOfNumber {
    static void main() {
        I1 i1 = (a) -> a * a;
        System.out.println(i1.m1(10));
        I2 i2 = (a, b) -> a + b;
        System.out.println(i2.m2(20, 30));
    }
}
