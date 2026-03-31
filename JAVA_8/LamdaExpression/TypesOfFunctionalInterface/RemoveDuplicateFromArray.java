package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray {
    static void main() {
        int[] a ={1,2,3,4,5,21,3,4,5,6,22,24,4,5,6};
        List<Integer> li= Arrays.asList(1,2,3,4,5,6,2,3,4,5,6,7,8,9);
        int [] arr =Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
