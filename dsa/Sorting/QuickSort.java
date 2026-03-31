package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] a = {7, -1, 5, -5, -10, 45, -20};
        quicSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void quicSort(int[] a, int low, int high) {
        if (low >= high) return;

        int pivot = a[(low + high) / 2];
        int i = low;
        int j = high;

        while (i <= j) {

            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        // recursive calls
        quicSort(a, low, j);
        quicSort(a, i, high);
    }
}
