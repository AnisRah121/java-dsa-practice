package JAVA_8.ConstructorReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class B {

    int i;
    int j;

    public B() {
        System.out.println("No args");
    }

    public B(int i) {
        this.i = i;
    }


    public B(int i, int j) {
        this.i = i;
        this.j = j;
    }

    static void main() {

        Supplier<B> s =B::new;
        B b1 = s.get();
        System.out.println(b1.i + " "+ b1.j);


        Function<Integer, B> fn =B::new;
        B b2 = fn.apply(10);
        System.out.println(b2.i + " "+ b2.j);


        BiFunction<Integer,Integer, B> fn2 = B::new;
        B b3 = fn2.apply(20,30);
        System.out.println(b3.i + " "+ b3.j);

    }
}
