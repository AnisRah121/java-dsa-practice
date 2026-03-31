package Arrays;

public class ArrayEvenEle {
    static void main() {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for (int i = a.length-1; i >=0 ; i--) {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
        for (int ele : a)
        {
            if(ele%2==0)
            {
                System.out.println(ele);
            }
        }
    }
}
