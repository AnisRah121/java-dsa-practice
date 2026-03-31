package Arrays;

import java.util.Arrays;

public class SecondHighest {
    static void main() {
        int []a={5,3,1,8,9,2};
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max)
            {
                max2=max;
                max=a[i];
            } else if (a[i]<max && a[i]>max2)
            {
                max2=a[i];
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
