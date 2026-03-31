package JAVA_8.LamdaExpression;

@FunctionalInterface
interface Printer {
    void print();
}

@FunctionalInterface
interface Adder {
    void add(int a, int b);
}

@FunctionalInterface
interface LengthFinder {
    int length(String str);
}

public class Demo {

    public static void main(String[] args) {

        Printer p = () -> System.out.println("Anis");
        p.print();

        Adder a = (x, y) -> {
            System.out.println(x + y);
        };
        a.add(10, 20);

        LengthFinder l = (String str) -> {
            return str.length();
        };
        System.out.println(l.length("Anis"));
    }
}
