package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccuranceCheck {
    static void main() {
        String str ="Java is very very easy easy Java is";
        String[] s =str.split(" ");
        List<String> li = Arrays.asList(s);
        Map<String,Long> collect  = li.stream().collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<String,Long>(),Collectors.counting()));
        collect.forEach((i,j)-> System.out.println(i+"="+j));

    }
}
