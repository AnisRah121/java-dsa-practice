package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.function.Function;

public class FunctionFI {
    static void main() {
        Function<String,Integer> fucntion = x->x.length();
        System.out.println(fucntion.apply("Anis"));


        //apply
        Function<Integer,Integer> fun = x->x*x;
        System.out.println(fun.apply(5));


         //andThen
        Function<String,String> fucntion1 = x->x.toUpperCase();
        Function<String,String> fucntion2 = x->x.substring(0,3);
        System.out.println(fucntion1.andThen(fucntion2).apply("Anisur"));



        //compose
        Function<Integer,Integer> fucnt1 = x->x*x;
        Function<Integer,Integer> fucnt2 = x->x*x*x;
        System.out.println(fucnt1.andThen(fucnt2).apply(3));
        System.out.println(fucnt2.andThen(fucnt1).apply(5));
        System.out.println(fucnt1.compose(fucnt2).apply(5));



        //identity
        Function<Integer,Integer> fucnt = Function.identity();
        System.out.println(fucnt.apply(15));







    }
}
