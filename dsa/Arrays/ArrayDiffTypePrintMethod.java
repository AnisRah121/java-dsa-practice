package Arrays;

import java.util.Arrays;

public class ArrayDiffTypePrintMethod {
    static void main() {
        int [] a = new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

        for (int i = a.length-1; i >=0 ; i--) {
            System.out.println(a[i]);
        }

        for(int ele :a)
        {
            System.out.println(ele);
        }
       int[] b = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(b));

    }
}
