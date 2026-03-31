package JAVA_8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramFilter {
    static void main() {
        List<Integer> li =Arrays.asList(1,2,3,4,45,56,7,78);
//         li.stream()
//                .filter(n -> n % 2 == 0)
//                 .map(n->n*n)
//                .forEach(System.out::println);
        li.stream().forEach(System.out::println);


    }
}
