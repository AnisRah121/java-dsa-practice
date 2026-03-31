package JAVA_8.MethodReference;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    //static
    public static  int squar(int i){
        return i=i*i;
    }


    //Non-static
    public  boolean isEven(int n) {
        return (n % 2 == 0);
    }


    static void main() {
        //instance method referense
        Test t = new Test();
        Predicate<Integer> p = i-> t.isEven(i);
        Predicate<Integer> p1 = t::isEven;
        System.out.println(p.test(4));
        System.out.println(p1.test(5));

        //static method reference
        Function<Integer,Integer> fn = i->squar(i);
        Function<Integer,Integer> fn1 = Test::squar;
        System.out.println(fn.apply(4));
        System.out.println(fn1.apply(5));
    }



}
