package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class DistinctAndSorted {
    static void main() {
        List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,1,2,3,4,5,6,7,8);
        List<Integer> l =list.stream().sorted().distinct().toList();
        System.out.println(l);
    }
}
