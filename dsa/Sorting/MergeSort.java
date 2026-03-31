package Sorting;

import java.util.Arrays;

public class MergeSort {

    static void main() {
        int[] a={7,8,9,5,56,45,456};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }


    public static void mergeSort(int[] a){
        if (a.length<=1) return ;
        int[] left=new int[a.length/2];
        int[] right=new int[a.length-left.length];
//        int i=0;
//        while (i<left.length){
//            left[i]=a[i];
//            i++;
//        }
        for (int i = 0; i <left.length ; i++) {
            left[i]=a[i];
        }
//        int j=0;
//        while (j<right.length){
//            right[j]=a[i];
//            j++;
//            i++;
//        }
        for (int j = 0; j <right.length ; j++) {
            right[j]=a[left.length+j];
        }
        mergeSort(left);
        mergeSort(right);


        merge(left,right,a);
    }
    public static void merge(int[]a,int[]b,int[]c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else
                c[k++] = b[j++];
        }

         while(i<a.length){
             c[k++]=a[i++];
         }
         while (j<b.length){
             c[k++]=b[j++];
         }


    }
}
