package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] a={7,8,9,5,56,45,456};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
