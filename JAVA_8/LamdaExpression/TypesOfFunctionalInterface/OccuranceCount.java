package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceCount {
    static void main() {
        List<String> st = Arrays.asList("ANIS","AKIB","USMAN","ROKIB","BITTU","YAMIN","YAKIB","ANIS","AKIB","USMAN","ANIS","AKIB","USMAN");
        Map<String,Long>occurance  = st.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        occurance.forEach((i,j)-> System.out.println(i+"="+j));


    }
}
