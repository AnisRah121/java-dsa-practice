package ComparableOrComparator;

import java.util.Arrays;

public class StringArraySort {
    public static void main(String[] args) {

        String[] arr = {"Java", "Python", "C", "Spring", "API"};

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}

