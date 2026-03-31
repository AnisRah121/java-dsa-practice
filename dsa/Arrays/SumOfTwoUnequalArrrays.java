package Arrays;
import java.util.Arrays;
public class SumOfTwoUnequalArrrays {
    static void main() {
        int[] a = {9, 0, 5, 0, 3, 0};
        int []b={1,2,3,4};
       int l = a.length<b.length?a.length:b.length;
        for (int i = 0; i <l ; i++) {
            if(a.length>b.length)a[i]=a[i]+b[i];
            else b[i]=b[i]+a[i];
        }
        b=a.length>b.length?a:b;
        System.out.println(Arrays.toString(b));
    }
}
