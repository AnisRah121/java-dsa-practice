package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.List;
import java.util.Arrays;
public class MathsMinMaxSum {
    static void main() {
        List<Integer> inte = Arrays.asList(1,2,3,4,5,6,7,8);
        //min
        Integer in =inte.stream().min((a,b)->a-b).get();
        System.out.println(in);
        //max
        System.out.println(inte.stream().max((a,b)->a-b).get());
        //count
        long coun=  inte.stream().count();
        System.out.println(coun);
        /// sum
        int sum = inte.stream().mapToInt(i->i).sum();
        System.out.println(sum);
    }
}
