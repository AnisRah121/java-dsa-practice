package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.*;
import java.util.stream.Collectors;

public class characterOccurance {
    static void main() {
        String str ="javadev";
        List<Character> li = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        Map<Character,Long> colle = li.stream().collect(Collectors.groupingBy( i -> i,
                LinkedHashMap::new,
                Collectors.counting()));
        colle.forEach((i,j)-> System.out.println(i+"="+j));

    }
}
