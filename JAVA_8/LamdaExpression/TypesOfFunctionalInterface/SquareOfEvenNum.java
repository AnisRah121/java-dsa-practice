package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class SquareOfEvenNum {
    static void main() {
        int [] a ={1,2,3,4,5,6,7,8};
        Predicate<Integer> e = i->i%2==0;
        Function<Integer,Integer> p = i->i*i;

        for (int n:a)
        {
            if (e.test(n)) {
                System.out.println(p.apply(n));
            }
        }
    }
}
