package JAVA_8.ConstructorReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class A {

    int i;
    int j;

    public A() {
        System.out.println("No args");
    }

    public A(int i) {
        this.i = i;
    }


    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    static void main() {
        Supplier<A> s =()->new A();
        A a1 = s.get();
        System.out.println(a1.i + " "+ a1.j);


        Function<Integer, A> fn = i->new A(i);
        A a2 = fn.apply(10);
        System.out.println(a2.i + " "+ a2.j);


        BiFunction<Integer,Integer, A> fn2 = (i,j)->new A(i,j);
        A a3 = fn2.apply(20,30);
        System.out.println(a3.i + " "+ a3.j);

    }
}
