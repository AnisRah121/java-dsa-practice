package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {
    static void main() {
//        Consumer<Integer> consume = x -> System.out.println(x);
//        consume.accept(10);
//
//        Consumer<String> st = s -> System.out.println(s);
//        st.accept("anis");


        Consumer<List<Integer>> list = li->{
            for (Integer i :li){
                System.out.println(i+100);
            }
        };
        Consumer<List<Integer>> list2 = li->{
            for (Integer i :li){
                System.out.println(i);
            }
        };


        Consumer<List<Integer>> c= list2.andThen(list);
        c.accept(Arrays.asList(1,2,3,4,5,6));




    }
}
