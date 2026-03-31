package Arrays;
import  java.util.Arrays;

public class ShiftZeroToLeft {
    static void main() {
        int[]a={9,0,5,0,3,0};

        int i = 0;
        int j = a.length-1;
       while(i<j)
       {
           while(a[i]==0)i++;
           while(a[j]!=0)j--;
           if(i<j)
           {
               int temp = a[i];
               a[i]=a[j];
               a[j]=temp;
               i++;
               j--;
           }
       }
        System.out.println(Arrays.toString(a));
    }
}
