package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class DelStringAndSort {
    static void main() {
        List<String> st = Arrays.asList("ANIS","AKIB","USMAN","ROKIB","BITTU","YAMIN","YAKIB","ANIS","AKIB","USMAN","ANIS","AKIB","USMAN");
        List<String> str=  st.stream().map(i->i.toLowerCase()).filter(i->!i.contains("y")).sorted().toList();
        System.out.println(str);



    }
}
