package Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void main() {
        int[] a={7,8,9,5,56,45,456};
        SelecSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void SelecSort(int[] a){
        for (int i = 0; i <a.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex=j;
                }
            }
            if (i != minIndex){
               int temp = a[minIndex];
               a[minIndex] = a[i];
               a[i] = temp ;
            }
        }

    }
}
