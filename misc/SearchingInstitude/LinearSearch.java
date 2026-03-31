package SearchingInstitude;

import java.util.Arrays;

public class LinearSearch {
    static void main() {
        int [] a = {1,2,34,4,6,7,78,8};
        int z=linearSearch(a,7);
        int y=linearSearch(a,100);
        System.out.println(z);
        System.out.println(y);
    }
    public static int linearSearch(int[]a,int key){
        int n= a.length;
        for (int i = 0; i <=n-1 ; i++) {
            if (a[i]==key){
                return i;
            }

        }
        return  -1;
    }
}
