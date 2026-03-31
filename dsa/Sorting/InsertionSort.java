package Sorting;

import java.util.Arrays;

public class InsertionSort {

        static void main() {
            int[] a={7,8,9,5,56,45,456};
            InsertSort(a);
            System.out.println(Arrays.toString(a));
        }

        public static void InsertSort(int[] a){
            for (int i = 1; i <a.length ; i++) {
                 int key = a[i];
                 int j = i-1;
                 while(j>=0 && a[j] > key){
                     a[j+1] = a[j];
                     j--;
                 }
                 a[j+1] = key;
            }

        }


}
