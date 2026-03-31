package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {
    static void main() {
        String str ="javadev";
        List<Character> li = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        li.stream().distinct().forEach(i-> System.out.print(i+" "));

    }
}
