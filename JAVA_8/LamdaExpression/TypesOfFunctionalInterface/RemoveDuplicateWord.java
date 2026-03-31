package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateWord {
    static void main() {
        String str ="Java is very very easy easy Java is";
        String[] s =str.split(" ");
        List<String> li = Arrays.asList(s);
        li.stream().distinct().forEach(i-> System.out.print(i+" ") );
    }
}
