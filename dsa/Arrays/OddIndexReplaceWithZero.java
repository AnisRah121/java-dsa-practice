package Arrays;

import java.util.Arrays;

public class OddIndexReplaceWithZero {
    static void main() {
        int[] a ={1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i <a.length ; i++) {
            if(i%2!=0)
            {
                a[i]=0;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
