package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.function.Predicate;
//@FunctionalInterface
//interface  I1{
//    void m1();
//        }
public class PredicateFI {
    static void main() {

//        Predicate<Integer> p = i ->
//            i%2==0;
//        System.out.println(p.test(5));
//        System.out.println(p.test(6));


//        Predicate<String> startsWith = x->x.toLowerCase().charAt(0)=='a';
//        System.out.println(startsWith.test("Anis"));

//        Predicate<String> startsWith1 = x->x.toLowerCase().charAt(0)=='a';
//        Predicate<String> endsWith1 = x->x.toLowerCase().charAt(x.length()-1)=='s';
//        Predicate<String> and = startsWith1.and(endsWith1);
//        System.out.println(and.test("Anis"));
//
//
//        Predicate<String> startsWith2 = x->x.toLowerCase().charAt(0)=='a';
//        Predicate<String> endsWith2 = x->x.toLowerCase().charAt(x.length()-1)=='s';
//        Predicate<String> or = startsWith1.or(endsWith1);
//        System.out.println(or.test("Anis"));
//
//        Predicate<String> startsWith3 = x->x.toLowerCase().charAt(0)=='a';
//        System.out.println(startsWith3.negate().test("anis"));


        Predicate<String> equal = Predicate.isEqual("anis");
        System.out.println(equal.test("anis"));

    }
}




