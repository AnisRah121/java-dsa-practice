package JAVA_8.LamdaExpression;

@FunctionalInterface
interface ISEvenOrOdd {
    boolean m1(int n);
}

public class EvenOdd {
    static void main() {
        //ISEvenOrOdd i = (a) -> a % 2 == 0;
        ISEvenOrOdd i = a -> a % 2 == 0;

        System.out.println(i.m1(6));
        System.out.println(i.m1(7));

    }
}
