package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierFI {
    static void main() {
Supplier<Integer> sup = () ->100;
        System.out.println(sup.get());


        Predicate<Integer> p = x->x%2==0;
        Function<Integer,Integer> f = x->x*x;
        Consumer<Integer> c = x-> System.out.println(x);
        Supplier<Integer> s = ()->100;

        if (p.test(s.get()))
            c.accept(f.apply(s.get()));
    }
}
