package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Romanizer {
    public static String convert(int number){
        Map<Integer, String> m = new LinkedHashMap<Integer, String>() {{
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }};


        int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String res = "";
        for (int value :a){
            while(number>=value)
            {
             res+=m.get(value);
             number-=value;
            }



        }
        return res;


    }

    static void main() {
        int n  = 1220;
        System.out.println(convert(n));
    }
}
