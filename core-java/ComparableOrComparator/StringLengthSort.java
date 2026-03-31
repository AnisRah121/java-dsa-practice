package ComparableOrComparator;

import java.util.Arrays;
import java.util.Comparator;

public class StringLengthSort {
    public static void main(String[] args) {

        String[] arr = {"Java", "Python", "C", "Spring", "API"};

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2)
            {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }
}

