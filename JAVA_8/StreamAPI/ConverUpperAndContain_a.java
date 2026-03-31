package JAVA_8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverUpperAndContain_a {
    static void main() {
        List<String> st = Arrays.asList("ANIS","AKIB","USMAN","ROKIB","BITTU");
        List<String> s= st.stream().filter(i-> i.contains("A")).map(i->i.toUpperCase()).toList();
        System.out.println(s);
    }
}

